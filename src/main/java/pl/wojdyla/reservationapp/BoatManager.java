package pl.wojdyla.reservationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Optional;

public class BoatManager {
    private BoatRepository boatRepository;
    @Autowired
    public BoatManager(BoatRepository boatRepository){
        this.boatRepository = boatRepository;
    }
    public Optional<Boat> findById(Long id){
        return boatRepository.findById(id);
    }
    public Iterable<Boat> findAll(){return boatRepository.findAll();}
    public Boat save(Boat boat){ return boatRepository.save(boat);}
    public void delete(Boat boat){boatRepository.delete(boat);}

}
