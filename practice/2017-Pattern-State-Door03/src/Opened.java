
public class Opened implements DoorState {
	
	private Door door;
	
    public Opened(Door door){
        this.door = door;
    }

	@Override
	public boolean open() {
		System.out.println("이미 열려있습");
		return false;
	}
	
	@Override
	public boolean close() {
		System.out.println("문이 닫힘");
		return true;
	}

	@Override
	public boolean lock() {
		
		System.out.println("문이 열려 있어 잠글수 없습");
		return false;
	}
	
	@Override
	public boolean unlock() {
		System.out.println("문이 잠겨 있지 않음");
		return false;
	}
}
