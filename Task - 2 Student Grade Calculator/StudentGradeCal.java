
import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter mark of MIL: ");
        float mil = sc.nextFloat();
        System.out.print("Enter mark of English: ");
        float eng = sc.nextFloat();
        System.out.print("Enter mark of Physics: ");
        float phy = sc.nextFloat();
        System.out.print("Enter mark of Chemistry: ");
        float che = sc.nextFloat();
        System.out.print("Enter mark of Math: ");
        float math = sc.nextFloat();
        System.out.print("Enter mark of Biology: ");
        float bio = sc.nextFloat();

        // Calculate total and average
        float totalMarks = mil + eng + phy + che + math + bio;
        int numSub = 6;
        double averagePer = totalMarks / numSub;

        // Grade logic
        char grade;
        if (averagePer >= 90) {
            grade = 'A';
        } else if (averagePer >= 80) {
            grade = 'B';
        } else if (averagePer >= 70) {
            grade = 'C';
        } else if (averagePer >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output
        System.out.println("\n----- Grade Report -----");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSub * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePer);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
