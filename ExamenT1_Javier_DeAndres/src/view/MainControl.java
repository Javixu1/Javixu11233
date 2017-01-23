package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainControl {
	
	private AnchorPane rootLayout;
	 @FXML
	    private void initialize() {
	    }

	 public void showImage() {
		 try {
	            // Load the fxml file and create a new stage for the popup.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainControl.class.getResource("Segundaa.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("FormulariodeRegistro");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);

	            
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}

	    

	    /**
	     * Called when the user clicks ok.
	     */
	    @FXML
	    private void handledie() {
	    	showImage();
	    }

	    /**
	     * Called when the user clicks cancel.
	     */
	
	 
}
