package com.company;

public class Main {

    public static void main(String[] args) {

        /*Класс Cow (weight, age, gender, nickName)
        Класс Sheep(weight, age, gender, nickName)
        Класс Horse(weight, age, color, gender, nickName)
        Класс Farm(address, cows, horses, sheep, OwnerName)
        2 Farm тузунуз.1-Farmда 3 sheep, 5 cows, 2 horses болсун.
        2-Farmда 1 sheep, 1 cow, 1 horse болсун.
         */


Cow cow = new Cow(178.3,4,"woman","Musya");
Cow cow1 = new Cow(164.8, 2,"woman","Roza");
Cow cow2 = new Cow(100.4, 3, "woman","Esma");
Cow cow3 = new Cow(118.9, 2,"woman","Luu");
Cow cow4 = new Cow(175.4,4,"woman", "Zara");

Hourse hourse = new Hourse(188.2,3,"male","Mustang");
Hourse hourse1 = new Hourse(197.8,2,"male","Porshe");

Sheep sheep = new Sheep(78.3,5,"male","Bars");
Sheep sheep1 = new Sheep(40.4,2,"male","Kia");
Sheep sheep2 = new Sheep(67.1,3,"woman","Asu");

Farm farm1 = new Farm("Chunkurchak",
         new Cow[]{cow, cow1, cow2, cow3, cow4},
         new Hourse[]{hourse, hourse1},
         new Sheep[]{sheep,sheep1,sheep2},"Four fermers");

        System.out.println(farm1);

    }
}
