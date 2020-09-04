import data.Animal;
import data.Dog;
import data.Fish;
import data.RangeRover;

public class Main {
    public static void main(String[] args) {
        example();
        challenge();
    }

    private static void challenge() {
        RangeRover range = new RangeRover("Left","Vogue",2020,5,200,false,300,200,150);
        range.accelerate(30);
        codingExercise35();
    }

    private static void codingExercise35() {

    }

    private static void example() {
        Animal animal = new Animal("dog",1,1,10,50);
        System.out.println(animal.getName());
        Dog dog = new Dog("Yorkie",10,50, 2, 4, 1, 12,"long silky" );
        dog.eat("meat");
        dog.walk();
        Fish fish = new Fish("name",4,2,3, 4);
    }
}
