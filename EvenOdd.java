import java.util.Scanner;

public class checknum {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int s = c.nextInt();

        if(s % 2 == 0)
            System.out.println(s + " is even");
        else
            System.out.println(s + " is odd");
    }
}
