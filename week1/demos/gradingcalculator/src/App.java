import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select an option.");
            System.out.println("1 for GPA, 2 for letter grade, 'stop' to exit");
            //scanner looks for the menu choice
            String mainMenuInput = scanner.nextLine();
            
            System.out.println("Please input grade...");
            int grade = scanner.nextInt();
            
            switch (mainMenuInput) {
                case "1":
                    System.out.println(calculate(grade, "gpa"));
                    break;
                case "2":
                    System.out.println(calculate(grade, "letter"));
                    break;
                case "stop":
                    run = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid input.");
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
