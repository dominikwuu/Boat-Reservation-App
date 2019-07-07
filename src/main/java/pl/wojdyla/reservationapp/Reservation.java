package pl.wojdyla.reservationapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    User user;
    Boat boat;
    int statusOfPayment; // 0: paid, 1: waiting for payment
    int statusOfReservation; // 0: available, 1: not available

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public int getStatusOfPayment() {
        return statusOfPayment;
    }

    public void setStatusOfPayment(int statusOfPayment) {
        this.statusOfPayment = statusOfPayment;
    }

    public int getStatusOfReservation() {
        return statusOfReservation;
    }

    public void setStatusOfReservation(int statusOfReservation) {
        this.statusOfReservation = statusOfReservation;
    }

    public Reservation(Long id, User user, Boat boat, int statusOfPayment, int statusOfReservation) {
        this.id = id;
        this.user = user;
        this.boat = boat;
        this.statusOfPayment = statusOfPayment;
        this.statusOfReservation = statusOfReservation;
    }
}
