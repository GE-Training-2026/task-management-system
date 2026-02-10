package com.gevernova.Task_management_system.service;


import com.gevernova.Task_management_system.DTO.UserRequest;
import com.gevernova.Task_management_system.exception.UserNotFoundException;
import com.gevernova.Task_management_system.model.User;
import com.gevernova.Task_management_system.repository.UserRepository;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;

    public User createUser(UserRequest req) {
        User user = new User(null, req.getName(), req.getEmail());
        return userRepo.save(user);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUser(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    public User updateUser(Long id, UserRequest req) {
        User user = getUser(id);
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        return userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.delete(getUser(id));
    }
}
