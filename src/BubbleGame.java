import java.util.Scanner;

public class BubbleGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Yo what up dogg");

        for(int i = 1; i < 5; i++) {
            System.out.println("Bud...Weisss...Errrr");
        }

        int num;
        int numTwo;
        String response;

        System.out.println("Would you like to add or subtract two numbers?");
        System.out.println("Please type 'add' or 'sub'.");
        response = scan.next();

        if (response.equals("add")){

            System.out.println("Please enter two whole numbers.");
            num = scan.nextInt();
            numTwo = scan.nextInt();
            int numbers = addNumbers(num, numTwo);
            System.out.println(numbers);
            System.out.println("Congrats! You added some numbers.");
        }
        else {
            System.out.println("Please enter two whole numbers.");
            num = scan.nextInt();
            numTwo = scan.nextInt();
            int numbers = subtNumbers(num, numTwo);
            System.out.println(numbers);
            System.out.println("Congrats! You subtracted some numbers.");
        }

        System.out.println("And Another One Bites the Dust!!");
    }

    static int addNumbers( int num1, int num2) {
        int answer;
        answer = num1 + num2;
        return answer;
    }

    static int subtNumbers( int num1, int num2) {
        return num1 - num2;
    }
}
