public class DeckException extends Exception
{
	//class that exists to be thrown whenever the user requests to draw a number of cards that is greater than the number of cards in the deck
	DeckException(String message)
	{
		super(message);
	}
}
