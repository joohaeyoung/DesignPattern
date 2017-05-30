
public class Card{
	private int number;
    private CardFace face;
    public Card(int number, CardFace face){
        this.number = number;
        this.face = face;
    }
    public int getNumber(){
        return number;
    }
    public CardFace getFace(){
        return face;
    }
    @Override
    public String toString(){
    	return String.format("%d %s", number, face);
    }
}
