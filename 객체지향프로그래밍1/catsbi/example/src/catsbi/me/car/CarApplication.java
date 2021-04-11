package catsbi.me.car;

public class CarApplication {
    public static void main(String[] args) {
        Car avante = new Avante("아방이", 5000L);
        RacingCar k5 = new K5("과학5호기", 10000L);
        RacingCar k3 = new K3("과학3호기", 7000L);

        avante.moveStraight();
        avante.printPrice();

        k5.acceleration();
        k3.acceleration();

    }
}
