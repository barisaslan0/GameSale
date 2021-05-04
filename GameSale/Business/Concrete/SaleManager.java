package Concrete;

import Abstract.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getName() + " Oyunu satýldý: " + gamer.getFirstName());

	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(
				campaign.getName() + " Dahilinde " + game.getName() + " Oyunu satýldý: " + gamer.getFirstName());
		System.out.println("TEBRÝKLER Kampanya dahilinde bedava OYUN KAZANDINIZ!");
	}

}
