import java.util.Scanner;

public class BubbleGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Yo what up dogg");

        for(int i = 1; i < 5; i++) {
            System.out.println("Bud...Weis...Errrr");
        }

        int num;
        int numTwo;

        System.out.println("Please enter two whole numbers.");
        num = scan.nextInt();
        numTwo = scan.nextInt();


        int numbers = addNumbers(num, numTwo);
        System.out.println(numbers);
        System.out.println("Congrats! You added some numbers.");

    }

    static int addNumbers( int num1, int num2) {
        int answer;
        answer = num1 + num2;
        return answer;
    }
}
