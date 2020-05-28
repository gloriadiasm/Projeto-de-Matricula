package unitri.sistemamatricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unitri.sistemamatricula.model.User;
import unitri.sistemamatricula.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User create(User user){
        return userService.create(user);
    }

    @GetMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping
    public Optional<User> findById(String id){
        return userService.findById(id);
    }

    @DeleteMapping("/delete")
    public void deleteById(String id){
        userService.deleteById(id);
    }

    @PutMapping("/update")
    public User update(User user){
        return userService.create(user);
    }
}
