package catsbi.me.car;

public interface Car {

    void moveStraight();

    void moveLeft();

    void moveRight();

    void stop();

    void updatePrice(Long price);

    default void printPrice() {
        System.out.println("이 자동차의 가격은 측정 불가입니다.");
    }
}
