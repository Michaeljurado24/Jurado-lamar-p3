package cs1302.p2;

import cs1302.effects.Artsy;
import cs1302.p2.MyArtsy;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.image.ImageView;

//my own imports (Hope this works)
import java.io.File;
import javafx.scene.image.Image;;
import javax.imageio.ImageIO;

/**
 * This is the driver for this application.
 */
public class testDriver extends Application {

    @Override
    public void start(Stage stage) {
    MyArtsy tricks = new MyArtsy();
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Artsy!");
        stage.sizeToScene();
//experiment reading an image stored in samp
   // File newFile = new File("samples/sample1.png");
    System.out.println("This is working so far");
    Image image =  new Image("file:samples/sample1.png");
    Image image2 = new Image("file:samples/sample2.png");
    //root.getChildren().add(new ImageView(image));
    //System.out.println("First imageadded");
    ImageView hi = new ImageView(tricks.doCheckers(image, image2, 20));
    //ImageView hi = new ImageView(tricks.doHorizontalStripes(image, image2, 20));
    root.getChildren().add(hi);
        stage.show();


    } // createAndShowGUI

    public static void main(String[] args) {
        launch(args);
    } // main

} // Driver
