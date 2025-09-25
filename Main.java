import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int generatednumber = (int)(Math.random()*100);
        int usernumber = 0;

        do {
            System.out.println("Guess my generated number(1-100) : " );
            usernumber = sc.nextInt();

            if(usernumber == generatednumber) {
                System.out.println("yess! you got it right congrats ");
                break;
            }
            else if(usernumber > generatednumber) {
                System.out.println("your number is bigger");
            }
            else {
                System.out.println("your number is smaller");
            }
        } while(usernumber >= 0);

        System.out.print("my generated number was : ");
        System.out.println(generatednumber);
    }
}