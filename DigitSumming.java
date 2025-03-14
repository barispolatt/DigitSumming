import java.util.Scanner;
public class DigitSumming {
    public static void main(String[] args) {
        int input, digitVal, tempNumber = 0, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        input = sc.nextInt();
        tempNumber = input;
        while (tempNumber != 0) {
            digitVal = tempNumber % 10;
            tempNumber = tempNumber / 10;
            result += digitVal;
        }
        System.out.println(result);
    }
}
