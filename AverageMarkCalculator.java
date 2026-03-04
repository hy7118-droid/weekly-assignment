public class AverageMarkCalculator {

    public static void main(String[] args) {

        // Fixed Values
        String studentName = "Sam";
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        int totalSubjects = 3;

        // Calculation
        int totalMarks = mathsMark + physicsMark + chemistryMark;
        double averagePercentage = (double) totalMarks / totalSubjects;

        // Output
        System.out.println(studentName + "'s average mark in PCM is " + averagePercentage);
    }
}
