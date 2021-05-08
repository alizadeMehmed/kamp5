package homeWorkD5.Business.concretes;

import homeWorkD5.Business.abstracts.ConfirmService;
import homeWorkD5.Entities.concrete.User;

public class ConfirmManager implements ConfirmService {

	@Override
	public boolean isConfirmed(User user) {
		System.out.println("Kullanýcý aktivasyonu saðlandý ");
		return true;
	}

	@Override
	public void confirm(User user) {
		System.out.println("Kullanýcýya aktivasyon maili gönderildi");

	}

}
