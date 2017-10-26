
public class Card 
{
	private int number = 0;
	private String suit = "";
	
	Card(int num, String suit)
	{
		String tempSuit = suit.toUpperCase();
		
		if (tempSuit.charAt(tempSuit.length() - 1) != 'S')
		{
			tempSuit += "S";
		}
		
		if(isValidSuit(tempSuit) && isValidNumber(num))
		{ 
			this.number = num;
			this.suit = tempSuit;
		}
	}
	
	boolean isValidNumber(int num)
	{
		boolean retval = true;
		
		if (num < 1 || num > 13)
		{
			retval = false;
		}
		
		return retval;
	}
	
	boolean isValidSuit(String suit)
	{
		boolean retval = false;
		String[] validSuits = {"CLUBS", "SPADES", "HEARTS", "DIAMONDS"};
		
		for (int i = 0; i < validSuits.length; i++)
		{
			if (suit.equals(validSuits[i]))
			{
				retval = true;
				break;
			}
		}
		return retval;
	}
	
	void print()
	{
		System.out.println(this.number + " of " + this.suit);
	}
	
	int getNumber()
	{
		return this.number;
	}
	
	String getSuit()
	{
		return this.suit;
	}
}
