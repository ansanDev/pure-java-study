package serialization;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String name;

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", obj=" + obj +
                '}';
    }

    transient private String password;
    private int age;

    transient private Object obj = new Object();






    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
