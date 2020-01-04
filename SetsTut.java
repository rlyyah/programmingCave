import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsTut {
    public static void main (String[] args){
        System.out.println("hi");

        // HashSet does not retain order!
        //Set<String> animals = new HashSet<String>();

        // LinkedHashSet remember the order of added items
        //Set<String> animals = new LinkedHashSet<String>();

        // TreeSet sorts in natural order
        Set<String> animals = new TreeSet<String>();

        if(animals.isEmpty()){
            System.out.println("is empty!");
        }


        animals.add("dog");
        animals.add("cat");
        animals.add("mouse");
        animals.add("swam");

        System.out.println(animals);

        //Only unique items so adding duplicate does nothing
        animals.add("dog");
        
        System.out.println(animals);

        if(animals.isEmpty()){
            System.out.println("is empty!");
        }

        ///////////// Iteration ///////////////

        for(String element: animals){
            System.out.println(element);
        }

        //////////// Does set contains a given item? ///////////
        if(animals.contains("hello")){
            System.out.println("Contains hello");
        }
        if(animals.contains("cat")){
            System.out.println("contains cat");
        }

        /////////// Intersection //////////////

        Set<String> animals2 = new HashSet<String>();

        animals2.add("dog");
        animals2.add("giraffe");
        animals2.add("mouse");
        animals2.add("cat");
        animals2.add("pigeon");

        Set<String> intersection = new HashSet<String>(animals);
        System.out.println(animals2);
        System.out.println(intersection);

        intersection.retainAll(animals2);

        System.out.println(intersection);
        

        /////////// diffrence ////////////

        Set <String> difference =  new HashSet<String>(animals2);
        System.out.println(animals);
        System.out.println(animals2);
        difference.removeAll(animals);
        System.out.println(difference);


    }
}