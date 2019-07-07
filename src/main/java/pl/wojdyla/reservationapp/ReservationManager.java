package pl.wojdyla.reservationapp;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ReservationManager {
    private ReservationRepository reservationRepository;
    @Autowired
    public ReservationManager(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }
    public Optional<Reservation> findById(Long id){return reservationRepository.findById(id);}
    public Iterable<Reservation> findAll(){return reservationRepository.findAll();}
    public Reservation save(Reservation reservation){ return reservationRepository.save(reservation);}
    public void delete(Reservation reservation){reservationRepository.delete(reservation);}
}
