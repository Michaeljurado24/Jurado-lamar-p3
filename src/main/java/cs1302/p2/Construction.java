import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
//my own image imports
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Construction {

private Group imgContainer;
private Text dimensions;
private GridPane grid1;
private GridPane grid2;
private GridPane grid3;
private HBox collection;
private GridPane rotateButtons;
private GridPane resetButtons;
private Button checkers;
private Button vertical;
private Button horizontal;
private Button rot1;
private Button rot2;
private Button rot3;
private Button rst1;
private Button rst2;
private Button rst3;
private Text pictureLabel1;
private Text pictureLabel2;
private Text pictureLabel3;
static MenuBar bar;
static Menu men;
static Menu item1;
static MenuItem item2;
static MenuItem exit;
static CheckMenuItem item3;
static CheckMenuItem item4;
static MenuItem saveitem;
private FileChooser fileChooserForBindedImage1 = new FileChooser();
private FileChooser fileChooserForBindedImage2 = new FileChooser();
private FileChooser fileChooserForBindedImage3 = new FileChooser();

//some additonal attributes for the images

private MyArtsy tricks;
private ImageView bindedImage1 = new ImageView(new Image("default.png"));
private ImageView bindedImage2 = new ImageView(new Image("default.png"));
private ImageView bindedImage3 = new ImageView(new Image("default.png"));
	public Construction(){ /* Each instance of a Construction object will have its
								own nodes that all work together to make the complex nodes of the GUI of
								the MyArtsy class.*/
		//setting picture initially
		tricks = new MyArtsy();

		 Group imgContainer;
		 Text dimensions;
		 GridPane grid1;
		 GridPane grid2;
		 GridPane grid3;
		 HBox collection;
		 GridPane rotateButtons;
		 GridPane resetButtons;
		 Button checkers;
		 Button vertical;
		 Button horizontal;
		 Button rot1;
		 Button rot2;
		 Button rot3;
		 Button rst1;
		 Button rst2;
		 Button rst3;
		 Text pictureLabel1;
		 Text pictureLabel2;
		 Text pictureLabel3;
		 ImageView bindedImage1;
		 ImageView bindedImage2;
		 ImageView bindedImage3;
		 FileChooser fileChooserForBindedImage1;
		 FileChooser fileChooserForBindedImage2;
		 FileChooser fileChooserForBindedImage3;

	}




	public  MenuBar createMenu(){
	bar = new MenuBar();
	bar.setPrefWidth(939);

	men = new Menu("File");
	item2 = new MenuItem("Save Result As");

	//openign files
	item1 = new Menu("Open");
	item3 = new CheckMenuItem("Open Image 1");
	item3.setOnAction(event -> {
	Stage stage = new Stage();

	fileChooserForBindedImage1.setTitle("Image For Image 1...");
	
	// puts the user in a initial file using a path
	fileChooserForBindedImage1.setInitialDirectory(new File("C:\\Users\\Jarrad\\Desktop\\samples")); // IDK how this is going to act, on nike.
	
	
    fileChooserForBindedImage1.getExtensionFilters().addAll(

            new FileChooser.ExtensionFilter("PNG Only", "*.png")
        );

	// makes the file chooser pop up in the stage made earlier in this lambda expression. 
	//This last line of code  is needed for everything to show up/work.
	File fileSelectedForImage1 = 	fileChooserForBindedImage1.showOpenDialog(stage);
    		if (fileSelectedForImage1 != null) {
    			bindedImage1.setImage(new Image(fileSelectedForImage1.toURI().toString()));
    		}
	
	});
	


//	item3.setOnAction(event -> bindedImage1.setImage(new Image("/sample1.png")));
	item4 = new CheckMenuItem("Open Image 2");
	
	item4.setOnAction(event -> {
		Stage stage = new Stage();

		fileChooserForBindedImage2.setTitle("Image For Image 2...");
		
		// puts the user in a initial file using a path
		fileChooserForBindedImage2.setInitialDirectory(new File("C:\\Users\\Jarrad\\Desktop\\samples")); // IDK how this is going to act, on nike.
		
		
	    fileChooserForBindedImage2.getExtensionFilters().addAll(

	            new FileChooser.ExtensionFilter("PNG Only", "*.png")
	        );
		
		
		// makes the file chooser pop up in the stage made earlier in this lambda expression. 
		//This line of code  is needed for everything to show up/work.------------------------
		fileChooserForBindedImage2.showOpenDialog(stage);
		//------------------------------------------------------------------------------------
		
		
		File fileSelectedForImage2 = 	fileChooserForBindedImage2.showOpenDialog(stage);
		if (fileSelectedForImage2 != null) {
			bindedImage2.setImage(new Image(fileSelectedForImage2.toURI().toString()));
		}
	
		});
	
	
	
	
	
	
	
	
// Where I'm working 2:19pm ------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------
	saveitem = new MenuItem("Save Result As..."); 
	saveitem.setOnAction(event -> {
		Stage stage = new Stage();

		fileChooserForBindedImage3.setTitle("Save Result In Directory...");
		
		// puts the user in a initial file using a path
		fileChooserForBindedImage3.setInitialDirectory(new File("C:\\Users\\Jarrad\\Desktop\\samples")); // IDK how this is going to act, on nike.
		
		
	    fileChooserForBindedImage3.getExtensionFilters().addAll(
	    		new FileChooser.ExtensionFilter("All Images", "*.*"),
	            new FileChooser.ExtensionFilter("PNG Only", "*.png")
	        );
		
		
		// makes the file chooser pop up in the stage made earlier in this lambda expression. 
		//This line of code  is needed for everything to show up/work.------------------------
		fileChooserForBindedImage3.showSaveDialog(stage);
		//------------------------------------------------------------------------------------
		
		
		File fileSelectedForImage3 = 	fileChooserForBindedImage2.showSaveDialog(stage);
		if (fileSelectedForImage3 != null) {
			bindedImage2.setImage(new Image(fileSelectedForImage3.toURI().toString()));
		}
	
		});
	
// --------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	item1.getItems().addAll(item3,item4);

	//for exit menu option
	exit = new MenuItem("Exit");
	exit.setOnAction(e -> System.exit(0) );

	men.getItems().addAll(item1,new SeparatorMenuItem(),item2, new SeparatorMenuItem(),exit);

	bar.getMenus().add(men);
	return bar;

	}




	public GridPane firstNodeForVBox(){

		grid1 = new GridPane(); // The GridPane to hold the first three buttons of the GUI
		
		// The buttons
		checkers = new Button("Checkers");
		checkers.setOnAction( event -> 
		  {Stage s = new Stage();
		  Group g = new Group();
		  Scene s1 = new Scene( g, 400, 200);
		  Text txt = new Text("Enter a integer to serve as width of each checker,in pixels");
		  TextField txtfield = new TextField();
		  Button cancel = new Button("Cancel");
		  cancel.setOnAction(e -> System.exit(0) );
		  Button okay = new Button("Okay");
		  
		  
		  okay.setOnAction(e1 -> {
				int width = Integer.parseInt(txtfield.getCharacters().toString() );
			 	bindedImage3.setImage(tricks.doCheckers(bindedImage1.getImage(),
				bindedImage2.getImage(), width ) );
				s.close();
		  		});	
			
		  txtfield.setMaxWidth(200);

		  txt.setX(90);
		  txt.setY(50);

		  txtfield.setLayoutX(120);
		  txtfield.setLayoutY(60);

		  cancel.setLayoutX(130);
		  cancel.setLayoutY(100);

		  okay.setLayoutX(200);
		  okay.setLayoutY(100);

		  g.getChildren().addAll(txt,txtfield,cancel,okay);
		  s.setScene(s1);
		  s.show();
		  });
		
		
		
		
		vertical = new Button("Vertical Stripes");
		vertical.setOnAction( event -> 
		  {Stage s = new Stage();
		  Group g = new Group();
		  Scene s1 = new Scene( g, 400, 200);
		  Text txt = new Text("Enter a integer to serve as width of vertical stripes,in pixels");
		  TextField txtfield = new TextField();
		  Button cancel = new Button("Cancel");
		  cancel.setOnAction(e -> System.exit(0) );
		  Button okay = new Button("Okay");
		  
		  
		  okay.setOnAction(e1 -> {
				int width = Integer.parseInt(txtfield.getCharacters().toString() );
			 	bindedImage3.setImage(tricks.doVerticalStripes(bindedImage1.getImage(),
				bindedImage2.getImage(), width ) );
				s.close();
		  		});	
			
		  txtfield.setMaxWidth(200);

		  txt.setX(90);
		  txt.setY(50);

		  txtfield.setLayoutX(120);
		  txtfield.setLayoutY(60);

		  cancel.setLayoutX(130);
		  cancel.setLayoutY(100);

		  okay.setLayoutX(200);
		  okay.setLayoutY(100);

		  g.getChildren().addAll(txt,txtfield,cancel,okay);
		  s.setScene(s1);
		  s.show();
		  });
		
		
		horizontal = new Button("Horizontal Stripes");
		horizontal.setOnAction( (event) -> 
		  {Stage s = new Stage();
		  Group g = new Group();
		  Scene s1 = new Scene( g, 400, 200);
		  Text txt = new Text("Enter a integer to serve as width of horiztonal stripes,in pixels");
		  TextField txtfield = new TextField();
		  Button cancel = new Button("Cancel");
		  cancel.setOnAction(e -> System.exit(0) );
		  Button okay = new Button("Okay");
		  
		  
		  okay.setOnAction(e1 -> {
				int width = Integer.parseInt(txtfield.getCharacters().toString() );
			 	bindedImage3.setImage(tricks.doHorizontalStripes(bindedImage1.getImage(),
				bindedImage2.getImage(), width ) );
				s.close();
		  		});	
			
		  txtfield.setMaxWidth(200);

		  txt.setX(90);
		  txt.setY(50);

		  txtfield.setLayoutX(120);
		  txtfield.setLayoutY(60);

		  cancel.setLayoutX(130);
		  cancel.setLayoutY(100);

		  okay.setLayoutX(200);
		  okay.setLayoutY(100);

		  g.getChildren().addAll(txt,txtfield,cancel,okay);
		  s.setScene(s1);
		  s.show();
		  });
		  
		  
		// spaced out the buttons and thickened the invisible border of the GridPane
		grid1.setPadding(new Insets(4));
		grid1.setHgap(12);

		grid1.add(checkers, 0, 0);
		grid1.add(vertical, 1, 0);
		grid1.add(horizontal, 2,0);

		return grid1;
	}

	public GridPane secondNodeForVBox(){

	grid2 = new GridPane();
	HBox large = new HBox(201);
	large.setPadding(new Insets(5));

	HBox small1 = new HBox();
	HBox small2 = new HBox();
	HBox small3 = new HBox();


	Text image1 = new Text("Image1: ");

	Text image2 = new Text("Image2: ");

	pictureLabel1 = new Text("default.png");
	pictureLabel2 = new Text("default.png");
	pictureLabel3 = new Text("Result");

	small1.getChildren().addAll(image1, pictureLabel1);
	small2.getChildren().addAll(image2, pictureLabel2);
	small3.getChildren().addAll(pictureLabel3);

	large.getChildren().addAll(small1,small2,small3);

	grid2.add(large, 0, 0);

	return grid2;
	}

	public GridPane thirdNodeForVBox(){

		grid3 = new GridPane();
		grid3.setHgap(8);
		grid3.setPadding(new Insets(3));


		//bindedImage3.setImage();
		grid3.add(bindedImage1, 0, 0);
		grid3.add(bindedImage2 , 1, 0);
		grid3.add(bindedImage3, 2, 0);
		return grid3;
	}

	public HBox fourthNodeForVBox(){

	// Creates an HBox that holds three VBoxes that hold inside of them two buttons.
	// Each button in each VBox is spaced out using setMargin method.


	collection = new HBox(252);
	collection.setPadding(new Insets(3));
	VBox firstSet = new VBox();
	VBox secondSet = new VBox();
	VBox thirdSet = new VBox();

	// Creation and placement of Rotate buttons
	rot1 = new Button ("Rotate");
	rot1.setOnAction( event -> 
	  {Stage s = new Stage();
	  Group g = new Group();
	  Scene s1 = new Scene( g, 400, 200);
	  Text txt = new Text("Enter a integer to serve as degrees of rotation.");
	  TextField txtfield = new TextField();
	  Button cancel = new Button("Cancel");
	  cancel.setOnAction(e -> System.exit(0) );
	  Button okay = new Button("Okay");
	  
	  
	  okay.setOnAction(e1 -> {
			int width = Integer.parseInt(txtfield.getCharacters().toString() );
		 	bindedImage1.setImage(tricks.doRotate(bindedImage1.getImage(), width ) );
			s.close();
	  		});	
		
	  txtfield.setMaxWidth(200);

	  txt.setX(90);
	  txt.setY(50);

	  txtfield.setLayoutX(120);
	  txtfield.setLayoutY(60);

	  cancel.setLayoutX(130);
	  cancel.setLayoutY(100);

	  okay.setLayoutX(200);
	  okay.setLayoutY(100);

	  g.getChildren().addAll(txt,txtfield,cancel,okay);
	  s.setScene(s1);
	  s.show();
	  });
	
	

	rot2 = new Button ("Rotate");
	rot2.setOnAction( event -> 
	  {Stage s = new Stage();
	  Group g = new Group();
	  Scene s1 = new Scene( g, 400, 200);
	  Text txt = new Text("Enter a integer to serve as degrees of rotation.");
	  TextField txtfield = new TextField();
	  Button cancel = new Button("Cancel");
	  cancel.setOnAction(e -> System.exit(0) );
	  Button okay = new Button("Okay");
	  
	  
	  okay.setOnAction(e1 -> {
			int width = Integer.parseInt(txtfield.getCharacters().toString() );
		 	bindedImage2.setImage(tricks.doRotate(bindedImage1.getImage(), width ) );
			s.close();
	  		});	
		
	  txtfield.setMaxWidth(200);

	  txt.setX(90);
	  txt.setY(50);

	  txtfield.setLayoutX(120);
	  txtfield.setLayoutY(60);

	  cancel.setLayoutX(130);
	  cancel.setLayoutY(100);

	  okay.setLayoutX(200);
	  okay.setLayoutY(100);

	  g.getChildren().addAll(txt,txtfield,cancel,okay);
	  s.setScene(s1);
	  s.show();
	  });
	
	
	
	rot3 = new Button ("Rotate");
	rot3.setOnAction( event -> 
	  {Stage s = new Stage();
	  Group g = new Group();
	  Scene s1 = new Scene( g, 400, 200);
	  Text txt = new Text("Enter a integer to serve as degrees of rotation.");
	  TextField txtfield = new TextField();
	  Button cancel = new Button("Cancel");
	  cancel.setOnAction(e -> System.exit(0) );
	  Button okay = new Button("Okay");
	  
	  
	  okay.setOnAction(e1 -> {
			int width = Integer.parseInt(txtfield.getCharacters().toString() );
		 	bindedImage3.setImage(tricks.doRotate(bindedImage1.getImage(), width ) );
		 	
			s.close();
	  		});	
		
	  txtfield.setMaxWidth(200);

	  txt.setX(90);
	  txt.setY(50);

	  txtfield.setLayoutX(120);
	  txtfield.setLayoutY(60);

	  cancel.setLayoutX(130);
	  cancel.setLayoutY(100);

	  okay.setLayoutX(200);
	  okay.setLayoutY(100);

	  g.getChildren().addAll(txt,txtfield,cancel,okay);
	  s.setScene(s1);
	  s.show();
	  });
	
	


	// Creation and placement of Reset buttons
	rst1 = new Button ("Reset");
	rst1.setOnAction(event -> bindedImage1.setImage(new Image("/sample1.png")));
	rst2 = new Button ("Reset");
	rst2.setOnAction(event -> bindedImage2.setImage(new Image("/sample2.png")));
	rst3 = new Button ("Reset");
	rst3.setOnAction(event -> bindedImage3.setImage(new Image("/default.png")));

	// Add spacing around the buttons
	firstSet.getChildren().addAll(rot1,rst1);
	firstSet.setMargin(rot1, new Insets(3,3,3,3));
	firstSet.setMargin(rst1, new Insets(3,3,3,3));

	secondSet.getChildren().addAll(rot2,rst2);
	secondSet.setMargin(rot2, new Insets(3,3,3,3));
	firstSet.setMargin(rst2, new Insets(3,3,3,3));

	thirdSet.getChildren().addAll(rot3,rst3);
	thirdSet.setMargin(rot3, new Insets(3,3,3,3));
	firstSet.setMargin(rst3, new Insets(3,3,3,3));

	collection.getChildren().addAll(firstSet,secondSet,thirdSet);
	return collection;
	}

	public Button getCButton(){
		return checkers;
	}

	public Button getHButton(){
		return horizontal;
	}

	public Button getVButton(){
		return vertical;
	}

	public Button getR1Button(){
		return rot1;
	}

	public Button getR2Button(){
		return rot2;
	}

	public Button getR3Button(){
		return rot3;
	}


	public Button getRS1Button(){
		return rst1;
	}

	public Button getRS2Button(){
		return rst2;
	}

	public Button getRS3Button(){
		return rst3;
	}

	/* So after getting the images to load up ontop of the 300x300 spaces to change the label above them use the following code:
	 The Construction object in Driver.java is named 'c' so I'll use it as the object the method is being called on.
	 Ex:
	 	c.getPictureLabelOne().setText(" Label's New Name ");
	 	*/
	public Text getPictureLabelOne(){
		return pictureLabel1;
	}

	public Text getPictureLabelTwo(){
		return pictureLabel2;
	}
}
