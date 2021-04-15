package catsbi.me.item.food;

public class Apple implements Food{
    @Override
    public String getFoodName() {
        return "사과";
    }

    @Override
    public int getHealth() {
        return 50;
    }
}
