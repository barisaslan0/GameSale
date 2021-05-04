package Concrete;

import Abstract.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Satýþa Sunuldu: " + game.getName());

	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Bilgileri Güncellendi: " + game.getName());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Satýþtan Kaldýrýldý: " + game.getName());

	}

}
