import java.util.Scanner;
public class Marks_40 {
    public static void main(String[] args) {
        int Marks;
        Scanner x =new Scanner(System.in);
        System.out.println("Enter score ");
        Marks=x.nextInt();
  System.out.println("marks got:- "+ Marks);

  if (Marks>=40){
   System.out.println("Pass!");
  }

  else{
   System.out.println("Fail!");
  }

}
}
