import java.util.Scanner;

public class while01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number ");
        int number = reader.nextInt();
        while (number > 0) {
            if(number % 2 == 0) 
                System.out.println(number + " is even");
            else 
                System.out.println(number + " is odd");
            System.out.println("Input another number ");
            number = reader.nextInt();
        
        }        
        System.out.println("Thats a 0, program ends");
    }
}

