/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;
/**
 *
 * @author Ahmad Nur Latif P
 */
public class master_aksesoris extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form master_aksesoris
     */
    public master_aksesoris() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        kosong();
        aktif();
        datatable();
    }

    protected void aktif() {
        id_aksesoris.requestFocus();
    }

    protected void kosong() {
        id_aksesoris.setText("");
        nama_aksesoris.setText("");
        harga_beliAk.setText("");
        harga_jualAk.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"ID Aksesoris", "Nama Aksesoris", "Harga Beli(Rp)", "Harga Jual (Rp)"};
        tabmode = new DefaultTableModel(null, Baris);
        String cariitem = txtcari.getText();

        try {
            String sql = "SELECT * FROM tb_aksesoris WHERE id_aksesoris LIKE '%" + cariitem + "%' "
                    + "OR nama_aksesoris LIKE '%" + cariitem + "%' "
                    + "OR harga_beliAk LIKE '%" + cariitem + "%' "
                    + "OR harga_jualAk LIKE '%" + cariitem + "%' "
                    + "ORDER BY id_aksesoris ASC";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),});
            }
            table_aksesoris.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil" + e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Service = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_aksesoris = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        harga_beliAk = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        nama_aksesoris = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        harga_jualAk = new javax.swing.JTextField();
        panel_kiri = new javax.swing.JPanel();
        panel_kanan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_aksesoris = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        cari_aksesoris = new javax.swing.JButton();
        bprint_pel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Service.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA AKSESORIS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ID Aksesoris");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Harga Beli (Rp) :");

        bsimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save.png"))); // NOI18N
        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bubah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.png"))); // NOI18N
        bubah.setText("UBAH");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        bhapus.setText("HAPUS");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bbatal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cancel.png"))); // NOI18N
        bbatal.setText("BATAL");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bkeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        bkeluar.setText("KEMBALI");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Harga Jual (Rp) :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(nama_aksesoris, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(id_aksesoris))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(harga_beliAk)
                    .addComponent(harga_jualAk)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(bsimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bhapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbatal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bkeluar)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_aksesoris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga_beliAk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_aksesoris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga_jualAk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bubah)
                    .addComponent(bhapus)
                    .addComponent(bbatal)
                    .addComponent(bkeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_kiri.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout panel_kiriLayout = new javax.swing.GroupLayout(panel_kiri);
        panel_kiri.setLayout(panel_kiriLayout);
        panel_kiriLayout.setHorizontalGroup(
            panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        panel_kiriLayout.setVerticalGroup(
            panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_kanan.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout panel_kananLayout = new javax.swing.GroupLayout(panel_kanan);
        panel_kanan.setLayout(panel_kananLayout);
        panel_kananLayout.setHorizontalGroup(
            panel_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        panel_kananLayout.setVerticalGroup(
            panel_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        table_aksesoris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_aksesoris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_aksesorisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_aksesoris);

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcariKeyTyped(evt);
            }
        });

        cari_aksesoris.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cari_aksesoris.setText("CARI");
        cari_aksesoris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_aksesorisActionPerformed(evt);
            }
        });

        bprint_pel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bprint_pel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/printer.png"))); // NOI18N
        bprint_pel.setText("CETAK");
        bprint_pel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bprint_pel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprint_pelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari_aksesoris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bprint_pel))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari_aksesoris)
                    .addComponent(bprint_pel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_ServiceLayout = new javax.swing.GroupLayout(Panel_Service);
        Panel_Service.setLayout(Panel_ServiceLayout);
        Panel_ServiceLayout.setHorizontalGroup(
            Panel_ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_ServiceLayout.createSequentialGroup()
                        .addComponent(panel_kiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(panel_kanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_ServiceLayout.setVerticalGroup(
            Panel_ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_kiri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_kanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Service, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Service, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean idTerdaftar(String id_aksesoris) {
        String sql = "SELECT id_aksesoris FROM tb_aksesoris WHERE id_aksesoris = ?";
        try (PreparedStatement stat = conn.prepareStatement(sql)) {
            stat.setString(1, id_aksesoris);
            ResultSet hasil = stat.executeQuery();
            return hasil.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memeriksa Kode Barang: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        String idText = id_aksesoris.getText().trim(); // Trim untuk menghapus spasi di awal dan akhir
        String namaText = nama_aksesoris.getText().trim();
        String hargabText = harga_beliAk.getText().trim();
        String hargajText = harga_jualAk.getText().trim();
        if (idText.isEmpty() || namaText.isEmpty() || hargabText.isEmpty() || hargajText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (idText.length() > 10) {
            JOptionPane.showMessageDialog(this, "ID Service harus terdiri dari 10 digit.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (idTerdaftar(idText)) {
            JOptionPane.showMessageDialog(this, "ID Service sudah terdaftar.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql = "insert into tb_aksesoris values(?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, idText);
            stat.setString(2, namaText);
            stat.setString(3, hargabText);
            stat.setString(4, hargajText);

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
            kosong();
            aktif();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan!" + e);
        }
        datatable();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        String idText = id_aksesoris.getText().trim(); // Trim untuk menghapus spasi di awal dan akhir
        String namaText = nama_aksesoris.getText().trim();
        String hargabText = harga_beliAk.getText().trim();
        String hargajText = harga_jualAk.getText().trim();
        if (idText.isEmpty() || namaText.isEmpty() || hargabText.isEmpty() || hargajText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (idText.length() > 10) {
            JOptionPane.showMessageDialog(this, "ID Service harus terdiri dari 10 digit.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql = "UPDATE tb_aksesoris SET nama_aksesoris=?, harga_beliAk=?, harga_jualAk=? WHERE id_aksesoris=?";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, namaText);
            stat.setString(2, hargabText);
            stat.setString(3, hargajText);
            stat.setString(4, idText);
            int rowsUpdated = stat.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
                kosong();
                aktif();
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal diubah. ID Service tidak ditemukan.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah!" + e, "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        datatable();
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        String idText = id_aksesoris.getText().trim();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Aksesoris belum diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!idTerdaftar(idText)) {
            JOptionPane.showMessageDialog(this, "ID Aksesoris tidak ditemukan.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int ok = JOptionPane.showConfirmDialog(null, "Apakah benar ingin dihapus?", "Peringatan!", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from tb_aksesoris where id_aksesoris='" + idText + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                kosong();
                aktif();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus" + e);
            }
            datatable();
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        menu_utama ma = new menu_utama();
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void table_aksesorisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_aksesorisMouseClicked
        int bar = table_aksesoris.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();

        id_aksesoris.setText(a);
        nama_aksesoris.setText(b);
        harga_beliAk.setText(c);
        harga_jualAk.setText(d);
    }//GEN-LAST:event_table_aksesorisMouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            datatable();
        }
    }//GEN-LAST:event_txtcariKeyPressed

    private void cari_aksesorisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_aksesorisActionPerformed
        datatable();
    }//GEN-LAST:event_cari_aksesorisActionPerformed

    private void txtcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyTyped
        datatable();
    }//GEN-LAST:event_txtcariKeyTyped

    private void bprint_pelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprint_pelActionPerformed
        form_report.report_pelanggan rp = new form_report.report_pelanggan();
        rp.setVisible(true);
        rp.setLocationRelativeTo(null);    // TODO add your handling code here:
    }//GEN-LAST:event_bprint_pelActionPerformed

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
            java.util.logging.Logger.getLogger(master_aksesoris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(master_aksesoris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(master_aksesoris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(master_aksesoris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new master_aksesoris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Service;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bprint_pel;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JButton cari_aksesoris;
    private javax.swing.JTextField harga_beliAk;
    private javax.swing.JTextField harga_jualAk;
    private javax.swing.JTextField id_aksesoris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_aksesoris;
    private javax.swing.JPanel panel_kanan;
    private javax.swing.JPanel panel_kiri;
    private javax.swing.JTable table_aksesoris;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
