


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
    	
        Group root = new Group();
        Scene scene = new Scene(root,Color.rgb(245,245,245));
        VBox v = new VBox();
       
        // constructing all the nodes
        Construction c = new Construction();
        v.getChildren().addAll(c.firstNodeForVBox(),c.secondNodeForVBox(),c.thirdNodeForVBox(),c.fourthNodeForVBox());
        root.getChildren().add(v);
        
        stage.setScene(scene);
        stage.setTitle("Artsy!");
        stage.sizeToScene();
        stage.show();
        
    } // createAndShowGUI

    public static void main(String[] args) {
        launch(args);
    } // main

} // Driver
