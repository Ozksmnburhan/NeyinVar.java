import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sekreter extends Giris {

    private String sekName ="Nuray Balcı";
    public Sekreter(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);

    }
    SimpleDateFormat sekil = new SimpleDateFormat();
    Date tarih = new Date();

        Noroloji n = new Noroloji(adSoyad2, tc1);

        Psikiyatri psk= new Psikiyatri(adSoyad2, tc1);
        Kbb kbb = new Kbb(adSoyad2, tc1);
        Goz goz = new Goz(adSoyad2,tc1);
        Cildiye cilt = new Cildiye(adSoyad2, tc1);
        Estetik est = new Estetik(adSoyad2,tc1);
        Dahiliye dahiliye = new Dahiliye(adSoyad2,tc1);
        DisHekmlk dis = new DisHekmlk(adSoyad2,tc1);
        Diyetisyen diyet = new Diyetisyen(adSoyad2,tc1);
        Ortapedi ortapedi = new Ortapedi(adSoyad2,tc1);




        public void HastKarsila(){
        System.out.println("\n\n***************************** SEKRETERLİK ****************************\n");
        System.out.println(adSoyad2+" Sekreterliğe Hosşgeldin ben sekreter "+getSekName());

        Scanner input = new Scanner(System.in);
        String sikayet;

        System.out.println(adSoyad2+" Neyin Var : ");
        sikayet = input.nextLine();


        if (sikayet.contains("baş")){
            System.out.print("Nörolojiye yönlendiriliyorsun");
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
            System.out.println("");
            n.drBiligi();

            n.muayene(sekil.format(tarih));



        }

        if (sikayet.contains("psiko")){
            System.out.print("Psikiyatri servisine yönlendiriliyosunuz");
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
            psk.drBiligi();
            psk.muayene(sekil.format(tarih));

        }

        if (sikayet.contains("burun") || sikayet.contains("boğaz") || sikayet.contains("kulağ")){
            System.out.print("KBB polikliğine yönlendiriliyosunuz");
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
            kbb.drBiligi();
            kbb.muayene(sekil.format(tarih));

        }

            if (sikayet.contains("göz") || sikayet.contains("Göz") || sikayet.contains("gör")){
                System.out.print("Göz polikiliğine yönlendiriliyosunuz");
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
                goz.drBiligi();
                goz.muayene(sekil.format(tarih));

            }

            if (sikayet.contains("cildiye") || sikayet.contains("sivilce") || sikayet.contains("yanık")) {
                System.out.print("Cildiye polikiliğine yönlendiriliyosunuz");
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.print(".");
                }
                cilt.drBiligi();
                cilt.muayene(sekil.format(tarih));
            }

                if(sikayet.contains("estetik") || sikayet.contains("botoks") || sikayet.contains("dolgu")) {
                    System.out.println("Plastik ve Estetik Cerrahisine yönlendiriliyorsun ");
                    for (int i = 1; i <= 5; i++) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.print(".");
                    }
                    est.drBiligi();
                    est.muayene(sekil.format(tarih));
                }
            if(sikayet.contains("mide") || sikayet.contains("bulantı") || sikayet.contains("karn")) {
                System.out.println("Dahiliye polikiliniğine yönlendiriliyorsun ");
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.print(".");
                }
                dahiliye.drBiligi();
                dahiliye.muayene(sekil.format(tarih));
            }

            if(sikayet.contains("diş") || sikayet.contains("Diş")) {
                System.out.println("Diş Hekimliği  polikiliniğine yönlendiriliyorsun ");
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.print(".");
                }
                dis.drBiligi();
                dis.muayene(sekil.format(tarih));
            }

            if(sikayet.contains("diyet") || sikayet.contains("kilo")) {
                System.out.println("Diyetisyen  polikiliniğine yönlendiriliyorsun ");
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.print(".");
                }
                diyet.drBiligi();
                diyet.muayene(sekil.format(tarih));
            }

            if(sikayet.contains("kırık") || sikayet.contains("çıkık")) {
                System.out.println("Ortapedi  polikiliniğine yönlendiriliyorsun ");
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.print(".");
                }
                ortapedi.drBiligi();
                ortapedi.muayene(sekil.format(tarih));
            }




        }

    public String getSekName() {
        return sekName;
    }

    public void setSekName(String sekName) {
        this.sekName = sekName;
    }
}

