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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmGiris extends javax.swing.JFrame {

    public frmGiris() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGirisYap = new javax.swing.JButton();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        lblKullaniciAdi = new javax.swing.JLabel();
        lblSifre = new javax.swing.JLabel();
        btnIptal = new javax.swing.JButton();
        btnKayitOl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GİRİŞ");
        setAlwaysOnTop(true);
        setResizable(false);

        btnGirisYap.setText("Giriş Yap");
        btnGirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisYapActionPerformed(evt);
            }
        });

        lblKullaniciAdi.setText("Kullanıcı Adı :");

        lblSifre.setText("Şifre :");

        btnIptal.setText("İptal");

        btnKayitOl.setText("Kayıt Ol");
        btnKayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitOlActionPerformed(evt);
            }
        });

        jLabel1.setText("(admin : admin)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSifre)
                            .addComponent(lblKullaniciAdi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGirisYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKayitOl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIptal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSifre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGirisYap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKayitOl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIptal)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisYapActionPerformed
        if(giris(this.txtKullaniciAdi.getText(), this.txtSifre.getText())){
            this.setVisible(false);
            if(adminMi()){
                 JOptionPane.showMessageDialog(null, "ADMIN girişi başarılı.");
                 new frmYonetici().setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(null, "ÇALIŞAN girişi başarılı.");
                 new frmKullanici().setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Giriş başarısız. Lütfen tekrar deneyiniz.");
        }

    }//GEN-LAST:event_btnGirisYapActionPerformed

    private void btnKayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitOlActionPerformed
        this.setVisible(false);
        new frmYeniKullanici().setVisible(true);
    }//GEN-LAST:event_btnKayitOlActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGiris().setVisible(true);
            }
        });
    }
    
    public boolean giris(String kullanici, String sifre){
        try {
            SQL.Instance.ac();
            String sorgu = "select * from calisan where kullaniciadi = ? and sifre = ?";

            PreparedStatement ps = SQL.Instance.exec(sorgu);
            ps.setString(1, kullanici);
            ps.setString(2, sifre);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                
                String kullaniciAdi = rs.getString("kullaniciadi");
                String pw = rs.getString("sifre");
                     
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
                
                int admin = rs.getInt("admin");

                if(kullaniciAdi.equalsIgnoreCase(kullanici) && pw.equalsIgnoreCase(sifre)){
                    SQL.Instance.Calisan = new calisan(id, kayitNo, birim, kalanIzin, kullaniciAdi, pw, ad, soyad, tc, sicil, cinsiyet, dogumTarihi, sehir);
                    
                    SQL.Instance.Calisan.Admin = admin;
                    
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean adminMi(){
        return SQL.Instance.Calisan.Admin == 1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGirisYap;
    private javax.swing.JButton btnIptal;
    private javax.swing.JButton btnKayitOl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
