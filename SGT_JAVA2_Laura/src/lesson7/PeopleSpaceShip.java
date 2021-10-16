package lesson7;

import lv.laura.rocketscience.Engine;

import java.util.ArrayList;

public class PeopleSpaceShip extends  SpaceShip{

    //methods are private, classes are public
    private  int numberOfPeople;
    private ArrayList<String> namesOfPeople = new ArrayList<>();

    public PeopleSpaceShip() {
    }

    public PeopleSpaceShip(int numberOfPeople, ArrayList<String> namesOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public PeopleSpaceShip(Engine engine, String name, int cargoSpace, int numberOfPeople, ArrayList<String> namesOfPeople) {
        super(engine, name, cargoSpace);
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public PeopleSpaceShip(Engine engine, String name, int cargoSpace) {
        super(engine, name, cargoSpace);
    }

    int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public ArrayList<String> getNamesOfPeople() {
        return namesOfPeople;
    }

    public void setNamesOfPeople(ArrayList<String> namesOfPeople) {
        this.namesOfPeople = namesOfPeople;
    }
}
