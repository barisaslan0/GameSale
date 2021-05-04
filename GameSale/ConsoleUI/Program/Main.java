package Program;

import java.time.LocalDate;

import Concrete.Campaign;
import Concrete.CampaignManager;
import Concrete.Game;
import Concrete.GameManager;
import Concrete.Gamer;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Verification.UserValidationManager;

public class Main {

	public static void main(String[] args) {
		System.out.println("----- BRS GAME STATION -----");
		Gamer gamer = new Gamer(1, "1234567890", "Barýþ", "Aslan", LocalDate.of(2000, 3, 2));

		Game game1 = new Game(1, "Red Dead Redemption 2", 300, "Gerçek Hayat Oyunu");
		Game game2 = new Game(2, "Cyberpunk 2077", 250, "Geliþmiþ teknoloji ile birlikte gerçek hayat");
		Game game3 = new Game(3, "Call of Duty Modern Warfare 3", 150, "Aksiyon dolu savaþlar");

		Campaign campaign = new Campaign(1, "Ramazan Kampanyasý", LocalDate.of(2021, 5, 13),
				"1 Oyun Alana 1 Oyun Bedava");

		System.out.println("--- Oyuncu Ýþlemleri ---");
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);

		System.out.println("--- Oyun Ýþlemleri ---");
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		gameManager.add(game2);
		gameManager.update(game2);
		gameManager.delete(game2);
		gameManager.add(game3);
		gameManager.update(game3);
		gameManager.delete(game3);

		System.out.println("--- Kampanya Ýþlemleri ---");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);

		System.out.println("--- Satýþ Ýþlemleri ---");
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer, game1);
		saleManager.saleWithCampaign(gamer, game1, campaign);
		saleManager.sale(gamer, game2);
		saleManager.saleWithCampaign(gamer, game1, campaign);
		saleManager.sale(gamer, game3);
		saleManager.saleWithCampaign(gamer, game1, campaign);

	}

}
