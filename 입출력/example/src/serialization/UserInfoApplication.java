package serialization;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class UserInfoApplication {
    public static void main(String[] args) {
        try(final FileOutputStream fos = new FileOutputStream("./example/src/serialization/userinfoSerial.ser");
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            final FileInputStream fis = new FileInputStream("./example/src/serialization/userinfoSerial.ser");
            final ObjectInputStream ois = new ObjectInputStream(fis)){

            //step1. 최초 serial 읽어보기
            System.out.println(fis.available());

            UserInfo info1 = new UserInfo("catsbi", "1234", 12);
            UserInfo info2 = new UserInfo("crong", "5678", 45);
            UserInfo info3 = new UserInfo("bibi", "1111", 67);

            final List<UserInfo> infos = Arrays.asList(info1, info2, info3);
            oos.writeObject(infos);

            final List<UserInfo> list = (List) ois.readObject();
            for (UserInfo userInfo : list) {
                System.out.println("userInfo = " + userInfo);
            }


        }catch(IOException | ClassNotFoundException ie){
            ie.printStackTrace();
        }

    }
}
