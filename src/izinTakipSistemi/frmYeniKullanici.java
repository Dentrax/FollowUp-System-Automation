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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class frmYeniKullanici extends javax.swing.JFrame {

    public frmYeniKullanici() {
        initComponents();
        //this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKullaniciEkle = new javax.swing.JButton();
        btnIptal = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        lblKullaniciAdi = new javax.swing.JLabel();
        lblSifre = new javax.swing.JLabel();
        lblAd = new javax.swing.JLabel();
        lblSoyad = new javax.swing.JLabel();
        lblTCNo = new javax.swing.JLabel();
        lblSicilNo = new javax.swing.JLabel();
        lblCinsiyet = new javax.swing.JLabel();
        lblDogumTarihi = new javax.swing.JLabel();
        lblSehir = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        txtTCNo = new javax.swing.JTextField();
        txtSicilNo = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        cbCinsiyet = new javax.swing.JComboBox<>();
        cbDogumAy = new javax.swing.JComboBox<>();
        cbDogumGun = new javax.swing.JComboBox<>();
        cbDogumYil = new javax.swing.JComboBox<>();
        cbSehir = new javax.swing.JComboBox<>();
        lblBirim = new javax.swing.JLabel();
        cbBirim = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YENİ KULLANICI");
        setAlwaysOnTop(true);
        setResizable(false);

        btnKullaniciEkle.setText("Kullanıcı Ekle");
        btnKullaniciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciEkleActionPerformed(evt);
            }
        });

        btnIptal.setText("İptal Et");
        btnIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIptalActionPerformed(evt);
            }
        });

        btnTemizle.setText("Tümünü Temizle");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });

        lblKullaniciAdi.setText("Kullanıcı Adı :");

        lblSifre.setText("Şifre :");

        lblAd.setText("Ad :");

        lblSoyad.setText("Soyad : ");

        lblTCNo.setText("TC No :");

        lblSicilNo.setText("Sicil No :");

        lblCinsiyet.setText("Cinsiyet :");

        lblDogumTarihi.setText("Doğum Tarihi :");

        lblSehir.setText("Şehir : ");

        cbCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın" }));

        cbDogumAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbDogumGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbDogumYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        cbSehir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Adana \t", "2.Adıyaman \t", "3.Afyonkarahisar \t", "4.Ağrı \t", "5.Amasya \t", "6.Ankara \t", "7.Antalya \t", "8.Artvin \t", "9.Aydın \t", "10.Balıkesir", "11.Bilecik \t", "12.Bingöl \t", "13.Bitlis \t", "14.Bolu", "15.Burdur \t", "16.Bursa \t", "17.Çanakkale \t", "18.Çankırı \t", "19.Çorum \t", "20.Denizli \t", "21.Diyarbakır \t", "22.Edirne \t", "23.Elazığ \t", "24.Erzincan", "25.Erzurum \t", "26.Eskişehir \t", "27.Gaziantep \t", "28.Giresun \t", "29.Gümüşhane \t", "30.Hakkâri \t", "31.Hatay \t", "32.Isparta \t", "33.İçel (Mersin) \t", "34.İstanbul \t", "35.İzmir \t", "36.Kars \t", "37.Kastamonu \t", "38.Kayseri \t", "39.Kırklareli \t", "40.Kırşehir \t", "41.Kocaeli \t", "42.Konya \t", "43.Kütahya \t", "44.Malatya \t", "45.Manisa \t", "46.Kahramanmaraş \t", "47.Mardin \t", "48.Muğla \t", "49.Muş \t", "50.Nevşehir \t", "51.Niğde \t", "52.Ordu \t", "53.Rize \t", "54.Sakarya \t", "55.Samsun \t", "56.Siirt \t", "57.Sinop \t", "58.Sivas \t", "59.Tekirdağ \t", "60.Tokat \t", "61.Trabzon \t", "62.Tunceli \t", "63.Şanlıurfa \t", "64.Uşak \t", "65.Van \t", "66.Yozgat \t", "67.Zonguldak \t", "68.Aksaray \t", "69.Bayburt \t", "70.Karaman \t", "71.Kırıkkale \t", "72.Batman \t", "73.Şırnak \t", "74.Bartın \t", "75.Ardahan \t", "76.Iğdır \t", "77.Yalova \t", "78.Karabük \t", "79.Kilis \t", "80.Osmaniye \t", "81.Düzce \t" }));

        lblBirim.setText("Birim : ");

        cbBirim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Birim", "2.Birim", "3.Birim", "4.Birim", "5.Birim" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIptal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKullaniciEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSehir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblDogumTarihi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbDogumAy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cbDogumGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDogumYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKullaniciAdi)
                            .addComponent(lblSoyad)
                            .addComponent(lblTCNo)
                            .addComponent(lblAd)
                            .addComponent(lblSifre)
                            .addComponent(lblSicilNo)
                            .addComponent(lblCinsiyet)
                            .addComponent(lblBirim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBirim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbCinsiyet, 0, 154, Short.MAX_VALUE)
                                .addComponent(txtSoyad)
                                .addComponent(txtAd)
                                .addComponent(txtTCNo)
                                .addComponent(txtSifre)
                                .addComponent(txtKullaniciAdi)
                                .addComponent(txtSicilNo)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSifre)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblAd)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoyad)
                            .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTCNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSicilNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSicilNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCinsiyet)
                    .addComponent(cbCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBirim)
                    .addComponent(cbBirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDogumAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDogumGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDogumYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDogumTarihi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSehir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKullaniciEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTemizle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIptal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIptalActionPerformed
       this.setVisible(false);
       new frmGiris().setVisible(true);
    }//GEN-LAST:event_btnIptalActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        this.txtKullaniciAdi.setText("");
        this.txtSifre.setText("");
        this.txtAd.setText("");
        this.txtSoyad.setText("");
        this.txtTCNo.setText("");
        this.txtSicilNo.setText("");
        
        this.cbCinsiyet.setSelectedIndex(0);
        this.cbBirim.setSelectedIndex(0);
        
        this.cbDogumGun.setSelectedIndex(0);
        this.cbDogumAy.setSelectedIndex(0);
        this.cbDogumYil.setSelectedIndex(0);
        
        this.cbSehir.setSelectedIndex(0);
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnKullaniciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciEkleActionPerformed
        
        int gun = Integer.parseInt((String)cbDogumGun.getSelectedItem());
        int ay = Integer.parseInt((String)cbDogumGun.getSelectedItem());
        int yil = Integer.parseInt((String)cbDogumGun.getSelectedItem());
        
        Date tarih = new Date(yil, ay, gun);
        
        try{
            int test = Integer.parseInt(txtTCNo.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "TC numarası karakter içermemeli");
            return;
        }
        
        try{
            int test = Integer.parseInt(txtSicilNo.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "SİCİL numarası karakter içermemeli");
            return;
        }
        
        if(txtTCNo.getText().length() > 11){
            JOptionPane.showMessageDialog(null, "TC numarası uzunluğu maksimum 10 'u geçmemeli");
            return;
        }
        
        if(txtSicilNo.getText().length() > 5){
            JOptionPane.showMessageDialog(null, "SİCİL numarası uzunluğu maksimum 5 'i geçmemeli");
            return;
        }
        
        
        
        
        if(this.kayitol(txtKullaniciAdi.getText(), txtSifre.getText(), txtAd.getText(), txtSoyad.getText(), txtTCNo.getText(), txtSicilNo.getText(), String.valueOf(cbCinsiyet.getSelectedItem()), tarih, String.valueOf(cbBirim.getSelectedItem()), String.valueOf(cbSehir.getSelectedItem()))){
            JOptionPane.showMessageDialog(null, "Kayıt başarılı. Lütfen giriş yapınız");
            this.setVisible(false);
            new frmGiris().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Kayıt başarısız. Lütfen tekrar deneyiniz.");
        }
        
        
    }//GEN-LAST:event_btnKullaniciEkleActionPerformed

    public boolean kayitol(String kullaniciAdi, String sifre, String ad, String soyad, String tc, String sicil, String cinsiyet, Date dogumTarihi, String birim, String sehir){
        try {
            SQL.Instance.ac();
            
            String sorgu = "INSERT INTO odev2.calisan (kullaniciadi, sifre, ad, soyad, tc, sicil, cinsiyet, dogumtarihi, birim, kalanizin, sehir, admin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, 20, ?, 0)";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, kullaniciAdi);
            ps.setString(2, sifre);
            ps.setString(3, ad);
            ps.setString(4, soyad);
            ps.setInt(5, Integer.parseInt(tc));
            ps.setInt(6, Integer.parseInt(sicil));
            ps.setString(7, cinsiyet);
            ps.setDate(8, dogumTarihi);
            ps.setString(9, birim);
            ps.setString(10, sehir);
            
            
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmYeniKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmYeniKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmYeniKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmYeniKullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmYeniKullanici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIptal;
    private javax.swing.JButton btnKullaniciEkle;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cbBirim;
    private javax.swing.JComboBox<String> cbCinsiyet;
    private javax.swing.JComboBox<String> cbDogumAy;
    private javax.swing.JComboBox<String> cbDogumGun;
    private javax.swing.JComboBox<String> cbDogumYil;
    private javax.swing.JComboBox<String> cbSehir;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblBirim;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblDogumTarihi;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblSehir;
    private javax.swing.JLabel lblSicilNo;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblTCNo;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtSicilNo;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTCNo;
    // End of variables declaration//GEN-END:variables
}
