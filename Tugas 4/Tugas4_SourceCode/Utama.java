/*
Nama             : Sahrul Adiyanto
Nim              : 13020220143
Kelas            : A4
Modul            : Modul 4, No 2
Tanggal Pengerjaan : Jumat, 29 Maret 2024
*/
package pkg13020220143_sahruladiyanto;
import java.util.*;

class Orang {
    public String nama;

    public Orang() {
        this.nama = "Sahrul Adiyanto";
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Orang.");
    }
}

class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "1302002131"; //stambuk anda
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Mahasiswa.");
    }
}

public class Utama {
    public static void main(String[] args) {
        // Memanggil method info() dari kelas Orang
        Orang.info();
        
        // Memanggil method info() dari kelas Mahasiswa
        Mahasiswa.info();
    }
}
