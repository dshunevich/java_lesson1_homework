package com.dshunevich.lesson1.homework;

import com.dshunevich.lesson1.homework.animals.Animal;
import com.dshunevich.lesson1.homework.animals.Dog;
import com.dshunevich.lesson1.homework.animals.HouseCat;
import com.dshunevich.lesson1.homework.animals.Tiger;


public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new HouseCat("Барсик", 200),
                new Dog("Бобик", 1000, 50),
                new Tiger("Тигра", 10000, 500)
        };
        for (Animal o : animals) {
            o.run(800);
            o.swim(40);
        }
    }
}
