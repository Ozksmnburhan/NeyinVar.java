import java.util.Scanner;

public class Noroloji extends Bolumler {
    public Noroloji(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Fatma TURGUT ");
        setBolum(" NOROLOJİ ");
        setUnvan(" prof.dr ");
    }


    @Override
    public void muayene(String muaneSaati){
        System.out.println("\n\n***************************** "+ getBolum()+ " PLOİKİLİNİĞİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba "+this.adSoyad2+" Ben " +this.getUnvan()+ this.getDrName()+ " şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet= scanner.nextLine();

        System.out.println("Sana bir ilaç yazıyorum her gün bir tane kullan. 2 hafta sonra kontrole gel");
    }
}
