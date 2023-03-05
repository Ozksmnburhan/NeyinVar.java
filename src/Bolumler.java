public abstract class Bolumler extends Giris {
     private String bolum;
     private String drName;
    private String unvan;


    public Bolumler(String adSoyad2, long tc1,String bolum, String drName, String unvan) {
        super(adSoyad2, tc1);
        this.bolum=bolum;
        this.drName=drName;
        this.unvan=unvan;
    }

    public Bolumler(String adSoyad2, long tc1) {
        super(adSoyad2, tc1);
    }

    public abstract void drBiligi();
    public abstract void muayene(String muaneSaati);



    public String getBolum() {return bolum;}

    public void setBolum(String bolum)
    {this.bolum = bolum;}

    public String getDrName() {return drName;}

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}

