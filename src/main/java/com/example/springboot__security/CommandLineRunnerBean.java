package com.example.springboot__security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public void run(String...args) {
        User user = new User("bart","bart@domain.com", "bart","Bart","Simpson",true);
        Role userRole = new Role("bart", "ROLE_USER");

        userRepository.save(user);
        roleRepository.save(userRole);

        User admin = new User("DaveWolf","dave@domain.com","beastmaster", "Dave","Wolf",true);
        Role adminRole1 = new Role("DaveWolf","ROLE_ADMIN");
        //Role adminRole2 = new Role("super","ROLE_USER");

        userRepository.save(admin);
        roleRepository.save(adminRole1);
        //roleRepository.save(adminRole2);
    }
}