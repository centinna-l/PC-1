import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of students:");
        int noOfStudents = sc.nextInt();
        System.out.println("Enter the total number of Quiz");
        int noOfQuiz = sc.nextInt();
        Grade grade = new Grade(noOfStudents, noOfQuiz);

        for (int student = 0; student < noOfStudents; student++) {
            for (int quiz = 0; quiz < noOfQuiz; quiz++) {
                System.out.println("Enter Student " + (student + 1) + " Quiz " + (quiz + 1) + " Grade: ");
                grade.setGrade(student, quiz, sc.nextInt());
            }
        }

        grade.displayGrade();
        grade.displayStudentAverage();
        grade.displayQuizAverage();
        sc.close();
    }
}
