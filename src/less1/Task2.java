package less1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter your name");
//        String name = new Scanner(System.in).next();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

//        System.out.println("Your name = " + name);
        LocalDateTime now = LocalDateTime.now();

    }
}
