package com.rebel.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rebel.test.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> 
{
	@Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.id= ?1" )
	Boolean isPersonExistById(Integer id);

}
