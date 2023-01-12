package com.driver.RequestDto;

import lombok.Data;

import javax.persistence.Column;
@Data
public class AuthorRequestDto {
    private String name;
    private String email;
    private int age;
    private String country;
}
