import java.util.ArrayList;

public class ArrayListTutorial {
    public static void main (String[] args){
        // inicial 
        System.out.println("x");
        // 
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Adding
        numbers.add(10);
        numbers.add(1100);
        numbers.add(25);
        
        //Retrieving
        System.out.println(numbers.get(1));

        System.out.println("\nIteration #1: ");
        //Indexed for loop iteration
        for( int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        // Removing items (careful!)
        numbers.remove(numbers.size() -1);
    
        //THIS IS VERY SLOW
        numbers.remove(0);

        System.out.println("\nIteration #2: ");
        for(Integer value: numbers){
            System.out.println(value);
        }

        // List interface ..
        List<String> values = new ArrayList<String>();
    }
}