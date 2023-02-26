package com.startjava.leasson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickname("Бобик");
        wolf.setColor("Серый");
        wolf.setAge(7);
        wolf.setGender("Самец");
        wolf.setWeight(20.4f);

        System.out.println("Кличка: " + wolf.getNickname() + "\nЦвет: " + wolf.getColor() +
                "\nВозраст: " + wolf.getAge() + "\nПол: " + wolf.getGender() +
                "\nВес: " + wolf.getWeight());

        wolf.go();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sitdown();
    }
}
