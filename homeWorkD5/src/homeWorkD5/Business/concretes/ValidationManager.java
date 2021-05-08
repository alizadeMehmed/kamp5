package homeWorkD5.Business.concretes;

import homeWorkD5.Business.abstracts.ValidationService;
import homeWorkD5.Entities.concrete.User;

import java.util.regex.Pattern;

public class ValidationManager implements ValidationService {
	private static final String mailPattern = "^[A-Z0-9._+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)?$";
	private static Pattern pattern = Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);

	public boolean isEmailValid(User user) {

		if (!user.getEmail().isEmpty()) {
			return pattern.matcher(user.getEmail()).find();
		}
		return false;
	}

	public boolean checkIsFilled(User user) {
		if (!user.getEmail().isEmpty() && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validate(User user) {

		if (isEmailValid(user) && user.getPassword().length() >= 6 && user.getFirstName().length() > 2
				&& user.getLastName().length() > 2 && checkIsFilled(user)) {
			System.out.println("Kullanýcý bilgileri doðrulandý " + user.getFirstName() + " " + user.getLastName());
			return true;
		} else {
			System.out.println(
					"Bilgilerinizi doðru girdiðinizden emin olunuz." + user.getFirstName() + " " + user.getLastName());
			;
			return false;
		}

	}

}
