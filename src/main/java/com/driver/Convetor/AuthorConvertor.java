package com.driver.Convetor;

import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Author;

public class AuthorConvertor {
    public static Author DtoToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder()
                .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry()).email(authorRequestDto.getEmail())
                .name(authorRequestDto.getName()).build();
        return author;
    }
}
