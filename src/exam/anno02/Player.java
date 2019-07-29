package exam.anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myplayer")
public class Player implements AbstractPlayer {
	
	@Autowired
	//@Qualifier("dice")
	@Qualifier("dice2")
	AbstractDice d;	//ªÛ¿ß
	int totalValue=0;
	public Player() {}
	public Player(AbstractDice d) {
		super();
		this.d = d;
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}