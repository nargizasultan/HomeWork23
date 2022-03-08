package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNums = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(100);
            randomNums.add(num);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < randomNums.size(); i++) {
            if(randomNums.get(i)%2 != 0){
                oddNumbers.add(randomNums.get(i));

            }else {
                evenNumbers.add(randomNums.get(i));
            }
        }

        System.out.println("Random numbers: ");
        printElementsOfList(randomNums);
        System.out.println();


        System.out.println("Even Numbers: ");
        printElementsOfList(evenNumbers);
        System.out.println();
        System.out.println("Odd Numbers: ");
        printElementsOfList(oddNumbers);
    }public static void printElementsOfList(List<Integer>a){
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");

        }

    }
}
