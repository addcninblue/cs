import java.util.Scanner;

public class main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String name = in.nextLine();
        Student student = new Student(name);

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Add score");
            System.out.println("2. Display total score");
            System.out.println("3. Display average score");
            int userChoice = in.nextInt();

            switch(userChoice){
                case 1:
                    System.out.print("Enter the score: ");
                    int score = in.nextInt();
                    student.addQuiz(score);
                    break;
                case 2:
                    System.out.println("This " + name + "'s score: " + student.getTotalScore());
                    break;
                case 3:
                    System.out.println("This is " + name + "'s average score: " + student.getAverageScore());
                    break;
                default:
                    System.out.println("That was not a choice");
            }

            in.nextLine();
            System.out.print("Would you like to continue?\ny/n: ");
            String yesNo = in.nextLine();
            if(yesNo.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
