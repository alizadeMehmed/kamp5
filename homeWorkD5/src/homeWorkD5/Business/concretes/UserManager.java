package homeWorkD5.Business.concretes;

import homeWorkD5.Business.abstracts.ConfirmService;
import homeWorkD5.Business.abstracts.UserService;
import homeWorkD5.Business.abstracts.ValidationService;
import homeWorkD5.Entities.concrete.User;

public class UserManager implements UserService {

	ValidationService validationService;
	ConfirmService confirmService;

	public UserManager(ValidationService validationService, ConfirmService confirmService) {
		super();
		this.validationService = validationService;
		this.confirmService = confirmService;

	}

	@Override
	public void register(User user) {
		if (validationService.validate(user)) {
			confirmService.confirm(user);
			if (confirmService.isConfirmed(user)) {
				System.out.println("Kullanýcý hesabý baþarý ile oluþturulmuþtur: " + user.getFirstName() + " "
						+ user.getLastName());
			} else {
				System.out.println("Aktivasyon linki için mailinizi kontrol ediniz.");
			}
		}
	}

	@Override
	public void login(User user) {
		if (!user.getEmail().isEmpty() && !user.getPassword().isEmpty() && validationService.isEmailValid(user)) {
			System.out.println("Login iþlemi baþarýlý: " + user.getFirstName() + " " + user.getLastName());
		} else {
			System.out.println("Parola veya þifre hatalý");
		}
	}

}
