import java.util.ArrayList;

public class Table 
{
	private Deck deck;
	private ArrayList <ArrayList <Card>> players = new ArrayList <ArrayList <Card>>();
	private int numPlayers;
	
	Table(int numPlayers)
	{
		deck = new Deck();
		deck.shuffleDeck();
		this.numPlayers = numPlayers;
		
	}
	
	void dealCards(int numCards) throws DeckException
	{
		if (players.isEmpty())
		{
			for(int i = 0; i < this.numPlayers; i++)
			{
				try 
				{
					players.add(deck.dealCards(numCards));
				} 
				catch (DeckException e) 
				{
					//e.printStackTrace();
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
					players.set(i, deck.dealCards(numCards));
				} 
				catch (DeckException e) 
				{
					//e.printStackTrace();
					throw e;
				}
			}
		}
	}	
	
	ArrayList<Card> getPlayerHands(int playerIndex)
	{
		return players.get(playerIndex); 
	}
	
	int getDeckSize()
	{
		return deck.getDeckIndex();
	}
	
}
