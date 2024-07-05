import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] grades = new double[6];

        
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        
        double total = 0;
        double highest = grades[0];
        double lowest = grades[0];

        for (double grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = total / grades.length;

        
        System.out.printf("Average grade: %.2f%n", average);
        System.out.printf("Highest grade: %.2f%n", highest);
        System.out.printf("Lowest grade: %.2f%n", lowest);

        scanner.close();
    }
}
