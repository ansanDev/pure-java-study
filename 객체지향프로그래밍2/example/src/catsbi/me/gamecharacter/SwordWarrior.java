package catsbi.me.gamecharacter;

import catsbi.me.item.weapon.Sword;
import catsbi.me.item.weapon.Weapon;

public class SwordWarrior extends Warrior{

    public SwordWarrior(int name) {
        this(name, DEFAULT_HP);
    }

    public SwordWarrior(int name, int hp) {
        super(name, hp);
    }

    @Override
    protected void changeWeapon(Weapon weapon)  {
        checkValidWeapon(weapon);
        System.out.println(name + " 의 무기가 " + weapon.getName() + "으로 변경되었습니다.");
        this.weapon = weapon;
    }

    private void checkValidWeapon(Weapon weapon) {
        if (!(weapon instanceof Sword)) {
            throw new IllegalArgumentException("소드워리어는 검을 제외하면 착용할 수 없습니다.");
        }
    }
}
