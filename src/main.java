
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestnumber = 1;
        int smallestnumber = 1;
        System.out.println("*******************************************************************************************************");
        System.out.println("Given the numbers, The Program which founds the lowest and the highest numbers");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.print("Please enter the number of numbers you want to enter into the system : ");
        int numbers = scanner.nextInt();
        for (int i = 1; i <= numbers ; i++) {
            System.out.print(i+". number : ");
            int number = scanner.nextInt();
            if (i==1) {
                biggestnumber = number;
                smallestnumber = number;
            }
            else{
                if (biggestnumber>number) {
                    biggestnumber = biggestnumber;
                }
                else if (biggestnumber< number) {
                    biggestnumber = number;
                }
                if (smallestnumber<number) {
                    smallestnumber = smallestnumber;
                }
                else{
                    smallestnumber = number;
                }
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("The biggest number is : "+biggestnumber);
        System.out.println("The smallest number is : "+smallestnumber);
        System.out.println("*******************************************************************************************************");
    }
}
