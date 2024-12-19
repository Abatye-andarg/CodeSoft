
package welcome;

import java.util.*;
public class TaskTwo {

    public static void main(String[] args) {
    

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of courses you took.");
        int numCourses = input.nextInt();
        String[] courses = new String[numCourses];
        String[] grade = new String[numCourses];
        int[] score = new int[numCourses];
        System.out.println("Enter the list of your courses.");
        for (int i = 0; i < numCourses; i++) {

            courses[i] = input.next();
        }
        int totalMark = 0;
        int outOf = 100 * numCourses;
        for (int i = 0; i < numCourses; i++) {
            do {
                System.out.println("Enter your score for the course " + courses[i]);
                score[i] = input.nextInt();
                if (score[i] < 0 || score[i] > 100) {
                    System.out.println("Please enter a correct mark between 0 and 100.");
                }
            } while (score[i] < 0 || score[i] > 100);
            totalMark += score[i];
        }
        double average = (double) totalMark / numCourses;
        double[] cor = new double[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (score[i] >= 90) {
                grade[i] = "A";
                cor[i] = 4;
            } else if (score[i] >= 85) {
                grade[i] = "B+";
                cor[i] = 3.5;
            } else if (score[i] >= 80) {
                grade[i] = "B";
                cor[i] = 3.0;
            } else if (score[i] >= 70) {
                grade[i] = "C+";
                cor[i] = 2.5;
            } else if (score[i] >= 60) {
                grade[i] = "C";
                cor[i] = 2.0;
            } else if (score[i] >= 50) {
                grade[i] = "D";
                cor[i] = 1;
            } else if (score[i] >= 0 && score[i] < 50) {
                grade[i] = "F";
                cor[i] = 0;
            } else {
                System.out.println("please enter the correct mark between 0 and 100.");
            }
        }
        double sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += cor[i];
        }
        double gpa = sum / numCourses;

        System.out.println("      Result Details      ");
        System.out.println("__________________________________________________");
        System.out.println("   Total Mark out of " + outOf + ":  " + totalMark);
        System.out.printf("Average Mark: %.2f%n ", average);
        System.out.println("Grade per Course");
        for (int i = 0; i < numCourses; i++) {
            System.out.println("       " + courses[i] + ":  " + grade[i]);
        }
        System.out.printf("GPA: %.2f%n", gpa);

    }
}
