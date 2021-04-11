package catsbi.me.car;

public class Avante implements Car {

    private Long wheelCount;
    private String name;
    private Long price;

    public Avante(String name, Long price) {
        this(4L, name, price);
    }

    public Avante(Long wheelCount, String name, Long price) {
        this.wheelCount = wheelCount;
        this.name = name;
        this.price = price;
    }

    @Override
    public void moveStraight() {
        System.out.println("직진합니다.");
    }

    @Override
    public void moveLeft() {
        System.out.println("좌회전합니다.");
    }

    @Override
    public void moveRight() {
        System.out.println("우회전합니다.");
    }

    @Override
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }

    @Override
    public void updatePrice(Long price) {

    }

    @Override
    public void printPrice() {
        System.out.println("이 자동차의 가격은 " + price + "원 입니다.");
    }
}
