package rs.hsk.demobackend.dao;

import java.util.List;

import rs.hsk.demobackend.dto.User;

public interface UserDAO {
	
	
	List<User>list();
	User get(int id);
	boolean add(User user);
	boolean update(User user);
	boolean delete(User user);
}
