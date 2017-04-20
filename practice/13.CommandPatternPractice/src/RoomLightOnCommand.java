import java.util.logging.Level;
import java.util.logging.Logger;

public class RoomLightOnCommand implements Command {
	
	private final static Logger LOGGER = Logger.getLogger(Command.class.getName());
	
	private RoomLight light ;

	public RoomLightOnCommand(RoomLight light) {
		super();
		this.light = light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
		LOGGER.log(Level.FINE, "light.on()");
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
