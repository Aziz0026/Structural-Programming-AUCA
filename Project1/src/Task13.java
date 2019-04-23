import processing.core.PApplet;

public class Task13 extends PApplet {
    private final int COUNT = 100;

    private float[] x = new float[COUNT];
    private float[] y = new float[COUNT];
    private float[] dy = new float[COUNT];
    private float[] radius = new float[COUNT];
    private float[] innerRadius = new float[COUNT];
    private int[] rayCount = new int[COUNT];


    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        strokeWeight(10);


        for (int i = 0; i < COUNT; i++) {
            radius[i] = random(10, 50);
            innerRadius[i] = radius[i] * 0.4f;
            x[i] = random(width);
            y[i] = -radius[i] * random(100);
            dy[i] = random(1, 4);
            rayCount[i] = (int) random(12, 20);
            rayCount[i] = rayCount[i] % 2 != 0 ? rayCount[i] + 1 : rayCount[i];
        }
    }

    public void draw() {
        background(0);

        strokeWeight(3);
        stroke(255);

        for (int i = 0; i < COUNT; i++) {
            snowflake(x[i], y[i], radius[i], innerRadius[i], rayCount[i]);

            y[i] += dy[i];
            if (y[i] - radius[i] > height) {
                y[i] = -radius[i] + random(100);
            }
        }
    }


    private void snowflake(float x, float y, float radius, float innerRadius, int ray_count) {
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
        PApplet.main("Task13");
    }
}
