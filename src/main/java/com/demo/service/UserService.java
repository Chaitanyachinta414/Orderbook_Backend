package com.demo.service;
 
import java.util.Arrays;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
 
import com.demo.model.UserEntity;
import com.demo.repository.UserRepo;
 
@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	@Autowired
	public UserService(UserRepo repo) {
		this.repo=repo;
	}
	public UserEntity findByUsername(String username) {
		return repo.findByUsername(username);
	}
	public UserEntity save(UserEntity user) {
		return repo.save(user);
	}
	public ResponseEntity<String> validateCredentials(UserEntity userentity,String requiredRole) {
    	UserEntity user =repo.findByUsernameAndPassword(userentity.getUsername(),userentity.getPassword());
		if(user!=null) {
			if(user.getRole().equals(requiredRole)) {
				return ResponseEntity.ok("user logged in successfully");
			}
			else {
				return ResponseEntity.badRequest().body("Access denied");
			}
		}else {
			return ResponseEntity.badRequest().body("invalid username or password");
		}
	}
	private boolean isRoleAllowed(String userRole) {
		List<String> allowedRoles=Arrays.asList("PM","USER","IBU_HEAD");
		return allowedRoles.contains(userRole);
	}
}