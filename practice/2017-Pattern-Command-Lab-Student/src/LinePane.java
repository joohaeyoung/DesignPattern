import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class LinePane extends Pane {
	public enum LineType {HORIZONTAL, VERTICAL};
	public void addLine(double startX, double startY, LineType type){
		Line line = new Line();
		
		if(type==LineType.HORIZONTAL){
			line.setStroke(Color.BLUE);
		}
		else{
			line.setStroke(Color.RED);
		}	
        getChildren().add(line);
	}
	public void deleteLine(){
		
	}
	public void repaint(){
		for(Node node: getChildren()){
			Line line = (Line)node;
		}
    }
}
