package serialization;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;

public class SerializationApplication {
    public static void main(String[] args) {
        try(final ByteArrayOutputStream bos = new ByteArrayOutputStream();
            final ObjectOutputStream oos = new ObjectOutputStream(bos)){

            final UserInfo catsbi = new UserInfo("catsbi", "1234", 11);
            oos.writeObject(catsbi);
            final byte[] serializedInfo = bos.toByteArray();
            String str = Base64.getEncoder().encodeToString(serializedInfo);

            System.out.println("serializedInfo origin: "+ Arrays.toString(serializedInfo));
            System.out.println("serializedInfo: " + str);

            /*final byte[] tempSerializedInfo = {-84, -19, 0, 5, 115, 114, 0, 22, 115, 101, 114, 105, 97, 108, 105, 122, 97, 116, 105, 111, 110, 46, 85, 115, 101, 114, 73, 110, 102, 111, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 2, 73, 0, 3, 97, 103, 101, 76, 0, 4, 110, 97, 109, 101, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 120, 112, 0, 0, 0, 11, 116, 0, 6, 99, 97, 116, 115, 98, 105};
            final ByteArrayInputStream bis = new ByteArrayInputStream(tempSerializedInfo);
            final ObjectInputStream ois = new ObjectInputStream(bis);


            final UserInfo userInfo = (UserInfo) ois.readObject();

            System.out.println("userInfo = " + userInfo);*/


        }catch(IOException ie){
            ie.printStackTrace();
        }

    }
}
