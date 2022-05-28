import java.util.Scanner;
import java.util.SortedMap;

public class NotOrt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik,toplam;
        double ort;

        System.out.print("Matematik notunuzu giriniz: ");
        Matematik = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        Fizik = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        Kimya = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        Türkçe = inp.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        Tarih = inp.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        Müzik = inp.nextInt();

        toplam = Matematik+Fizik+ Kimya+Türkçe+Tarih+Müzik;
        ort=toplam/6;
        System.out.println("Ortalamanız: "+ ort);

        boolean isPass = ort>=60;
        String pass = isPass? "Geçti":"Kaldi";
        System.out.println(pass);
    }
}
