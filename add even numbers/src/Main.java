import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,total=0;

        do{
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
            if(number % 4 == 0){
                total += number;
            }
        }while (number >= 0 && number % 2 == 0);
        System.out.println("Sum of numbers that are multiples of 4 = "+total);
    }
}
