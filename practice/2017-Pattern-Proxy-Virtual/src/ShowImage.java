import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {
	
	private String imageURL = "";
	
	@Override
	
	public void start(Stage primaryStage) throws Exception {
		
		TextInputDialog getURLDialog = new TextInputDialog();
		getURLDialog.setTitle("이미지 주소 입력창");
		getURLDialog.setHeaderText("웹 이미지 주소를 입력하여 주십시오.");
		Optional<String> userInput = getURLDialog.showAndWait();
		
		if(userInput.isPresent()){
			imageURL = userInput.get();
			System.out.println(imageURL);
		}
		
		Pane pane = new Pane();
		//Image img = new Image(imageURL);//이미지 가지고 와서
		ImageProxyView iView = new ImageproxyView();
		iView.setImage(imgeURL);
		
		ImageView iView = new ImageView(img);//이미지로 본다. 
		//가상 프록시를 만들어서 백그라운드로 돌린다. 
		pane.getChildren().add(iView);
		
		primaryStage.setTitle("Virtual Proxy Pattern App");
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

