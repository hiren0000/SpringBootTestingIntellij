package com.rebel.test.repo;

import com.rebel.test.entity.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo repo;

    @Test
    void isPersonExistById()
    {
        Person person = new Person(124, "Hiren", "Devmurari");
        repo.save(person);
        boolean ac = repo.isPersonExistById(124);
        assertThat(ac).isTrue();

    }

    // we can delete all testing data using this function that runs after each test cases
    @AfterEach
    void tearDown()
    {
        System.out.println("Tearing down !!");
        repo.deleteAll();

    }
}