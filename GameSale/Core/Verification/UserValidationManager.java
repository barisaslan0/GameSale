package Verification;

import Concrete.Gamer;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		if (gamer.getNationalityId() == "1234567890" 
				&& gamer.getFirstName() == "Barýþ"
				&& gamer.getLastName() == "Aslan" 
				&& gamer.getBirthDate().getYear() == 2000) 
		{
			return true;
		}
		else 
		{
			return false;
		}

	}

}
