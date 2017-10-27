import java.util.ArrayList;

public class Table 
{
	//private variables that will represent a table of players playing a card game
	private Deck deck;
	private ArrayList <ArrayList <Card>> players = new ArrayList <ArrayList <Card>>();
	private int numPlayers;
	
	//constructor that initializes the 'deck' and shuffles it and sets the class data member 'numPlayers' through the parameter
	Table(int numPlayers)
	{
		deck = new Deck();
		deck.shuffleDeck();
		this.numPlayers = numPlayers;
	}
	
	//method that deals a number of cards given by the parameter to a number of players given by the data member'numPlayers'
	void dealCards(int numCards) throws DeckException
	{
		//if 'players' has not been initialized yet, add an ArrayList of Card objects for every player to 'players'
		if (players.isEmpty())
		{
			for(int i = 0; i < this.numPlayers; i++)
			{
				try 
				{
					//during initialization, call ArrayLists's add method because it contains no elements at this point
					players.add(deck.dealCards(numCards));
				} 
				catch (DeckException e) 
				{
					throw e;
				}
			}
		}
		else
		{
			for(int i = 0; i < this.numPlayers; i++)
			{
				try 
				{
					//once ArrayList elements have been added, overwrite them by calling ArrayLists's set method
					players.set(i, deck.dealCards(numCards));
				} 
				catch (DeckException e) 
				{
					throw e;
				}
			}
		}
	}	
	
	//method that will return the ArrayList of Card objects at the parameter index of 'players'
	ArrayList<Card> getPlayerHands(int playerIndex)
	{
		//ArrayList to be returned
		ArrayList<Card> hand = null;
		
		//don't allow the setting of 'hand' with an invalid parameter index for 'numPlayers'
		if (playerIndex < 0 || playerIndex > this.numPlayers)
		{
			System.out.println("Invalid player index");
		}

		//otherwise if the parameter index is valid, set 'hand' to the ArrayList at the index
		else
		{
			hand = players.get(playerIndex); 
		}
		
		return hand;
	}
	
	//method that will return the value obtained from calling the Deck class' getDeckIndex() method
	int getDeckSize()
	{
		return deck.getDeckIndex();
	}
}
