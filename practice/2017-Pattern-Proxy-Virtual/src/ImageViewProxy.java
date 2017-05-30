import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewProxy extends ImageView{
	
	private Image tmpImage = new Image("progress.gif");
	
	public void setImage(String url){
		
		setImage(tmpImage);
		Thread retrievalThread = new Thread(new Runnable(){
			public void run(){
				try{
					Image actualImage = new Image(url);
					setImage(actualImage);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		retrievalThread.start();
	}
}
