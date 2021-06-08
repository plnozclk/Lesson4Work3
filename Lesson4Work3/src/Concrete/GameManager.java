package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println("Kampanya Eklendi   : "+game.getName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Kampanya Güncellendi   : "+game.getName());
		
	}

	@Override
	public void Delete(int gameId) {
		System.out.println("Kampanya Eklendi   : "+gameId);
		
	}

}
