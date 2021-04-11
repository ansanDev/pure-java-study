package catsbi.me.car;

public abstract class RacingCar implements Car {
    public abstract void moveStraight();

    public abstract void moveLeft();

    public abstract void moveRight();

    public abstract void stop();

    public abstract void updatePrice(Long price);

    public void acceleration() {
        System.out.println("속도를 1.5배 가속합니다.");
    }
}
