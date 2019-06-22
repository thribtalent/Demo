package rs.hsk.demobackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import rs.hsk.demobackend.dao.UserDAO;
import rs.hsk.demobackend.dto.User;


public class UserTestCase {

	private static AnnotationConfigApplicationContext context;

	private static UserDAO userDAO;

	private User user;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("rs.hsk.demobackend");
		context.refresh();
		userDAO = (UserDAO)context.getBean("userDAO");
	}

	
	/*@Test
	public void TestAddUser() {
		user =new User();
		user.setName("Ruchita");
		user.setNumber(843615);
		
		assertEquals("Successfully added user inside the table", true, userDAO.add(user));
	}*/
	
	/*@Test
	public void TestGetUser() {
		user = userDAO.get(1);
		
		assertEquals("Successfully fetched user inside the table", "Rucita", user.getName());
	}*/
	/*@Test
	public void TestUpdateUser() {
		user = userDAO.get(3);
		user.setName("Harish");
		
		assertEquals("Successfully updated user inside the table", true, userDAO.update(user));
	}*/
	
	/*@Test
	public void TestDeleteUser() {
		user = userDAO.get(2);
		
		
		assertEquals("Successfully deleted user inside the table", true, userDAO.delete(user));
	}*/
	/*@Test
	public void TestListUser() {
		
		assertEquals("Successfully fetched user inside the table",3,userDAO.list().size());
	}*/
	
	
	 @Test public void testListUser() {
	  assertEquals("Successfully fetched a list of category from the table!",3,
	  userDAO.list().size()); } 
	 
}
