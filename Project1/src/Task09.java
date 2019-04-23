import processing.core.PApplet;

public class Task09 extends PApplet {

    public void settings(){
        fullScreen();
    }

    public void setUp(){
        background(0);
        noStroke();

        final int CIRCLE_COUNT  = 100;
        final int MIN_DIAMETER = 10;
        final int MAX_DIAMETER = 100;

        for(int i = 0; i < CIRCLE_COUNT; i++){
            // TODO

            int x = (int) random(width);
            int y = (int) random(height);
            int diameter = (int) random(MIN_DIAMETER, MAX_DIAMETER);

            int red = (int) random(256);
            int green = (int) random(256);
            int blue = (int) random(256);

            fill(red, green, blue);
            ellipse(x, y, diameter, diameter);
        }
    }

    public static void main(String args[]){
        PApplet.main("Task09");
    }
}
