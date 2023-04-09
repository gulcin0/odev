package Proje;

import java.io.*;
import java.util.Scanner;
import Proje.uye;


public class dosya {

        public static void elitUyeEkle() throws IOException {
            Scanner scan = new Scanner(System.in);
            //x değişkeni ile kişi sayısını tutarak aşağıdaki while döngüsünü sınırlıyorum.
            int x=0;
            System.out.println("kaç elit üye gireceksiniz?");
            int say = scan.nextInt();
            File file = new File("kullanıcılar.txt");

            FileWriter fWriter = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write("\n#ELİT ÜYELER#\n");
            while(x!=say) {
            System.out.println("isim,soyisim ve email adresinizi giriniz.");
            String isim = scan.next();
            String soyisim = scan.next();
            String email = scan.next();
            //Alınan değerlerle nesnemi oluşturuyorum.
            elitUye e1 = new elitUye(isim, soyisim, email);

                bWriter.write(e1.isim + "\t" + e1.soyisim + "\t" + e1.email+"\n");
                x++;
            }
            bWriter.close();
            if (!file.exists()) {
                file.createNewFile();
            }

            FileReader fReader = new FileReader(file);
            String line;
            BufferedReader bReader = new BufferedReader(fReader);
            while ((line = bReader.readLine()) != null) {
                System.out.println(line);
            }
            bReader.close();
        }
        public static void genelUyeEkle() throws IOException {
            Scanner scan = new Scanner(System.in);
            //x değişkeni ile kişi sayısını tutarak aşağıdaki while döngüsünü sınırlıyorum.
            int x=0;
            System.out.println("kaç genel üye gireceksiniz?");
            int say = scan.nextInt();
            File file2 = new File("kullanıcılar.txt");
            FileWriter fWriter2 = new FileWriter(file2, true);
            BufferedWriter bWriter2 = new BufferedWriter(fWriter2);
            bWriter2.write("\n#GENEL ÜYELER#\n");

            while (x!=say) {
                System.out.println("isim,soyisim ve email adresinizi giriniz.");
                Scanner scan2 = new Scanner(System.in);
                String isim2 = scan2.next();
                String soyisim2 = scan2.next();
                String email2 = scan2.next();
                //Alınan değerlerle nesnemi oluşturuyorum.
                genelUye g1 = new genelUye(isim2, soyisim2, email2);
                //System.out.println(g1.isim + "\t" + g1.soyisim + "\t" + g1.email);
                bWriter2.write(g1.isim + "\t" + g1.soyisim + "\t" + g1.email + "\n");
                x++;
            }
            bWriter2.close();

            if (!file2.exists()) {
                file2.createNewFile();
            }

            FileReader fReader2 = new FileReader(file2);

            BufferedReader bReader2 = new BufferedReader(fReader2);
            String line;
            while ((line = bReader2.readLine()) != null) {
                System.out.println(line);
            }
            bReader2.close();
        }

}
