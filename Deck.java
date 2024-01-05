package week06Project;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
private ArrayList<Card>cards;

public Deck() {
	String Rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	String suit[]= {"Club","Diamond","Heart","Spade"};
	
	cards = new ArrayList<>();
	for(int i=0;i<4;i++)
	{
	for(int j=0;j<13;j++)
	{
String name = Rank[j]+ "of" + suit[i];
Card acard = new Card(j+1, name);
cards.add(acard);

}
}
}

public void shuffle()
{
Random rand = new Random();
for(int i=1; i<52; i++)
{
int j = rand.nextInt(52-i) + i;
Card tmp = cards.get(i-1);
cards.set(i-1, cards.get(j));
cards.set(j, tmp);
}
}
public Card draw()
{
Card topCard = cards.get(cards.size()-1);

cards.remove(topCard);

return topCard;
}
}
