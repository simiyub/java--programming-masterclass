import data.*;

import java.lang.module.ResolutionException;

public class Main {

    //models has a relationship.
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard("intel 10", "intel", 3,2,"UEFI");
        //monitor is composed of resolution
        Monitor monitor= new Monitor("samsung", "samsung", 21,new Resolution(1080,200));
        //Computer case has dimensions
        Case computerCase=new Case("intech", "intech", "main",new Dimensions(70,200,400));


        Computer computer = new Computer(computerCase,monitor,motherboard);
        computer.powerUp();
        //computer.getMotherboard().loadProgram("word");
    }
}
