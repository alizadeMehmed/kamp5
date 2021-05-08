package homeWorkD5.dataAccess.abstracts;

import java.util.List;

import homeWorkD5.Entities.concrete.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	List<User> getAll(User user);
}
