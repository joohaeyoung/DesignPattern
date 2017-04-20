
public interface CommandHolder {
	
	//커맨드를 유지하고실행할수있는 인터페이스가 따로 있따. 

	
	void setCommand(Command cmd);
	Command getCommand();
	void execute();
}
