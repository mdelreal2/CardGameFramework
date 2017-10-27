import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class TableTest 
{
	@Test
	public void test() 
	{
		//Initializing a Table object with 4 players
		Table table = new Table(4);
		
		try
		{
			//calling the method to deal 5 cards to every player
			table.dealCards(5);
			
			//setting 4 ArrayLists to the ArrayLists in 'table's players arrayList
			ArrayList<Card> p1 = table.getPlayerHands(0);
			ArrayList<Card> p2 = table.getPlayerHands(1);
			ArrayList<Card> p3 = table.getPlayerHands(2);
			ArrayList<Card> p4 = table.getPlayerHands(3);
			
			//testing that all players have a hand size of 5 cards
			assertEquals(5, p1.size());
			assertEquals(5, p2.size());
			assertEquals(5, p3.size());
			assertEquals(5, p4.size());
			
			//testing that after 20 cards were removed from the deck, 31 cards remain
			assertEquals(31, table.getDeckSize());
			
			//dealing out another 6 cards
			table.dealCards(6);

			//resetting the ArrayLists to contain the new hands drawn
			p1 = table.getPlayerHands(0);
			p2 = table.getPlayerHands(1);
			p3 = table.getPlayerHands(2);
			p4 = table.getPlayerHands(3);
			
			//testing that the 'players' ArrayList can handle a different hand size from the previous drawing
			assertEquals(6, p1.size());
			assertEquals(6, p2.size());
			assertEquals(6, p3.size());
			assertEquals(6, p4.size());
			
			//at this point 7 cards remain in the deck, so if another round of 5 cards were to be dealt, then an exception should be thrown
			table.dealCards(5);

			//if the exception is not thrown, then the test will fail
			fail();
		}
		catch(DeckException e)
		{
			e.printStackTrace();
		}
	}
}
