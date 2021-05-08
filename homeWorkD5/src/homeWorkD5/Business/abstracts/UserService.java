package homeWorkD5.Business.abstracts;

import homeWorkD5.Entities.concrete.User;

public interface UserService {
	void register(User user);

	void login(User user);
}
