package cs1302.p2;

import javafx.scene.control.Menu;

public class ExitMenu  extends Menu{

  public ExitMenu() {
    super("exit");
    this.setOnAction(event -> System.exit(0));

  }
}
