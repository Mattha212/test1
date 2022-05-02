package hellofx;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Panel extends Canvas {
    public static int TITLESIZE= 48;
    public static int MAXSCREENCOL = 15;
    public static int MAXSCREENROW = 15;
    public static int SCREENWIDTH = TITLESIZE*MAXSCREENCOL;
    public static int SCREENHEIGHT = TITLESIZE*MAXSCREENROW;

    protected GraphicsContext gc;
    protected Scene scene;


    public Panel(int w, int h)
    {
        super(w,h);        
        gc =this.getGraphicsContext2D();
        double height =this.getHeight();
        double width =this.getWidth();
        for(int i =0; i < width; i +=50)       
             gc.strokeLine(0, i, width, i);
        for(int i =0; i < width; i +=50)       
             gc.strokeLine(i,0, i, height);
            }
    public void setDefaultValues(Scene s)
    {
        scene=s;
    }
}
