package pl.wojdyla.reservationapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Boat {
    private String boatName;
    private boolean isCurrentlyRented;

}
