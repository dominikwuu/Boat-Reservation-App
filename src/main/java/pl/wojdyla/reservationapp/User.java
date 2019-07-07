package pl.wojdyla.reservationapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
    private String name;
    private String firstName;
    private String telephoneNumber;
    private String emailAdress;
}
