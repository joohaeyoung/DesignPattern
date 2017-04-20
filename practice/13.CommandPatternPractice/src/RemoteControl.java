import java.util.Stack;

public class RemoteControl {

	//만능 리모콘을 만들어 보겠다.
	//책에서는 7개의 on/off 버튼 (똑같은 기계에 쌍으로 필요 ) 
	//하나의 undo 버튼이 있다. 차근차근 만들어 가자. 
	//1번 슬롯에 tv를 넣어줫다가 조작이 가능하다. 
	
	private Command[] onCommands = new Command[4];
	private Command[] offCommands = new Command[4];
	
	//스태틱으로해서 하나만 만들면된다. 노코맨드가 필요할때는 노코맨드 쓴다.
	private static final Command noCommand = new NoCommand();
	private Stack<Command> commandHistory = new Stack<>();
	
	
	public RemoteControl(){
		
		//요론것을 더비 객체라고 한다. 내가 널검사를 해야되는데 하지않는 방법으로 이런 방법을쓴다 .
		//null을 리턴해야되면 null 말고 더비객체로 리턴을 처리하는 방법이 있다. 그게 빈 스택, 빈 큐,~ 그것들이 널을 검사하는것보다는 깔끔하게 처리할 수 있는 방법이다.
		
		for(int i = 0 ; i < onCommands.length; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		
	}
	
	public void pressOnButton(int slot){ // slot이 4개안에 들어와야한다. 4개안에 들어왔는데 설저잉 안되있으면 널포인트 익셉션 나온다. 그런무넺는 어떻게 쉽게 애기 할 수 있나. 
		onCommands[slot].execute();       // 그래서 널이니 아니니 물어본다. 그게 되게 번거롭다. 그러면 null 검사를 안하겟끔 프로그램을짜주는게 좋은 방법이다
		if(onCommands[slot]!= noCommand)
			commandHistory.push(onCommands[slot]);							//널인지 아닌지를 검사안하게 하는 방법은 어떤 방법이 있을까?
										//객체를 등록시켜놓데 더비 객체를 등록 시켜 놓는다. 범위만 맞으면 눌러도 제대로된게 등록되어있으면 제대로 등록 안되있으면 아무것도 안하게 된다. 
		
		
	}
	public void pressOffButtoon(int slot){
		offCommands[slot].execute();
		if(onCommands[slot]!= noCommand)
			commandHistory.push(onCommands[slot]);	
	}
	public void pressUndoButton(){
		if( commandHistory.isEmpty()){
			Command undoCommand = commandHistory.pop();
			undoCommand.undo();
		}
	}
	
	

}
