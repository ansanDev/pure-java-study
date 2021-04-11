package catsbi.me.car;

public class K5 extends RacingCar{
    private Long wheelCount;
    private String name;
    private Long price;

    public K5(String name, Long price) {
        this(4L, name, price);
    }

    public K5(Long wheelCount, String name, Long price) {
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
        System.out.println("멈춥니다.");
    }

    @Override
    public void updatePrice(Long price) {
        this.price = price;
    }

    public void updatePrice(String price) {
        this.price = Long.parseLong(price);
    }

    @Override
    public void acceleration() {
        System.out.println("속도를 2배 가속합니다.");
    }
}
