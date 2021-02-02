package frmm;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import thienAn.thienAn;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
public class frmKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form frmKhachHang
     */
    public frmKhachHang() {
        initComponents();
    }
    Calendar cal = Calendar.getInstance();

    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);

    Date dt = cal.getTime();
// Dinh dang lai hien thi thong tin ngay gio ra man hinh
    SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
     private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel_KhachHang = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        lblMaKhachHang_KhachHang = new javax.swing.JLabel();
        lblTenKhachHang_KhachHang = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        rbtnNam = new javax.swing.JRadioButton();
        rbtnNu = new javax.swing.JRadioButton();
        lblNgaySinh_KhachHang = new javax.swing.JLabel();
        lblGioiTinh_KhachHang = new javax.swing.JLabel();
        lblDiaChi_KhachHang = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblSDT_KhachHang = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        cbbLoaiKhachHang = new javax.swing.JComboBox<>();
        lblLoaiKhachHang_KhachHang = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextPane();
        btnThem_ = new javax.swing.JButton();
        btnReset_ = new javax.swing.JButton();
        cbbNgay = new javax.swing.JComboBox<>();
        cbbThang = new javax.swing.JComboBox<>();
        cbbNam = new javax.swing.JComboBox<>();
        lblLoiMaKhachHang_KhachHang4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_KhachHang.setPreferredSize(new java.awt.Dimension(500, 434));
        jPanel_KhachHang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_KhachHangComponentShown(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("KHACH HANG");

        lblMaKhachHang_KhachHang.setText("MA KH");

        lblTenKhachHang_KhachHang.setText("TEN KH");

        txtMaKhachHang.setEditable(false);

        txtTenKhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenKhachHangFocusLost(evt);
            }
        });
        txtTenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHangActionPerformed(evt);
            }
        });
        txtTenKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKhachHangKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenKhachHangKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtnNam);
        rbtnNam.setText("Nam");

        buttonGroup1.add(rbtnNu);
        rbtnNu.setText("Nu");

        lblNgaySinh_KhachHang.setText("Ngay Sinh");

        lblGioiTinh_KhachHang.setText("Gioi Tinh");

        lblDiaChi_KhachHang.setText("Dia Chi");

        txtDiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusLost(evt);
            }
        });

        lblSDT_KhachHang.setText("SDT");

        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });

        cbbLoaiKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblLoaiKhachHang_KhachHang.setText("Loai KH");

        jLabel85.setText("Ghi Chu");

        jScrollPane25.setViewportView(txtGhiChu);

        btnThem_.setText("Them");
        btnThem_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_ActionPerformed(evt);
            }
        });

        btnReset_.setText("Reset");
        btnReset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_ActionPerformed(evt);
            }
        });

        cbbThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangItemStateChanged(evt);
            }
        });
        cbbThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThangActionPerformed(evt);
            }
        });

        lblLoiMaKhachHang_KhachHang4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblLoiMaKhachHang_KhachHang4.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel_KhachHangLayout = new javax.swing.GroupLayout(jPanel_KhachHang);
        jPanel_KhachHangLayout.setHorizontalGroup(
        	jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        			.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        					.addGap(24)
        					.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        									.addComponent(lblTenKhachHang_KhachHang, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblNgaySinh_KhachHang, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblGioiTinh_KhachHang, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblDiaChi_KhachHang, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblSDT_KhachHang)
        									.addComponent(lblMaKhachHang_KhachHang, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
        								.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        									.addComponent(lblLoaiKhachHang_KhachHang, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        									.addComponent(btnReset_)))
        							.addGap(4))
        						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        							.addComponent(jLabel85)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(cbbLoaiKhachHang, 0, 219, Short.MAX_VALUE)
        							.addComponent(txtSDT))
        						.addComponent(jScrollPane25, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnThem_, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        							.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
        							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(txtTenKhachHang)
        								.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        										.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        											.addGap(2)
        											.addComponent(rbtnNam))
        										.addComponent(cbbNgay, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
        									.addGap(18)
        									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        										.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        											.addComponent(cbbThang, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        											.addPreferredGap(ComponentPlacement.UNRELATED)
        											.addComponent(cbbNam, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
        										.addComponent(rbtnNu, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
        								.addComponent(txtDiaChi, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        					.addGap(158)
        					.addComponent(jLabel56)))
        			.addContainerGap())
        		.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        			.addGap(145)
        			.addComponent(lblLoiMaKhachHang_KhachHang4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(833))
        );
        jPanel_KhachHangLayout.setVerticalGroup(
        	jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        			.addGap(17)
        			.addComponent(jLabel56)
        			.addGap(18)
        			.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        					.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
        										.addComponent(lblMaKhachHang_KhachHang)
        										.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        									.addGap(18)
        									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
        										.addComponent(lblTenKhachHang_KhachHang)
        										.addComponent(txtTenKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        									.addGap(18)
        									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(lblNgaySinh_KhachHang)
        										.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
        											.addComponent(cbbNgay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        											.addComponent(cbbThang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        											.addComponent(cbbNam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        									.addGap(18)
        									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
        										.addComponent(rbtnNam)
        										.addComponent(lblGioiTinh_KhachHang)
        										.addComponent(rbtnNu))
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addComponent(lblDiaChi_KhachHang))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addComponent(lblSDT_KhachHang))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(cbbLoaiKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lblLoaiKhachHang_KhachHang))
        			.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        					.addGap(26)
        					.addComponent(jScrollPane25, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        					.addGap(45)
        					.addComponent(jLabel85)))
        			.addGap(27)
        			.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnReset_)
        				.addComponent(btnThem_, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(0, 13, Short.MAX_VALUE))
        		.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
        			.addContainerGap(398, Short.MAX_VALUE)
        			.addComponent(lblLoiMaKhachHang_KhachHang4, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        			.addGap(22))
        );
        jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel_KhachHang, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 389, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel_KhachHang, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKhachHangFocusLost
        lblTenKhachHang_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtTenKhachHangFocusLost

    private void txtTenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHangActionPerformed

    private void txtTenKhachHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHangKeyPressed

    }//GEN-LAST:event_txtTenKhachHangKeyPressed

    private void txtTenKhachHangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHangKeyTyped

    }//GEN-LAST:event_txtTenKhachHangKeyTyped

    private void txtDiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusLost
        lblDiaChi_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtDiaChiFocusLost

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        lblSDT_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtSDTFocusLost

    private void btnThem_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_ActionPerformed
        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
        MaKhachHang = txtMaKhachHang.getText();
        TenKhachHang = txtTenKhachHang.getText();
        String ngay, thang, nam;
        ngay = cbbNgay.getSelectedItem().toString();
        thang = cbbThang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        if (rbtnNam.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        DiaChi = txtDiaChi.getText();
        SDT = txtSDT.getText();
        LoaiKhachHang =     thienAn.frmTC.GetCbbSelected(cbbLoaiKhachHang);
        ChuThich = txtGhiChu.getText();
        String cautruyvan = "insert into KhachHang values("
        + " N'" + TenKhachHang + "' , '" + NgaySinh + "' ," + GioiTinh
        + ",N'" + DiaChi + "','" + SDT + "'," + LoaiKhachHang + ", N'" + ChuThich + "')";
        boolean kiemtra = KiemTraNhapKhachHang(0);
        if (kiemtra) {
        	thienAn.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("them thanh cong");
            System.out.println(cautruyvan);
            this.dispose();

        } else {
            System.out.println("them that bai");
        }
        thienAn.frmTC.layDuLieuKhachHang();
        thienAn.frmTC.SetCbbKhachHangfrm(txtTenKhachHang.getText());
    }//GEN-LAST:event_btnThem_ActionPerformed
