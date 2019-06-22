package rs.hsk.demobackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rs.hsk.demobackend.dao.UserDAO;
import rs.hsk.demobackend.dto.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<User> users = new ArrayList<>();

	@Override
	public List<User> list() {
String selectActiveUser = "From User WHERE active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveUser);
	
		query.setParameter("active", true);
		
		return query.getResultList();
	}

	@Override
	public boolean add(User user) {
		try {
			// add user to database table

			sessionFactory.getCurrentSession().persist(user);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}

	}

	
	//updateing a single user
	@Override
	public boolean update(User user) {
		try {
			// add user to database table

			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean delete(User user) {
		
		user.setActive(false);
		try {
			// add user to database table

			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}

	}

	//getting single user based on their id
	@Override
	public User get(int id) {
		return sessionFactory.getCurrentSession().get(User.class,Integer.valueOf(id));
	}

}
