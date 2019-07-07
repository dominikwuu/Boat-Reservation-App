package pl.wojdyla.reservationapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserRestApiController {

    private List<User> users;

    public UserRestApiController() {
        users = new ArrayList<>();
        fillDbWithUsers();
    }
    public void fillDbWithUsers(){
        users.add(new User("Wojdyła", "Dominik", "123456789",
                "email@gmail.com"));
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return users;
    }

    @PostMapping
    public boolean addUser(@RequestBody User user) {
        return users.add(user);
    }

    @PutMapping
    public boolean updateUser(@RequestBody User user) {
        return users.add(user);
    }
    @DeleteMapping
    public boolean removeUser(@RequestParam String userName){
        return users.removeIf(element -> element.getName().equals(userName));
    }
}
