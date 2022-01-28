package fr.formation.inti.service;

import fr.formation.inti.dao.UserDaoImpl;
import fr.formation.inti.entity.User;

public class UserService {
	private UserDaoImpl dao ;
	public UserService() {
		dao = new UserDaoImpl();
	}
	
	public  User verifyLogin(String login, String password) {
		dao.beginTransaction();
		User user = dao.findByLoginAndPassword(login,password);
		dao.commitTransaction();
		dao.close();
		return user;
		
	}
	
}
