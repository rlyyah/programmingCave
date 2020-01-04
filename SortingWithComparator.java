import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


class Person{
    private Integer id;
    private String name;

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ID: " + id + " ;name=" + name + "]";
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    

}


class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        Integer len1 = s1.length();
        Integer len2 = s2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }

        return 0;
    }

}

class ReverseAlphabeticalOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -1 * o1.compareTo(o2);
    }
    
}

public class SortingWithComparator {
    public static void main(String[] args){

        ////////////////////// Sorting Strings //////////////////////
        
        // Firstly we create an empty ArrayList
        List<String> animals = new ArrayList<String>();

        // Then Populate list with animals names (String type)
        animals.add("lion");
        animals.add("tiger");
        animals.add("monkey");
        animals.add("elephant");
        animals.add("parrot");

        // Sort animals List by natural order aka. alphabetical or numerical (same as in the TreeSet/Map)
        Collections.sort(animals); 

        // Loop through every element of animals List and print it out
        for (String animal: animals){
            System.out.println(animal);
        }

        // Print an empty line
        System.out.println();

        // Sort animals List with StringLengthComparator class which implements Comparator class
        // Which sorts the list by the String lenght
        Collections.sort(animals, new StringLengthComparator());

        for (String animal: animals){
            System.out.println(animal);
        }

        // Empty line
        System.out.println();

        // Sort animals list with ReverseAlphabetical order which implements Comparator class
        // With CompareTo method but the result is multiplied with -1 OR we use (s2.compareTo(s1) instead of s1.compareTo(s1))
        Collections.sort(animals, new ReverseAlphabeticalOrder());

        for (String animal: animals){
            System.out.println(animal);
        }

        ////////////////////// Sorting Integers //////////////////////

        // Generate an empty ArrayList of Integer type called numbers
        List<Integer> numbers = new ArrayList<Integer>();

        // Populate the list with some numbers
        numbers.add(10);
        numbers.add(100);
        numbers.add(54321);
        numbers.add(1);
        numbers.add(1337);
        
        // Loop through and print out unsorted list
        for (Integer number: numbers){
            System.out.println(number);
        }

        // Sort the List with natural order (numerical)
        Collections.sort(numbers);

        // Empty line
        System.out.println();

        // Loop through and print out sorted list by numerical order (natural)
        for (Integer number: numbers){
            System.out.println(number);
        }

        // Sort the List with anonymous class from highest to lowest
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2){
                return num2.compareTo(num1);
            }
        });

        // Empty line
        System.out.println();

        // Loop through and print out sorted list from highest to lowest (reverse natural)
        for (Integer number: numbers){
            System.out.println(number);
        }        

        ////////////////////// Sorting Arbitary Objects //////////////////////

        // Generate an empty List of Person type
        List<Person> people = new ArrayList<Person>();

        // Populate people List with some Person objects
        people.add(new Person(0, "Tomasz"));
        people.add(new Person(2, "Julia"));
        people.add(new Person(4, "Artur"));
        people.add(new Person(1, "Zygmunt"));
        people.add(new Person(3, "Euzebiusz"));

        // Loop through unsorted PeopleList and print out names + ids 
        for (Person person: people){
            System.out.println(person);
        }

        // Sort with anonymous function by IDs
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                return -1 * p1.getId().compareTo(p2.getId());
            }
        });

        // Empty line
        System.out.println();

        // Loop through sorted PeopleList and print out names + ids 
        for (Person person: people){
            System.out.println(person);
        }
        
        // Sort with anonymous function by names

        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                return p1.getName().compareTo(p2.getName()); 
            }
        });

        // Empty line
        System.out.println();

        // Loop through sorted PeopleList and print out names + ids 
        for (Person person: people){
            System.out.println(person);
        }

    }
}