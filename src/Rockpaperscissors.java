import java.util.Scanner;

public class Rockpaperscissors {
    public static void main(String[] args) {
        int p = 1;
        int a = 0; // bilgisayar ve kullanıcı puanı
        int b = 0;
        System.out.println("***********************************");
        System.out.println("Welcome to rock paper scisoors!");
        while (p == 1) {
            while (5 != a && 5 != b) {
                int c = (int) (Math.random() * 3 + 1);
                // System.out.println(c); // sonra sil
                Scanner user = new Scanner(System.in);
                System.out.println("***********************************");
                System.out.println("Computer = " + a + " User = " + b);
                System.out.println("***********************************");
                System.out.println("---------------------------------------");
                System.out.println("Write 1 for rock");
                System.out.println("Write 2 for paper");
                System.out.println("Write 3 for scissors");
                System.out.println("---------------------------------------");
                int u = user.nextInt();
                if (u == c) {
                    System.out.println("Draw!");
                } else if (u == 1 && c == 2) {
                    System.out.println("User chose rock. Computer chose paper. Computer Wins! ");
                    a++;
                } else if (u == 1 && c == 3) {
                    System.out.println("User chose rock. Computer chose scissors. User Wins! ");
                    b++;
                } else if (u == 2 && c == 1) {
                    System.out.println("User chose paper. Computer chose rock. User Wins! ");
                    b++;
                } else if (u == 2 && c == 3) {
                    System.out.println("User chose paper. Computer chose scissors. Computer Wins! ");
                    a++;
                } else if (u == 3 && c == 1) {
                    System.out.println("User chose scissors. Computer chose rock.  Computer Wins! ");
                    a++;
                } else if (u == 3 && c == 2) {
                    System.out.println("User chose scissors. Computer chose paper.  User Wins! ");
                    b++;
                } else {
                    System.out.println(("İncorrect input try again"));
                }
            }
            System.out.println("***********************************");
            System.out.println("Computer = " + a + " User = " + b);
            System.out.println("***********************************");

            if (a == 5) {
                System.out.println("Computer Wins The Game !");
                System.out.println("Computer Wins The Game !");
                System.out.println("Computer Wins The Game !");
            }
            if (b == 5) {
                System.out.println("User Wins The Game !");
                System.out.println("User Wins The Game !");
                System.out.println("User Wins The Game !");
            }
            System.out.println("Write 1 to play again, any other number to stop.");
            Scanner again = new Scanner(System.in);
            p = again.nextInt();
            a = 0;
            b = 0;

        }

    }
}