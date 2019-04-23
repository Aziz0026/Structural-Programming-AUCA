import processing.core.PApplet;

public class Task12 extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        strokeWeight(10);

        final float MARGIN = 220;
        final float CENTER_START_RADIUS = 400;
        final float OUTER_STAR_RADIUS = 200;
        final int RAY_COUNT = 8;

        stroke(0xFFFF0000);
        start(width / 2, height / 2, CENTER_START_RADIUS, CENTER_START_RADIUS * 0.4f, 8);
        stroke(250, 218, 94);
        start(MARGIN, MARGIN, OUTER_STAR_RADIUS, OUTER_STAR_RADIUS * 0.4f, RAY_COUNT);
        start(width - MARGIN, MARGIN, OUTER_STAR_RADIUS, OUTER_STAR_RADIUS * 0.4f, RAY_COUNT);
        start(width - MARGIN, height - MARGIN, OUTER_STAR_RADIUS, OUTER_STAR_RADIUS * 0.4f, RAY_COUNT);
        start(MARGIN, height - MARGIN, OUTER_STAR_RADIUS, OUTER_STAR_RADIUS * 0.4f, RAY_COUNT);

    }

    private void start(float x, float y, float radius, float innerRadius, int ray_count) {
        float angle = 0;
        float deltaAngle = TWO_PI / ray_count;


        float prevEndX = x + cos(angle - deltaAngle) * innerRadius;
        float prevEndY = y + sin(angle - deltaAngle) * innerRadius;

        for (int i = 0; i < ray_count; i++, angle += deltaAngle) {
            float selectRadius = i % 2 == 0 ? radius : innerRadius;
            float endX = x + cos(angle) * selectRadius;
            float endY = y + sin(angle) * selectRadius;

            line(x, y, endX, endY);
            line(endX, endY, prevEndX, prevEndY);

            prevEndX = endX;
            prevEndY = endY;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Task12");
    }
}
