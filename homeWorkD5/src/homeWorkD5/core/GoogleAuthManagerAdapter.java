package homeWorkD5.core;

import homeWorkD5.Entities.concrete.User;

public class GoogleAuthManagerAdapter implements GoogleAuthService {
	GoogleAuthService googleAuth;

	public GoogleAuthManagerAdapter(GoogleAuthService googleAuth) {
		super();
		this.googleAuth = googleAuth;
	}

	@Override
	public void registerWithGoogle(User user) {
		googleAuth.registerWithGoogle(user);

	}

	@Override
	public void loginWithGoogle(User user) {
		googleAuth.registerWithGoogle(user);

	}

}
