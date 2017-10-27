import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class DeckTest 
{
	@Test
	public void test() 
	{
		//Initializing a Deck object and shuffling it
		Deck deck = new Deck();
		deck.shuffleDeck();
		
		//Creating an ArrayList that will hold cards drawn from the 'deck'
		ArrayList<Card> hand = new ArrayList<Card>();
		
		try 
		{
			//setting the 'hand' to hold 5 Card objects returned by the dealCards() method
			hand = deck.dealCards(5);

			//testing to make sure that the size of 'hand' contains exactly 5 elements
			assertEquals(5, hand.size());

			//testing to make sure that, logically, 5 cards were removed from the 'deck'
			assertEquals(46, deck.getDeckIndex());
			
			//outputting an example playing hand to the console
			for (int i = 0; i < hand.size(); i++)
			{
				hand.get(i).print();
			}
			
			//testing to make sure that the 'deck' continues to draw cards right up until the point where another drawing of 5 cards would throw an exception
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
			
			//if the exception is thrown, then this will not be executed and the test will be pass
			fail();
		}
		catch (DeckException e) 
		{
			e.printStackTrace();
		}
	}
}
