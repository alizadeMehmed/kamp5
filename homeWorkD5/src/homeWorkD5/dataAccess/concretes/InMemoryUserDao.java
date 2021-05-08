package homeWorkD5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeWorkD5.Entities.concrete.User;
import homeWorkD5.dataAccess.abstracts.UserDao;

public class InMemoryUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý Sisteme Eklendi" + user.getFirstName() + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi" + user.getFirstName() + user.getLastName());

	}

	@Override
	public void delete(User user) {

		users.removeIf(kullanici -> kullanici.equals(user));
		System.out.println("Kullanýcý Silindi");

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
