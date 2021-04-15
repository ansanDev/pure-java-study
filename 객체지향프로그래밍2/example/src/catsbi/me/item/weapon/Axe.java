package catsbi.me.item.weapon;

public class Axe implements Weapon{
    public static final Axe DEFAULT_AXE = new Axe("강철도끼", 1000L, 50);

    private String name;
    private long price;
    private int damage;

    public Axe() {
    }

    public Axe(String name, long price, int damage) {
        this.name = name;
        this.price = price;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return damage;
    }

    @Override
    public void attack() {
        System.out.println("도끼로 공격합니다.");

    }
}
