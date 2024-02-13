//package spring.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<String> sname = new ArrayList<>(); 
        sname.add("Rakesh");
        //if size of array is n and it needs to be increased it will become n+n/2+1
        System.out.println(sname);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.add(3); //It always adds the element at the end of the list
        System.out.println(list);

        list.add(1,0); //Adding element at a specific index
        System.out.println(list);

        List<Integer> newlist = new ArrayList<>(); //Creating a new list
        newlist.add(100);
        newlist.add(101);
        System.out.println(newlist);

        list.addAll(newlist); //Adding elements of newlist to list
        //list.addAll(list); Adding elements of list to list
        System.out.println(list);

        System.out.println(list.get(3)); //Prints the element at that index
        list.set(0,0); //Changes the element at that index
        System.out.println(list);

        System.out.println(list.contains(5)); //Returns true or false
        System.out.println(list.contains(100)); //Returns if the element is present in list or not

        list.remove(1); //Removes element at that index //Removed 0
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        list.clear(); //It removes all the elements of the list
        System.out.println(list);

        for(int i=0; i< list.size(); i++){
            System.out.println("The element is" + list.get(i));
        }

        for(Integer element: list){
            System.out.println("The element is" + element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasnext()){
            System.out.println("iterator" + it.next());
        }


    }
   

    
}
