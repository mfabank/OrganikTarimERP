
package organiktarimerp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import musteri.KayitListele;
import musteri.KayitSil;
import musteri.MusteriGuncelle;
import urun.UrunEkle;
import urun.UrunListele;
import musteri.YeniMusteri;
import organiktarimerp.sayfalar.Fatura;
import urun.UrunGuncelle;
import urun.UrunSil;


public class Program extends javax.swing.JFrame {

    public Program() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/organik.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        jMenu3.setText("Müşteri");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/add.png"))); // NOI18N
        jMenu1.setText("Yeni Kayıt");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/update.png"))); // NOI18N
        jMenu2.setText("Kayıt Güncelle");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/delete.png"))); // NOI18N
        jMenu4.setText("Kayıt Sil");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu4);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/info.png"))); // NOI18N
        jMenu11.setText("Kayıt Listele");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu11);

        jMenuBar2.add(jMenu3);

        jMenu5.setText("Ürünler");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/urun1.png"))); // NOI18N
        jMenu6.setText("Ürün Ekle");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/urun2.png"))); // NOI18N
        jMenu7.setText("Ürün Güncelle");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/urun3.png"))); // NOI18N
        jMenu8.setText("Ürün Sil");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu8);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/info.png"))); // NOI18N
        jMenu12.setText("Ürün Listele");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu12);

        jMenuBar2.add(jMenu5);

        jMenu9.setText("Faturalar");

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/organiktarimerp/img/fatura.png"))); // NOI18N
        jMenu10.setText("Yeni Fatura");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu9.add(jMenu10);

        jMenuBar2.add(jMenu9);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        YeniMusteri yeniMusteri = new YeniMusteri();
        yeniMusteri.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        UrunEkle urunEkle = new UrunEkle();
        urunEkle.setVisible(true);
        
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        MusteriGuncelle musteriGuncelle = new MusteriGuncelle();
        musteriGuncelle.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        KayitSil kayitSil = new KayitSil();
        kayitSil.setVisible(true);
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
       KayitListele kayitListele = new KayitListele();
       kayitListele.setVisible(true);
       
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        UrunListele urunListele = new UrunListele();
        urunListele.setVisible(true);
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        Fatura fatura = new Fatura();
        fatura.setVisible(true);
        try {
            FileInputStream f1 = new FileInputStream("kullanicilar.txt");
            FileInputStream f2 = new FileInputStream("urunler.txt");
            FileOutputStream yeniDosya = new FileOutputStream("fatura.txt");
            SequenceInputStream birlestir = new SequenceInputStream(f1,f2);
            
            int i = 0;
            while((i = birlestir.read()) != -1) {
                yeniDosya.write(i);
            }
            
            birlestir.close();
            f1.close();
            f2.close();
            yeniDosya.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fatura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Fatura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        UrunGuncelle urunGuncelle = new UrunGuncelle();
        urunGuncelle.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        UrunSil urunSil = new UrunSil();
        urunSil.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
