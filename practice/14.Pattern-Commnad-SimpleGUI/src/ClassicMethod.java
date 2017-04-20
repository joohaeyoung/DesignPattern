import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ClassicMethod extends Application {
	private MenuItem crongChoice = new MenuItem("crong");
	private MenuItem pororoChoice = new MenuItem("pororo");
	private Button crongButton = new Button("crong");
	private Button pororoButton = new Button("pororo");
	private Image pImg = new Image("pororo.jpg");
	private Image cImg = new Image("crong.jpg");
	private ImageView iView = new ImageView(pImg);
	
	private void handle(ActionEvent event){
		
		

		
		
			Object source = event.getSource();
		
		if(source==crongButton||source==crongChoice){//메뉴다.
			iView.setImage(cImg);//크롱이미지
		}
		else{
			iView.setImage(pImg);//뽀로로 이미지.
		} 
		
		
	
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane mainPane = new BorderPane();
			
		iView.setFitWidth(100);
		iView.setPreserveRatio(true);
		
		HBox buttonPane = new HBox(10);
		buttonPane.setAlignment(Pos.CENTER);
		buttonPane.setPadding(new Insets(10));
		buttonPane.getChildren().addAll(crongButton, pororoButton);
		crongButton.setOnAction(e->handle(e));
		pororoButton.setOnAction(e->handle(e));
		
		Menu imageMenu = new Menu("Change Image");
		imageMenu.getItems().addAll(crongChoice, pororoChoice);
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(imageMenu);
		crongChoice.setOnAction(e->handle(e));
		pororoChoice.setOnAction(e->handle(e));
		
		mainPane.setTop(menuBar);
		mainPane.setCenter(iView);
		mainPane.setBottom(buttonPane);
		
		primaryStage.setTitle("Event Processing App");
		primaryStage.setScene(new Scene(mainPane, 300, 300));
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
