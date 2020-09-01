import data.Animal;
import data.Dog;
import data.Fish;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("dog",1,1,10,50);
        System.out.println(animal.getName());
        Dog dog = new Dog("Yorkie",10,50, 2, 4, 1, 12,"long silky" );
        dog.eat("meat");
        Fish fish = new Fish("name",4,2,3, 4);
    }
}
