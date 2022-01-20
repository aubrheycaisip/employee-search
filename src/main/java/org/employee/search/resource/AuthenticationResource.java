package org.employee.search.resource;

import org.employee.search.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface AuthenticationResource {

    @PostMapping("/register")
    ResponseEntity<User> register(@RequestBody User user);
}
