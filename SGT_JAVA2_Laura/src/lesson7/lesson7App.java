package lesson7;

import lv.laura.rocketscience.Engine;

import java.util.ArrayList;

public class lesson7App {
    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);

        ArrayList<String> people = new ArrayList<>();
        people.add("Bezos");
        people.add("Musk");
        people.add("Brenson");

        PeopleSpaceShip peopleSpaceShip= new PeopleSpaceShip(new Engine(), "Elon", 100, 3, new ArrayList<String>());

        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        System.out.println(peopleSpaceShip);
    }
}
