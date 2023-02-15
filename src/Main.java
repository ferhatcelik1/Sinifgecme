import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyo, muzik, tarih, ing, turkce;

        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunu giriniz :");
        mat = input.nextInt();

        System.out.println(" fizik notunuzu giriniz :");
        fizik = input.nextInt();

        System.out.println(" kimya notunuzu giriniz :");
        kimya = input.nextInt();

        System.out.println(" biyoloji notunuzu giriniz :");
        biyo = input.nextInt();

        System.out.println(" muzik notunuzu giriniz :");
        muzik = input.nextInt();

        System.out.println(" tarih notunuzu giriniz :");
        tarih = input.nextInt();

        System.out.println(" ingilizce notunuzu giriniz :");
        ing = input.nextInt();

        System.out.println(" turkce notunuzu giriniz :");
        turkce = input.nextInt();

        double sonuc = (mat + fizik + kimya + biyo + muzik + tarih + ing + turkce) / 6;

        if (sonuc <= 55) {
            System.out.println(" sınıfta kaldınız :");


        } else {
            System.out.println("sınıfı geçtiniz: ");

        }
        System.out.println(" ortalamanız:" + sonuc);
    }
}