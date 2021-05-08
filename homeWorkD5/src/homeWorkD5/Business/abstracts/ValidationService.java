package homeWorkD5.Business.abstracts;

import homeWorkD5.Entities.concrete.User;

public interface ValidationService {
	boolean isEmailValid(User user);

	boolean checkIsFilled(User user);

	boolean validate(User user);
}
