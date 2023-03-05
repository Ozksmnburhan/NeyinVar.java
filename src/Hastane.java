import java.util.Scanner;
import java.util.InputMismatchException;

public class Hastane {
    public void cagirma(){

        System.out.println("\n                                 ************************  Hastalar Hastanesine Hoşgeldiniz  *****************************\n\n\n");

        System.out.println("1. Acil     2.Polikinikler");

        System.out.println("Lütfen gitmek istediğiniz bölümü seçiniz : ");
        try {


        Scanner input = new Scanner(System.in);
        int a= input.nextInt();

        switch (a){
            case 1: {
                IAcil iAcil = new AcilKarsilama();
                iAcil.giris();
                iAcil.cikis();

                break;
            }
            case 2:{
                HastKabl kbl = new HastKabl();
                kbl.uyelik();
                System.out.println("Ad Soyad="+kbl.getAdSoyad());


                Giris giris= new Giris(kbl);
                giris.karsilama();



                Sekreter sek =new Sekreter(giris.adSoyad2, giris.tc1);
                sek.HastKarsila();
              break;


            }
            default:
                System.out.println("Lütfen yalnızca iki seçenekten birini giriniz !!!");
                cagirma();
        }
        }catch (InputMismatchException e){
        System.out.println("Lütfen doğru bir şekilde girdiğinizden emin olunuz..");
        cagirma();
    }
    }

}
