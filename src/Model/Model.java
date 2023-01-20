package Model;
import View.*;

import java.util.ArrayList;

public class Model {

    int width;
    int height;

    int numalive = 0;


    int[] cells = new int[50 * 50];
    int[] alive = new int[numalive];

    public Model(int width, int height) {
        this.width = width;
        this.height = height;
        cells[255] = 1;
    }


    public void update() {
        checkCells();
        getNeighbour();
    }


    public Shape[] getShapes() {

        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(7, 8));


        Point[] pixelsToDisplay = new Point[points.size()];
        points.toArray(pixelsToDisplay);

        return (Shape[]) points;
    }


    public void checkCells() {
        int n = 0;
        int x;

        for (int z = 0; z < cells.length; z++) {
            if (cells[z] == 1) {
                numalive++;
            }
        }


        for (int i = 0; i < cells.length; i++) {
            if (cells[i] == 1) {
                x = i;
                alive[n] = x;
                n++;
            } else {
                System.out.println("isDead");
            }
        }

        System.out.println(n);
    }


    public int getNeighbour() {
        int grannar = 0;


        for (int i = 0; i < alive.length; i++) {
            if (cells[alive[i] - 51] == 1) {
                grannar++;
            }
            if (cells[alive[i] - 50] == 1) {
                grannar++;
            }
            if (cells[alive[i] - 49] == 1) {
                grannar++;
            }
            if (cells[alive[i] - 1] == 1) {
                grannar++;
            }
            if (cells[alive[i] + 1] == 1) {
                grannar++;
            }
            if (cells[alive[i] + 49] == 1) {
                grannar++;
            }
            if (cells[alive[i] + 50] == 1) {
                grannar++;
            }
            if (cells[alive[i] + 51] == 1) {
                grannar++;
            }
                System.out.println(alive[i] + " has " + grannar + " grannar");
                grannar = 0;
            }
        return grannar;
    }
}