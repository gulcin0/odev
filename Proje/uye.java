package Proje;

public class uye {
    public String isim;
    public String soyisim;
    public String email;


    uye(String isim, String soyisim, String email){
        super();
        this.isim=isim;
        this.soyisim=soyisim;
        this.email=email;
    }
}
/*üye sınıfını kullanarak iki farklı class olusturuyorum,elituye ve geneluye olmak üzere*/
     class elitUye extends uye {
    public elitUye(String isim, String soyisim, String email) {
        super(isim, soyisim, email);
    }
}

    class genelUye extends uye{
    public genelUye(String isim, String soyisim, String email) {
        super(isim, soyisim, email);
    }
}
