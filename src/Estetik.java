import java.util.Scanner;
import java. util.Date;
import java.text.SimpleDateFormat;


public class Estetik extends Bolumler{
    public Estetik(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Firuze ŞAHİN ");
        setBolum(" PLASTİK VE ESTETİK CERRAHİ ");
        setUnvan(" doç.dr ");
    }

    @Override
    public void muayene(String muaneSaati) {

        System.out.println("\n\n***************************** "+ getBolum() + " SERVİSİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba " + adSoyad2 + " Ben "+ getUnvan()+ getDrName()+ "şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet = scanner.nextLine();
        if(sikayet.contains("burun") || sikayet.contains("Burun") || sikayet.contains("burn")){
            System.out.print("Tamam aklında olan bir model var mı ? yoksa ben kataloktan göstereyim");
            for (int i=1; i<=3; i++)
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(".");
            }
            System.out.println("\n1. Dosal Kemer");
            System.out.println("2. Uzun Burun");
            System.out.println("3. Tansiyon Burun");
            System.out.println("4. Aşırı Korunaklı Burun");
            System.out.println("5. Soğan Burun");
            System.out.println("6. Korunaksız Burun");

            Scanner input = new Scanner(System.in);
            int a ;
            System.out.println("Hangi seçeneği istersin : ");
            a = input.nextInt();

            switch (a){
                case 1:
                    System.out.println("Haftaya çarşamba günü ameliyatınızı yapalım. ");
                    break;
                case 2:
                    System.out.println("Güzel bir seçim önümüzdeki perşembe  günü ameliyatınızı yapalım. ");
                    break;
                case 3:
                    System.out.println("Çok tercih edilen bir burun türü. 1 ay sonra ameliyatınızı yapalım. ");
                    break;
                case 4:
                    System.out.println("Mükemmel bir tercih yaptın " + getAdSoyad()+ " ameliyatınızı hemen yapalım. ");
                    break;
                case 5:
                    System.out.println("Oooo çok iyi bir tercih pazar günü ameliyatınızı yapalım. ");
                    break;
                case 6:
                    System.out.println(getAdSoyad()+" Haftaya salı günü ameliyatınızı yapalım. ");
                    break;

            }
        }


        SimpleDateFormat sekil = new SimpleDateFormat();
        Date tarih = new Date();


        if (sikayet.contains("botoks")){
            System.out.println("Vücüdunun neresine botoks yapmak istiyorsun ");
            Scanner a = new Scanner(System.in);
            String istek = a.next();

            System.out.println("Tamamdır saat "+sekil.format(tarih)+" te ameliyata başlayalım");
        }

        if (sikayet.contains("dolgu")){
            System.out.println("Yarın saat 9:00 da ameliyatınızı yapalım. ");
        }

    }
}
