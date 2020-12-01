package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> topics = new ArrayList<>();
        topics.add("math");
        topics.add("capitals");


        List<String> questionsMath = new ArrayList<>();
        questionsMath.add("1.How many zeros are there in the number one thousand?");
        questionsMath.add("2.What is the next prime number after 7?");
        questionsMath.add("3.True or false? A convex shape curves outwards.");
        questionsMath.add("4.What does the square root of 144 equal?");
        questionsMath.add("5.True or false? -2 is an integer.");
        questionsMath.add("6.7 x 9 = ?");
        questionsMath.add("7.What does 3 squared equal?");
        questionsMath.add("8.True or false? -4 is a natural number.");
        questionsMath.add("9.5 to the power of 0 equals what?");
        questionsMath.add("10.87 + 56 = ?");

        List<String> answerMath = new ArrayList<>();
        answerMath.add("3");
        answerMath.add("11");
        answerMath.add("true");
        answerMath.add("12");
        answerMath.add("true");
        answerMath.add("63");
        answerMath.add("9");
        answerMath.add("false");
        answerMath.add("1");
        answerMath.add("143");


        List<String> questionsCapitals = new ArrayList<>();
        questionsCapitals.add("1.Italy?");
        ;
        questionsCapitals.add("2.United States?");
        questionsCapitals.add("3.Greece?");
        questionsCapitals.add("4.France?");
        questionsCapitals.add("5.Spain?");
        questionsCapitals.add("6.Japan?");
        questionsCapitals.add("7.Thailand?");
        questionsCapitals.add("8.Russia?");
        questionsCapitals.add("9.Egypt?");
        questionsCapitals.add("10.England?");
        List<String> answerCapitals = new ArrayList<>();

        answerCapitals.add("Rome");
        answerCapitals.add("Washington");
        answerCapitals.add("Athens");
        answerCapitals.add("Paris");
        answerCapitals.add("Madrid");
        answerCapitals.add("Tokyo");
        answerCapitals.add("Bangkok");
        answerCapitals.add("Moscow");
        answerCapitals.add("Cairo");
        answerCapitals.add("London");

        int answers = 10;
        String answer = "";
        System.out.println("Рello , please choice topic of quiz: Math(press \"1\") or Capitals(press \"2\")");
        String topic = scanner.nextLine();

        if (topic.equals("2")) {
            for (int i = 0; i < questionsCapitals.size(); i++) {
                System.out.println(questionsCapitals.get(i));
                answer = scanner.nextLine();

                if (!answer.equals(answerCapitals.get(i))) {
                    System.out.println("Ops, incorrect answer(");
                    answers--;
                } else {
                    System.out.println("Congratulation!!! ");
                    System.out.println("+1 point ");

                }

            }
            System.out.println("Number of correct answers " + answers);
        } else if (topic.equals("1")) {
            for (int i = 0; i < questionsMath.size(); i++) {
                System.out.println(questionsMath.get(i));
                answer = scanner.nextLine();

                if (!answer.equals(answerMath.get(i))) {
                    System.out.println("Ops, incorrect answer(");
                    answers--;
                } else {
                    System.out.println("Congratulation!!! ");
                    System.out.println("+1 point ");

                }
            }
            System.out.println();
            System.out.println("Number of correct answers " + answers);
        }
    }
}