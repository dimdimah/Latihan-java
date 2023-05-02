package Loop;

import java.util.*;

public class WhileL {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai awal: ");
        nilaiAwal = userInput.nextInt();
        System.out.print("Nilai akhir: ");
        nilaiAkhir = userInput.nextInt();

        total = 0;
        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("nilai ditambah "+nilaiAwal+" menjadi "+total);
            nilaiAwal++;
        }
        userInput.close();
    }
}
