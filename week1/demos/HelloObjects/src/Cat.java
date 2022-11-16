public class Cat {
    //classes have: Fields (variables,characteristics), Methods (fucntions,behaviors), and constructors

    //constructors----------------------------------------------------------------
    //no arg constructor to set default values
    public Cat(){
        this.name = "stray";
        this.age = 0;
        this.color = "not defined";
    }

    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //fields-----------------------------------------------------------------------
    //private fields are only accessible by this instance of the class
    private String name;
    private int age;
    private String color;

    //methods----------------------------------------------------------------------
    public void meow() {
        System.out.println("meow");
    }
    public void sitOnKeyboard(String keyBoardSmash) {
        System.out.println(keyBoardSmash);
    }



    //getters and setters----------------------------------------------------------
    //getter retrieves the value
    //setter sets the value
    //if field has no setter, field is read-only
    //if field has no getter, field is write-only
    public String getName() {
        return name;
    }
    public void setName(String name){
        if (name.equals("Rover")) {
            throw new RuntimeException("bad name");   
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("age must be positive");
        }
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    

}