public boolean KiemTraNhapKhachHang(int ts) {
        String MaKhachHang, TenKhachHang, Ngaysinh, DiaChi, SDT;
        boolean kiemtra = false;
        MaKhachHang = txtMaKhachHang.getText();
        TenKhachHang = txtTenKhachHang.getText();
        String ngay, thang, nam, ThongBao = "";
        ngay = cbbNgay.getSelectedItem().toString();
        thang = cbbThang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        Ngaysinh = nam + "-" + thang + "-" + ngay;
        DiaChi = txtDiaChi.getText();
        SDT = txtSDT.getText();
        if (MaKhachHang.equals("") && ts == 1) {
            ThongBao += "Ban Chua nhap ma khach hang /n";
            lblMaKhachHang_KhachHang.setForeground(Color.red);
        }
        if (TenKhachHang.equals("")) {
            ThongBao += "ban chua nhap ten khach hanh /n";
            lblTenKhachHang_KhachHang.setForeground(Color.red);
        }
        if (DiaChi.equals("")) {
            lblDiaChi_KhachHang.setForeground(Color.red);
            ThongBao += "Ban chua nhap dia chi\n";
        }
        if (SDT.equals("")) {
            lblSDT_KhachHang.setForeground(Color.red);
            ThongBao += "Ban chua nhap SDT \n";
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            lblDiaChi_KhachHang.setForeground(Color.black);
            lblSDT_KhachHang.setForeground(Color.black);
            lblMaKhachHang_KhachHang.setForeground(Color.black);
            lblTenKhachHang_KhachHang.setForeground(Color.black);
        } else {
            kiemtra = false;
            thienAn.frmTC.ThongBao(ThongBao, "that bai", 2);
        }
        return kiemtra;
    }
    private void btnReset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_ActionPerformed
    
        txtMaKhachHang.setText("");
        txtTenKhachHang.setText("");
        cbbNgay.setSelectedIndex(1);
        cbbThang.setSelectedIndex(1);
        cbbNam.setSelectedIndex(20);
        txtDiaChi.setText("");
        txtSDT.setText("");
        cbbLoaiKhachHang.setSelectedIndex(1);
        txtGhiChu.setText("");
  
    }//GEN-LAST:event_btnReset_ActionPerformed
