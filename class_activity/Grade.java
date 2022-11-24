public class Grade {
    int noOfQuiz, noOfStudents;
    int[][] grade;
    double[] studentAverage;
    double[] quizAverage;

    Grade(int noOfStudents, int noOfQuiz) {
        this.noOfQuiz = noOfQuiz;
        this.noOfStudents = noOfStudents;
        grade = new int[noOfStudents][noOfQuiz];
        studentAverage = new double[noOfStudents];
        quizAverage = new double[noOfQuiz];
    }

    public int getNoOfQiuz() {
        return this.noOfQuiz;
    }

    public int getNoOfStudents() {
        return this.noOfStudents;
    }

    public int[][] getGrade() {
        return this.grade;
    }

    public double[] getStudentAverage() {
        return this.studentAverage;
    }

    public double[] getQuizAverage() {
        return this.quizAverage;
    }

    void setGrade(int student, int quiz, int marks) {
        grade[student][quiz] = marks;
    }

    public double[] calculateStudentAverage() {
        for (int student = 0; student < noOfStudents; student++) {
            int sum = 0;
            for (int quiz = 0; quiz < noOfQuiz; quiz++) {
                sum += grade[student][quiz];
            }
            studentAverage[student] = (double) sum / noOfQuiz;

        }
        return studentAverage;
    }

    public double[] calculateQuizAverage() {
        for (int quiz = 0; quiz < noOfQuiz; quiz++) {
            int sum = 0;
            for (int student = 0; student < noOfStudents; student++) {
                sum += grade[student][quiz];
            }
            quizAverage[quiz] = (double) sum / noOfStudents;

        }
        return quizAverage;
    }

    public void displayGrade() {
        for (int student = 0; student < noOfStudents; student++) {
            for (int quiz = 0; quiz < noOfQuiz; quiz++) {
                System.out
                        .println("Student " + (student + 1) + " Grade " + (quiz + 1) + "  is " + grade[student][quiz]);
            }

        }
    }

    public void displayStudentAverage() {
        calculateStudentAverage();
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " Average is " + studentAverage[i]);
        }
    }

    public void displayQuizAverage() {
        calculateQuizAverage();
        for (int i = 0; i < noOfQuiz; i++) {
            System.out.println("Quiz " + (i + 1) + " Average is " + quizAverage[i]);
        }
    }
}