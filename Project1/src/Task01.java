import processing.core.PApplet;

public class Task01 extends PApplet {
    public void settings(){
        fullScreen();
    }

    public void draw(){
        /*
            int centerX = width / 2;
            int centerY = height / 2;

            noStroke();

            background(88898);
            fill(255, 0, 0);

            ellipse(centerX, centerY, 100, 100);
        */

        noStroke();
        fill(0, 0, 0, 10);
        rect(0, 0, width, height);
        fill(255);
        ellipse(mouseX, mouseY, 100, 100);
    }

    public static void main(String[] args) {
        PApplet.main("Task01");
    }
}
