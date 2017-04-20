import javafx.scene.control.MenuItem;

public class MenuItemCommandHolder extends MenuItem implements CommandHolder {
	private Command command;
	public MenuItemCommandHolder(String menuItemText){
		super(menuItemText);
	}
	@Override
	public void setCommand(Command command) {
		this.command = command;
	}

	@Override
	public Command getCommand() {
		return command;
	}

	@Override
	public void execute() {
		command.execute();
	}

}
