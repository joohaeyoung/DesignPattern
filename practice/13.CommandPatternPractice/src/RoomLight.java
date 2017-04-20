
public class RoomLight {
	
	private String location;
	public RoomLight(String location){
		this.location = location;
		
	}
	public void on(){
		System.out.printf("%s : 불이켜짐\n", location);
	}
	
	public void off(){
		System.out.printf("%s : 불이꺼짐\n", location);
	}

}
