package pl.wojdyla.reservationapp;

import org.springframework.beans.factory.annotation.Autowired;

public class BoatManager {
    private BoatRepository boatRepository;
    @Autowired
    public BoatManager(BoatRepository boatRepository){
        this.boatRepository = boatRepository;
    }
}
