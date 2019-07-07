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

    public void fillDbWithBoats() {
        boats.add(new Boat(1L, "Ebro1", false));
        boats.add(new Boat(2L, "Ebro2", false));
        boats.add(new Boat(3L, "Ebro3", false));
        boats.add(new Boat(4L, "Ebro4", false));
        boats.add(new Boat(5L, "RIB BOra", false));
        boats.add(new Boat(6L, "Bayliner E7", false));
        boats.add(new Boat(7L, "Lema Force", false));
        boats.add(new Boat(8L, "Bavaria Sport", false));
        boats.add(new Boat(9L, "Elan", false));
    }

        @GetMapping("/all")
        public List<Boat> getAll() {
            return boats;
        }
        @PostMapping
        public boolean addBoat(@RequestBody Boat boat){
            return boats.add(boat);
        }
        @DeleteMapping
        public boolean deleteBoat(@RequestParam Long id){
            return boats.removeIf(element -> element.getId() == id);
        }
        @PutMapping
        public boolean updateBoat(@RequestBody Boat boat){
            return boats.add(boat);
        }
    }
