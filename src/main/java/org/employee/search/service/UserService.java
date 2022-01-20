package org.employee.search.service;

import org.employee.search.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getById(Long id);

    User createUser(User user);

    User getByUsername(String username);
}
