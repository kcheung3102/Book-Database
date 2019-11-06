import java.awt.print.Book;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SKU");
        String userInput = input.nextLine().trim().toLowerCase();

        switch (userInput) {
            case "java1001":
                BookData javaBook = new BookData("Java1001",
                        "Head First Java",
                        "Kathy Sierra and Bert Bates",
                        "Easy to read Java workbook",
                        47.00);

                System.out.println(javaBook.toString());
                break;
            case "java1002":
                BookData thinkinJava = new BookData("Java1002",
                        "Thinking in Java",
                        "Bruce Eckel",
                        "Details about Java under the hood",
                        20.00);

                System.out.println(thinkinJava.toString());
                break;
            case "orcl1003":
                BookData orcaleCert = new BookData(
                        "Orcl1003",
                        "OCP: Oracle Certified Professional Java SE",
                        "Jeanne Boyarsky",
                        "Everything you need to know in one place",
                        45.00
                );
                System.out.println(orcaleCert.toString());
                break;
            case "python1004":
                BookData pythonBook = new BookData(
                        "Python1004",
                        "Automate the Boring Stuff with Python",
                        "Al Sweigart",
                        "Fun with Python",
                        10.50
                );
                System.out.println(pythonBook.toString());
                break;
            case "zombie1005":
                BookData zombieBook = new BookData(
                        "Zombie1005",
                        "the Zombie Apocalypse",
                        "Simon Monk",
                        "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",
                        16.50
                );
                System.out.println(zombieBook.toString());
                break;
            case "rasp1006":
                BookData raspBook = new BookData(
                        "Rasp1006",
                        "Raspberry Pi Projects for the Evil Genius",
                        "Donald Norris",
                        "A dozen fiendishly fun projects for the Raspberry Pi!",
                        14.75
                );
                System.out.println(raspBook.toString());
                break;
            default:
                System.out.println("Invalid SKU");
        }
    }






}
