package com.example.service;
import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String email,String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }


}
