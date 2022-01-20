package org.employee.search.resource.impl;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import jdk.net.SocketFlow;
import org.employee.search.model.User;
import org.employee.search.resource.AuthenticationResource;
import org.employee.search.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationResourceImpl implements AuthenticationResource {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<User> register(User user) {
        User created = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}
