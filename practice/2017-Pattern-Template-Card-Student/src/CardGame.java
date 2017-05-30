import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;

public abstract class CardGame {
	
	protected ArrayList<Card> originalDeck = new ArrayList<>();
	protected Queue<Card> remainingDeck = new ArrayDeque<>();
	protected ArrayList<ArrayList<Card>> userCards = new ArrayList<>();
	public final void init(){
		CardFace[] cardFaces = CardFace.values();
		for(int i=0; i<52; i++){
			originalDeck.add(new Card( i % 13 + 1, cardFaces[i/13]));
		}
		shuffle();
		remainingDeck.addAll(originalDeck);
		dealCards();
	}
	protected void shuffle(){
	//썪는다
		//특수하게 썪고 싶으면 재정의 .ㅎ낟. 
		
	}
	protected abstract void dealCards();//나눠준다.
}

//블랙잭 두장
//포카 다섯장씩. 
//섞는건 어케 할까?
//라이브러리 쓴다. 

