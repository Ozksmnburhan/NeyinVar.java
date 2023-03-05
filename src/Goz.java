import java.util.Scanner;
public class Goz extends Bolumler{

    public Goz(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Suat Uğurlu ");
        setBolum(" GÖZ ");
        setUnvan(" Dr. ");
    }

    @Override
    public void muayene(String muaneSaati){
        System.out.println("\n\n*****************************  "+getBolum()+ " POLLİKLİNİĞİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba "+adSoyad2+" Ben "+getUnvan()+getUnvan()+" şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet= scanner.nextLine();

        System.out.println("Şimdi seni göz testine sokalım  ");
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
            System.out.println(".");
        }


        System.out.println("1. A  B  C  D  E  F ");
        System.out.println("2. G  H  J  J  K  L ");
        System.out.println("3. Ş  İ  Z  X  C  V ");
        System.out.println("4. B  N  M  Ö  Ç  W ");

        Scanner input = new Scanner(System.in);
        int a ;
        System.out.println("Sana gösterdiğim şablondan hangi satırı görmüyorsun !");
        a = input.nextInt();
        switch (a){
            case 1:
                System.out.println("Ooo göz numaran çok büyükmüş televizyonu fazla izleme !!! \n Göz numaran : 6.5 ");
                break;
            case 2:
                System.out.println("Biraz büyükmüş göz numaran  televizyon izlemeni azaltmalısın !!! \n Göz numaran : 4.5 ");
                break;
            case 3:
                System.out.println("Göz numran çokta büyük değilmiş. !!! \n Göz numaran : 2.5 ");
                break;
            case 4:
                System.out.println("Gözlerin gayet iyi görüyor !!! \n Göz numaran : 0.5  ");
                System.out.println("Gözlerini biraz yormuşsun sadece sana bir göz damlası yazıyorum sabah akşam kullanırsın");
                break;

        }






    }

}
