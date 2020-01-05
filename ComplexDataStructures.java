import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {
    public static String[] vehicles = {
        "ambulance","helicopter","lifeboat"
    };
    public static String[][] drivers = {
        {"Fred","Sue","Pere"},
        {"Sue", "richard", "Bob", "Fred"},
        {"Pete", "Mary", "Bob"}
    };

    public static void main(String[] args){
        
        Map<String, Set<String>> personnel = new HashMap<>();
        

        for( int i = 0; i < vehicles.length; i++){

            String vehicle = vehicles[i];
            String[] driverList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<>(); 

            for(String driver: driverList){
                driverSet.add(driver);
            }
            System.out.println("For " + vehicle + ", the drivers are: " + driverSet);
            personnel.put(vehicle, driverSet);
        }

        Set<String> personelPicker = personnel.get("helicopter");

        for( String driverName: personelPicker){
            System.out.println(driverName);
        }

        System.out.println();

        for(String vehicle: personnel.keySet()){
            System.out.print(vehicle + ": ");
            for(String driver: personnel.get(vehicle)){
                System.out.print(driver);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}