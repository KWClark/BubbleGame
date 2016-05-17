
public class BubbleGame {

    public static void main(String[] args) {

        System.out.println("Yo what up dogg");

        for(int i = 1; i < 5; i++) {
            System.out.println("Bud...Weis...Errrr");
        }

        int num = 5;
        int numTwo = 10;


        int numbers = addNumbers(num, numTwo);
        System.out.println(numbers);

    }

    static int addNumbers( int num1, int num2) {
        int answer;
        answer = num1 + num2;
        return answer;
    }
}
