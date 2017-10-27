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
		
		ArrayList<Card> hand = new ArrayList<Card>();
		
		try 
		{
			hand = deck.dealCards(5);
			assertEquals(5, hand.size());
			assertEquals(46, deck.getDeckIndex());
			
			for (int i = 0; i < hand.size(); i++)
			{
				hand.get(i).print();
			}
			
			int previousDeckSize = 46;
			while (deck.getDeckIndex() > 5)
			{
				hand = deck.dealCards(5);
				assertEquals(5, hand.size());
				assertEquals(previousDeckSize - 5, deck.getDeckIndex());
				previousDeckSize -= 5;
			}
			
			//get an exception by drawing past the deck size
			hand = deck.dealCards(5);
			fail();
			
		} 
		catch (DeckException e) 
		{
			e.printStackTrace();
		}
		
	}

}
