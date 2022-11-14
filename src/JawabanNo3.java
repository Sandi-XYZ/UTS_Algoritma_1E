import java.sql.SQLOutput;
import java.util.Scanner;
public class JawabanNo3 {
    public static void main(String[] args) {
        String[]InfoBus=new String[]{"01-TopLevel","02-MiddleLevel","03-RegularStaff","04-Staff"};


        int i;
        String c;

        do {
            System.out.println("======================================");
            System.out.println("========== Kamif From Cinde ==========");

            System.out.println("1. Bus Top Level Untuk C ");
            System.out.println("2. Bus Middle Level Untuk J");
            System.out.println("3. Bus Regullar Staff Untuk N");
            System.out.println("4. Bus Staff Untuk P");
            System.out.println("Jika Tida Terdaftar Aplikasi Keluar");
            System.out.println();
            System.out.println("Masukan No Nik Kariawan");
            Scanner satu = new Scanner(System.in);
            i = satu.nextInt();
            System.out.println("Masukan Nama : ");
            Scanner dua = new Scanner(System.in);
            c = dua.nextLine();


            System.out.println("Anda Di Tempatkan Pada Bus Ke" + i);
            System.out.println();
            System.out.println("======================================");
            System.out.println("Jumlah Bus Top Level " + i  );
            System.out.println("Jumlah Bus Middle Level " + i);
            System.out.println("Jumlah Bus Regullar Staff " + i);
            System.out.println("Jumlah Bus Staff " + i);
            System.out.println("======================================");

        }

        while (i <= 4);
        System.out.println("Anda Salah Memasukan Input");


    }

}