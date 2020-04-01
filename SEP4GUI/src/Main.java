import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application{
	@FXML private TextFieldtext;
	@FXML private Button clickMe;
	
	public void start(Stage window) throws IOException{
		window.setTitle("A Simple Window 3");
		FXMLLoaderloader = new FXMLLoader();
		loader.setLocation(getClass().getResource("SimpleGUI3.fxml"));
		Scene scene= new Scene(loader.load());
	
		window.setScene(scene);
		window.show();
		}
	public static void main(String[] args){
		launch(args);
		}
	public void handleClickMe(ActionEvent e)
	{
		if(e.getSource() == clickMe)
		{
			text.setText("Hello");
			}
		}
	}
