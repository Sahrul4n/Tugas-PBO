/*
NIM              : 13020220143
Nama             : Sahrul Adiyanto
Hari/Tanggal     : Senin 26/02/2024
Waktu Pengerjaan : 14:00
*/
public class Oper4 {
    public static void main(String[] args) {
        int i = 0; 
        int j = 0;
        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);

        System.out.print ("Nilai e = "+ e);
        System.out.print ("\nNilai k = "+ k);
        i = 2;
        j = 3;
        k = ((i++>j++) ? i: j) ;
        System.out.print ("\nNilai k = "+ k);
    }
}