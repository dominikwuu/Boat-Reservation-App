package pl.wojdyla.reservationapp;

public class Boat {
    private String boatName;
    private boolean isCurrentlyRented;

    public Boat() {
    }

    public Boat(String boatName, boolean isCurrentlyRented) {
        this.boatName = boatName;
        this.isCurrentlyRented = isCurrentlyRented;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public boolean isCurrentlyRented() {
        return isCurrentlyRented;
    }

    public void setAvailableForRent(boolean availableForRent) {
        isCurrentlyRented = availableForRent;
    }
}
