import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class Deck 
{
	//private Card[] deck = new Card[52];
	private ArrayList<Card> deck = new ArrayList<Card>();
	private int deckIndex = 51;
	
	
	Deck()
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 13; j++)
			{
				String suit = "";
				if (i == 0)
				{
					suit = "HEARTS";
				}
				
				else if (i == 1)
				{
					suit = "SPADES";
				}
				
				else if (i == 2)
				{
					suit = "CLUBS";
				}
				
				else if (i == 3)
				{
					suit = "DIAMONDS";
				}
				
				Card tempCard = new Card(j + 1, suit);
				
				//deck[i * 13 + j] = tempCard;
				deck.add(tempCard);
			}
		}
	}
	
	//Shuffle itself
	void shuffleDeck()
	{
		Random random = new Random();
		random.nextInt();
		
		for (int i = 0; i < deck.size(); i++)
		{
			int change = i + random.nextInt(deck.size() - i);
			Collections.swap(deck, i, change);
		}
		
	}
	
	
	ArrayList<Card> dealCards(int numCards) throws DeckException
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		
		if (numCards > deckIndex)
		{
			throw new DeckException("Not enough cards in the deck");
			
		}
		
		else
		{
			for (int i = deckIndex; i > deckIndex - numCards; i--)
			{
				cards.add(deck.get(i));
			}
			
			deckIndex -= numCards;
		}
		
		return cards;
		
	}
	
	//Deal(num)
		//throw an expection if not enough cards to deal hand
	
	
		//return array of Cards
	
	
	void printDeck()
	{
		for (int i = 0; i < deck.size(); i++)
		{
			deck.get(i).print();
		}
	}
}
