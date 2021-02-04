package com.gotcodehooked.homework_lesson_2_task_2;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Test {


    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "/home/msi/IdeaProjects/sber_school/src/com/gotcodehooked/homework_lesson_2_task_2/text_3.txt";
        FileReader fileReader = new FileReader(filePath);
        String[] words;
        StringBuilder line = new StringBuilder();

        ArrayList<String[]> lineList = new ArrayList<>();

        Scanner scanner = new Scanner(fileReader);
        //Парсинг строк
        while (scanner.hasNextLine()) {
            var s = scanner.nextLine().toLowerCase();
            line.append(s);
            lineList.add(s.split("[ .,!?]"));
        }
        scanner.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число не больше : " + (lineList.size() - 1));
        int number = sc.nextInt();
        System.out.println("Строка номер : " + number);
        sc.close();
        System.out.println(Arrays.toString(lineList.get(number)));
        System.out.println("\n");

        //Words Array
        words = line.toString().split("[ .,!?]");


        // Задание 4: Выведите на экран все строки файла в обратном порядке.
        for (String[] arr : lineList) {
            System.out.println("\n");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\n");


        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        ListIterator<String> it = wordsList.listIterator(wordsList.size());
        System.out.println("--------------------------------------------------");

        //Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
        while (it.hasPrevious()) {
            if (!it.previous().equals("")) {
                System.out.println(it.previous());
            }
        }

        HashMap<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (!word.equals("")) {
                if (wordsMap.containsKey(word)) {
                    wordsMap.replace(word, wordsMap.get(word) + 1);
                } else {
                    int value = 1;
                    wordsMap.put(word, value);
                }
            }
        }

        //Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
        for (Map.Entry<String, Integer> stringIntegerEntry : wordsMap.entrySet()) {
            System.out.println(stringIntegerEntry);
        }

        //Задание 1:  Подсчитайте количество различных слов в файле.
        System.out.println("number of words in the text : " + wordsMap.size());


    }


}

