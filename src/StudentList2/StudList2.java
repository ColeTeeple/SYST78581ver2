package StudentList2;
import java.util.Scanner;
/**
 * @author Cole Teeple
 */
public class StudList2
{

   public static void main (String[] args)
   {
      Student2[] s1 = new Student2[3];
      Scanner input = new Scanner(System.in);

      for (int i = 0; i < s1.length; i++) {
         s1[i] = new Student2();
         System.out.println("Enter student name: ");
         s1[i].setName(input.nextLine());
      }

      for (int i = 0; i < s1.length; i++) {
         System.out.println("Student name: " + s1[i].getName());
      }
   }
}
