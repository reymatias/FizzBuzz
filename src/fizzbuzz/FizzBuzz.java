package fizzbuzz;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        // Introduction with instructions
        System.out.println("FizzBuzz: \n");
        System.out.println("FizzBuzz is a program that prints the numbers from 1 to x, where x greater or equal to 0.");
        System.out.println("Multiples of three prints \"Fizz\" instead of the number, and multiples of five prints \"Buzz\".");
        System.out.println("For numbers which are multiples of both three and five the program prints \"FizzBuzz\".\n");

        Scanner scanner = new Scanner(System.in);

        int input = 0;
        boolean flag = true;


        System.out.println("INPUT: ");
        do {
            System.out.print("Enter a number greater than or equal to 0: ");
            input = scanner.nextInt();

            if(input >= 0) {
                flag = false;
            }
        } while(flag);


        System.out.println("\nOUTPUT: ");
        for(int i = 1; i <= input; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
