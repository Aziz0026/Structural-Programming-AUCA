import processing.core.PApplet;

import javax.swing.*;

public class Task05 extends PApplet {
    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(255);
        fill(255, 0, 0);
        textSize(200);
        textAlign(CENTER, CENTER);

        int a = Integer.valueOf(JOptionPane.showInputDialog("Enter first digit:"));
        int b = Integer.valueOf(JOptionPane.showInputDialog("Enter second digit:"));

        int result =  a + b;

        text("%d + %d = %d", a, b, result);
    }

    public void draw(){
        int CenterX = width / 2;
        int CenterY = height / 2;
    }

    public static void main(String args[]){
        PApplet.main("Task05");
    }
}
