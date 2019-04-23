import processing.core.PApplet;

import javax.swing.*;

public class Task04 extends PApplet {
    public void settings(){
        String name = JOptionPane.showInputDialog("Enter your name:");

        background(255);
        fill(255, 0, 0);
        textSize(200);
        textAlign(CENTER, CENTER);
        text(name, width / 2, height /2);
    }

    public void draw(){
        int CenterX = width / 2;
        int CenterY = width / 2;
    }

    public static void main(String args[]) {
        PApplet.main("Task04");
    }
}
