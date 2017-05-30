import javafx.geometry.Point2D;

public class HorizontalDrawCommand implements Command {
	private int y = 10;
	private LinePane pane;
	public HorizontalDrawCommand(LinePane pane){	
		this.pane = pane;
	}
	public void execute(){
		
	}
	public void undo(){
		
	}
}
