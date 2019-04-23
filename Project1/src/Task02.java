import processing.core.PApplet;

public class Task02 extends PApplet {
    private int shade = 0;
    private int shadeDiff = 40;

    public static void main(String args[]){
        PApplet.main("Task02");
    }

    public void settings(){
        fullScreen();
    }

    public void draw(){
        if(shade > 255){
            shade = 255;
            shadeDiff -= shadeDiff;
        }else if(shade < 0){
            shade = 0;
            shadeDiff -= shadeDiff;
        }
        background(shade, 0, 0);

        shade += shadeDiff;
    }

}
