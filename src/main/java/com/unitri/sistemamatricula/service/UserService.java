package unitri.sistemamatricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unitri.sistemamatricula.model.User;
import unitri.sistemamatricula.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user){
       return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(String id){
        return userRepository.findById(id);
    }

    public void deleteById(String id){
        userRepository.deleteById(id);
    }

    public User update(User user){
        return userRepository.save(user);
    }
}
