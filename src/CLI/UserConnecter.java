package CLI;

import java.util.Scanner;

public class UserConnecter {
    public UserConnecter() {
        System.out.println("Hello, chose correct action\n [e] encrypt;  [d] decrypt;  [b] brute force;");
        try (Scanner console = new Scanner(System.in)) {
            String command = console.nextLine();
            switch (command) {
                case "e" -> {
                    System.out.println("Enter filename and key");
                    command = console.nextLine();
                    // call correct command
                }
                case "d" -> {
                    System.out.println("Enter filename and key");
                    command = console.nextLine();
                    // call correct command
                }
                case "b" -> {
                    System.out.println("Enter filename");

                }
                default -> System.out.println("ok");
            }
        }
    }
}