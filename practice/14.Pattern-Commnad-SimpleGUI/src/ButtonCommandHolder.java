import javafx.scene.control.Button;

public class ButtonCommandHolder extends Button implements CommandHolder {
	//버튼을 상속받고 커맨홀드를 구현.
	private Command cmd;
	public ButtonCommandHolder(String buttonText){
		super(buttonText);
	}
	@Override
	public void setCommand(Command cmd) {
		this.cmd = cmd;
	}
	@Override
	public Command getCommand() {
		return cmd;
	}
	@Override
	public void execute() {
		cmd.execute();
	}
}
