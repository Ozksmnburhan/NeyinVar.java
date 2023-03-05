public class KirmiziAlan  implements IAcil{
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
        System.out.println("Hastayı ameliyata alıyoruz . Lütfen Sabırlı olun ... ");

        System.out.println("Ameliyat sonrası");
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


    }

    @Override
    public void cikis() {
        System.out.println("Hastamızın durumu iyi şimdi yoğun bakımda 1 saate servislere alırız");
        System.out.println("Geçmiş Olsun...");
        System.out.println("Kırmızzı alandan ayrıldınız...");
    }
}
