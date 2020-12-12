package com.simpleex.sbsecurityex.service;

import com.simpleex.sbsecurityex.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    User findByUserId(Long userId);
    List<User> allUsers();
    boolean saveUser(User user);
    boolean deleteUser(Long userId);
    List<User> userGtList(Long idMin);
}
