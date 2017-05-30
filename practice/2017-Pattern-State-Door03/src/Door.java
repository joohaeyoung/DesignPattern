
public class Door {

	private final DoorState openedState = new Opened(this);
	private final DoorState closedState = new Closed(this);
	private final DoorState lockedState = new Locked(this);

	private DoorState currentState = closedState;
	
	public void open(){
		if(currentState.open()) currentState = openedState;
	}
	public void close(){
	if(currentState.close()) currentState = closedState;;
	}
	public void lock(){
		if(currentState.lock()) currentState = lockedState;
	}
	public void unlock(){
		if(currentState.unlock()) currentState = closedState;
	}
}
