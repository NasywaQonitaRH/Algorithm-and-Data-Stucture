import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println(" Final Grade Calculation Program");
        System.out.println("===================================");

        double assignment = inputScore(scanner, "Enter Assignment Score: ");
        double quiz = inputScore(scanner, "Enter Quiz Score: ");
        double midTerm = inputScore(scanner, "Enter Mid-Term Exam Score: ");
        double finalExam = inputScore(scanner, "Enter Final Exam Score: ");

        if (assignment == -1 || quiz == -1 || midTerm == -1 || finalExam == -1) {
            System.out.println("\nInvalid score entered.");
            return;
        }

        double finalScore = (0.2 * assignment) + (0.2 * quiz) + (0.3 * midTerm) + (0.3 * finalExam);
        String grade = getLetterGrade(finalScore);

        System.out.println("===================================");
        System.out.printf("Final Score: %.1f%n", finalScore);
        System.out.println("Letter Grade: " + grade);

        if (grade.equals("A") || grade.equals("B+") || grade.equals("B") || grade.equals("C+") || grade.equals("C")) {
            System.out.println("\nCONGRATULATIONS, YOU PASSED!");
        } else {
            System.out.println("\nSORRY, YOU FAILED.");
        }

        scanner.close();
    }

    public static double inputScore(Scanner scanner, String prompt) {
        System.out.print(prompt);
        double score = scanner.nextDouble();
        if (score < 0 || score > 100) {
            return -1;
        }
        return score;
    }
    
    public static String getLetterGrade(double score) {
        if (score > 80 && score <= 100) {
            return "A";
        } else if (score > 73 && score <= 80) {
            return "B+";
        } else if (score > 65 && score <= 73) {
            return "B";
        } else if (score > 60 && score <= 65) {
            return "C+";
        } else if (score > 50 && score <= 60) {
            return "C";
        } else if (score > 39 && score < 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
