package catsbi.me.item.weapon;

public class Sword implements Weapon{
    public static final Sword DEFAULT_SWORD = new Sword("강철검", 1000L, 40);

    private String name;
    private long price;
    private int damage;

    public Sword() {
    }

    public Sword(String name, long price, int damage) {
        this.name = name;
        this.price = price;
        this.damage = damage;
    }

    public long getPrice() {
        return price;
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
        System.out.println("검으로 공격합니다.");
    }


}
