package pl.wojdyla.reservationapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationRestApiController {
    public List<Reservation> reservations;

    public ReservationRestApiController(){
        reservations = new ArrayList<>();
    }

    @GetMapping("/all")
    public List<Reservation> getAll() {
        return reservations;
    }
    @PostMapping
    public boolean addReservation(@RequestBody Reservation reservation){
        return reservations.add(reservation);
    }
    @PutMapping
    public boolean updateReservation(@RequestBody Reservation reservation){
        return reservations.add(reservation);
    }
    @DeleteMapping
    public boolean deleteReservation(@RequestParam String userName) {
        return reservations.removeIf(element -> element.getUser().getName().equals(userName));
    }
}
