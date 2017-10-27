import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class TableTest 
{

	@Test
	public void test() 
	{
		Table table = new Table(4);
		
		try
		{
			table.dealCards(5);
			
			ArrayList<Card> p1 = table.getPlayerHands(0);
			ArrayList<Card> p2 = table.getPlayerHands(1);
			ArrayList<Card> p3 = table.getPlayerHands(2);
			ArrayList<Card> p4 = table.getPlayerHands(3);
			
			assertEquals(5, p1.size());
			assertEquals(5, p2.size());
			assertEquals(5, p3.size());
			assertEquals(5, p4.size());
			
			assertEquals(31, table.getDeckSize());
			
			table.dealCards(6);
			p1 = table.getPlayerHands(0);
			p2 = table.getPlayerHands(1);
			p3 = table.getPlayerHands(2);
			p4 = table.getPlayerHands(3);
			
			assertEquals(6, p1.size());
			assertEquals(6, p2.size());
			assertEquals(6, p3.size());
			assertEquals(6, p4.size());
			
			table.dealCards(5);
			fail();
		}
		catch(DeckException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
