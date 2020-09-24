import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        /**Inserts and deletions can be slow with arraylists.
         * Linked lists store a value and a pointer to the
         * next element in the list
         */
        example();
        exampleOrderedInsertion();
    }

    private static void exampleOrderedInsertion() {


        LinkedList<String> citiesToVisit=new LinkedList<>();
        addInOrder(citiesToVisit,"London");
        addInOrder(citiesToVisit, "Paris");
        addInOrder(citiesToVisit, "Berlin");
        addInOrder( citiesToVisit,"Seoul");
        addInOrder(citiesToVisit,"Monrovia");
        print(citiesToVisit);
    }

    private static void example() {
        LinkedList<String> citiesToVisit=new LinkedList<>();
        citiesToVisit.add("London");
        citiesToVisit.add("Paris");
        citiesToVisit.add("Berlin");
        print(citiesToVisit);
        citiesToVisit.add(0,"New York");
        print(citiesToVisit);
        citiesToVisit.remove(3);
        print(citiesToVisit);
    }

    private static boolean addInOrder(LinkedList<String> list, String city) {
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareToIgnoreCase(city);
            if(comparison==0){
                System.out.println(city+" already in the list. Not added.");
                return false;
            }
            else{
                if(comparison>0){
                    listIterator.previous();
                    listIterator.add(city);
                    return true;
                }
            }
        }
        listIterator.add(city);
        return true;

    }

    private static void print(LinkedList<String> list){
        Iterator<String> iterator = list.iterator();
        System.out.println();
        while (iterator.hasNext()){
            System.out.println("I want to visit "+iterator.next());
        }
    }
}
