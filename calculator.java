import java.util.Scanner;
public class calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter two number1: ");
      num1 = obj.nextDouble();
      System.out.print("Enter two number2: ");
      num2 = obj.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = obj.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}