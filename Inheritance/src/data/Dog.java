package data;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int teeth;
    private int tails;
    private String coat;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(int tails) {
        this.tails = tails;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    @Override
    public void eat(String foodType) {
        super.eat(foodType);
        System.out.println("Dog bites and chews.");
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat)
    {
        super(name,1,1,size,weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tails=tails;
        this.teeth=teeth;
        this.coat=coat;


    }
}
