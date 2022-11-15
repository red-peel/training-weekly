import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select an option.");
            System.out.println("1 for GPA, 2 for letter grade, 3 to exit");
            //scanner looks for the menu choice
            String mainMenuInput = scanner.nextLine();
            switch (mainMenuInput) {
                case "1":
                    System.out.println("Please input grade...");
                    int grade1 = scanner.nextInt();
                    System.out.println(calculate(grade1, "gpa"));
                    break;
                case "2":
                    System.out.println("Please input grade...");
                    int grade2 = scanner.nextInt();
                    System.out.println(calculate(grade2, "letter"));
                    break;
                case "3":
                    run = false;
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    }
     
    
    public static String calculate(int grade, String type){
        if (grade>=90) {
            if(type.equals("gpa")){
                return "4.0";
            }
            if(type.equals("letter")){
                return "A";
            }
        }
        else if (grade>=80 && grade<90) {
            if(type.equals("gpa")){
                return "3.0";
            }
            if(type.equals("letter")){
                return "B";
            }
        }
        else if (grade>=70 && grade<80) {
            if(type.equals("gpa")){
                return "2.0";
            }
            if(type.equals("letter")){
                return "C";
            }
        }
        if (grade>=60 && grade>70) {
            if(type.equals("gpa")){
                return "1.0";
            }
            if(type.equals("letter")){
                return "D";
            }
        }
        else{
            if(type.equals("gpa")){
                return "0.0";
            }
            if(type.equals("letter")){
                return "F";
            }
        }
        return "Done";
    }

}
