import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Construction {
	
private Group imgContainer;
private Text dimensions;
private GridPane grid1;
private GridPane grid2;
private GridPane grid3;
private VBox both;
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
static MenuItem item1;
static MenuItem item2;

	public Construction(){ /* Each instance of a Construction object will have its 
								own nodes that all work together to make the complex nodes of the GUI of 
								the MyArtsy class.*/

		 Group imgContainer;
		 Text dimensions;
		 GridPane grid1;
		 GridPane grid2;
		 GridPane grid3;
		 VBox both;
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
		imgContainer.getChildren().addAll(r1,dimensions);
		return imgContainer;
		
	}
	

// Where i stopped.	
//	public static void createMenu(){ 
//	bar = new MenuBar();
//	men = new Menu("File");
//	item1 = new Menu("Image")
//	
//	}
	
	
	
	
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
		grid3.add(Construction.imageSlot(), 0, 0);
		grid3.add(Construction.imageSlot(), 1, 0);
		grid3.add(Construction.imageSlot(), 2, 0);
		return grid3;
	}

	public VBox fourthNodeForVBox(){
		
	// a grid is allocated for the sets of rotate and reset buttons.
	// Both of these gridpanes will be placed in the VBox called 'both'.
	// The node 'both' will be returned by the method.
	
	
	both = new VBox();
	
	rotateButtons = new GridPane();	
	//setPadding keeps the first button a certain length away from the left edge of the window.
	// the Hgap spaces the buttons out.
	
	rotateButtons.setPadding(new Insets(5));
	rotateButtons.setHgap(190);
	
	resetButtons = new GridPane();
	//setPadding keeps the first button a certain length away from the left edge of the window.
	// the Hgap spaces the buttons out.
	resetButtons.setPadding(new Insets(5));
	resetButtons.setHgap(200);	
	
	// Creation and placement of Rotate buttons
	rot1 = new Button ("Rotate");
	rot2 = new Button ("Rotate");
	rot3 = new Button ("Rotate");
	
	rotateButtons.add(rot1, 0, 0);
	rotateButtons.add(rot2, 1, 0);
	rotateButtons.add(rot3, 3, 0);
	
	// Creation and placement of Reset buttons
	rst1 = new Button ("Reset");
	rst2 = new Button ("Reset");
	rst3 = new Button ("Reset");
	
	resetButtons.add(rst1, 0, 0);
	resetButtons.add(rst2, 1, 0);
	resetButtons.add(rst3, 3, 0);
	
	// Placing both gridpanes into VBox.
	
	both.getChildren().addAll(rotateButtons,resetButtons);
	return both;
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

}
