package Concrete;

import Abstract.GamerService;
import Verification.UserValidationService;

public class GamerManager implements GamerService {
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.checkIfRealPerson(gamer)) {
			System.out.println("Kayýt Olundu: " + gamer.getFirstName() + " " + gamer.getLastName());
		}
		else 
		{
			System.out.println("Kullanýcý Doðrulamadý!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgiler Güncellendi: " + gamer.getFirstName() + " " + gamer.getLastName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Hesabýnýz Silindi: " + gamer.getFirstName() + " " + gamer.getLastName());

	}

}
