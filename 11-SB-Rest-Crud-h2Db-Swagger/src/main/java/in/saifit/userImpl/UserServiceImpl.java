package in.saifit.userImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.saifit.entity.User;
import in.saifit.repository.userRepository;
import in.saifit.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private userRepository repo;
	
	public UserServiceImpl(userRepository repo) {
		this.repo = repo;
	}

	@Override
	public String upsertUser(User user) {
		
		Integer id = user.getUId();
		 
	     repo.save(user);
	     if(id == null) {
	    	 return "record inserted";
	     }else {
	    	 return "record updated";
	     }
		
	}

	@Override
	public List<User> getUser() {
		List<User> all = repo.findAll();
		return all;
	}

	@Override
	public String dltUser(Integer uid) {
		repo.deleteById(uid);
		return "record deleted";
	}

}
