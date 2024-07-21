import java.util.Scanner;
public class Quize {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Marks;
    System.out.println("=================");
    System.out.println("Please enter your Marks:");
    Marks = scanner.nextInt();
    System.out.println("================= \nResults");
   if (Marks >=80) {
    System.out.println("Marks:Pass(A)");
   } else if (Marks >= 70) {
    System.out.println("Marks:Pass(B)");
   } else if (Marks >=60) {
    System.out.print("Marks:Pass(C)");
   }else if (Marks >= 50) {
    System.out.print("Marks:Pass(D)");
   } else if (Marks >= 40) {
    System.out.print("Marks:Pass(E)");
   } else if (Marks >=30) {
    System.out.print("Marks:Pass(F)");
   } else if (Marks >=29) {
    System.out.print("Marks:Fail(FF)");
   }else{
    System.out.print("Please Enter Marks from 0-100");
   }
}
    
}