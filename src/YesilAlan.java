public class YesilAlan   implements IAcil{
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


    }

    @Override
    public void cikis() {
        System.out.println("Hasta durumu iyi korkulacak bir şey yok. Bir serum vericez sadece .");
        System.out.println("Yesil alndan ayrıldınızz...");
    }
}
