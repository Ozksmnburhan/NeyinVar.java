import java.util.Scanner;
public class AcilKarsilama implements IAcil{

    YesilAlan yesilAlan = new YesilAlan();
    SariAlan sariAlan = new SariAlan();
    KirmiziAlan kirmiziAlan = new KirmiziAlan();
    @Override
    public void giris() {
        System.out.println("Hasta durumu nasıl ?  ( iyi , orta , kötü diye belirtiniz lütfen...)");
        Scanner scanner = new Scanner(System.in);
        String durum= scanner.next();

        if(durum.contains("iyi")){
            System.out.print("Yeşil alana yönlendiriliyor");
            for (int i=1; i<=5; i++)
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
            yesilAlan.giris();
            yesilAlan.cikis();


        }


        if (durum.contains("orta")) {
            System.out.print("Sarı alana yönlendiriliyor");
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.print(".");
            }
            sariAlan.giris();
            sariAlan.cikis();
        }

            if(durum.contains("kötü")){
                System.out.print("Kırmmızı alana yönlendiriliyor");
                for (int i=1; i<=5; i++)
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
                kirmiziAlan.giris();
                kirmiziAlan.cikis();

        }

    }

    @Override
    public void cikis() {
        System.out.println("Hastanemizi tercih ettiğiniz için teşekkürler. ");
        System.out.println("                  Acil Şifalar Dileriz...");

    }
}
