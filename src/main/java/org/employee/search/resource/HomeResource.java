package org.employee.search.resource;

import org.employee.search.model.User;
import org.employee.search.service.TestingService;
import org.employee.search.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeResource {

    @Autowired
    private UserService userService;

    @Autowired
    private TestingService testingService;

    @GetMapping("/")
    public List<User> home(){
        return userService.getAllUser();
    }

    @PostMapping("/")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping("/admins")
    public String homeAdmin(){
        return ("<h1>Welcome Admin</h1>");
    }

    @GetMapping("/users")
    public String homeUser(){
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping("/username/{username}")
    public User getByUsername(@PathVariable String username){
        return userService.getByUsername(username);
    }

    @GetMapping("/add")
    public ResponseEntity<?> add(){
        return ResponseEntity.ok(testingService.add(1,2));
    }

}
