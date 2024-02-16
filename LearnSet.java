import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(45);
        set.add(34);
        set.add(56);
        set.add(12);
        set.add(58);
        set.add(45); //Duplicate elements cannot be put in a set
        System.out.println(set);
        // No order is defined in a set, it is displayed in a random order
        //Every element has a unique hash
        set.remove(12);
        System.out.println(set);
        set.contains(34); //Returns boolean - true or false value
        //Checks whether an element is present or not
        System.out.println(set.isEmpty());
        //Returns boolean value
        System.out.println(set.size()); //Returns the no of elements in a set
        set.clear();
        System.out.println(set); 
        System.out.println(set.isEmpty());
    }
    
}
