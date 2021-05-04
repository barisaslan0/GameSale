package Concrete;

import Abstract.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Sat��a Sunuldu: " + game.getName());

	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Bilgileri G�ncellendi: " + game.getName());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Sat��tan Kald�r�ld�: " + game.getName());

	}

}
