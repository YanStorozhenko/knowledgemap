package view;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleUI {

    public ConsoleUI() {

    }

    public static void textInTopBottomBorder(String text, int maxWidth){

        String widthStars = "═".repeat(maxWidth + 4);
        System.out.println("\u001B[35m" + "╔" + widthStars + "╗\u001B[0m");


        String formattedLines = Arrays.stream(text.split("\n"))
                .map(line -> "║" + line)
                .collect(Collectors.joining("\n"));

        System.out.println(formattedLines);


        System.out.println("\u001B[37m╚" + widthStars + "╝\u001B[0m");
    }

    public static void menuBorder(String text){
        System.out.println("\u001B[36m" + "╭╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╮\u001B[0m");
        System.out.println("\u001B[36m" + "|   " + text + "\u001B[0m");

        System.out.println("\u001B[36m" + "╰╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╴╯\u001B[0m");
    }

    public static void printMessage(String text){
        System.out.println("\u001B[34m" + "┃  " + text + "\u001B[0m");

        System.out.println("\u001B[34m" + "┗┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅\u001B[0m");
    }

    public static void printOperationMessage(String text){
        System.out.println("\u001B[35m" + "┃  " + text + "\u001B[0m");

        System.out.println("\u001B[35m" + "┗┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷┷\u001B[0m");
    }


    public static String userInputText(String message) {
        Scanner scanner = new Scanner(System.in);

        printMessage(message);

        String input = scanner.next();
        return input;
    }

    public static int userInputInt(String message) {
        Scanner scanner = new Scanner(System.in);

        printMessage(message);
        int input=0;
        try {
            input = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            printOperationMessage("Введено некоректне значення. Будь ласка, введіть ціле число.");
        }


        return input;
    }

}
