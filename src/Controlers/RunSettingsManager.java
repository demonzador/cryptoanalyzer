package Controlers;

import CLI.UserConnector;

import java.io.IOException;

//this class work with start arguments and chooses the correct way to execute program
public class RunSettingsManager {
    public RunSettingsManager() {

    }

    public void run(String[] args) {
        try {
            if (args.length == 0) {
                // call the work with console
                new UserConnector();
            } else if (args.length == 2 && args[0].equals("BRUTE_FORCE")) {
                new RunManager().runBruteForce(args[1]);
            } else if (args.length == 3) {
                if (args[0].equals("ENCRYPT")) {
                    new RunManager().runEncrypt(new String[]{args[1], args[2]});
                } else if (args[0].equals("DECRYPT")) {
                    new RunManager().runDecrypt(new String[]{args[1], args[2]});
                } else System.out.println("Invalid command entered, please try again.");
            }
        } catch (IOException e) {
            System.out.println("Invalid file name entered, please try again.");
            new UserConnector();
        }
    }
}
