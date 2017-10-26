import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest 
{

	@Test
	public void test() 
	{
		Card card1 = new Card(2, "Hearts");
		assertEquals(2, card1.getNumber());
		assertEquals("HEARTS", card1.getSuit());
		
		Card card2 = new Card(3, "Club");
		assertEquals(3, card2.getNumber());
		assertEquals("CLUBS", card2.getSuit());
		
		Card card3 = new Card(4, "Dog");
		assertEquals(0, card3.getNumber());
		assertEquals("", card3.getSuit());
		
		Card card4 = new Card(14, "HEARTS");
		assertEquals(0, card4.getNumber());
		assertEquals("", card4.getSuit());
		
		
	}

}
