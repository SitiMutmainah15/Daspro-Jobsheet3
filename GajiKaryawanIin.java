import java.util.Scanner;

public class GajiKaryawanIin{
    public static void main(String[] args) {

        Scanner gaji = new Scanner(System.in);
        long jmlJam, upah, gajiAwal, gajiAkhir, bonus, pajak, gajiSebelumPajak;

        
        System.out.println("Masukkan jumlah jam kerja Anda: ");
        jmlJam = gaji.nextLong();
        System.out.println("Masukkan upah per jam Anda: ");
        upah = gaji.nextLong();

        gajiAwal = upah*jmlJam;
        bonus = gajiAwal*10/100;
        gajiSebelumPajak = gajiAwal + bonus;
        pajak = gajiAwal*5/100;
        gajiAkhir = (gajiSebelumPajak-pajak) *30;

        System.out.println("gaji akhir anda adalah rp: " + gajiAkhir);
    }
}