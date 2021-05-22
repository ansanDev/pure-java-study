package serialization;

import java.io.*;

public class ColorPoint extends Point implements Serializable {
    static final long serialVersionUID = 1L;
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(super.getX());
        out.writeInt(super.getY());
        out.defaultWriteObject();
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.setX(in.readInt());
        super.setY(in.readInt());
        in.defaultReadObject();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorPoint: { x:" + super.getX() + ", y: " + super.getY() + ", color: " + color + "}";
    }
}
