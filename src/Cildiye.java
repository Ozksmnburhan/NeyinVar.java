import java.util.Scanner;
public class Cildiye extends Bolumler {
    public Cildiye(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    @Override
    public void drBiligi() {
        setDrName(" Sami YENER ");
        setBolum(" CİLDİYE ");
        setUnvan(" prof.dr ");
    }

    @Override
    public void muayene(String muaneSaati){

        System.out.println("\n\n***************************** " +getBolum()+  " POLİKİLİĞİNİ ****************************\n");

        System.out.println("                                                                     Muane saati : "+ muaneSaati+"\n\n");

        System.out.println("Merhaba "+adSoyad2+" Ben "+getUnvan()+ getDrName()+" şikayetin nedir ?");
        Scanner scanner = new Scanner(System.in);
        String sikayet= scanner.nextLine();

        if (sikayet.contains("sivilce")){
            System.out.println("Sivilceler genelde yağlı yiyeceklerden yada stresten dolayı meydana gelir bumlardan uzak durmalısın !");
            System.out.println("854984513  numaralı reçeteni yazdım ilaçlarını en kısa zaman da al");
        } else if (sikayet.contains("yanık")) {
            System.out.println("Vereceğim yanık kremini her akşam yatmadan iyice yedirerek yanığın olduğu heryere sür ");
            System.out.println(" Reçete kodun : 456132232");
        }
    }
}
