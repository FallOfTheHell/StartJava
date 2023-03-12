package com.startjava.leasson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger mark4 = new Jaeger();

        mark4.setName("Crimson Typhoon");
        mark4.setWeight(1.722);
        mark4.setSpeed(9);
        mark4.setStrength(8);
        mark4.setArmor(6);

        Jaeger mark1 = new Jaeger("Mark-1", 2.412, 3, 10, 10);

        mark1.setName("Cherno Alpha");
        mark1.setWeight(2.411);
        mark1.setSpeed(4);
        mark1.setStrength(9);
        mark1.setArmor(9);

        System.out.println(mark4.getName() + "\n" + mark4.getWeight() + "\n" + mark4.getSpeed() + "\n" +
                mark4.getStrength() + "\n" + mark4.getArmor());

        System.out.println(mark1.getName() + "\n" + mark1.getWeight() + "\n" + mark1.getSpeed() + "\n" +
                mark1.getStrength() + "\n" + mark1.getArmor());

        mark4.useVortexCannon();
        System.out.println(mark1.isDrift());
        mark1.move();
    }
}
