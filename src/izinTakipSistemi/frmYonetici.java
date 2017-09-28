/*License
// ====================================================
// Follow-Up System Automation Copyright(C) 2017 Furkan Türkal
// This program comes with ABSOLUTELY NO WARRANTY; This is free software,
// and you are welcome to redistribute it under certain conditions; See
// file LICENSE, which is part of this source code package, for details.
// ====================================================
*/

package izinTakipSistemi;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmYonetici extends javax.swing.JFrame {
    
    public final static long MILLISECONDS_IN_DAY = 24 * 60 * 60 * 1000;

    public static int gunSayisi(Date from, Date to) {
        return (int)((to.getTime() - from.getTime()) / MILLISECONDS_IN_DAY);
    }

    public frmYonetici() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlKullaniciBilgileri = new javax.swing.JPanel();
        lblKullaniciBilgileri = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        cbDogumAy = new javax.swing.JComboBox<>();
        lblKullaniciAdi1 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        cbDogumGun = new javax.swing.JComboBox<>();
        lblSifre = new javax.swing.JLabel();
        txtTCNo = new javax.swing.JTextField();
        cbDogumYil = new javax.swing.JComboBox<>();
        lblAd = new javax.swing.JLabel();
        txtSicilNo = new javax.swing.JTextField();
        cbSehir = new javax.swing.JComboBox<>();
        lblSoyad = new javax.swing.JLabel();
        txtSifre = new javax.swing.JPasswordField();
        lblTCNo = new javax.swing.JLabel();
        lblSicilNo = new javax.swing.JLabel();
        cbCinsiyet = new javax.swing.JComboBox<>();
        lblCinsiyet = new javax.swing.JLabel();
        lblDogumTarihi = new javax.swing.JLabel();
        lblSehir = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        cbBirim = new javax.swing.JComboBox<>();
        lblBirim = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblKullaniciBilgileri2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKullanicilar = new javax.swing.JList<>();
        pnlKullaniciBilgileri1 = new javax.swing.JPanel();
        lblKullaniciBilgileri1 = new javax.swing.JLabel();
        txtAd1 = new javax.swing.JTextField();
        cbDogumAy1 = new javax.swing.JComboBox<>();
        lblKullaniciAdi2 = new javax.swing.JLabel();
        txtSoyad1 = new javax.swing.JTextField();
        cbDogumGun1 = new javax.swing.JComboBox<>();
        lblSifre1 = new javax.swing.JLabel();
        txtTCNo1 = new javax.swing.JTextField();
        cbDogumYil1 = new javax.swing.JComboBox<>();
        lblAd1 = new javax.swing.JLabel();
        txtSicilNo1 = new javax.swing.JTextField();
        cbSehir1 = new javax.swing.JComboBox<>();
        lblSoyad1 = new javax.swing.JLabel();
        txtSifre1 = new javax.swing.JPasswordField();
        lblTCNo1 = new javax.swing.JLabel();
        lblSicilNo1 = new javax.swing.JLabel();
        cbCinsiyet1 = new javax.swing.JComboBox<>();
        lblCinsiyet1 = new javax.swing.JLabel();
        lblDogumTarihi1 = new javax.swing.JLabel();
        lblSehir1 = new javax.swing.JLabel();
        txtKullaniciAdi1 = new javax.swing.JTextField();
        lblKullaniciBilgileri4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBirim1 = new javax.swing.JLabel();
        cbBirim1 = new javax.swing.JComboBox<>();
        lblKalanIzin = new javax.swing.JLabel();
        lblKullanilanIzin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblKullaniciBilgileri3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAramaSonuc = new javax.swing.JList<>();
        lblKullaniciBilgileri6 = new javax.swing.JLabel();
        txtAd2 = new javax.swing.JTextField();
        lblAd2 = new javax.swing.JLabel();
        lblSoyad2 = new javax.swing.JLabel();
        txtSoyad2 = new javax.swing.JTextField();
        lblSicilNo2 = new javax.swing.JLabel();
        txtSicilNo2 = new javax.swing.JTextField();
        cbCinsiyet2 = new javax.swing.JComboBox<>();
        lblCinsiyet2 = new javax.swing.JLabel();
        javax.swing.JButton btnKullaniciAraAd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnKullaniciAraSoyad = new javax.swing.JButton();
        btnKullaniciAraSicil = new javax.swing.JButton();
        btnKullaniciAraIzin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblKullaniciBilgileri5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstBekleyenIzinler = new javax.swing.JList<>();
        btnOnayla = new javax.swing.JButton();
        btnReddet = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YÖNETİCİ PANEL");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlKullaniciBilgileri.setBackground(new java.awt.Color(0, 153, 153));

        lblKullaniciBilgileri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri.setText("YÖNETİCİ BİLGİLERİ");

        cbDogumAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblKullaniciAdi1.setText("Kullanıcı Adı :");

        cbDogumGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        lblSifre.setText("Şifre :");

        cbDogumYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        lblAd.setText("Ad :");

        cbSehir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 .Adana \t", "2 .Adıyaman \t", "3 .Afyonkarahisar \t", "4 .Ağrı \t", "5 .Amasya \t", "6 .Ankara \t", "7 .Antalya \t", "8 .Artvin \t", "9 .Aydın \t", "10 .Balıkesir", "11 .Bilecik \t", "12 .Bingöl \t", "13 .Bitlis \t", "14 .Bolu", "15 .Burdur \t", "16 .Bursa \t", "17 .Çanakkale \t", "18 .Çankırı \t", "19 .Çorum \t", "20 .Denizli \t", "21 .Diyarbakır \t", "22 .Edirne \t", "23 .Elazığ \t", "24 .Erzincan", "25 .Erzurum \t", "26 .Eskişehir \t", "27 .Gaziantep \t", "28 .Giresun \t", "29 .Gümüşhane \t", "30 .Hakkâri \t", "31 .Hatay \t", "32 .Isparta \t", "33 .İçel (Mersin) \t", "34 .İstanbul \t", "35 .İzmir \t", "36 .Kars \t", "37 .Kastamonu \t", "38 .Kayseri \t", "39 .Kırklareli \t", "40 .Kırşehir \t", "41 .Kocaeli \t", "42 .Konya \t", "43 .Kütahya \t", "44 .Malatya \t", "45 .Manisa \t", "46 .Kahramanmaraş \t", "47 .Mardin \t", "48 .Muğla \t", "49 .Muş \t", "50 .Nevşehir \t", "51 .Niğde \t", "52 .Ordu \t", "53 .Rize \t", "54 .Sakarya \t", "55 .Samsun \t", "56 .Siirt \t", "57 .Sinop \t", "58 .Sivas \t", "59 .Tekirdağ \t", "60 .Tokat \t", "61 .Trabzon \t", "62 .Tunceli \t", "63 .Şanlıurfa \t", "64 .Uşak \t", "65 .Van \t", "66 .Yozgat \t", "67 .Zonguldak \t", "68 .Aksaray \t", "69 .Bayburt \t", "70 .Karaman \t", "71 .Kırıkkale \t", "72 .Batman \t", "73 .Şırnak \t", "74 .Bartın \t", "75 .Ardahan \t", "76 .Iğdır \t", "77 .Yalova \t", "78 .Karabük \t", "79 .Kilis \t", "80 .Osmaniye \t", "81 .Düzce \t" }));

        lblSoyad.setText("Soyad : ");

        lblTCNo.setText("TC No :");

        lblSicilNo.setText("Sicil No :");

        cbCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın" }));

        lblCinsiyet.setText("Cinsiyet :");

        lblDogumTarihi.setText("Doğum Tarihi :");

        lblSehir.setText("Şehir : ");

        cbBirim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Birim", "2.Birim", "3.Birim", "4.Birim", "5.Birim" }));

        lblBirim.setText("Birim :");

        javax.swing.GroupLayout pnlKullaniciBilgileriLayout = new javax.swing.GroupLayout(pnlKullaniciBilgileri);
        pnlKullaniciBilgileri.setLayout(pnlKullaniciBilgileriLayout);
        pnlKullaniciBilgileriLayout.setHorizontalGroup(
            pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                .addComponent(lblKullaniciBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                        .addComponent(lblDogumTarihi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDogumAy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDogumGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDogumYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileriLayout.createSequentialGroup()
                            .addComponent(lblBirim)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbBirim, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileriLayout.createSequentialGroup()
                            .addComponent(lblSehir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileriLayout.createSequentialGroup()
                            .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblKullaniciAdi1)
                                .addComponent(lblSoyad)
                                .addComponent(lblTCNo)
                                .addComponent(lblAd)
                                .addComponent(lblSifre)
                                .addComponent(lblSicilNo)
                                .addComponent(lblCinsiyet))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbCinsiyet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSoyad)
                                .addComponent(txtAd)
                                .addComponent(txtSicilNo)
                                .addComponent(txtTCNo)
                                .addComponent(txtSifre)
                                .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKullaniciBilgileriLayout.setVerticalGroup(
            pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                .addComponent(lblKullaniciBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi1)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSifre)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblAd)
                        .addGap(10, 10, 10)
                        .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoyad)
                            .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTCNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSicilNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSicilNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCinsiyet)
                    .addComponent(cbCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDogumAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDogumGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDogumTarihi)
                    .addComponent(cbDogumYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSehir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirim)))
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblKullaniciBilgileri2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri2.setText("KULLANICILAR");

        lstKullanicilar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstKullanicilar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstKullanicilarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstKullanicilar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblKullaniciBilgileri2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblKullaniciBilgileri2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlKullaniciBilgileri1.setBackground(new java.awt.Color(0, 153, 153));

        lblKullaniciBilgileri1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri1.setText("İZİN BİLGİLERİ");

        txtAd1.setEditable(false);

        cbDogumAy1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblKullaniciAdi2.setText("Kullanıcı Adı :");

        txtSoyad1.setEditable(false);

        cbDogumGun1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        lblSifre1.setText("Şifre :");

        txtTCNo1.setEditable(false);

        cbDogumYil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        lblAd1.setText("Ad :");

        txtSicilNo1.setEditable(false);

        cbSehir1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Adana \t", "2.Adıyaman \t", "3.Afyonkarahisar \t", "4.Ağrı \t", "5.Amasya \t", "6.Ankara \t", "7.Antalya \t", "8.Artvin \t", "9.Aydın \t", "10.Balıkesir", "11.Bilecik \t", "12.Bingöl \t", "13.Bitlis \t", "14.Bolu", "15.Burdur \t", "16.Bursa \t", "17.Çanakkale \t", "18.Çankırı \t", "19.Çorum \t", "20.Denizli \t", "21.Diyarbakır \t", "22.Edirne \t", "23.Elazığ \t", "24.Erzincan", "25.Erzurum \t", "26.Eskişehir \t", "27.Gaziantep \t", "28.Giresun \t", "29.Gümüşhane \t", "30.Hakkâri \t", "31.Hatay \t", "32.Isparta \t", "33.İçel (Mersin) \t", "34.İstanbul \t", "35.İzmir \t", "36.Kars \t", "37.Kastamonu \t", "38.Kayseri \t", "39.Kırklareli \t", "40.Kırşehir \t", "41.Kocaeli \t", "42.Konya \t", "43.Kütahya \t", "44.Malatya \t", "45.Manisa \t", "46.Kahramanmaraş \t", "47.Mardin \t", "48.Muğla \t", "49.Muş \t", "50.Nevşehir \t", "51.Niğde \t", "52.Ordu \t", "53.Rize \t", "54.Sakarya \t", "55.Samsun \t", "56.Siirt \t", "57.Sinop \t", "58.Sivas \t", "59.Tekirdağ \t", "60.Tokat \t", "61.Trabzon \t", "62.Tunceli \t", "63.Şanlıurfa \t", "64.Uşak \t", "65.Van \t", "66.Yozgat \t", "67.Zonguldak \t", "68.Aksaray \t", "69.Bayburt \t", "70.Karaman \t", "71.Kırıkkale \t", "72.Batman \t", "73.Şırnak \t", "74.Bartın \t", "75.Ardahan \t", "76.Iğdır \t", "77.Yalova \t", "78.Karabük \t", "79.Kilis \t", "80.Osmaniye \t", "81.Düzce \t" }));

        lblSoyad1.setText("Soyad : ");

        txtSifre1.setEditable(false);

        lblTCNo1.setText("TC No :");

        lblSicilNo1.setText("Sicil No :");

        cbCinsiyet1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın" }));

        lblCinsiyet1.setText("Cinsiyet :");

        lblDogumTarihi1.setText("Doğum Tarihi :");

        lblSehir1.setText("Şehir : ");

        txtKullaniciAdi1.setEditable(false);

        lblKullaniciBilgileri4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri4.setText("KULLANICI BİLGİLERİ");

        jLabel1.setText("Kalan İzin Günü : ");

        jLabel2.setText("Kullanılan İzin Günü :");

        lblBirim1.setText("Birim :");

        cbBirim1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Birim", "2.Birim", "3.Birim", "4.Birim", "5.Birim" }));

        lblKalanIzin.setForeground(new java.awt.Color(255, 51, 51));
        lblKalanIzin.setText("0");

        lblKullanilanIzin.setForeground(new java.awt.Color(255, 51, 51));
        lblKullanilanIzin.setText("0");

        javax.swing.GroupLayout pnlKullaniciBilgileri1Layout = new javax.swing.GroupLayout(pnlKullaniciBilgileri1);
        pnlKullaniciBilgileri1.setLayout(pnlKullaniciBilgileri1Layout);
        pnlKullaniciBilgileri1Layout.setHorizontalGroup(
            pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgileri1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKullaniciBilgileri1Layout.createSequentialGroup()
                        .addComponent(lblDogumTarihi1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDogumAy1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDogumGun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDogumYil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblKullaniciBilgileri1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileri1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKalanIzin))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileri1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblKullanilanIzin)))
                    .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileri1Layout.createSequentialGroup()
                            .addComponent(lblBirim1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbBirim1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileri1Layout.createSequentialGroup()
                            .addComponent(lblSehir1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSehir1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileri1Layout.createSequentialGroup()
                            .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblKullaniciAdi2)
                                .addComponent(lblSoyad1)
                                .addComponent(lblTCNo1)
                                .addComponent(lblAd1)
                                .addComponent(lblSifre1)
                                .addComponent(lblSicilNo1)
                                .addComponent(lblCinsiyet1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbCinsiyet1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSoyad1)
                                .addComponent(txtAd1)
                                .addComponent(txtSicilNo1)
                                .addComponent(txtTCNo1)
                                .addComponent(txtSifre1)
                                .addComponent(txtKullaniciAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKullaniciBilgileri1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblKullaniciBilgileri4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        pnlKullaniciBilgileri1Layout.setVerticalGroup(
            pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgileri1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi2)
                    .addComponent(txtKullaniciAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSifre1)
                    .addComponent(txtSifre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKullaniciBilgileri1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblAd1)
                        .addGap(10, 10, 10)
                        .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoyad1)
                            .addComponent(txtSoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlKullaniciBilgileri1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtAd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTCNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTCNo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSicilNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSicilNo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCinsiyet1)
                    .addComponent(cbCinsiyet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDogumAy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDogumGun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDogumTarihi1)
                    .addComponent(cbDogumYil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSehir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSehir1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBirim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirim1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKullaniciBilgileri1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblKalanIzin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblKullanilanIzin))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlKullaniciBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKullaniciBilgileri1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblKullaniciBilgileri4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(538, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        lblKullaniciBilgileri3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri3.setText("ARAMA FİLTRESİ");

        lstAramaSonuc.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAramaSonuc.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAramaSonucValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstAramaSonuc);

        lblKullaniciBilgileri6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri6.setText("KULLANICI ARA");

        lblAd2.setText("Ad :");

        lblSoyad2.setText("Soyad : ");

        lblSicilNo2.setText("Sicil No :");

        cbCinsiyet2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yıllık", "Mazeret", "Rapor", "Ücretsiz" }));

        lblCinsiyet2.setText("İzin Türü :");

        btnKullaniciAraAd.setText("ARA AD");
        btnKullaniciAraAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciAraAdActionPerformed(evt);
            }
        });

        jLabel3.setText("BULUNANLAR");

        btnKullaniciAraSoyad.setText("ARA SOYAD");
        btnKullaniciAraSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciAraSoyadActionPerformed(evt);
            }
        });

        btnKullaniciAraSicil.setText("ARA SİCİL");
        btnKullaniciAraSicil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciAraSicilActionPerformed(evt);
            }
        });

        btnKullaniciAraIzin.setText("ARA İZİN");
        btnKullaniciAraIzin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciAraIzinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSoyad2)
                                    .addComponent(lblAd2)
                                    .addComponent(lblSicilNo2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoyad2)
                                    .addComponent(txtAd2)
                                    .addComponent(txtSicilNo2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCinsiyet2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCinsiyet2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblKullaniciBilgileri3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addComponent(btnKullaniciAraAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKullaniciAraSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKullaniciAraSicil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKullaniciAraIzin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblKullaniciBilgileri6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblKullaniciBilgileri3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblAd2)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoyad2)
                            .addComponent(txtSoyad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtAd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSicilNo2)
                    .addComponent(txtSicilNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCinsiyet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCinsiyet2))
                .addGap(18, 18, 18)
                .addComponent(btnKullaniciAraAd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKullaniciAraSoyad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKullaniciAraSicil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKullaniciAraIzin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblKullaniciBilgileri6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(538, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        lblKullaniciBilgileri5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri5.setText("BEKLYEN İZİNLER");

        lstBekleyenIzinler.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstBekleyenIzinler);

        btnOnayla.setText("ONAYLA");
        btnOnayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnaylaActionPerformed(evt);
            }
        });

        btnReddet.setText("REDDET");
        btnReddet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReddetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblKullaniciBilgileri5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOnayla, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(btnReddet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblKullaniciBilgileri5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnOnayla, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReddet, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnCikis.setText("ÇIKIŞ");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlKullaniciBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlKullaniciBilgileri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlKullaniciBilgileri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlKullaniciBilgileri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        this.setVisible(false);
        new frmGiris().setVisible(true);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void lstKullanicilarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstKullanicilarValueChanged
        
        if (!evt.getValueIsAdjusting()) { 
            this.kullaniciYukle(lstKullanicilar.getSelectedValue());
        }
        
        
    }//GEN-LAST:event_lstKullanicilarValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.yoneticiYukle();
        this.tumKullanicilariYukle();
        this.bekleyenIzinleriYukle();
    }//GEN-LAST:event_formWindowOpened

    private void yenile(){
        this.yoneticiYukle();
        this.tumKullanicilariYukle();
        this.bekleyenIzinleriYukle();
    }
    
    private void btnOnaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnaylaActionPerformed
        if(izinIslemi(true)){
            JOptionPane.showMessageDialog(null, "İzin onaylandı!");
            this.yenile();
        }else{
            JOptionPane.showMessageDialog(null, "İzin onaylanırken hata oluştu!");
        }
    }//GEN-LAST:event_btnOnaylaActionPerformed

    private void btnReddetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReddetActionPerformed
        if(izinIslemi(false)){
            JOptionPane.showMessageDialog(null, "İzin reddedildi!");
            this.yenile();
        }else{
            JOptionPane.showMessageDialog(null, "İzin reddedilirken hata oluştu!");
        }
    }//GEN-LAST:event_btnReddetActionPerformed

    private void btnKullaniciAraAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciAraAdActionPerformed
        
        this.lstAramaSonuc.removeAll();
        this.kullaniciAraAd(this.txtAd2.getText());
        
    }//GEN-LAST:event_btnKullaniciAraAdActionPerformed

    private void btnKullaniciAraSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciAraSoyadActionPerformed
        this.lstAramaSonuc.removeAll();
        if(this.txtSoyad2.getText().trim() == ""){
            JOptionPane.showMessageDialog(null, "Boş değer girilemez");
            return;
        }
        this.kullaniciAraSoyad(this.txtSoyad2.getText());
    }//GEN-LAST:event_btnKullaniciAraSoyadActionPerformed

    private void btnKullaniciAraSicilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciAraSicilActionPerformed
        this.lstAramaSonuc.removeAll();
        if(this.txtSicilNo2.getText().trim() == ""){
            JOptionPane.showMessageDialog(null, "Boş değer girilemez");
            return;
        }
        this.kullaniciAraSicil(this.txtSicilNo2.getText());
    }//GEN-LAST:event_btnKullaniciAraSicilActionPerformed

    private void btnKullaniciAraIzinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciAraIzinActionPerformed
        this.lstAramaSonuc.removeAll();
        if(this.txtAd2.getText().trim() == ""){
            JOptionPane.showMessageDialog(null, "Boş değer girilemez");
            return;
        }
        this.kullaniciAraAd(this.txtAd2.getText());
    }//GEN-LAST:event_btnKullaniciAraIzinActionPerformed

    private void lstAramaSonucValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAramaSonucValueChanged
         if (!evt.getValueIsAdjusting()) { 
             try{
                 String deger = lstAramaSonuc.getSelectedValue().split("-")[0].trim();
                 this.kullaniciYukle(deger);
             } catch (Exception ex){
                 //JOptionPane.showMessageDialog(null, "Seçilen değer hatalı");
             }
        }
    }//GEN-LAST:event_lstAramaSonucValueChanged

    private void kullaniciAraAd(String ad){
        List<String> bulunanlar = new ArrayList<String>();
        try {
            SQL.Instance.ac();
            String sorgu = "SELECT * FROM calisan WHERE ad LIKE ? OR ad LIKE ? OR ad LIKE ?";
            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, "%" + ad + "%");
            ps.setString(2, "%" + ad);
            ps.setString(3, ad + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("kullaniciadi");
                String gercekAd = rs.getString("ad");
                bulunanlar.add(id + " - " + gercekAd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstAramaSonuc.setListData(bulunanlar.toArray(new String[0]));
    }
      
    private void kullaniciAraSoyad(String soyad){
        List<String> bulunanlar = new ArrayList<String>();
        try {
            SQL.Instance.ac();
            String sorgu = "SELECT * FROM calisan WHERE soyad LIKE ? OR soyad LIKE ? OR soyad LIKE ?";
            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, "%" + soyad + "%");
            ps.setString(2, "%" + soyad);
            ps.setString(3, soyad + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("kullaniciadi");
                String gercekSoyad = rs.getString("soyad");
                bulunanlar.add(id + " - " + gercekSoyad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstAramaSonuc.setListData(bulunanlar.toArray(new String[0]));
    }
    
    private void kullaniciAraSicil(String sicil){
        List<String> bulunanlar = new ArrayList<String>();
        try {
            SQL.Instance.ac();
            String sorgu = "select * from calisan where sicil = ?";
            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, Integer.parseInt(sicil));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("kullaniciadi");
                bulunanlar.add(id + " - " + sicil);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstAramaSonuc.setListData(bulunanlar.toArray(new String[0]));
    }
    
    private void tumKullanicilariYukle(){
        
        List<String> kullanicilar = new ArrayList<String>();
        
        try {
            SQL.Instance.ac();
            String sorgu = "select * from calisan";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String id = rs.getString("kullaniciadi");
                kullanicilar.add(id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstKullanicilar.setListData(kullanicilar.toArray(new String[0]));
    }
    
    private void kullaniciYukle(String kullanici){
        
        try {
            SQL.Instance.ac();
            String sorgu = "select * from calisan where kullaniciadi = ?";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, kullanici);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String id = rs.getString("kullaniciadi");
                     
                int kayitNo = rs.getInt("kayitno");
                String birim = rs.getString("birim");
                int kalanIzin = rs.getInt("kalanizin");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                int tc = rs.getInt("tc");
                int sicil = rs.getInt("sicil");
                String cinsiyet = rs.getString("cinsiyet");
                Date dogumTarihi = rs.getDate("dogumtarihi");
                String sehir = rs.getString("sehir");
                

                if(id.equalsIgnoreCase(kullanici)){
                    
                    this.txtKullaniciAdi1.setText(id);
                    this.txtSifre1.setText("-----");
                    this.txtAd1.setText(ad);
                    this.txtSoyad1.setText(soyad);
                    this.txtTCNo1.setText(Integer.toString(tc));
                    this.txtSicilNo1.setText(Integer.toString(sicil));

                    this.cbSehir1.setSelectedItem(sehir);
                    this.cbCinsiyet1.setSelectedItem(cinsiyet);
                    this.cbBirim1.setSelectedItem(birim);
                    
                    this.lblKalanIzin.setText(Integer.toString(kalanIzin));
                    
                }
            }
            
            //this.kullaniciKalanIzinYukle(kullanici);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void yoneticiYukle(){
        
        this.txtKullaniciAdi.setText(SQL.Instance.Calisan.KullaniciAdi);
        this.txtSifre.setText(SQL.Instance.Calisan.Sifre);
        this.txtAd.setText(SQL.Instance.Calisan.Ad);
        this.txtSoyad.setText(SQL.Instance.Calisan.Soyad);
        this.txtTCNo.setText(Integer.toString(SQL.Instance.Calisan.TC));
        this.txtSicilNo.setText(Integer.toString(SQL.Instance.Calisan.Sicil));
        
        this.cbSehir.setSelectedItem(SQL.Instance.Calisan.Sehir);
        this.cbCinsiyet.setSelectedItem(SQL.Instance.Calisan.Cinsiyet);
        this.cbBirim.setSelectedItem(SQL.Instance.Calisan.Birim);
    }
    
    private void bekleyenIzinleriYukle(){
        
        List<String> izinler = new ArrayList<String>();
        
        try {
            SQL.Instance.ac();
            String sorgu = "select * from izin where onaylandi = 0";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int uid = rs.getInt("u_id");
                
                String kullanici = getKullaniciAdiFromID(uid);
                 
                Date baslangic = rs.getDate("baslangic");
                Date bitis = rs.getDate("bitis");
                String tur = rs.getString("tur");
                
                izinler.add(kullanici + "  -  " + tur + "  -  " + gunSayisi(baslangic, bitis) + " gün");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstBekleyenIzinler.setListData(izinler.toArray(new String[0]));
        
    }
    
    private void kullaniciKalanIzinYukle(String kullanici){
        
        List<String> izinler = new ArrayList<String>();
        
        try {
            SQL.Instance.ac();
            
            String sorgu = "select * from izin";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, kullanici);
            ResultSet rs = ps.executeQuery();
            

            while(rs.next()){
                String id = rs.getString("kullaniciadi");
                
                 int kalan = rs.getInt("kalan");
                 int kullanilan = rs.getInt("kullanilan");
                 
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstBekleyenIzinler.setListData(izinler.toArray(new String[0]));
        
    }
    
    private String getKullaniciAdiFromID(int id){
        try {
            SQL.Instance.ac();
            
            String sorgu = "select * from calisan where id = ?";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            

            while(rs.next()){
                String kullanici = rs.getString("kullaniciadi");
                
                return kullanici;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
    
    private int getKullaniciIDFromAdi(String kullaniciAdi){
              
        try {
            SQL.Instance.ac();
            
            String sorgu = "select * from calisan where kullaniciadi = ?";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, kullaniciAdi);
            ResultSet rs = ps.executeQuery();
            

            while(rs.next()){
                int id = rs.getInt("id");
                
                return id;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    private String getKullaniciAdiFromBekleyenIzinListesi(){
        return this.lstBekleyenIzinler.getSelectedValue().split("-")[0].trim();
    }
    
    private boolean izinIslemi(boolean kabulEt){
        try {
            int onay = kabulEt ? 1 : -1;
            int u_id = getKullaniciIDFromAdi(getKullaniciAdiFromBekleyenIzinListesi());
            
            SQL.Instance.ac();
            
            String sorgu = "UPDATE izin SET onaylandi = ? where u_id = ?";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, onay);
            ps.setInt(2, u_id);
            ps.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmYonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmYonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmYonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmYonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmYonetici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnKullaniciAraIzin;
    private javax.swing.JButton btnKullaniciAraSicil;
    private javax.swing.JButton btnKullaniciAraSoyad;
    private javax.swing.JButton btnOnayla;
    private javax.swing.JButton btnReddet;
    private javax.swing.JComboBox<String> cbBirim;
    private javax.swing.JComboBox<String> cbBirim1;
    private javax.swing.JComboBox<String> cbCinsiyet;
    private javax.swing.JComboBox<String> cbCinsiyet1;
    private javax.swing.JComboBox<String> cbCinsiyet2;
    private javax.swing.JComboBox<String> cbDogumAy;
    private javax.swing.JComboBox<String> cbDogumAy1;
    private javax.swing.JComboBox<String> cbDogumGun;
    private javax.swing.JComboBox<String> cbDogumGun1;
    private javax.swing.JComboBox<String> cbDogumYil;
    private javax.swing.JComboBox<String> cbDogumYil1;
    private javax.swing.JComboBox<String> cbSehir;
    private javax.swing.JComboBox<String> cbSehir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblAd1;
    private javax.swing.JLabel lblAd2;
    private javax.swing.JLabel lblBirim;
    private javax.swing.JLabel lblBirim1;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblCinsiyet1;
    private javax.swing.JLabel lblCinsiyet2;
    private javax.swing.JLabel lblDogumTarihi;
    private javax.swing.JLabel lblDogumTarihi1;
    private javax.swing.JLabel lblKalanIzin;
    private javax.swing.JLabel lblKullaniciAdi1;
    private javax.swing.JLabel lblKullaniciAdi2;
    private javax.swing.JLabel lblKullaniciBilgileri;
    private javax.swing.JLabel lblKullaniciBilgileri1;
    private javax.swing.JLabel lblKullaniciBilgileri2;
    private javax.swing.JLabel lblKullaniciBilgileri3;
    private javax.swing.JLabel lblKullaniciBilgileri4;
    private javax.swing.JLabel lblKullaniciBilgileri5;
    private javax.swing.JLabel lblKullaniciBilgileri6;
    private javax.swing.JLabel lblKullanilanIzin;
    private javax.swing.JLabel lblSehir;
    private javax.swing.JLabel lblSehir1;
    private javax.swing.JLabel lblSicilNo;
    private javax.swing.JLabel lblSicilNo1;
    private javax.swing.JLabel lblSicilNo2;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblSifre1;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblSoyad1;
    private javax.swing.JLabel lblSoyad2;
    private javax.swing.JLabel lblTCNo;
    private javax.swing.JLabel lblTCNo1;
    private javax.swing.JList<String> lstAramaSonuc;
    private javax.swing.JList<String> lstBekleyenIzinler;
    private javax.swing.JList<String> lstKullanicilar;
    private javax.swing.JPanel pnlKullaniciBilgileri;
    private javax.swing.JPanel pnlKullaniciBilgileri1;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAd1;
    private javax.swing.JTextField txtAd2;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtKullaniciAdi1;
    private javax.swing.JTextField txtSicilNo;
    private javax.swing.JTextField txtSicilNo1;
    private javax.swing.JTextField txtSicilNo2;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JPasswordField txtSifre1;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtSoyad1;
    private javax.swing.JTextField txtSoyad2;
    private javax.swing.JTextField txtTCNo;
    private javax.swing.JTextField txtTCNo1;
    // End of variables declaration//GEN-END:variables
}
