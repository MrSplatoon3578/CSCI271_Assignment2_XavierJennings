import java.util.Scanner;

public class RecursionQ4 {
    public static int countnum(long n, int d){
        //basecase
        if( n == 0){
            return 0;
        }

        int count = 0;
        if(n % 10 == d){
            count = 1;
        }

        return count + countnum(n / 10, d);
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number:");

        long n = input.nextLong();

        System.out.print("Enter the number you wanna count:");

        int d = input.nextInt();

        int result = countnum(n,d);

        System.out.println("The number " + d + " appears " + result + " times in " + n);


    }
}
