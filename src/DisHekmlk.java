import java.util.Scanner;

public class DisHekmlk extends Bolumler {

    public DisHekmlk(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Bayram SERPEK ");
        setBolum(" Diş Hekimliği ");
        setUnvan(" prof.dr ");
    }

    @Override
    public void muayene(String muaneSaati) {
        System.out.println("\n\n***************************** " +getBolum()+ " ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba " + adSoyad2 + " Ben "+getUnvan()+ getDrName()+" şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet = scanner.nextLine();

    }
}
