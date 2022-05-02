package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    Panel gridCanvas;
    @Override
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        gridCanvas =new Panel(Panel.SCREENWIDTH, Panel.SCREENHEIGHT);
        Pane pane =new Pane(gridCanvas);
        Scene scene =new Scene(pane);
        gridCanvas.setDefaultValues(scene);
        Circle c = new Circle(150,15,10);
        root.getChildren().add(gridCanvas);
        root.getChildren().add(c);
        stage.setResizable(false);// fenêtre non redimensionable        
        stage.setTitle("Mon Zelda");        
        stage.centerOnScreen();// centrage sur l'écran        
        stage.setScene(scene);        
        stage.show();
    }




    public static void main(String[] args) {
        launch();
    }

}