import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        boolean isNumber = StringUtils.isNumeric(input);
        System.out.println("Is Number: " + isNumber);

        // Flip the case of the string
        String flippedCase = StringUtils.swapCase(input);
        System.out.println("Flipped Case: " + flippedCase);


        System.out.println(StringUtils.reverse(input));
        System.out.println("Reversed String: ");
    }
}
