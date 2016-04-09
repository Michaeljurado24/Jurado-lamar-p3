import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

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
private boolean image1selected;
private boolean image2selected;



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
		 
	}


	public static Group imageSlot(){
		Group imgContainer = new Group();
		Rectangle r1 = new Rectangle(300,300,Color.rgb(190,190,190));
		Text dimensions = new Text("300 x 300");
		dimensions.setFill(Color.rgb(140, 140, 140));
		dimensions.setScaleY(4);
		dimensions.setScaleX(4);
		dimensions.setX(110);
		dimensions.setY(140);

		imgContainer.getChildren().addAll(r1, dimensions);
		return imgContainer;

	}



	public  MenuBar createMenu(){
	bar = new MenuBar();
	bar.setPrefWidth(939);

	men = new Menu("File");
	item2 = new MenuItem("Save Result As");

	//openign files
	item1 = new Menu("Open");
	item3 = new CheckMenuItem("Open Image 1");
	item3.setOnAction(event -> bindedImage1.setImage(new Image("/sample1.png")));
	item4 = new CheckMenuItem("Open Image 2");
	item4.setOnAction(event -> bindedImage2.setImage(new Image("/sample2.png")));
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
		vertical = new Button("Vertical Stripes");
		horizontal = new Button("Horizontal Stripes");

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
	//rot1.setOnAction(event ->  = tricks.doRotate(picture1, 90) );

	rot2 = new Button ("Rotate");
	rot3 = new Button ("Rotate");


	// Creation and placement of Reset buttons
	rst1 = new Button ("Reset");
	rst2 = new Button ("Reset");
	rst3 = new Button ("Reset");

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
