import java.util.Scanner;

public class hesapMakinesi{
      public static void main(String[] args) {
            int n1,n2; // n1 ve n2 değerler

            Scanner input = new Scanner(System.in);
            System.out.print("İlk sayıyı giriniz");
            n1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz");
            n2 = input.nextInt();

            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma" );
            System.out.println("4. Bölme");

            int secim = input.nextInt();
            int sonuc = 0;

            switch(secim) {
                  case 1:
                        secim = n1+n2;
                        System.out.println("Toplam: " + secim);
                        break;
                  case 2:
                        secim = n1-n2;
                        System.out.println("Çıkarma:" +secim);
                        break;
                  case 3:
                        secim = n1*n2;
                        System.out.println("Çarpma:" + secim);
                        break;
                  case 4:
                        secim = n1/n2;
                        System.out.println("Bölme:" + secim);
                        break;
            }


      }


}
