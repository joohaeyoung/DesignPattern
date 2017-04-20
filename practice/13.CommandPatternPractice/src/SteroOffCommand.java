
public class SteroOffCommand implements Command {
	
	private Stero stero;
	
	public SteroOffCommand(Stero stero){
		this.stero = stero;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stero.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
		stero.on();
		stero.setCD();
		stero.setVolume(12);
	}

}
