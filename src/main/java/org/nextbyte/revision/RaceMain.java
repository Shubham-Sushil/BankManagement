package org.nextbyte.revision;

public class RaceMain {

    public static void main(String[] args) {
        Car c = new Car();
        Race r = new Race();
        r.race(c);

        Bike b = new Bike();
        r.race(b);
    }

}
