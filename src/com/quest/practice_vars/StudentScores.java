package com.quest.practice_vars;

public class StudentScores {
    public static void main(String[] args) {

//        Initialize arrays

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };
        //Calculate average scores
        calculateAverageScores(names, ages, scores);
        // Find the highest scorer
        findHighestScorer(names, ages, scores);
        //Ranking students by average score
        rankStudents(names, ages, scores);
        //Detect missing data
        detectMissingData(names, scores);


    }

    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        System.out.println("Average scores of Students:");

        for (int i = 0; i < names.length; i++) {
            int sum = 0;
            int count = 0;
            for (int score : scores[i]) {
                sum += score;
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Name of Student:" + names[i]);
            System.out.println("Age of Student:" + ages[i]);
            System.out.println("AverageScore of Student:" + average);
        }
    }

    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        System.out.println("Highest scorer:");
        int highest = 0;
        String topScorer = "";
        for (int i = 0; i < names.length; i++) {
            int Sum = 0;
            int count = 0;
            for (int score : scores[i]) {
                Sum += score;
                count++;
            }

            double average = (double) Sum / count;
            if (average > highest) {
                highest = (int) average;
                topScorer = names[i];
            }
            System.out.println("Top scorer:" + topScorer+"Highest average"+highest);
        }
    }

    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        System.out.println("Ranking Students:");
        double[] average = new double[names.length];

        for (int i = 0; i < names.length; i++) {
            int sum = 0;
            int count = 0;
            for (int score : scores[i]) {
                sum += score;
                count++;
            }
            average[i] = (double) sum / count;
            for(i=0;i<average.length-1;i++) {
                for (int j=0;j<average.length-i-1;j++){
                    if (average[j]>average[j+1]) {
                        double temp = average[j];
                        average[j] = average[j+1];
                        average[j+1] = temp;


                    }
                }
            }

        }


    }

    public static void detectMissingData(String[] names, int[][] scores) {
    }
}
