public class SariAlan  implements IAcil{

    @Override
    public void giris() {
        System.out.println("Muayene yapılıyor ");
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
        System.out.println("Hastayı 5 saat müşaade altında tutmamız lazım..");

        System.out.println("5 saat sonra ");
        for (int i=1; i<=5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");


        }
    }

    @Override
    public void cikis() {
        System.out.println("Hastamızın durumu şimdilik iyi. Taburcu edebiliriz. ");
        System.out.println("Sarı Alandan Çıkış yaptınız...");
    }
}
