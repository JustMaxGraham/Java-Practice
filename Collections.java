import java.util.*;

public class Collections {

    public static void main(String[] args){

        // Lists
        String[] names = {"Max", "Bob", "Theo"};
        List<String> nameList = Arrays.asList(names);

        System.out.println(Arrays.toString(names));
        System.out.println(nameList.get(0));

        // Sets

        Set<String> users = Set.<String>of("Max", "Bob");
        System.out.println(users);

        Set<String> people = new HashSet<String>();
        people.add("Max");
        people.add("George");
        people.add("Max");

        System.out.println(people);

        //Treesets

        TreeSet<String> ts = new TreeSet<String>();

        ts.add("A");
        ts.add("C");
        ts.add("B");

        System.out.println(ts);
        System.out.println(ts.contains("A"));
    }
}
