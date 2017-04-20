
public class SteroOnCommand implements Command {
	
	private Stero stero;
	
	public SteroOnCommand(Stero stero){
		this.stero = stero;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stero.on();
		stero.setCD();
		stero.setVolume(12);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stero.off();
		
	}

}
