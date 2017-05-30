import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

@FunctionalInterface
interface FileFilter{
	boolean filter(String fileName);
}

public class FolderView extends Application {
	private Button selectBtn = new Button("폴더 선택");
	private TextArea infoboard = new TextArea();
	private BorderPane mainPane = null;
	private Stage mainStage  = null;
	private TreeView<String> tree; 
	
	private NonLeaf constructFolderTree(File selectedDirectory){
		NonLeaf folder = new NonLeaf(selectedDirectory.getName());
		File[] list = selectedDirectory.listFiles();
		for(File file: list){
			if(file.isDirectory()){
				NonLeaf node = constructFolderTree(file);
				folder.add(node);
			}
			else folder.add(new Leaf(file.getName()));
		}
		return folder;
	}
	
	private TreeItem<String> constructTreeItem(NonLeaf currentFolder){
		currentFolder = currentFolder.getRearranged();
		TreeItem<String> root = new TreeItem<>(currentFolder.getName());
		for(int i=0; i<currentFolder.numberOfChilds(); i++){
			TreeNode node = currentFolder.getChild(i);
			TreeItem<String> item = null;
			if(node instanceof NonLeaf){
				item = constructTreeItem((NonLeaf)node);
			}
			else item = new TreeItem<>(node.getName());
			root.getChildren().add(item);
		}
		return root;
	}
	
	private void directoryList(){
		DirectoryChooser chooser = new DirectoryChooser();
		File selectedDirectory = chooser.showDialog(mainStage);
		if(selectedDirectory==null) return;
		
		NonLeaf currentFolder = constructFolderTree(selectedDirectory);
		TreeItem<String> root = constructTreeItem(currentFolder);
		root.setExpanded(false);
		tree = new TreeView<>(root);
		mainPane.setCenter(tree);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		mainPane = new BorderPane();
		
		HBox buttonPane = new HBox();
		buttonPane.setPadding(new Insets(10));
		buttonPane.setSpacing(10);
		buttonPane.setAlignment(Pos.CENTER);
		buttonPane.getChildren().add(selectBtn);
		selectBtn.setOnAction(e->directoryList());
		
		StackPane centerPane = new StackPane();
		centerPane.setPadding(new Insets(10));
		centerPane.getChildren().add(infoboard);
		infoboard.setEditable(false);
		
		mainPane.setCenter(centerPane);
		mainPane.setBottom(buttonPane);
		primaryStage.setTitle("폴더 내용 보여주기");
		primaryStage.setScene(new Scene(mainPane,400,200));
		primaryStage.show();
	}
	public static void main(String[] args){
		Application.launch(args);
	}
}
