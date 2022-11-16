public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        String name = "Auryine";
        Cat auryn = new Cat();
        auryn.setName(name);
        System.out.println(auryn.getName());
        auryn.setAge(30);


        iceCream myIceCream = new iceCream("chocolate", 3);
        myIceCream.eat();
        myIceCream.dontEat();
        System.out.println(myIceCream.toString());
    }
}
