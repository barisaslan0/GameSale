package Abstract;

import Concrete.Campaign;
import Concrete.Game;
import Concrete.Gamer;

public interface SaleService {
	void sale(Gamer gamer, Game game);

	void saleWithCampaign(Gamer gamer, Game game, Campaign campaign);
}
