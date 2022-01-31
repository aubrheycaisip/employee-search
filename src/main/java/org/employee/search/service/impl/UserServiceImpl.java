package org.employee.search.service.impl;

import org.employee.search.model.Role;
import org.employee.search.model.User;
import org.employee.search.repository.UserRepository;
import org.employee.search.service.RoleService;
import org.employee.search.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private RoleService roleService;

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User getById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        List<Role> roles = new ArrayList<>();
        roles.add(roleService.getRoleByName("ROLE_USER"));
        user.setRoles(roles);
        return userRepo.save(user);
    }

    @Override
    public User getByUsername(String username){
        User user = null;
        try {
            user = userRepo.findByUsername(username).orElseThrow(() -> new Exception("User not found."));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
