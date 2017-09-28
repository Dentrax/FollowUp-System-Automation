/*License
// ====================================================
// EasySSA Copyright(C) 2017 Furkan Türkal
// This program comes with ABSOLUTELY NO WARRANTY; This is free software,
// and you are welcome to redistribute it under certain conditions; See
// file LICENSE, which is part of this source code package, for details.
// ====================================================
*/

package izinTakipSistemi;

import java.sql.Date;

public final class calisan {
    
    public int ID;
    
    public int Admin;
    
    public int KayitNo;
    
    public String Birim;
    
    public int KalanIzin;
    
    public String KullaniciAdi;
    
    public String Sifre;
    
    public String Ad;
    
    public String Soyad;
    
    public int TC;

    public int Sicil;
    
    public String Cinsiyet;
    
    public Date DogumTarihi;
    
    public String Sehir;
    
    public calisan(int id, int KayitNo, String Birim, int KalanIzin, String KullaniciAdi, String Sifre, String Ad, String Soyad, int TC, int Sicil, String Cinsiyet, Date DogumTarihi, String Sehir) {
        this.ID = id;
        this.KayitNo = KayitNo;
        this.Birim = Birim;
        this.KalanIzin = KalanIzin;
        this.KullaniciAdi = KullaniciAdi;
        this.Sifre = Sifre;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.TC = TC;
        this.Sicil = Sicil;
        this.Cinsiyet = Cinsiyet;
        this.DogumTarihi = DogumTarihi;
        this.Sehir = Sehir;
    }
    
}
