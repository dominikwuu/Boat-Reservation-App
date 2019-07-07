package pl.wojdyla.reservationapp;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class Reservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @ManyToOne(targetEntity = Boat.class)
    private List<Boat> boat;
    @OneToMany(targetEntity = Reservation.class)
    private User user;
    private boolean isPaid;
    private boolean isAvailableForReservation;

}
