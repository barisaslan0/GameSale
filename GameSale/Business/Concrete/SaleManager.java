package Concrete;

import Abstract.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getName() + " Oyunu sat�ld�: " + gamer.getFirstName());

	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(
				campaign.getName() + " Dahilinde " + game.getName() + " Oyunu sat�ld�: " + gamer.getFirstName());
		System.out.println("TEBR�KLER Kampanya dahilinde bedava OYUN KAZANDINIZ!");
	}

}
