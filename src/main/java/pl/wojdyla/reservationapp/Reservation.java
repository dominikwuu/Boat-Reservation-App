package pl.wojdyla.reservationapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Reservation {
    User user;
    Boat boat;
    boolean isPaid;
    boolean isAvailableForReservation;

}
