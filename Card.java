public class Card 
{
	//variables that will represent a standard playing card
	private int number = 0;
	private String suit = "";
	
	//constructor that uses its parameters to set the class' data members
	Card(int num, String suit)
	{
		//going to convert the suit to an uppercase version of itself to allow the program to accept either an upper or lower case variant of a suit from the user
		String tempSuit = suit.toUpperCase();
		
		//also going to allow the user to enter the suit as either ending in an 's' or not. Logically, the program will store it as being a plural variant
		if (tempSuit.charAt(tempSuit.length() - 1) != 'S')
		{
			tempSuit += "S";
		}
		
		//calling two methods that will check for valid suit and number values and set the class data members if the parameters are valid
		if(isValidSuit(tempSuit) && isValidNumber(num))
		{ 
			this.number = num;
			this.suit = tempSuit;
		}
	}
	
	//will return true if the number for a card is between the value of 1 and 13 (inclusive)
	boolean isValidNumber(int num)
	{
		boolean retval = true;
		
		if (num < 1 || num > 13)
		{
			retval = false;
		}
		
		return retval;
	}
	
	//will return true if the suit for a card matches a valid suit name
	boolean isValidSuit(String suit)
	{
		boolean retval = false;
		//this is an array of valid suit names that will be used to check for data equivalence against the parameter
		String[] validSuits = {"CLUBS", "SPADES", "HEARTS", "DIAMONDS"};
		
		//check to see if the parameter matches any of the elements in 'validSuits'
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
	
	//will output the class data members representing a card in a readable manner
	void print()
	{
		//creating a String and not a char because the number 10 consists of two characters
		String cardValue = "";

		//treating a card value of 1 as an ACE
		if (this.number == 1)
		{
			cardValue = "A";
		}

		//treating a card value of 11 as a JACK
		else if(this.number == 11)
		{
			cardValue = "J";
		}

		//treating a card value of 12 as a QUEEN
		else if(this.number == 12)
		{
			cardValue = "Q";
		}

		//treating a card value of 13 as a KING
		else if (this.number == 13)
		{
			cardValue = "K";
		}

		//otherwise just treat the card value as its String equivalent
		else
		{
			cardValue = Integer.toString(this.number);
		}

		System.out.println(cardValue + " of " + this.suit);
	}
	
	//will return the class data member 'number'
	int getNumber()
	{
		return this.number;
	}
	
	//will return the class data member 'suit'
	String getSuit()
	{
		return this.suit;
	}
}
