import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, kmy, fzk, tr, mzk, total = 0, validGrade = 0;
        double average;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        if (0 <= mat && mat <= 100) {
            total += mat;
            validGrade++;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kmy = inp.nextInt();
        if (0 <= kmy && kmy <= 100) {
            total += kmy;
            validGrade++;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fzk = inp.nextInt();
        if (0 <= fzk && fzk <= 100) {
            total += fzk;
            validGrade++;
        }

        System.out.print("Türkçe notunuzu giriniz:");
        tr = inp.nextInt();
        if (0 <= tr && tr <= 100) {
            total += tr;
            validGrade++;
        }

        System.out.print("Müzik notunuzu giriniz:");
        mzk = inp.nextInt();
        if (0 <= mzk && mzk <= 100) {
            total += mzk;
            validGrade++;
        } else {

        }
        if (validGrade > 0) {
            average = total / validGrade;

            if (average <= 55) {
                System.out.println("Sınıfta kaldınız!");
            } else {
                System.out.println("Tebrikler,sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız: " + average);
        }else{
            System.out.println("Gecerli notlar giriniz!");
        }
    }

}