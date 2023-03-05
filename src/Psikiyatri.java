import java.util.Scanner;

public class Psikiyatri  extends Bolumler{
    public Psikiyatri(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Fuat Sezgin ");
        setBolum(" PSİKİYATRİ ");
        setUnvan(" prof.dr ");
    }

    @Override
    public void muayene(String muaneSaati ){
        System.out.println("\n\n***************************** "+ getBolum() + " SERVİSİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba "+adSoyad2 +" Ben "+ getUnvan()+ getDrName() +" hayat nasıl gidiyor");
        Scanner scanner = new Scanner(System.in);
        String sikayet= scanner.next();
    }
}
