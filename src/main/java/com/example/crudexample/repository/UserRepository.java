package com.example.crudexample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.crudexample.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findByName(@Param("name") String name);
	
	List<User> findByNameOrderByEmailDesc(@Param("name") String name);
	
}
