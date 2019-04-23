import processing.core.PApplet;

public class Task11 extends PApplet {
    private int earthOrbitAngle = 0;
    private int moonOrbitAngle = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        background(0);
        //Sun
        final int SUN_DIAMETER = 350;

        translate(width / 2, height / 2);
        fill(255, 255, 0);
        ellipse(0, 0, SUN_DIAMETER, SUN_DIAMETER);

        //Earth
        final int EARTH_DIAMETER = 70;

        rotate(radians(earthOrbitAngle));
        translate(350, 0);
        fill(0xff40abff);
        ellipse(0, 0, EARTH_DIAMETER, EARTH_DIAMETER);

        earthOrbitAngle += 2;

        //MOON
        final int MOON_DIAMETER = 20;

        rotate(radians(moonOrbitAngle));
        translate(0, 60);
        fill(255, 255, 255);
        ellipse(0, 0, MOON_DIAMETER, MOON_DIAMETER);

        moonOrbitAngle -= 5;
    }


    public static void main(String[] args) {
        PApplet.main("Task11");
    }
}
