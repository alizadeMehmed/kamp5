package homeWorkD5.core;

import homeWorkD5.Entities.concrete.User;

public interface GoogleAuthService {
	void registerWithGoogle(User user);

	void loginWithGoogle(User user);
}
