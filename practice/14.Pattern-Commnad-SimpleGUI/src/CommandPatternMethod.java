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

public class CommandPatternMethod extends Application {
	private MenuItemCommandHolder crongChoice = new MenuItemCommandHolder("crong");
	private MenuItemCommandHolder pororoChoice = new MenuItemCommandHolder("pororo");
	private ButtonCommandHolder crongButton = new ButtonCommandHolder("crong");
	private ButtonCommandHolder pororoButton = new ButtonCommandHolder("pororo");
	private Image pImg = new Image("pororo.jpg");
	private Image cImg = new Image("crong.jpg");
	private ImageView iView = new ImageView(pImg);
	
	private Command crongCommand = () -> iView.setImage(cImg);
	private Command pororoCommand = () -> iView.setImage(pImg);
	
	private void handle(ActionEvent event){
		Command command = ((CommandHolder)event.getSource()).getCommand();
		command.execute();
		/*
		Object source = event.getSource();
		if(source==crongButton||source==crongChoice){
			iView.setImage(cImg);
		}
		else{
			iView.setImage(pImg);
		}*/
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
		crongButton.setCommand(crongCommand);
		pororoButton.setOnAction(e->handle(e));
		pororoButton.setCommand(pororoCommand);
		
		Menu imageMenu = new Menu("Change Image");
		imageMenu.getItems().addAll(crongChoice, pororoChoice);
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(imageMenu);
		crongChoice.setOnAction(e->handle(e));
		crongChoice.setCommand(crongCommand);
		pororoChoice.setOnAction(e->handle(e));
		pororoChoice.setCommand(pororoCommand);
		
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
