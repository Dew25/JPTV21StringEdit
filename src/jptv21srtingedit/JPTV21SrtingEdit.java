/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21srtingedit;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class JPTV21SrtingEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== StringEdit ====");
        System.out.print("Введите текст (латиницей): ");
        String str = scanner.nextLine();
        int repeat = 1;
        do {
            System.out.println("Выберите номер функции: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Количество символов в тексте");
            System.out.println("2. Количество слов в тексте");
            System.out.println("3. Находит указанную подстроку в тексте");
            System.out.println("4. Заменяет указанную подстроку на другую подстроку.");
            int numberFunction = scanner.nextInt();
            scanner.nextLine();
            switch (numberFunction) {
                case 0:
                    System.out.println("Пока!");
                    repeat = 0;
                    break;
                case 1:
                    System.out.println("Вы выбрали функцию \"1. Количество символов в тексте\"");
                    char[] strChar = str.toCharArray();
                    System.out.println("Посчитано: "+strChar.length+ " символов.");
                    break;
                case 2:
                    System.out.println("Вы выбрали функцию: \"2. Количество слов в тексте\"");
                    String[] wordArray = str.split(" ");
                    System.out.println("Посчитано: "+wordArray.length+ " слов.");
                    break;
                case 3:
                    System.out.println("Вы выбрали функцию \"3. Находит указанную подстроку в тексте\"");
                    System.out.println("Введите подстроку для поиска: ");
                    String subStr = scanner.nextLine();
                    int indexSubStr = str.indexOf(subStr);
                    if(indexSubStr < 0) {
                        System.out.println("Такой подстроки в строке нет");
                    }else{
                        indexSubStr++;
                        System.out.println("Подстрока находится на "+indexSubStr +" позиции в строке");
                    }
                    break;
                case 4:
                    System.out.println("Вы выбрали функцию \"4. Заменяет указанную подстроку на другую подстроку.");
                    System.out.println("Введите подстроку которую надо заменить: ");
                    subStr = scanner.nextLine();
                    indexSubStr = str.indexOf(subStr);
                    if(indexSubStr < 0){
                        System.out.println("Такой подстроки в строке нет");
                    }else{
                        System.out.println("Введите строку замены: ");
                        String replaceStr = scanner.nextLine();
                        System.out.println("Результат замены: "+str.replace(subStr, replaceStr));
                    }
                    break;
                default:
                    break;
            }
            System.out.println("------------------------------");
            if(repeat == 0) break;
        } while (true);
    }
    
}
