package week06Project;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Paul");
		Player player2 = new Player("Bobby");
		deck.shuffle();
		for(int i=0; i<52; i++)
		{
		if(i%2==0)
		player1.draw(deck);
		else
		player2.draw(deck);
		}
		for(int i=0; i<26; i++)
		{
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		if(card1.getValue() > card2.getValue())
		player1.incrementScore();
		else
		player2.incrementScore();
		}
		System.out.println ("Score of " + player1.getName() + ": " + player1.getScore());
		System.out.println ("Score of " + player2.getName() + ": " + player2.getScore());
		if(player1.getScore() > player2.getScore())
			System.out.println ("Player 1");
			else if(player1.getScore() < player2.getScore())
			System.out.println ("Player 2");
			else
			System.out.println ("Draw");
			}
			

	}


