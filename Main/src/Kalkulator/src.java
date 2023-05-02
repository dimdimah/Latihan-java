package Kalkulator;

import java.util.*;

public class src {
    public static void main(String[] args) {
        System.out.println("testing file");
        Scanner dataUser = new Scanner (System.in);
        System.out.print("Masukan simbol aritmatikanya = ");
        String input = dataUser.next(); 

        switch(input){
            case "+":
                System.out.print("angka pertama : ");
                int angkaX = dataUser.nextInt();
                System.out.print("angka kedua : ");
                int angkaY = dataUser.nextInt();

                int hasilPlus = angkaX + angkaY;
                System.out.println(angkaX + " + " + angkaY + "=" + hasilPlus);
                break;
            case "-":
                System.out.print("angka pertama : ");
                int angkax = dataUser.nextInt();
                System.out.print("angka kedua : ");
                int angkay = dataUser.nextInt();

                int hasilMinus = angkax - angkay;
                System.out.println(angkax + " - " + angkay +" = "+hasilMinus);
                break;
            case "*":
                System.out.print("angka pertama : ");
                int angkaA = dataUser.nextInt();
                System.out.print("angka kedua : ");
                int angkaB = dataUser.nextInt();

                int hasilMultiple = angkaA * angkaB;
                System.out.println(angkaA + " * " + angkaB +" = "+hasilMultiple);
                break;
            case "/":
                System.out.print("angka pertama : ");
                int angka1 = dataUser.nextInt();
                System.out.print("angka kedua : ");
                int angka2 = dataUser.nextInt();

                int hasilDevide = angka1 / angka2;
                System.out.println(angka1 + " - " + angka2 +" = "+hasilDevide);
                break;
            default:
                System.out.println("Pilihan anda tidak di temukan");
        }
        dataUser.close();
    }
}
