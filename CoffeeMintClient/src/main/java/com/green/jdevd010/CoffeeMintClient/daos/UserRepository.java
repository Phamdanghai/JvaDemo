package com.green.jdevd010.CoffeeMintClient.daos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.green.jdevd010.CoffeeMintClient.models.User;

public interface UserRepository  extends CrudRepository<User, Integer>{

	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getUserByUsername(@Param("username") String username);
}
