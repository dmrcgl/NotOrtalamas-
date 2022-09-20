package com.notortalaması;

import java.util.Scanner;

public class NotOrtalamsı {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = sc.nextInt();

        System.out.print("Fizik notunuz:");
        fizik = sc.nextInt();

        System.out.print("Kimya notunuz:");
        kimya = sc.nextInt();

        System.out.print("Turkce notunuz:");
        turkce = sc.nextInt();

        System.out.print("Tarih notunuz:");
        tarih = sc.nextInt();

        System.out.print("Muzik notunuz:");
        muzik = sc.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = (toplam / 6);

        System.out.println("Ortalamanız: " +sonuc);

        boolean kosul = sonuc >= 60;
        String sinif = kosul ? "Sinifi gecti." : "Sinifta kaldı.";
        System.out.println(sinif);
    }
}
