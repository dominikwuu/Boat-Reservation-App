package pl.wojdyla.reservationapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/boats")
public class BoatApi {

    private List<Boat> boat;

    public  BoatApi(){
        boat = new ArrayList<>();
        boat.add(new Boat("Ebro1"));
        boat.add(new Boat("Ebro2"));
        boat.add(new Boat("Ebro3"));
        boat.add(new Boat("Ebro4"));
        boat.add(new Boat("RIB BORA"));
        boat.add(new Boat("Bayliner e7"));
        boat.add(new Boat("Bavaria Sport"));
        boat.add(new Boat("ELAN"));
    }

    @GetMapping("/all")
    public List<Boat> getAll(){
        return boat;
    }

}
