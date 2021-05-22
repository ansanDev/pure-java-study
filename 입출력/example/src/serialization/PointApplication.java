package serialization;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class PointApplication {
    public static void main(String[] args) {
        try(final FileOutputStream fos = new FileOutputStream("./example/src/serialization/pointSerial.txt");
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            final FileInputStream fis = new FileInputStream("./example/src/serialization/pointSerial.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis)){

            /*final ColorPoint bluePoint = new ColorPoint(0, 1, "blue");

            oos.writeObject(bluePoint);*/

            final ColorPoint colorPoint = (ColorPoint) ois.readObject();
            System.out.println("colorPoint = " + colorPoint);


        }catch(IOException | ClassNotFoundException ie){
            ie.printStackTrace();
        }
    }
}
