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

public class frmKullanici extends javax.swing.JFrame {

    public frmKullanici() {
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
        jButton1 = new javax.swing.JButton();
        cbBirim = new javax.swing.JComboBox<>();
        lblBirim = new javax.swing.JLabel();
        pnlIzinBilgileri = new javax.swing.JPanel();
        lblIzinler1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstButunIzinler = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstReddedilenler = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstKabulEdilenler = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIzinIstegi = new javax.swing.JButton();
        cbBaslangicGun = new javax.swing.JComboBox<>();
        cbBaslangicAy = new javax.swing.JComboBox<>();
        cbBaslangicYil = new javax.swing.JComboBox<>();
        cbBitisGun = new javax.swing.JComboBox<>();
        cbBitisAy = new javax.swing.JComboBox<>();
        cbBitisYil = new javax.swing.JComboBox<>();
        lblKullanilanIzin = new javax.swing.JLabel();
        lblKalanIzin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbIzinTuru = new javax.swing.JComboBox<>();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KULLANICI PANEL");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlKullaniciBilgileri.setBackground(new java.awt.Color(0, 153, 153));

        lblKullaniciBilgileri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciBilgileri.setText("KULLANICI BİLGİLERİ");

        cbDogumAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblKullaniciAdi1.setText("Kullanıcı Adı :");

        cbDogumGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        lblSifre.setText("Şifre :");

        cbDogumYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        lblAd.setText("Ad :");

        cbSehir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Adana \t", "2.Adıyaman \t", "3.Afyonkarahisar \t", "4.Ağrı \t", "5.Amasya \t", "6.Ankara \t", "7.Antalya \t", "8.Artvin \t", "9.Aydın \t", "10.Balıkesir", "11.Bilecik \t", "12.Bingöl \t", "13.Bitlis \t", "14.Bolu", "15.Burdur \t", "16.Bursa \t", "17.Çanakkale \t", "18.Çankırı \t", "19.Çorum \t", "20.Denizli \t", "21.Diyarbakır \t", "22.Edirne \t", "23.Elazığ \t", "24.Erzincan", "25.Erzurum \t", "26.Eskişehir \t", "27.Gaziantep \t", "28.Giresun \t", "29.Gümüşhane \t", "30.Hakkâri \t", "31.Hatay \t", "32.Isparta \t", "33.İçel (Mersin) \t", "34.İstanbul \t", "35.İzmir \t", "36.Kars \t", "37.Kastamonu \t", "38.Kayseri \t", "39.Kırklareli \t", "40.Kırşehir \t", "41.Kocaeli \t", "42.Konya \t", "43.Kütahya \t", "44.Malatya \t", "45.Manisa \t", "46.Kahramanmaraş \t", "47.Mardin \t", "48.Muğla \t", "49.Muş \t", "50.Nevşehir \t", "51.Niğde \t", "52.Ordu \t", "53.Rize \t", "54.Sakarya \t", "55.Samsun \t", "56.Siirt \t", "57.Sinop \t", "58.Sivas \t", "59.Tekirdağ \t", "60.Tokat \t", "61.Trabzon \t", "62.Tunceli \t", "63.Şanlıurfa \t", "64.Uşak \t", "65.Van \t", "66.Yozgat \t", "67.Zonguldak \t", "68.Aksaray \t", "69.Bayburt \t", "70.Karaman \t", "71.Kırıkkale \t", "72.Batman \t", "73.Şırnak \t", "74.Bartın \t", "75.Ardahan \t", "76.Iğdır \t", "77.Yalova \t", "78.Karabük \t", "79.Kilis \t", "80.Osmaniye \t", "81.Düzce \t" }));

        lblSoyad.setText("Soyad : ");

        lblTCNo.setText("TC No :");

        lblSicilNo.setText("Sicil No :");

        cbCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın" }));

        lblCinsiyet.setText("Cinsiyet :");

        lblDogumTarihi.setText("Doğum Tarihi :");

        lblSehir.setText("Şehir : ");

        txtKullaniciAdi.setEditable(false);

        jButton1.setText("KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                        .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
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
                                    .addComponent(txtKullaniciAdi)))
                            .addGroup(pnlKullaniciBilgileriLayout.createSequentialGroup()
                                .addComponent(lblDogumTarihi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbDogumAy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDogumGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDogumYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKullaniciBilgileriLayout.createSequentialGroup()
                        .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSehir)
                            .addComponent(lblBirim))
                        .addGap(52, 52, 52)
                        .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSehir, 0, 144, Short.MAX_VALUE)
                            .addComponent(cbBirim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKullaniciBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirim)
                    .addComponent(cbBirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIzinBilgileri.setBackground(new java.awt.Color(0, 153, 153));

        lblIzinler1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIzinler1.setText("İZİN BİLGİLERİ");

        lstButunIzinler.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstButunIzinler);

        jLabel1.setText("Bütün İzinler");

        jLabel2.setText("Kabul Edilenler");

        jLabel3.setText("Kabul Edilmeyenler");

        lstReddedilenler.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstReddedilenler);

        lstKabulEdilenler.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstKabulEdilenler);

        jLabel4.setText("Kalan İzin Günü : ");

        jLabel5.setText("Kullanılan İzin Günü :");

        jLabel6.setText("İzin İste");

        jLabel7.setText("Başlangıç Tarihi : ");

        jLabel8.setText("Bitiş Tarihi :");

        btnIzinIstegi.setText("İzin İsteği Gönder");
        btnIzinIstegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzinIstegiActionPerformed(evt);
            }
        });

        cbBaslangicGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbBaslangicAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbBaslangicYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        cbBitisGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbBitisAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbBitisYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        lblKullanilanIzin.setForeground(new java.awt.Color(255, 51, 51));
        lblKullanilanIzin.setText("0");

        lblKalanIzin.setForeground(new java.awt.Color(255, 51, 51));
        lblKalanIzin.setText("0");

        jLabel9.setText("Türü:");

        cbIzinTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yıllık", "Mazeret", "Rapor", "Ücretsiz" }));

        javax.swing.GroupLayout pnlIzinBilgileriLayout = new javax.swing.GroupLayout(pnlIzinBilgileri);
        pnlIzinBilgileri.setLayout(pnlIzinBilgileriLayout);
        pnlIzinBilgileriLayout.setHorizontalGroup(
            pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzinBilgileriLayout.createSequentialGroup()
                .addComponent(lblIzinler1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzinBilgileriLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlIzinBilgileriLayout.createSequentialGroup()
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(pnlIzinBilgileriLayout.createSequentialGroup()
                                .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblKullanilanIzin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblKalanIzin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 342, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzinBilgileriLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(cbBaslangicGun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBaslangicAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBaslangicYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzinBilgileriLayout.createSequentialGroup()
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlIzinBilgileriLayout.createSequentialGroup()
                                .addComponent(cbBitisGun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbBitisAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbBitisYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbIzinTuru, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIzinIstegi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        pnlIzinBilgileriLayout.setVerticalGroup(
            pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzinBilgileriLayout.createSequentialGroup()
                .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIzinBilgileriLayout.createSequentialGroup()
                        .addComponent(lblIzinler1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblKullanilanIzin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblKalanIzin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(pnlIzinBilgileriLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbBaslangicGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBaslangicAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBaslangicYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBitisYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBitisAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBitisGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlIzinBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbIzinTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIzinIstegi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pnlKullaniciBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlIzinBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlIzinBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlKullaniciBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCikis)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.kullaniciYukle();
        this.butunIzinleriYukle();
        this.kabulEdilenIzinleriYukle();
        this.reddedilenIzinleriYukle();
    }//GEN-LAST:event_formWindowOpened

    private void butunIzinleriYukle(){
        List<String> izinler = new ArrayList<String>();
        try {
            SQL.Instance.ac();
            String sorgu = "select * from izin where u_id = ?";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, SQL.Instance.Calisan.ID);
            ResultSet rs = ps.executeQuery();

            int say = 1;
            while(rs.next()){
                String tur = rs.getString("tur");
                Date baslangic = rs.getDate("baslangic");
                Date bitis = rs.getDate("bitis");
                int onaylandi = rs.getInt("onaylandi");
                int kullanilan = rs.getInt("kullanilan");

                izinler.add(say + " - " + tur + " - " + " KULLANILAN : " + kullanilan + " - " + "ONAYLANDI : " + onaylandi + " BAŞLANGIÇ : " + baslangic + " BİTİŞ : " + bitis);
                
                say++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstButunIzinler.setListData(izinler.toArray(new String[0]));
    }
    
    private void kabulEdilenIzinleriYukle(){
         List<String> izinler = new ArrayList<String>();
        try {
            SQL.Instance.ac();
            String sorgu = "select * from izin where u_id = ? and onaylandi = 1";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, SQL.Instance.Calisan.ID);
            ResultSet rs = ps.executeQuery();

            int say = 1;
            while(rs.next()){
                String tur = rs.getString("tur");
                Date baslangic = rs.getDate("baslangic");
                Date bitis = rs.getDate("bitis");
                int onaylandi = rs.getInt("onaylandi");
                int kullanilan = rs.getInt("kullanilan");

                izinler.add(say + " - " + tur + " - " + " KULLANILAN : " + kullanilan + " - " + " BAŞLANGIÇ : " + baslangic + " BİTİŞ : " + bitis);
                
                say++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstKabulEdilenler.setListData(izinler.toArray(new String[0]));
    }
    
    private void reddedilenIzinleriYukle(){
        List<String> izinler = new ArrayList<String>();
        try {
            SQL.Instance.ac();
            String sorgu = "select * from izin where u_id = ? and onaylandi = -1";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, SQL.Instance.Calisan.ID);
            ResultSet rs = ps.executeQuery();

            int say = 1;
            while(rs.next()){
                String tur = rs.getString("tur");
                Date baslangic = rs.getDate("baslangic");
                Date bitis = rs.getDate("bitis");

                izinler.add(say + " - " + tur + " - " + " - " + " BAŞLANGIÇ : " + baslangic + " BİTİŞ : " + bitis);
                
                say++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lstReddedilenler.setListData(izinler.toArray(new String[0]));
    }
    
    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        SQL.Instance.Calisan = null;
        this.setVisible(false);
        new frmGiris().setVisible(true);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int gun = Integer.parseInt((String)cbDogumGun.getSelectedItem());
        int ay = Integer.parseInt((String)cbDogumGun.getSelectedItem());
        int yil = Integer.parseInt((String)cbDogumGun.getSelectedItem());
        
        Date tarih = new Date(yil, ay, gun);
        
        if(this.kullaniciGuncelle(txtKullaniciAdi.getText(), txtSifre.getText(), txtAd.getText(), txtSoyad.getText(), txtTCNo.getText(), txtSicilNo.getText(), String.valueOf(cbCinsiyet.getSelectedItem()), tarih, String.valueOf(cbBirim.getSelectedItem()), String.valueOf(cbSehir.getSelectedItem()))){
            JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarılı. Lütfen tekrar giriş yapınız");
            this.setVisible(false);
            new frmGiris().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarısız. Lütfen tekrar deneyiniz.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIzinIstegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzinIstegiActionPerformed
        
        int basgun = Integer.parseInt((String)cbBaslangicGun.getSelectedItem());
        int basay = Integer.parseInt((String)cbBaslangicAy.getSelectedItem());
        int basyil = Integer.parseInt((String)cbBaslangicYil.getSelectedItem());
        
        Date baslangic = new Date(basyil - 1900, basay, basgun);
        
        int bitgun = Integer.parseInt((String)cbBitisGun.getSelectedItem());
        int bitay = Integer.parseInt((String)cbBitisAy.getSelectedItem());
        int bityil = Integer.parseInt((String)cbBitisYil.getSelectedItem());
        
        Date bitis = new Date(bityil - 1900, bitay, bitgun);
        
        if(baslangic.compareTo(bitis) > 0){
           JOptionPane.showMessageDialog(null, "Bitiş tarihi, başlangıç tarihinden küçük olamaz!");
           return;
        }

        if(!bekleyenIzinVarmi()){
            if(izinIste(baslangic, bitis, (String)cbIzinTuru.getSelectedItem())){
                JOptionPane.showMessageDialog(null, "İzin isteği gönderildi.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Onaylanmayı bekleyen zaten bir izin var!");
        }
        
       
        
    }//GEN-LAST:event_btnIzinIstegiActionPerformed

    public void kullaniciYukle(){
        this.txtKullaniciAdi.setText(SQL.Instance.Calisan.KullaniciAdi);
        this.txtSifre.setText(SQL.Instance.Calisan.Sifre);
        this.txtAd.setText(SQL.Instance.Calisan.Ad);
        this.txtSoyad.setText(SQL.Instance.Calisan.Soyad);
        this.txtTCNo.setText(Integer.toString(SQL.Instance.Calisan.TC));
        this.txtSicilNo.setText(Integer.toString(SQL.Instance.Calisan.Sicil));
        
        this.cbSehir.setSelectedItem(SQL.Instance.Calisan.Sehir);
        this.cbCinsiyet.setSelectedItem(SQL.Instance.Calisan.Cinsiyet);
        this.cbBirim.setSelectedItem(SQL.Instance.Calisan.Birim);
        
        this.lblKalanIzin.setText(Integer.toString(SQL.Instance.Calisan.KalanIzin));
        this.lblKullanilanIzin.setText(Integer.toString(20 - SQL.Instance.Calisan.KalanIzin));
    }
    
    public boolean kullaniciGuncelle(String kullaniciAdi, String sifre, String ad, String soyad, String tc, String sicil, String cinsiyet, Date dogumTarihi, String birim, String sehir){
         
         try {
            SQL.Instance.ac();
            
            String sorgu = "UPDATE odev2.calisan SET sifre = ?, ad = ?, soyad = ?, tc = ?, sicil = ?, cinsiyet = ?, dogumtarihi = ?, birim = ?, sehir = ? WHERE kullaniciadi = ?";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, sifre);
            ps.setString(2, ad);
            ps.setString(3, soyad);
            ps.setInt(4, Integer.parseInt(tc));
            ps.setInt(5, Integer.parseInt(sicil));
            ps.setString(6, cinsiyet);
            ps.setDate(7, dogumTarihi);
            ps.setString(8, birim);
            ps.setString(9, sehir);
            
            ps.setString(10, kullaniciAdi);
            //ps.setString(11, sifre);
            
            ps.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    public boolean bekleyenIzinVarmi(){
         try {
            SQL.Instance.ac();
            String sorgu = "select * from izin where u_id = ? and onaylandi = 0";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, SQL.Instance.Calisan.ID);
            ResultSet rs = ps.executeQuery();

            int say = 0;
            while(rs.next()){
                String tur = rs.getString("tur");
                Date baslangic = rs.getDate("baslangic");
                Date bitis = rs.getDate("bitis");

                
                say++;
            }
            return say > 0;
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean izinIste(Date baslangic, Date bitis, String tur){
        try {
            SQL.Instance.ac();
            
            String sorgu = "insert into izin (u_id, baslangic, bitis, tur, kullanilan, onaylandi) values (?, ?, ?, ?, ?, 0)";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setInt(1, SQL.Instance.Calisan.ID);
            ps.setDate(2, baslangic);
            ps.setDate(3, bitis);
            ps.setString(4, tur);
            ps.setInt(5, 0);
            
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKullanici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnIzinIstegi;
    private javax.swing.JComboBox<String> cbBaslangicAy;
    private javax.swing.JComboBox<String> cbBaslangicGun;
    private javax.swing.JComboBox<String> cbBaslangicYil;
    private javax.swing.JComboBox<String> cbBirim;
    private javax.swing.JComboBox<String> cbBitisAy;
    private javax.swing.JComboBox<String> cbBitisGun;
    private javax.swing.JComboBox<String> cbBitisYil;
    private javax.swing.JComboBox<String> cbCinsiyet;
    private javax.swing.JComboBox<String> cbDogumAy;
    private javax.swing.JComboBox<String> cbDogumGun;
    private javax.swing.JComboBox<String> cbDogumYil;
    private javax.swing.JComboBox<String> cbIzinTuru;
    private javax.swing.JComboBox<String> cbSehir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblBirim;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblDogumTarihi;
    private javax.swing.JLabel lblIzinler1;
    private javax.swing.JLabel lblKalanIzin;
    private javax.swing.JLabel lblKullaniciAdi1;
    private javax.swing.JLabel lblKullaniciBilgileri;
    private javax.swing.JLabel lblKullanilanIzin;
    private javax.swing.JLabel lblSehir;
    private javax.swing.JLabel lblSicilNo;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblTCNo;
    private javax.swing.JList<String> lstButunIzinler;
    private javax.swing.JList<String> lstKabulEdilenler;
    private javax.swing.JList<String> lstReddedilenler;
    private javax.swing.JPanel pnlIzinBilgileri;
    private javax.swing.JPanel pnlKullaniciBilgileri;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtSicilNo;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTCNo;
    // End of variables declaration//GEN-END:variables
}
