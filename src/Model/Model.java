package Model;
import View.*;

public class Model {

    int width;
    int height;

    int[] cells = new int[50 * 50];

    public Model(int width, int height) {
        this.width = width;
        this.height = height;
        cells[255] = 1;
    }


    public void update() {
        int n = 0;
        for (int i = 0; i < cells.length; i++) {
            if (cells[i] == 1) {
                n++;
                System.out.println("isAlive");
            } else {
                System.out.println("isDead");
            }
        }
        System.out.println(n);
    }



    public Shape[] getShapes() {

        Point[] points = {new Point(5,5)};
        return (Shape[])points;
    }


}