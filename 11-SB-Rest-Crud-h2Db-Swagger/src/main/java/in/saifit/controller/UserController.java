package in.saifit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.saifit.entity.User;
import in.saifit.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userSer;
	
	@PostMapping("/saveUser")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		String user2 = userSer.upsertUser(user);
		return new ResponseEntity<>(user2 , HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getUser")
	public ResponseEntity<List<User>> getUser(){
		List<User> list = userSer.getUser();
		return new ResponseEntity<>(list , HttpStatus.OK);
		
	}
	@PutMapping("/updateUser")
	public ResponseEntity<String> updateUser(@RequestBody User user){
		String string = userSer.upsertUser(user);
		return new ResponseEntity<>(string , HttpStatus.OK);
		
	}
	@DeleteMapping("deleteUser/{uid}")
	public ResponseEntity<String> dltUser(@PathVariable Integer uid){
		String string = userSer.dltUser(uid);
		return new ResponseEntity<>(string , HttpStatus.OK);
		
	}

}
