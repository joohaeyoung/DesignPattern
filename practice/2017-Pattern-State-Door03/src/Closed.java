
public class Closed implements DoorState {
	
	private Door door;
	
    public Closed(Door door){
 
        this.door = door;
    }
    
	@Override
	public boolean open() {
		System.out.println("문을 연다");
		return true;
	}
	
	@Override
	public boolean close() {
		System.out.println("이미 닫혀 있습");
		return false;
	}
	
	@Override
	public boolean lock() {
		System.out.println("문을 잠근다");
		return true;
	}
	
	@Override
	public boolean unlock() {
		System.out.println("문이 잠겨있지 않음");
		return false;
	}
}
