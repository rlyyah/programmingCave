import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.SortedSet;

class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Person o) {
        int len1 = name.length();
        int len2 = o.name.length();

        if(len1>len2){
            return 1;
        }else if(len1<len2){
            return -1;
        }else{
            return name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}

public class NaturalOrderComparable {
    public static void main(final String[] args) {

        final List<Person> namesList = new ArrayList<Person>();
        final SortedSet<Person> namesSet = new TreeSet<Person>();

        addElements(namesList);
        addElements(namesSet);

        Collections.sort(namesList);

        showElements(namesList);
        System.out.println();
        showElements(namesSet);
        

    }

    private static void addElements(final Collection<Person> col) {

        col.add(new Person("Tomasz"));
        col.add(new Person("Jula"));
        col.add(new Person("Anna"));
        col.add(new Person("Bolo"));
        col.add(new Person("Kara"));
        col.add(new Person("Hura"));
        col.add(new Person("Zara"));
        col.add(new Person("Zbigniew"));
        col.add(new Person("Aleksander"));

    }

    private static void showElements(final Collection<Person> col) {
        for (final Person element : col) {
            System.out.println(element);
        }
    }
}