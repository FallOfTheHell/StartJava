package com.startjava.leasson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.nickname = "Бобик";
        wolf.color = "Cерый";
        wolf.age = 7;
        wolf.gender = "Самец";
        wolf.weight = 20.4f;

        System.out.println("Кличка: " + wolf.nickname + "\nЦвет: " + wolf.color + "\nВозраст: " + wolf.age +
                "\nПол: " + wolf.gender + "\nВес: " + wolf.weight);

        wolf.go();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sitDown();
    }
}
