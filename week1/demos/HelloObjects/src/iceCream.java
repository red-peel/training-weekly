public class iceCream {
    //fields
    private String flavor;
    private String state;
    private int scoops;

    //constructors
    public iceCream(){
        this.flavor = "vanilla";
        this.state = "frozen";
        this.scoops = 2;
    }
    
    public iceCream(String flavor, int scoops){
        this.flavor = flavor;
        this.state = "frozen";
        this.scoops = scoops;
    }

    public void eat(){
        if (scoops == 0){
            throw new RuntimeException("out of ice cream!");
        }
        else{
            scoops-=1;
            System.out.println("ate a scoop!");
        }
    }
    public void dontEat(){
        if (this.state.equals("frozen")){
            this.state="melted";
            System.out.println("your ice cream melted :(");
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Scoops left: " + this.scoops + "\nFlavor: " + this.flavor + "\nState: " + this.state;
    }

}
