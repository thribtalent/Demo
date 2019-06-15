package rs.hsk.demobackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import rs.hsk.demobackend.dao.UserDAO;
import rs.hsk.demobackend.dto.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	private static List<User> users =new ArrayList<>();
	static {
		User user = new User();
		//adding fisrt user
		user.setId(1);
		user.setName("Harish");
		user.setNumber(80550);
		users.add(user);
		
		user = new User();
		user.setId(2);
		user.setName("Ruchita");
		user.setNumber(841819);
		users.add(user);
		
		user = new User();
		user.setId(3);
		user.setName("Harshal");
		user.setNumber(95112233);
		users.add(user);
		
			}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return users;
	}

}
