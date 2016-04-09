


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * This is the driver for this application.
 */
public class Driver extends Application {

    @Override
    public void start(Stage stage) {
    	
    	// Makes sure the dimensions of the window of GUI NEVER change -----------------
    	stage.setMinHeight(500);
    	stage.setMinWidth(939);
    	stage.setMaxHeight(500);
    	stage.setMaxWidth(939);
    	//------------------------------------------------------------------------------
    	
        Group root = new Group();
        Scene scene = new Scene(root,Color.rgb(245,245,245));
        VBox v = new VBox();
       
        // constructing all the nodes
        Construction c = new Construction();
        v.getChildren().addAll(c.firstNodeForVBox(),c.secondNodeForVBox(),c.thirdNodeForVBox(),c.fourthNodeForVBox());
        v.setLayoutX(1);
        v.setLayoutY(28);
        root.getChildren().addAll(v,Construction.createMenu());
        stage.setScene(scene);
        stage.setTitle("Artsy!");
        stage.sizeToScene();
        stage.show();
        
    } // createAndShowGUI

    public static void main(String[] args) {
        launch(args);
    } // main

} // Driver
