
public class Locked implements DoorState {
	private Door door;
	
    public Locked(Door door){
        this.door = door;
    }
	@Override
	public void open() {
		System.out.println("잠겨 있습.");
	}

	@Override
	public void close() {
		System.out.println("이미 닫혀 있습");
	}

	@Override
	public void lock() {
		System.out.println("이미 잠겨있습");
	}

	@Override
	public void unlock() {
		System.out.println("열림");
		door.changeToClosedState();
	}

}
