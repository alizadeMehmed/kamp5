package homeWorkD5;

import homeWorkD5.Business.abstracts.UserService;
import homeWorkD5.Business.concretes.ConfirmManager;
import homeWorkD5.Business.concretes.UserManager;
import homeWorkD5.Business.concretes.ValidationManager;
import homeWorkD5.Entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Mehmet", "Parlak", "mehmetparlak01@gmail.com", "1234561");
		User user2 = new User(2, "Ali", "Durmaz", " ", "123456");
		User user3 = new User(3, "Orhan", "Kýlýç", " ", "12");

		UserService userService = new UserManager(new ValidationManager(), new ConfirmManager());
		userService.register(user1);
		userService.register(user2);
		userService.register(user3);

		userService.login(user1);

	}

}
