package pl.wojdyla.reservationapp;

public class Boat {
    private String boatName;

    public Boat() {
    }

    public Boat(String boatName) {
        this.boatName = boatName;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }
}
