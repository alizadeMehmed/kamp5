package homeWorkD5.Business.concretes;

import homeWorkD5.Business.abstracts.ConfirmService;
import homeWorkD5.Entities.concrete.User;

public class ConfirmManager implements ConfirmService {

	@Override
	public boolean isConfirmed(User user) {
		System.out.println("Kullanıcı aktivasyonu sağlandı ");
		return true;
	}

	@Override
	public void confirm(User user) {
		System.out.println("Kullanıcıya aktivasyon maili gönderildi");

	}

}