int tam=0;
    private void cbbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangItemStateChanged

        String thang = cbbThang.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgay.getSelectedItem().toString();
        }
        tam = 1;

        if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 31) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else if (thang.equals("1") || thang.equals("3") || thang.equals("5")
            || thang.equals("7") || thang.equals("8") || thang.equals("12") || thang.equals("10")) {

            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 32; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 32) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 29; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 29) {
                cbbNgay.setSelectedItem(thanght);
            }
        }
    }//GEN-LAST:event_cbbThangItemStateChanged

    private void cbbThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThangActionPerformed

    }//GEN-LAST:event_cbbThangActionPerformed

    private void jPanel_KhachHangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_KhachHangComponentShown
        rbtnNam.setSelected(true);
        thienAn.frmTC.layDuLieuKhachHang();
        cbbLoaiKhachHang.setModel(  thienAn.frmTC.LayDuLieucbb("LoaiKhachHang", "TenLoaiKhachHang", "MaLoaiKhachHang"));
        for (int i = 1; i < 32; i++) {
            cbbNgay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang.addItem(String.valueOf(i));
        }
        for (int i = 2016; i > 1950; i--) {
            cbbNam.addItem(String.valueOf(i));
        }
     
    }//GEN-LAST:event_jPanel_KhachHangComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          rbtnNam.setSelected(true);
        cbbLoaiKhachHang.setModel(thienAn.frmTC.LayDuLieucbb("LoaiKhachHang", "TenLoaiKhachHang", "MaLoaiKhachHang"));
        for (int i = 1; i < 32; i++) {
            cbbNgay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang.addItem(String.valueOf(i));
        }
        for (int i = year; i > 1950; i--) {
            cbbNam.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset_;
    private javax.swing.JButton btnThem_;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLoaiKhachHang;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbNgay;
    private javax.swing.JComboBox<String> cbbThang;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JLabel lblDiaChi_KhachHang;
    private javax.swing.JLabel lblGioiTinh_KhachHang;
    private javax.swing.JLabel lblLoaiKhachHang_KhachHang;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang4;
    private javax.swing.JLabel lblMaKhachHang_KhachHang;
    private javax.swing.JLabel lblNgaySinh_KhachHang;
    private javax.swing.JLabel lblSDT_KhachHang;
    private javax.swing.JLabel lblTenKhachHang_KhachHang;
    private javax.swing.JRadioButton rbtnNam;
    private javax.swing.JRadioButton rbtnNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextPane txtGhiChu;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
