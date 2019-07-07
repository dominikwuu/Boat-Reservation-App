package pl.wojdyla.reservationapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/boats")
public class BoatRestApiController {

    private List<Boat> boats;

    public BoatRestApiController() {
        boats = new ArrayList<>();
        fillDbWithBoats();
    }
    public void fillDbWithBoats(){
        boats.add(new Boat("Ebro1",false));
        boats.add(new Boat("Ebro2",false));
        boats.add(new Boat("Ebro3",false));
        boats.add(new Boat("Ebro4",false));
        boats.add(new Boat("RIB BORA",false));
        boats.add(new Boat("Bayliner E7",false));
        boats.add(new Boat("LEMA FORCE",false));
        boats.add(new Boat("Bavaria Sport",false));
        boats.add(new Boat("ELAN",false));
    }

    @GetMapping("/all")
    public List<Boat> getAll(){
        return boats;
    }
    @PostMapping
    public boolean addBoat(@RequestBody Boat boat){
        return boats.add(boat);
    }
    @DeleteMapping
    public boolean deleteBoat(@RequestParam String boatName){
        return boats.removeIf(element -> element.getBoatName().equals(boatName));
    }
    @PutMapping
    public boolean updateBoat(@RequestBody Boat boat){
        return boats.add(boat);
    }

}
