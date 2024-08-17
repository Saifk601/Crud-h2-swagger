package in.saifit.service;

import java.util.List;

import in.saifit.entity.User;

public interface UserService {
	
	 public String upsertUser(User user);
	 
	 public List<User> getUser();
	 
	 public String dltUser(Integer uid);

}
