package com.shahriar;
import java.time.Month;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Creating singer1 object

        Singers singer1 = new Singers();
        System.out.println(singer1);

        System.out.println();

        //Set all the values of object singer1

        singer1.setId("TW12");
        singer1.setName("The Weekend");
        singer1.setAddress("Canada");
        singer1.setDateOfBirth(LocalDate.of(1990, Month.FEBRUARY, 16));
        singer1.setAlbumPubNumber(25);

        System.out.println(singer1);
        System.out.println();

        //Creating singer2 object with the help of 5-argument constructor

        Singers singer2 = new Singers("RH80", "Rihanna", "USA", LocalDate.of(1988, Month.FEBRUARY, 20), 50);
        System.out.println(singer2);
        System.out.println();

        //Modify some values of object singer2

        singer2.setId("RH70");
        singer2.setAlbumPubNumber(55);

        System.out.println(singer2);

    }



}
