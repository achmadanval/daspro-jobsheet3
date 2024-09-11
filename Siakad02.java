import java.util.Scanner;

public  class Siakad02 {

    public static void main(String[] argss){
    Scanner sc = new Scanner(System.in);
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = sc.nextLine();
    System.err.print("Masukkan kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen:");
    absen = sc.nextByte(); 
    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai UTS :");
    nilaiUts = sc.nextDouble();
    System.out.print("Masukkan nilai UAS :");
    nilaiUas = sc.nextDouble();
    System.out.print("Memasukkan nilaiAkhir: ");
    nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas /100 * 15) + (nilaiUts /100 * 30 ) + (nilaiUas /100 * 35) / 3;
    System.out.println("Nama : " + nama + "NIM: " + nim);
    System.out.println("Kelas: " + kelas + "Absen: " + absen);
    System.out.println("Nilai UTS : " + nilaiUts + "Nilai UAS : " + nilaiUas);
    System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}