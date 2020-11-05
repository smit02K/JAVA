import java.util.Scanner;

public class largestof3__4 {

    public static void main(String[] args){

        int num1,num2,num3,num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second Number: ");
        num2 = sc.nextInt();

        System.out.print("Enter third Number: ");
        num3 = sc.nextInt();

        sc.close();

        if(num1 > num2){

            if(num1>num3){

                num =num1;

            }
            else{

                num =num3;

            }
        }
        else{

            if(num2>num3){

                num=num2;

            }
            else{

                num=num3;
            }
        }

        System.out.println("largest of three number is : " + num );

    
    }
}
