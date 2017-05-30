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
	//���´�
		//Ư���ϰ� ���� ������ ������ .����. 
		
	}
	protected abstract void dealCards();//�����ش�.
}

//���� ����
//��ī �ټ��徿. 
//���°� ���� �ұ�?
//���̺귯�� ����. 

