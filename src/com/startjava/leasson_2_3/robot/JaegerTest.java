package com.startjava.leasson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger mark1 = new Jaeger("Mark-1", 2.412, 3, 10, 10);
        Jaeger mark4 = new Jaeger();

        mark4.setName("Mark-4");
        mark4.setWeight(1.722);
        mark4.setSpeed(9);
        mark4.setStrength(8);
        mark4.setArmor(6);
    }
}
