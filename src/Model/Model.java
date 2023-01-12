package Model;
import View.*;

import java.util.ArrayList;

public class Model {

    int width;
    int height;
    int size;
    int[] world = new int[size];

    public Model(int width, int height) {
        this.width = width;
        this.height = height;
        this.size = width * height;
        this.world = world;
    }

    public void update() {

    }


    public Shape[] getShapes() {
        ArrayList <Point> points = new ArrayList<Point>();
        points.add(new Point (6, 5));
        points.add(new Point (5, 5));
        return (Shape[])points;
    }

    public void checkCell(){
        for(int i = 0; i < size; i++) {

        }

    }

}