import javafx.geometry.Point2D;

public class VerticalDrawCommand implements Command {
	private int x = 10;
	private LinePane pane;
	public VerticalDrawCommand(LinePane pane){
		this.pane = pane;
	}
	public void execute(){
		
	}
	public void undo(){
		
	}
}
