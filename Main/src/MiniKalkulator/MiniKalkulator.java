package MiniKalkulator;

import java.util.*;

public class MiniKalkulator {
    public static float HitungTambah(float input1, float input2) {
        float hasil;
        hasil = input1 + input2;
        System.out.println("hasil = " + hasil);
        return hasil;
    }

    public static float HitungKurang(float input1, float input2) {
        float hasil;
        hasil = input1 - input2;
        System.out.println("hasil = " + hasil);
        return hasil;
    }

    public static float HitungKali(float input1, float input2) {
        float hasil;
        hasil = input1 * input2;
        System.out.println("hasil = " + hasil);
        return hasil;
    }

    public static float HitungBagi(float input1, float input2) {
        float hasil;
        if (input2 == 0)
            ;
        hasil = input1 / input2;
        System.out.println("hasil = " + hasil);
        return hasil;
    }

    public static void main(String[] args) {
        Scanner inputAngka;
        float a, b;
        char operator;
        System.out.println("Latihan Program Kalkulator sederhana Java");
        System.out.println("=========================================");
        inputAngka = new Scanner(System.in);

        System.out.print("Masukan Nilai pertama: ");
        a = inputAngka.nextFloat();
        System.out.print("Masukan Nilai Kedua: ");
        b = inputAngka.nextFloat();
        System.out.print("Masukan operator hitung: ");
        operator = inputAngka.next().charAt(0);
        System.out.println("=======================================");
        System.out.println("Nilai input = " + a + " " + operator + " " + b);

        if (operator == '+') {
            HitungTambah(a, b);
        } else if (operator == '-') {
            HitungKurang(a, b);
        } else if (operator == '*') {
            HitungKali(a, b);
        } else if (operator == '/') {
            HitungBagi(a, b);
        } else {
            System.out.println("Operator tidak tersedia");
        }
        inputAngka.close();
    }
}
