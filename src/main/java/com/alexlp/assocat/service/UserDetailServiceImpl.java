package com.alexlp.assocat.service;

import com.alexlp.assocat.model.MyUserDetails;
import com.alexlp.assocat.model.User;
import com.alexlp.assocat.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);

        if (user==null){
            throw new UsernameNotFoundException("User Not Found");
        }

        return  new MyUserDetails(user);
    }
}
