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

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int count = 0;
            //calculating the sum
            for (int score : scores[i]) {
                sum += score;
                count++;
            }
            //finding the average
            double average = (double) sum / count;
            System.out.println("Name of Student:" + names[i]);
            System.out.println("Age of Student:" + ages[i]);
            System.out.println("AverageScore of Student:" + average);
        }
    }

    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        System.out.println("Highest scorer:");
        double highest = 0;
        String topScorer = " ";
        for (int i = 0; i < scores.length; i++) {
            int Sum = 0;
            int count = 0;
            //calculating the sum
            for (int score : scores[i]) {
                Sum += score;
                count++;
            }
            //finding the average
            double average = (double) Sum / count;
            if (average > highest) {
                highest = (int) average;
                topScorer = names[i];
            }
        }
        System.out.println("Top scorer:" + topScorer + "\nAverage" + highest);

    }

    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        double[] average = new double[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int count = 0;
            //calculating the sum
            for (int score : scores[i]) {
                sum += score;
                count++;
            }
            average[i] = (double) sum / count;
        }
        //use bubble sort for sorting averagescore
        for (int i = 0; i < average.length - 1; i++) {
            for (int j = 0; j < average.length - i - 1; j++) {
                if (average[j] < average[j + 1]) {//sorted in descending order
                    //swap average score
                    double temp = average[j];
                    average[j] = average[j + 1];
                    average[j + 1] = temp;
                    //swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                    //swap age
                    int tempage = ages[j];
                    ages[j] = ages[j + 1];
                    ages[j + 1] = tempage;
                }
            }
        }
        System.out.println("Ranked Students:");
        for (int i = 0; i < average.length; i++) {
            System.out.println("Rank " + (i + 1) + " " + names[i] + " AverageScore " + average[i] + " Age :" + ages[i]);
        }
    }


    public static void detectMissingData(String[] names, int[][] scores) {
        System.out.println("Detect missing data:");
        for (int i = 0; i < scores.length; i++) { //loop over each student
            for (int j = 0; j < scores[i].length; j++) {//loop over each subject for current student
                if (scores[i][j] == -1) {
                    System.out.println("Missing data at index " + j);
                    break;

                }
            }
        }
    }
}




