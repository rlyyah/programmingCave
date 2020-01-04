import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterators {
    public static void main (String[] args){
        LinkedList<String> animals = new LinkedList<String>();
        LinkedList<String> animalsCopy = new LinkedList<String>();

        animals.add("fox");
        animals.add("dog");
        animals.add("cat");
        animals.add("rat");

        Iterator<String> it = animals.iterator();

        while(it.hasNext()){
            String animal = it.next();
            System.out.println(animal);

            if(animal == "cat"){
                it.remove();
            }
        }
 
        System.out.println();

        for(String element: animals){
            System.out.println(element);
            if(element != "rat"){
                animalsCopy.add(element);
            }
        }

        System.out.println();

        Iterator<String> itCopy = animalsCopy.iterator();
        
        while(itCopy.hasNext()){
            String helper = itCopy.next() + "chuj";
            System.out.println(helper);
        }


    }
}