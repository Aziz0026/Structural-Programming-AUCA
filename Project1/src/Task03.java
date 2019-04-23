import processing.core.PApplet;

public class Task03 extends PApplet {
    private final int SIZE = 100;
    private final int HALF_SIZE = SIZE / 2;

    private int x;
    private int y;

    private int dx = 8;
    private int dy = 3;

    public static void main(String args[]) {
        PApplet.main("Task03");
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        y = height / 2;
    }

    public void draw() {
        background(0);
        noStroke();

        fill(255);
        ellipse(x, y, SIZE, SIZE);

        x += dx;
        if (x + HALF_SIZE > 255) {
            dx = -dx;
        } else if (x - HALF_SIZE < 0) {
            dx = -dx;
        }

        y += dy;
        if (y + HALF_SIZE > 255) {
            dy -= dy;
        } else if (y - HALF_SIZE < 0) {
            dy -= dy;
        }
    }
}
