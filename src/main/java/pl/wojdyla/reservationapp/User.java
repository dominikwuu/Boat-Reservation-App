package pl.wojdyla.reservationapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity

public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    private String name;
    private String firstName;
    private String telephoneNumber;
    private String emailAdress;


}

