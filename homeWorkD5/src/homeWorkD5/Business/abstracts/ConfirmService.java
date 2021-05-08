package homeWorkD5.Business.abstracts;

import homeWorkD5.Entities.concrete.User;

public interface ConfirmService {
	boolean isConfirmed(User user);

	void confirm(User user);
}
