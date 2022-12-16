package Model;
import View.*;

public class Model {

    int width;
    int height;
    int size;

    public Model(int width, int height) {
        this.width = width;
        this.height = height;
        this.size = width * height;
    }

    public void update() {

    }

    public Shape[] getShapes() {
        isAlive(width, height, shapes)
        Point[] points = {new Point(5,5), new Point (6, 5), new Point (7, 5)};
        return (Shape[])points;
    }



    protected int isAlive(int x, int y, byte[] d){

        int count = 0;
        int pos1 = y * width + x;

        for ( int i = x-1; i <= x + 1; i++ ){

            for ( int j = y - 1; j <= y + 1; j++ ){
                int pos = j * width + i;

                if ( pos >= 0 && pos < size - 1 && pos != pos1){

                    if ( d[pos] == 1 ){

                        count++;
                    }
                }
            }
        }
        //dead

        if ( d[pos1] == 0 ){
            if ( count == 3 ){//becomes alive.
                return 1;
            }
            return 0;//still dead

        }else{//live
            if ( count < 2 || count > 3 ){//Dies
                return 0;
            }
            return 1;//lives
        }
    }
}
