import java.util.Scanner;
import java.util.InputMismatchException;
public class Giris extends HastKabl {
    String adSoyad2;
    long tc1;

     private HastKabl gelenHasta;
    public Giris(String adSoyad2,long tc) {
        this.adSoyad2 = adSoyad2;
        this.tc1=tc1;
    }

    public Giris(String adSoyad2,long tc,HastKabl hasta) {
        this.adSoyad2 = adSoyad2;
        this.tc1=tc1;
    }

    public Giris(HastKabl hasta) {
        gelenHasta = hasta;

    }

    public Giris() {
    }



    public void karsilama() {


        System.out.println("\n ************************  Giriş Sayfası  *****************************\n");
        try {


        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı Soyadınızı giriniz : ");
        this.adSoyad2 = input.nextLine();

        System.out.println("TC ni gir :");
        tc1 = input.nextLong();
        }catch (InputMismatchException e){
            System.out.println("Lütfen doğru bir şekilde girdiğinizden emin olunuz..");
            karsilama();
        }

        if (adSoyad2.equals(gelenHasta.getAdSoyad()) && tc1 == gelenHasta.getTc()) {
            System.out.print(adSoyad2 + " hangi polikliniğe gideceğini belirlemek için sekreterliğe yönlendiriyorum");

            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.print(".");
            }
            System.out.println("");
        }
      else {
            System.out.println("Kullanıcı adı veya TC no hatalı !!! Tekrardan Giriş yapınız ");
           karsilama();
      }

    }
}
