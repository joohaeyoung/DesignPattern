
public class Closed implements DoorState {
	
	private Door door;
    public Closed(Door door){
    	
        this.door = door;
    }
	@Override
	public void open() {
		System.out.println("���̴���");
		door.changeToOpenedState();
	}

	@Override
	public void close() {
		//
	}

	@Override
	public void lock() {
		System.out.println("���̴���");
		door.lock();
	}

	@Override
	public void unlock() {
		//
	}

}
