import java.util.Scanner;

public class Kbb extends Bolumler{
    public Kbb(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Ayşe BİLGİN ");
        setBolum(" KBB ");
        setUnvan(" dr. ");
    }

    @Override
    public void muayene(String muaneSaati){
        System.out.println("\n\n***************************** " +getBolum()+ " POLİKİLİNİĞİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");
        System.out.println("Merhaba "+getAdSoyad()+" Ben" +getUnvan()+ getDrName()+ " şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet= scanner.nextLine();
            
        System.out.println("Sana bir ilaç yazıyorum her gün bir tane kullan. 2 hafta sonra kontrole gel");
    }
}
