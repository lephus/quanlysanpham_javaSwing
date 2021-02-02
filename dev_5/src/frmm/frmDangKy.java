package frmm;

import thienAn.thienAn;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
public class frmDangKy extends javax.swing.JFrame {
    public frmDangKy() {
        initComponents();

    }
    private void initComponents() {
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlRegisterInfo = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblRetypePassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnDangKy = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRetypePasswword = new javax.swing.JPasswordField();
        txtMaNhanVien = new javax.swing.JTextField();
        pnlCopyright = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        lblRegisterTitle.setFont(new java.awt.Font("Arial", 1, 12)); 
        lblRegisterTitle.setForeground(new java.awt.Color(255, 51, 0));
        lblRegisterTitle.setText("Tao Tai Khoan");

        lblUserName.setText("Ten Dang Nhap");

        lblPassword.setText("Mat Khau");

        lblRetypePassword.setText("Ma Nhan Vien");

        btnDangKy.setForeground(new java.awt.Color(255, 153, 51));
        btnDangKy.setText("Tao Tai Khoan Moi");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnDangKyActionPerformed(evt);
            }
        });

        btnDangNhap.setForeground(new java.awt.Color(255, 153, 51));
        btnDangNhap.setText("Dang Nhap Ngay");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        jLabel5.setText("Nhap Lai Mat Khau");

        javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
        pnlRegisterInfoLayout.setHorizontalGroup(
        	pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlRegisterInfoLayout.createSequentialGroup()
        			.addGap(48)
        			.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlRegisterInfoLayout.createSequentialGroup()
        					.addComponent(btnDangKy)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnDangNhap))
        				.addGroup(pnlRegisterInfoLayout.createSequentialGroup()
        					.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblUserName)
        						.addComponent(lblPassword)
        						.addComponent(lblRetypePassword)
        						.addComponent(jLabel5))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblRegisterTitle)
        						.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(txtMaNhanVien, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        							.addComponent(txtRetypePasswword, Alignment.TRAILING)
        							.addComponent(txtPassword, Alignment.TRAILING)
        							.addComponent(txtUserName, Alignment.TRAILING)))))
        			.addContainerGap(44, Short.MAX_VALUE))
        );
        pnlRegisterInfoLayout.setVerticalGroup(
        	pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlRegisterInfoLayout.createSequentialGroup()
        			.addGap(6)
        			.addComponent(lblRegisterTitle, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblRetypePassword)
        				.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblUserName))
        			.addGap(18)
        			.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPassword)
        				.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(txtRetypePasswword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnDangKy)
        				.addComponent(btnDangNhap))
        			.addGap(107))
        );
        pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);

        pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        jLabel1.setText(" Lien He Admin De Duoc Cap Quyen Cao Hon");

        javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
        pnlCopyright.setLayout(pnlCopyrightLayout);
        pnlCopyrightLayout.setHorizontalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        pnlCopyrightLayout.setVerticalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static int quyen = 0;
    public static String ten = "";
    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄ�angKyActionPerformed
        String MaNhanVien, TenDangNhap, Password, NhapLai, Quyen = "";

        MaNhanVien = txtMaNhanVien.getText().trim();
        TenDangNhap = txtUserName.getText();
        Password = String.valueOf(txtPassword.getPassword()).trim();
        NhapLai = String.valueOf(txtRetypePasswword.getPassword());
        String cautruyvan = "select *from Quyen ";
        ResultSet rs = thienAn.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                if (rs.getString("TenQuyen").equals("New")) {
                    Quyen = rs.getString("MaQuyen");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
       
        boolean kt = true;

        if (MaNhanVien.equals("")) {
            ThongBao("That Bai", "That bai", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TenDangNhap.length() < 6 || TenDangNhap.length() > 10) {
                ThongBao("Ten dang nhap phai >6 va < 10", "That Bai", JOptionPane.ERROR_MESSAGE);
            } else if (Password.length() < 6 || Password.length() > 50) {
                ThongBao("Mat Khau phai >6 va < 10", "That Bai", 2);
            } else if (!KiemTraChuaChuVaSo(Password)) {
                ThongBao("Mat khau khong duoc viet IN", "Thong Bao", 2);
            } else if (!Password.equals(NhapLai)) {
                ThongBao("Nhap lai mat khau", "thong bao", 2);
            } else {

                String cautruyvan2 = "select * from Users where MaNhanVien= '" + MaNhanVien + "'";
                ResultSet rs2 = thienAn.connection.ExcuteQueryGetTable(cautruyvan2);
                try {
                    rs2.next();
                    if (rs.getString("MaNhanVien").equals(MaNhanVien)) {
                        kt = false;
                        ThongBao("Ma Nhan Vien: " + MaNhanVien + " da ton tai!", "Thong Bao", 2);
                    }

                } catch (SQLException ex) {
                    System.out.println("fail");
                    kt = true;
                }
                if (kt == true) {
                 String ctv = "insert into Users values(" + MaNhanVien
                + " ,'" + TenDangNhap + "' , '" + Password + "' ," + Quyen
                + ", N' ')";
        System.out.println(cautruyvan);
        thienAn.connection.ExcuteQueryUpdateDB(ctv);
            System.out.println("Dang Nhap Thanh Cong");
        } else {
            ThongBao("Khong tim thay tai khoan ", " ", 2);
                }
            }
        }


    }//GEN-LAST:event_btnÄ�angKyActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed

        String strUsername = txtUserName.getText().trim();
        String strPassword = String.valueOf(txtPassword.getPassword()).trim();
        if(strUsername.equals("")){
            ThongBao("Hay nhap Thong Tin","", 2);
        }else
            if(strPassword.equals("")){
            ThongBao("Hay nhap mat khau", "thong bao", 2);
        }else
           if (KiemTra(strUsername, strPassword)) {
        	   thienAn.frmTC.show();
            this.dispose();
        } else {
            ThongBao("Ban Nhap sai thong tin tai khoan", " ", 2);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmDangNhap frmDN = new frmDangNhap();
        frmDN.show();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private boolean KiemTra(String tdn, String mk) {
        boolean kq = false;

        String cautruyvan = "select * from Users where TenDangNhap= '" + tdn + "' and Password= '" + mk + "'";
        System.out.println(cautruyvan);
        ResultSet rs = thienAn.connection.ExcuteQueryGetTable(cautruyvan);

        try {
            if (rs.next()) {
                kq = true;
                quyen = rs.getInt("Quyen");
                ten = rs.getString("TenDangNhap");
                System.out.println(" " + quyen);
            }
        } catch (SQLException ex) {
            System.out.println("296 - dang ky");
        }

        return kq;
    }

    private boolean KiemTraChuaChuVaSo(String chuoi) {
        boolean ketqua = false;
        Pattern p = Pattern.compile("[a-zA-Z][0-9]");
        Matcher m = p.matcher(chuoi);
        if (!(chuoi == chuoi.toLowerCase())) {
            ketqua = m.find();
        }
        return ketqua;
    }

    public boolean KiemTraEmail(String email) {
        boolean kq = false;
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern v = Pattern.compile(EMAIL_PATTERN);
        Matcher m = v.matcher(email);
        kq = m.matches();
        return kq;
    }

    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDangKy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JLabel lblRetypePassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlCopyright;
    private javax.swing.JPanel pnlRegisterInfo;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRetypePasswword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
