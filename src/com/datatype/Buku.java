package com.datatype;
import java.util.Scanner;


public class Buku {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String bookName, author;
        int page, price;
        String[][] books = new String[10][4];
        int bookCount = 0;
        boolean system = true;



        while (system) {
            System.out.print(
                    "---------------------------------------\n" +
                    "1. Add Book \n" + "2. View Stock \n" + "3. Delete Book \n" + "4. View Book Info \n" + "5. Exit\n" + "Pilih Menu Anda : "
            );
            int menu = input.nextInt();
            if (menu == 1) {

                if (bookCount <= books.length ){
                    System.out.println("Add Book");

                    System.out.print("Input Title : ");
                    bookName = input.next();
                    System.out.print("Input total page : ");
                    page = input.nextInt();
                    System.out.print("Input price : Rp.");
                    price = input.nextInt();
                    System.out.print("Input author : ");
                    author = input.next();

                    books [bookCount] [0] = bookName;
                    books [bookCount] [1] = String.valueOf(page);
                    books [bookCount] [2] = String.valueOf(price);
                    books [bookCount] [3] = author;

                    bookCount ++;
                    System.out.println("Book Added is Successfully");
                    System.out.println("book total : " + bookCount);

                } else {
                    System.out.println("Book is full in order");
                }
            } else if (menu == 2) {
                if (bookCount >= 1) {
                    System.out.println("Book Total : " + bookCount);

                    System.out.println("List of available books");

                    for (int i = 0; i < bookCount; i ++) {
                        System.out.println( i +1 +". " + books[i][0]);
                    }
                } else {
                    System.out.println("Not Avaible list of book");
                }
                System.out.println();

            } else if (menu == 3) {

            } else if (menu == 4) {
                System.out.println("Hello World!");

            } else if (menu == 5) {
                system = false;

            } else {

                System.out.println("invalid option! please choose again!");
            }
        }

    }
}
