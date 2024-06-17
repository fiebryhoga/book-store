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
                if (bookCount >= 1) {
                    System.out.println("Delete Book");

                    boolean found = false;
                    while (found == false) {

                        System.out.print("Input Book title : ");
                        String bookDelete = input.next();

                        if (bookDelete.equalsIgnoreCase("cancel")) {
                            System.out.println("Operation is Cancelled");
                            break;
                        }

                            for (int i = 0; i < bookCount; i++) {
                            if (books[i][0].equalsIgnoreCase(bookDelete)) {
                                found = true;

//                            jika buku ditemukan found menjadi true dan perulangan int j digunakan untuk menghapus buku
//                            perulangan dimulai dari j = i artinya dimulai dari indeks buku yang dicari, kemudian buku dengan indeks tersebut
//                            akan digantikan oleh buku setelahnya misal j = buku indeks kedua, maka book[j + 1] digunakan untuk memerintahkan
//                            buku indeks ketiga menggantikan posisi indeks kedua, nantinya buku indeks ketiga menjadi kedua, keempat menjadi ketiga
//                            dan seterusnya sampai panjang bookcount.
                                for (int j = i; j < bookCount - 1; j++) {
                                    books[j] = books[j + 1];
                                }
                                bookCount--;
                                System.out.println("Book deleted successfully!\n");
                            }
                        } if (!found) {
                            System.out.println("Book not avaible, please input title book again");
                        }
                    }
                }
                else {
                    System.out.println("Book not avaible, Please Add Book!");
                }

            } else if (menu == 4) {
                System.out.println("View Book Detail");
                if (bookCount >= 1) {
                    boolean foundView = false;

                    while (foundView == false) {
                        System.out.print("Input Book Title : ");
                        String titleView = input.next();

                        if (titleView.equalsIgnoreCase("cancel")) {
                            System.out.println("Operation is Cancelled");
                            break;

                        }

                        for (int i = 0; i < bookCount; i++) {
                            if (books[i][0].equalsIgnoreCase(titleView)) {
                                foundView = true;
                                System.out.println("Book : " + books[i][0]);
                                System.out.println("Total Page : " + books[i][0]);
                                System.out.println("Price : Rp." + books[i][0]);
                                System.out.println("Author : " + books[i][0]);

                            }
                        }
                        if (!foundView) {
                            System.out.println("Book not avaible, please input title book again");
                        }


                    }
                } else {
                    System.out.println("Book not avaible, Please Add Book!");
                }

            } else if (menu == 5) {
                system = false;

            } else {

                System.out.println("invalid option! please choose again!");
            }
        }

    }
}
