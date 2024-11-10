package com.quest.practice_vars;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        final int MAX_SCORE = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int num = sc.nextInt();
        if (num < 1 || num > 100) {
            System.out.println("Invalid number.Please re-enter the value");
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.println("Enter the name of Student " + i + ":");
                String name = sc.next();
                int mathScore;
                int englishScore;
                int scienceScore;

                do {
                    System.out.println("Enter the score of Maths:");
                    mathScore = sc.nextInt();
                } while (mathScore < 0 || mathScore > MAX_SCORE);
                do {
                    System.out.println("Enter the score of English:");
                    englishScore = sc.nextInt();
                } while (englishScore < 0 || englishScore > MAX_SCORE);
                do {
                    System.out.println("Enter the score of Science:");
                    scienceScore = sc.nextInt();
                } while (scienceScore < 0 || scienceScore > MAX_SCORE);

                int totalScore = mathScore + englishScore + scienceScore;
                System.out.println("Total Score: " + totalScore);
                int averageScore = totalScore / 3;
                System.out.println("Average Score: " + averageScore);

                char grade;
                if (averageScore >= 90) {
                    grade = 'A';
                } else if (averageScore >= 80 && averageScore < 90) {
                    grade = 'B';
                } else if (averageScore >= 70 && averageScore < 80) {
                    grade = 'C';
                } else if (averageScore >= 60 && averageScore < 70) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                System.out.println("Grade: " + grade);

                switch (grade) {
                    case 'A':
                        System.out.println("Excellent performance!");
                        break;
                    case 'B':
                        System.out.println("Good job");
                        break;
                    case 'C':
                        System.out.println("You can do better");
                        break;
                    case 'D':
                        System.out.println("Needs improvement");
                        break;
                    case 'F':
                        System.out.println("Failure.You need significant improvement");
                        break;
                    default:
                        System.out.println("Invalid grade");

                }
                if (totalScore < 50) {
                    System.out.println("Stop processing for remaining Students");
                    break;
                }
                if (mathScore < 60 || englishScore < 60 || scienceScore < 60) {
                    System.out.println("Warning:Need improvements in individual Subjects");
                }
            }


        }

    }
}
