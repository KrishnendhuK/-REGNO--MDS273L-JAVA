package lab1;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Collect basic details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your gender (m/f): ");
        char gender = sc.next().charAt(0);
        
        System.out.print("Enter your state: ");
        sc.nextLine();
        String state = sc.nextLine();
        
        //Display basic details
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        
        //Check and display gender
        if (gender == 'm') {
            System.out.println("Gender: MALE");
        } else if (gender == 'f') {
            System.out.println("Gender: FEMALE");
        } else {
            System.out.println("Invalid gender input.");
        }
        
        System.out.println("State: " + state);
        
        //Check and display region
        switch(state) {
            case "Tamil Nadu":
            case "Kerala":
            case "Karnataka":
                System.out.println("The student is from the southern states of India.");
                break;
            case "Delhi":
            case "Punjab":
                System.out.println("The student is from the northern states of India.");
                break;
            case "West Bengal":
            case "Orissa":
                System.out.println("The student is from the eastern states of India.");
                break;
            case "Maharashtra":
            case "Gujarat":
                System.out.println("The student is from the western states of India.");
                break;
            default:
                System.out.println("Invalid state input.");
                break;
        }
    }
}
      

      

    

