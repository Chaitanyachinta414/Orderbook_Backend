package com.demo.repository;
 
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.demo.model.UserEntity;
 
 
public interface UserRepo extends JpaRepository<UserEntity,Integer> {
 
	UserEntity findByUsername(String username);
 
	UserEntity findByUsernameAndPassword(String username, String password);
 
 
}