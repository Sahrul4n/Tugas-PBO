/*
NIM              : 13020220143
Nama             : Sahrul Adiyanto
Hari/Tanggal     : Senin 26/02/2024
Waktu Pengerjaan : 14:00
*/
import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); 
        
        System.out.print ("Nilai yang dibaca : "+ a);
}
}
