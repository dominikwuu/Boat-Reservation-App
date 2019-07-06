package pl.wojdyla.reservationapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserApi {

    private List<User> users;

    public UserApi(){
        users = new ArrayList<>();
        users.add(new User("Wojdyła","Dominik","123456789",
                "email@gmail.com"));
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return users;
    }
}
