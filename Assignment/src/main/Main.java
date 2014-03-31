package main;

import dao.UserDAO;
import dto.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		dao.insert(new User("20","aa","bb",28, 0));
		
	}

}
