package com.assignments.BookClub.Services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.assignments.BookClub.models.Login;
import com.assignments.BookClub.models.User;
import com.assignments.BookClub.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository userrepo;

	public User register(User newUser, BindingResult result) {

		Optional<User> potentialUser = userrepo.findByEmail(newUser.getEmail());

		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
			return null;
		}
		if (potentialUser.isPresent()) {
			result.rejectValue("email", "Matches", "Invalid Email ");
			return null;

		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userrepo.save(newUser);

	}

	public User login(Login Login, BindingResult result) {
		// TO-DO: Additional validations!
		Optional<User> potentialUser = userrepo.findByEmail(Login.getEmail());
		if (!potentialUser.isPresent()) {
			result.rejectValue("email", "Matches", "Invalid Email ");
			return null;
		}
		User user = potentialUser.get();
		if(!BCrypt.checkpw(Login.getPassword(), user.getPassword())) {
		    result.rejectValue("password", "Matches", "Invalid Password!");
		    return null; 
		}
		return user;
	}

}
