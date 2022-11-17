import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Covariance - when you use a child implementation in place of the parent
        List<Integer> randomNumbers = new ArrayList<Integer>();
        randomNumbers.add(0);
        randomNumbers.add(1);
        randomNumbers.add(2);
        randomNumbers.add(3);
        System.out.println("List: ");
        for (Integer i : randomNumbers) {
            System.out.println(i);
        }
        
        System.out.println("Set: ");
        Set<Integer> randomNumbers2 = new HashSet<Integer>();
        randomNumbers2.add(-2);
        randomNumbers2.add(2);
        randomNumbers2.add(0);
        randomNumbers2.add(1);
        randomNumbers2.add(-1);
        for (int i : randomNumbers){
            System.out.println(i);
        }

        Queue<String> fruits = new ArrayDeque<>();
        fruits.add("kiwi");
        fruits.add("durian");
        fruits.add("mango");
        fruits.add("lychee");
        fruits.add("nectarines");
        fruits.add("jackfruit");
        fruits.add("durian"); 
        fruits.add("tamarind");
        fruits.add("strawberry");
        System.out.println(fruits.remove());
        System.out.println(fruits.remove());
        System.out.println(fruits.remove());





    }
}
