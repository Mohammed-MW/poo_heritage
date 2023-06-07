package org.example.quetepoo;

public class Boat extends Vehicle{
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff(){return "Je suis "+ this.getBrand() + " et je fais glou glou ! ";}
    public String allInfo(){return "Je suis "+ this.getBrand() + " et j'ai " + this.getKilometers() + " km au compteur";}


}
