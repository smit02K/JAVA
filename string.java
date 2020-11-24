import java.util.Scanner;
public class string {
      
        public static void main(String args[]){  
        // System.out.println("Hello Java");  
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a first string");
        String str1 = obj.nextLine();

        System.out.println("\n string1 is: " +str1);  

        System.out.print("The java string toUpperCase() method converts this string into uppercase: ");
        System.out.println(str1.toUpperCase());
        System.out.print("string toLowerCase() method into lowercase letter: ");
        System.out.println(str1.toLowerCase());  
        System.out.print("Java String startsWith() and endsWith() method gives ans in boolean: ");
        System.out.print(str1.startsWith("S") +" "); 
        System.out.println(str1.endsWith("t"));  
        System.out.print("The string length() method returns length of the string: " );
        System.out.println(str1.length());
        obj.close();
        }  
    
    
}
