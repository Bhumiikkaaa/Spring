import java.util.Set;
import java.util.TreeSet;

public class LearntreeSet {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<>();
        set.add(45);
        set.add(34);
        set.add(56);
        set.add(12);
        set.add(58);
        set.add(45); //Duplicate elements cannot be put in a set
        System.out.println(set);
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
