
public interface Command {
	
	void execute(); //어떤 명령을 실행할수 있겠끔. 
	//등록된 객체에 execute 만 실행하면 된다.
	//그럼 불, 에어턴 이런 것들은 커맨드 객체가 알아야하낟. 
	
	void undo(); // 방금한 액션을 되돌린다. 
	
	
}
