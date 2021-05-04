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
			System.out.println("Kay�t Olundu: " + gamer.getFirstName() + " " + gamer.getLastName());
		}
		else 
		{
			System.out.println("Kullan�c� Do�rulamad�!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgiler G�ncellendi: " + gamer.getFirstName() + " " + gamer.getLastName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Hesab�n�z Silindi: " + gamer.getFirstName() + " " + gamer.getLastName());

	}

}
