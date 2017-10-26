import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class DeckTest 
{

	@Test
	public void test() 
	{
		Deck deck = new Deck();
	
		
		deck.shuffleDeck();
		
		//deck.printDeck();
		
		ArrayList<Card> hand = new ArrayList<Card>();
		
		try 
		{
			hand = deck.dealCards(5);
			
			for (int i = 0; i < hand.size(); i++)
			{
				hand.get(i).print();
			}
			
		} 
		catch (DeckException e) 
		{
			e.printStackTrace();
		}
		
	}

}
