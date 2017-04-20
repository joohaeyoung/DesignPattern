
public class RoomLightOffCommand implements Command {
	private RoomLight light ;
	

	public RoomLightOffCommand(RoomLight light) {
		super();
		this.light = light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();

	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
