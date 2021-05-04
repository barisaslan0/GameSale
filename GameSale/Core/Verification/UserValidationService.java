package Verification;

import Concrete.Gamer;

public interface UserValidationService {
	boolean checkIfRealPerson(Gamer gamer);
}
