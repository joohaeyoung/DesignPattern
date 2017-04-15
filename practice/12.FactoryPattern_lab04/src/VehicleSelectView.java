import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VehicleSelectView extends Application {
	
	
	private RadioButton carButton = new RadioButton("Car");
	private RadioButton offRoadButton = new RadioButton("OffRoad");
	
	private Button submitButton = new Button("Submit");
	
	private TextField recommendedVehicle = new TextField();
	
	private ComboBox<String> drivingStyleBox = new ComboBox<>();
	private ComboBox<String> vehicleColorBox = new ComboBox<>();
	
	private VehicleFactory vFactory;
	
	
	public void getVehicleRecommendation(){
		// 아래 코드를 적절하게 수정하시오.
		
		VehicleFactory vFactory = null;
		
		//버튼 클릭 마다 차량을 생산할 펙토리를 선택한다. 
		if(carButton.isSelected()) vFactory = new CarFactory();
		else vFactory = new OffRoadFactory();
		
		String text = null;
		
		try{
			
			String style = drivingStyleBox.getValue();
			String color = vehicleColorBox.getValue();
			
			Vehicle v = vFactory.build(
					
					VehicleFactory.DrivingStyle.valueOf(style), Vehicle.Color.valueOf(color) );
			
			text = v.toString();
		
		}catch(IllegalArgumentException e ){
			text = " 추천할 차량 없습";
		}
	
		recommendedVehicle.setText(text);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane mainPane = new BorderPane();
		HBox vehicleChoiceBox = new HBox(10);
		ToggleGroup vehicleChoiceGroup = new ToggleGroup();
		carButton.setToggleGroup(vehicleChoiceGroup);
		offRoadButton.setToggleGroup(vehicleChoiceGroup);
		carButton.setSelected(true);
		vehicleChoiceBox.getChildren().addAll(carButton, offRoadButton);
		drivingStyleBox.getItems().addAll("ECONOMICAL", "MIDRANGE", "LUXURY", "POWERFUL");
		drivingStyleBox.setValue(drivingStyleBox.getItems().get(0));
		drivingStyleBox.setMaxWidth(Double.MAX_VALUE);
		vehicleColorBox.getItems().addAll("BLUE", "BLACK", "PERLWHITE", "WHITE", "SILVER", "GRAY", "RED");
		vehicleColorBox.setValue(vehicleColorBox.getItems().get(0));
		vehicleColorBox.setMaxWidth(Double.MAX_VALUE);
			
		GridPane mainGrid = new GridPane();
		mainGrid.setPadding(new Insets(10));
		mainGrid.setHgap(10);
		mainGrid.setVgap(10);
		mainGrid.addRow(0, new Label("차량 종류:"), vehicleChoiceBox);
		mainGrid.addRow(1, new Label("차량 스타일:"), drivingStyleBox);
		mainGrid.addRow(2, new Label("차량 색:"), vehicleColorBox);
		mainGrid.addRow(3, submitButton);
		GridPane.setColumnSpan(submitButton,2);
		GridPane.setHalignment(submitButton, HPos.CENTER);
		
		
		VBox outputBox = new VBox(10);
		outputBox.setPadding(new Insets(10));
		outputBox.getChildren().addAll(new Separator(), new Label("추천 차량"), recommendedVehicle);
		
		mainPane.setCenter(mainGrid);
		mainPane.setBottom(outputBox);
		
		//람다를씀. 
		//내부 메소드 처럼 만들어서  달라진다. 
		
		submitButton.setOnAction(e->getVehicleRecommendation());
		
		primaryStage.setTitle("Vehicle Select App");
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.sizeToScene();
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
