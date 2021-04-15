package catsbi.me.gamecharacter;

import catsbi.me.item.food.Food;
import catsbi.me.item.food.SpiceType;
import catsbi.me.item.weapon.Weapon;

import java.util.Objects;

public abstract class Warrior implements Human {
    public static final int DEFAULT_HP = 100;

    protected int name;
    protected int hp;
    protected Weapon weapon;
    protected int level;

    public Warrior(int name) {
        this(name, DEFAULT_HP);
    }

    public Warrior(int name, int hp) {
        this.name = name;
        this.hp = hp;
        this.level = 1;
    }

    @Override
    public void eat(Food food) {
        System.out.println(food.getFoodName() + "을 먹습니다.");
        this.hp += food.getHealth();
    }

    //Overloading
    public void eat(Food food, SpiceType spiceType) {
        System.out.println(food.getFoodName() + "을 먹습니다.");
        hp += SpiceType.spiceAddOns(spiceType, hp);
    }

    @Override
    public void showLevel() {
        System.out.println("레벨: " + level);
    }

    @Override
    public void attack() {
        if (!existsWeapon()) {
            System.out.println("무기가 없어 공격을 할 수 없습니다.");
        } else {
            weapon.attack();
        }
    }

    protected boolean existsWeapon(){
        return !Objects.isNull(weapon);
    }

    protected abstract void changeWeapon(Weapon weapon);
}
