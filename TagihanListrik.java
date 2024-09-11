import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {

        Scanner listrik = new Scanner(System.in);
        boolean statusListrik;
        double totalTagihan, tarifListrik = 1500, jmlListrik;

        System.out.println("Apakah listrik Anda melebihi 500 kwh? True/False: ");
        statusListrik = listrik.nextBoolean();
        System.out.println("Masukkan jumlah Listrik Anda (kwh) ");
        jmlListrik = listrik.nextDouble();

        statusListrik = jmlListrik > 500;

        totalTagihan = tarifListrik*jmlListrik;

        System.out.println("Jumlah listrik: " + jmlListrik);
        System.out.println("Total tagihan Anda Rp " + totalTagihan);

    }
}
    