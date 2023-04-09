package Proje;

import java.io.*;
import java.util.Scanner;

import static Proje.dosya.elitUyeEkle;
import static Proje.dosya.genelUyeEkle;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {


        System.out.println("1-Elit üye ekleme\n2-Genel Üye ekleme\n3- Mail Gönderme");
        System.out.println("Elit üye ise 1'e,Genel üye ise 2'ye tıklayınız.");

            int num = scan.nextInt();
            switch (num) {
                case 1:
                    elitUyeEkle();
                    break;
                case 2:
                    genelUyeEkle();
                    break;
                case 3:
                    // ...
                    break;
                default:
                    System.out.println("Yanlış seçim. Tekrar deeneyiniz");
            }

    }


}
