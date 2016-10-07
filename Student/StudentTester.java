
/**
 * To test Student.java
 * 
 * @author (Lucy) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String name = input.nextLine();
        Student lucy = new Student(name);
        boolean cont = true;
        while (cont == true)
        {
            System.out.print("Enter quiz score: ");
            int score = input.nextInt();
            lucy.addQuiz(score);
            
            System.out.print("Continue? (y/n) ");
            String optOut = input.next();
            if (!optOut.equals("y"))
                cont = false;
         }
         
         System.out.println("Student: " + lucy.getName());
         System.out.println("Total quiz score: " + lucy.getTotalScore());
         System.out.println("Average quiz score: " + lucy.getAverageScore());
        
    }
}
