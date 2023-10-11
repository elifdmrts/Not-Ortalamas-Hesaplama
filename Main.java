import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematık, fızık, kımya, turkce, tarıh, muzık;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematık = scanner.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fızık = scanner.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kımya = scanner.nextInt();

        System.out.print("Türkce Notunuzu Giriniz: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarıh = scanner.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzık = scanner.nextInt();

        int toplam = (matematık + fızık + kımya + turkce + tarıh + muzık);
        double ortalama = toplam / 6;

        System.out.println("Not Ortalamanız: " + ortalama);

boolean sonuc= ortalama>60;
String snc= (sonuc)? "Sınıfı Gecti":"Sınıfta Kaldı";
System.out.println(snc);

    }
}