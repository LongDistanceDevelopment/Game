import java.util.Random;



/**
 * Deck of card objects, 
 */
public class deck 
{
	private card[] _cards;
	
	/**
	 * default constructor
	 */
	public deck()
	{
		_cards = new card[52];
		int index = 0;
		//CARD VALUE
		for( int i = 2; i <= 14; i++)
		{
		//CARD SUIT
			for( int j = 0; j < 4; j++)
			{
				_cards[index].type = i;
				_cards[index].suit = j;
				index++;
			}
		}
	}
	
	/**
	 * Mixes up the order of the deck
	 */
	public static void shuffle()
	{
		
		
		//Swaps position of card i and j
		while(true)
		{
			//Selects two random cards
			int i = (int) (Math.random()*52);
			int k = (int) (Math.random()*52);
			/*Implement more code here*/
			
			
		}
	}
}
