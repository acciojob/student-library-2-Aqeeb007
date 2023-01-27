package com.driver.services;

import com.driver.security.AuthorityConstants;
import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository;

    public void create(Author author){
        authorRepository.save(author);
    }
}
