import java.util.Scanner;

public class Ortapedi extends Bolumler {

    public Ortapedi(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Emre ALKİN ");
        setBolum(" ORTAPEDİ ");
        setUnvan(" prof.dr ");
    }

    @Override
    public void muayene(String muaneSaati) {
        System.out.println("\n\n***************************** "+getBolum()+ " POLİKİLİNİĞİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba " + adSoyad2 + " Ben " +getUnvan()+ getDrName()+ " şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet = scanner.next();

    }
}
