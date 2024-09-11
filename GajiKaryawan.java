import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        double bonuss = 0.10;
        double pajakk = 0.05;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja karyawan dalam sebulan: ");
        double jamKerja = input.nextDouble();
        System.out.print("Masukkan upah per jam kerja: ");
        double upahPerJam = input.nextDouble();

        double gajiSebelumPajak = jamKerja * upahPerJam;
        double bonus = gajiSebelumPajak * bonuss;
        double totalGajiSebelumPajak = gajiSebelumPajak + bonus;
        double pajak = totalGajiSebelumPajak * pajakk;
        double gajiBersih = totalGajiSebelumPajak - pajak;

        System.out.printf("Gaji sebelum pajak: Rp %.2f%n", gajiSebelumPajak);
        System.out.printf("Bonus: Rp %.2f%n", bonus);
        System.out.printf("Total gaji sebelum pajak: Rp %.2f%n", totalGajiSebelumPajak);
        System.out.printf("Pajak yang dikenakan: Rp %.2f%n", pajak);
        System.out.printf("Gaji bersih setelah pajak: Rp %.2f%n", gajiBersih);
    }
}