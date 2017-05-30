
public class Locked implements DoorState {
	
	private Door door;
	
    public Locked(Door door){
        this.door = door;
    }
    
	@Override
	public boolean open() {
		System.out.println("잠겨 있어서 열수 가 없습");
		return false;
	}

	@Override
	public boolean close() {
		System.out.println("이미 닫혀서 잠겨있습");
		return false;
	}

	@Override
	public boolean lock() {
		System.out.println("이미 잠겨 있습");
		return false;
	}

	@Override
	public boolean unlock() {
		System.out.println("열림");
		return true;
	}
    
}
