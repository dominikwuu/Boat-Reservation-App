package pl.wojdyla.reservationapp;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserManager {
    private UserRepository userRepository;
    @Autowired
    public UserManager(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }
    public Iterable<User> findAll(){return userRepository.findAll();}
    public User save(User user){ return userRepository.save(user);}
    public void delete(User user){userRepository.delete(user);}
}
