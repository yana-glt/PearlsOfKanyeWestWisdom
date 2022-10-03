package kanye;

import java.util.Scanner;

public class NextCommand {
    public void nextCommandLine() {
        Scanner scanner = new Scanner(System.in);
        String str;
        do {
            System.out.println("please enter your command");
            str = scanner.nextLine();

            if (!str.isEmpty()) {
                if (str.equals("next")) {
                    final Request request = new Request();
                    String quote = request.getQuote();
                    System.out.println("Quote > " + quote);
                    str = "new command";
                } else {
                    System.out.println("make sure the command is correct");
                    str = "new command";
                }
            }else{
                str = "new command";
            }
        }
        while (!str.isEmpty());
        scanner.close();
    }
}
