import functionalProgrammingTask.WordCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WordCount count = new WordCount(scan());
        count.printResult();
    }
    public static String scan(){
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
