import java.util.Scanner;

import java.util.InputMismatchException;

public class HastKabl {
    private String adSoyad,dogumTrh;
    private  long tc,tel;
    public void uyelik(){

        System.out.println("\n                                          ---------------------------------------POLİKLİNİKLER---------------------------------------------");

        System.out.println("\n************************  Üyelik Sayfası  *****************************\n");

        try {


        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı Soyadınızı giriniz : ");
        this.adSoyad = input.nextLine();

        System.out.println("TC no giriniz :");
        this.tc=input.nextLong();

        System.out.println("Doğum Tarihinizi giriniz : ");
        this.dogumTrh = input.next();

        System.out.println("Telefon numaranızı giriniz :");
        this.tel=input.nextLong();

        }catch (InputMismatchException e){
            System.out.print("Lütfen doğru bir şekilde girdiğinizden emin olunuz..");
            uyelik();
        }finally {
            System.out.println(".");
        }


        System.out.print("Üyeliğin Tamamlanıyor");
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
        System.out.println("Üyeliğin Tamamlandı");

    }

    public String getAdSoyad() {return adSoyad;}
    public void setAdSoyad(String adSoyad) {this.adSoyad = adSoyad;}

    public long getTc() {return tc;}
    public void setTc(long tc) {this.tc = tc;}

    public long getTel() {return tel;}
    public void setTel(long tel) {this.tel = tel;}

    public String getdogumTrh() {return dogumTrh;}

    public void setdogumTrh(String dogumTrh) {this.dogumTrh = dogumTrh;}
}
