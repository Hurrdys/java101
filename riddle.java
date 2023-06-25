import java.util.Scanner;

public class riddle {
    public static void main(String[] args) {

        String name, school;
        int age; 
        name = "hurrdy";
        school = "Jack Chambers";
        age = 14;

        System.out.println("hello!");
        System.out.println("I am glad to meet you!");
        System.out.println("I am " + age + "years old");
        System.out.println("I go to " + school + "Ps");
        System.out.println("What is your name?");
       
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String Name = input.nextLine();
        System.out.println("Nice to meet you " + Name);
        System.out.println("I have a question for you, what goes up but never goes down?");



        
       Scanner answScanner = new Scanner(System.in);
        System.out.println("Enter answer");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Your age")) {
            System.out.println("That is correct! well done!");
        } else { 
            System.out.println("Unfortunatly, that is not it. Would you like to hear the answer?");
        
        
        
        Scanner yesorno = new Scanner(System.in);
        System.out.println("yes or no");
        String yesornoString = input.nextLine(); 
        
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("It was your age!");
        } else { 
            System.out.println("Too bad, I am telling you anyways. It was your age!");
        }

        }
    }   
        
}


      