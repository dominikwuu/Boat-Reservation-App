package pl.wojdyla.reservationapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Boat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String boatName;
    private boolean isCurrentlyRented;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCurrentlyRented(boolean currentlyRented) {
        isCurrentlyRented = currentlyRented;
    }

    public Boat() {
    }

    public Boat(Long id, String boatName, boolean isCurrentlyRented) {
        this.id = id;
        this.boatName = boatName;
        this.isCurrentlyRented = isCurrentlyRented;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }
}


