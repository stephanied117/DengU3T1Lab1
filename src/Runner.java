import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

            // Write a little program here to randomly choose
        // one of six responses to the user's yes-no question!
        int num = (int) ((Math.random() * 6) + 1);
        if (num == 1) {
            System.out.println("Yes please.");
        } else if (num == 2) {
            System.out.println("Go ahead.");
        } else if (num == 3) {
            System.out.println("Don't do that.");
        } else if (num == 4) {
            System.out.println("Nah.");
        } else if (num == 5) {
            System.out.println("Yeah, sure.");
        } else if (num == 6) {
            System.out.println("No, go away.");
        }
    }
}

