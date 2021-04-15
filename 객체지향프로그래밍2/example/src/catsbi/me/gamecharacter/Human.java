package catsbi.me.gamecharacter;

import catsbi.me.item.food.Food;

public interface Human {
    void eat(Food food);

    void showLevel();

    void attack();
}
