
public class Door {
	
	public enum State {OPENED, CLOSED, LOCKED}
	private State currentState = State.CLOSED;
	
	public void open(){
		switch(currentState){
		case OPENED:
			System.out.println("�씠誘� �뿴�젮 �엳�쓬");
			break;
		case CLOSED:
			System.out.println("臾몄씠 �뿴由�");
			currentState = State.OPENED;
			break;
		case LOCKED:
			System.out.println("臾몄씠 �옞寃� �엳�뼱 �뿴 �닔 �뾾�쓬");
			break;
		} // switch
	}
	
	public void close(){
		switch(currentState){
		case OPENED:
			System.out.println("臾몄씠 �떕�옒");
			currentState = State.CLOSED;
			break;
		case CLOSED:
		case LOCKED:
			System.out.println("臾몄씠 �씠誘� �떕�� �엳�쓬");
			break;
		} // switch
	}
	public void lock(){
		switch(currentState){
		case OPENED:
			System.out.println("臾몄씠 �뿴�젮 �엳�뼱 �옞湲� �닔 �뾾�쓬");
			break;
		case CLOSED:
			System.out.println("臾몄쓣 �옞湲�");
			currentState = State.LOCKED;
			break;
		case LOCKED:
			System.out.println("臾몄씠 �씠誘� �옞寃� �엳�쓬");
			break;
		} // switch
	}
	public void unlock(){
		switch(currentState){
		case OPENED:
		case CLOSED:
			System.out.println("臾몄씠 �옞寃� �엳吏� �븡�쓬");
			break;
		case LOCKED:
			System.out.println("臾몄쓽 �옞湲덉쓣 �빐�젣�븿");
			currentState = State.CLOSED;
			break;
		} // switch
	}
}
