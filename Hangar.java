package org.example.quetepoo;

public class Hangar {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 12000);
        Boat boat1 = new Boat("Titanic", 500);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
        System.out.println("***************optionel************");
        System.out.println(car1.allInfo());
        System.out.println(boat1.allInfo());

        }
    }
