package Model;
import View.*;

public class Model {

    int width;
    int height;

    public Model(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void update() {
    }

    public Shape[] getShapes() {
        Point[] points = {new Point(5,5), new Point (6, 4), new Point (6, 5), new Point (5, 4)};
        return (Shape[])points;
    }
}
