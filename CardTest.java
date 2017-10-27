import static org.junit.Assert.*;
import org.junit.Test;

public class CardTest 
{
	@Test
	public void test() 
	{
		//testing the ability of the constructor to turn "Hearts" into "HEARTS"
		Card card1 = new Card(2, "Hearts");
		assertEquals(2, card1.getNumber());
		assertEquals("HEARTS", card1.getSuit());
		
		//testing the ability of the constructor to turn a singular and not pluaral "Club" into "CLUBS" 
		Card card2 = new Card(3, "Club");
		assertEquals(3, card2.getNumber());
		assertEquals("CLUBS", card2.getSuit());
		
		//testing the ability of the constructor to turn away the creation of a Card that is not a valid suit
		Card card3 = new Card(4, "Dog");
		assertEquals(0, card3.getNumber());
		assertEquals("", card3.getSuit());
		
		//testing the ability of the constructor to turn away the creation of a Card that is not a valid number
		Card card4 = new Card(14, "HEARTS");
		assertEquals(0, card4.getNumber());
		assertEquals("", card4.getSuit());
	}
}
