import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Person {
    private Integer id;
    private String name;

    public Person(Integer id, String name){
        this.id = id;
        this.name =name;
    }

    public String toString(){
        return "(ID: " + id + "; NAME: " + name + ")";
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

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
    
}

public class SetsAndMaps {
    public static void main (String[] args){

        Person p1 = new Person(0, "Tomasz");
        Person p2 = new Person(1, "Julia");
        Person p3 = new Person(2, "Eugeniusz");
        Person p4 = new Person(1, "Julia");


        Map<Person, Integer> numbers = new LinkedHashMap<Person, Integer>();

        numbers.put(p1, 1);
        numbers.put(p2, 2);
        numbers.put(p3, 3);
        numbers.put(p4, 1);

        for(Person number: numbers.keySet()){
            System.out.println(number + ": " + numbers.get(number));
        }

        Set<Person> animals = new HashSet<Person>();
        
        animals.add(p1);
        animals.add(p2);
        animals.add(p3);
        animals.add(p4);

        System.out.println(animals);

        for(Person element: animals){
            System.out.println(element);
        }
    }
}