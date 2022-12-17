package com.rebel.test.service;


import com.rebel.test.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

   // we want fake data that is why we do Mock
    @Mock
    private PersonRepo repo;

    private PersonService service;

    @BeforeEach
    void setUp() {
        this.service = new PersonService(this.repo);
    }

    @Test
    void getALlPerson()
    {
      service.getAllPerson();
      verify(repo).findAll();

    }
}