import java.util.Scanner;

public class kafe02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTEh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100;
        System.out.print("Masukkan keanggotaan (ture/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembeliat teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        double totalHarga = (jmlKopi * hargaKopi) + (jmlRoti * hargaRoti) + (jmlTeh * hargaTEh);
        byte totalByte = (byte) totalHarga;
        double nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalint = (int) nominalBayar;
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("total harga (byte)" + totalByte);
        System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlRoti + "Roti, " + jmlTeh + "Teh ");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("Nominal bayar (int)" + nominalBayar);


        
    }
}