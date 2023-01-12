package com.driver.services;

import com.driver.Convetor.AuthorConvertor;
import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository1;

    public void create(AuthorRequestDto author){
        Author author1 = AuthorConvertor.DtoToEntity(author);
        authorRepository1.save(author1);
    }
}
