package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        //Declare variables
        Scanner input = new Scanner(System.in);
        int num;
        int secondNum;
        String A, B, C, D, E;
        String answer;

        //Ask for user input
        //1. Add two numbers given by the user.
        System.out.print("Enter two numbers to add: ");
        num = input.nextInt();
        secondNum = input.nextInt();
        System.out.print("The sum of these two numbers is: " + addNumbers(num, secondNum));

        /*2)Write an application to divide 2 numbers. Prompt the user to
        enter two numbers. Take the first number and divide it by the second
        number and print that result to the screen. If the second number is a
        zero, print "Undefined" to the screen, otherwise just print the result.
         */
        System.out.print("\n\nEnter two numbers to divide: ");
        num = input.nextInt();
        secondNum = input.nextInt();
        divideNumbers(num, secondNum);

        /*
        3) Get 5 letters from the user, output them sorted
        (Hint: Use ArrayList and Collections.sort())
         */
        System.out.print("\n\nEnter 5 letters");
        A = input.next();
        B = input.next();
        C = input.next();
        D = input.next();
        E = input.next();

        System.out.print("These letters sorted: ");
        sortLetters(A, B, C, D, E);

        /*
        4. Get the length of a string
         */
        input.nextLine();
        System.out.print("\n\nEnter a string: ");
        answer = input.nextLine();
        stringLength(answer);

        /*
        5. Get the average of 3 numbers
         */
        System.out.print("\n\nEnter 3 numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.print("The average of these three numbers: " +
                averageOfThree(a , b, c));

        /*
        7. Count all words in the sentence:
        The dog jumped over the fence (use String.split(" ") method).
         */
        String m = "The dog jumped over the fence";
        System.out.print("\n\nIn the sentence: ' The dog jumped over the fence'");
        System.out.println("\nThere are " + countWords(m) + " words");

        /*
        9. Print a 5 random numbers given a bound.
         */
        System.out.print("\n\nEnter an upper limit for 5 random numbers: ");
        randomGenerator(input.nextInt());

        /*
        10. Given the array list, print a random word from the list: (module, class, implement)
         */
        ArrayList<String> listKeywords = new ArrayList<>();
        listKeywords.add("module");
        listKeywords.add("class");
        listKeywords.add("implement");

        System.out.print("\n\nA random number from my arrayList is: " );
        randomWord(listKeywords);

    }

    public static int addNumbers(int a, int b) {
        return (a + b);
    }

    public static void divideNumbers(double c, double d) {
        if (d == 0) {
            System.out.print("undefined");
        } else {
            System.out.print("The result is: " + (c / d));
        }
    }

    public static void sortLetters(String a, String b, String c, String d,
                                   String e) {
        String A, B, C, D, E;

        A = a.toUpperCase();
        B = b.toUpperCase();
        C = c.toUpperCase();
        D = d.toUpperCase();
        E = e.toUpperCase();

        ArrayList<String> letters = new ArrayList<>();
        letters.add(A);
        letters.add(B);
        letters.add(C);
        letters.add(D);
        letters.add(E);

        Collections.sort(letters);
        System.out.print(letters);
    }

    public static void stringLength(String m) {
        System.out.print("The length of this string is " + m.length());
    }
    public static double averageOfThree(double a, double b, double c){
        return ((a + b + c) / 3);
    }
    public static void randomGenerator(int bnd){
        ArrayList<Integer>numbers = new ArrayList<>();
        Random rnd = new Random();

        for(int i= 0; i <5; i++){
            numbers.add((rnd.nextInt(bnd))+1);
        }
        System.out.print(numbers);
    }
    public static void randomWord(ArrayList<String> m){
        Collections.shuffle(m);
        System.out.println(m.get(2));
    }
    public static int countWords(String m){
        String wordSplit[] = m.split(" ");
        return wordSplit.length;


        }

    }


