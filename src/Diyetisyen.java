import java.util.Scanner;

public class Diyetisyen extends Bolumler {
    public Diyetisyen(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Ali ÇAPAK ");
        setBolum("DİYETİSYEN");
        setUnvan(" doç.dr ");
    }

    @Override
    public void muayene(String muaneSaati) {
        System.out.println("\n\n***************************** "+getBolum()+ " POLİKİLİNİĞİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba " + adSoyad2 + " Ben " +getDrName() + getUnvan()+ "şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet = scanner.next();
        System.out.println("");
    }
}
