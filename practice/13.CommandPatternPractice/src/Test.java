import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test {

	private final static Logger LOGGER = 
			Logger.getLogger(Command.class.getName());

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		
		LOGGER.setLevel(Level.ALL);// 모든 레벨의 로그를 다기록해라. 
		
		FileHandler handler = new FileHandler("command.log");

		handler.setFormatter(new SimpleFormatter());
		handler.setLevel(Level.ALL);
		LOGGER.addHandler(handler);
		
		RemoteControl rc = new RemoteControl();
		RoomLight light = new RoomLight("안방");
		
		//중간에 커맨드를 만든다. 커맨드패턴을 만들게 되면 필요한 클래스에 개의 생성하는 객체의 객수는 늘어나게된다. 이게단점이다. 그러나 전반적으로 확장할떄는 이것이 유연한 방법이 된다. 
	
		RoomLightOnCommand roomLightOnCommand = new RoomLightOnCommand(light);
		RoomLightOffCommand roomLightOffCommand = new RoomLightOffCommand(light);

		rc.setCommand(0, roomLightOnCommand, roomLightOffCommand);
		rc.pressOnButton(0);
		rc.pressOnButton(1);
		
		Stero stero = new Stero();
		
		//SteroOnCommand steroOnCommand = new SteroOnCommand(stero);
		//SteroOnCommand steroOffCommand = new SteroOnCommand(stero);
		
		rc.setCommand(1,new SteroOnCommand(stero), new SteroOnCommand(stero));
		
		rc.pressOnButton(1);
		rc.pressOnButton(1);
	
		
		
	}

}
