package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Integer userId = Integer.parseInt(username);
            Optional<User> userOptional = userRepository.findByUserId(userId);
            User user = userOptional.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
            return new org.springframework.security.core.userdetails.User(
                    user.getUserId().toString(), user.getPassword(), user.getRoles());
        } catch (NumberFormatException e) {
            throw new UsernameNotFoundException("Invalid user ID format: " + username);
        }
    }
}


