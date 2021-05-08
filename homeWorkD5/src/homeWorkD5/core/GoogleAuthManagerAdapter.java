package homeWorkD5.core;

import homeWorkD5.Entities.concrete.User;
import homeWorkD5.GoogleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {
	GoogleAuthManager googleAuth;

	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuth) {
		super();
		this.googleAuth = googleAuth;
	}

	@Override
	public void registerWithGoogle(User user) {
		googleAuth.registerGoogle(user);

	}

	@Override
	public void loginWithGoogle(User user) {
		googleAuth.loginWithGoogle(user);

	}

}
