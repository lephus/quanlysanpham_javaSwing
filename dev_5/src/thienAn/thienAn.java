
package thienAn;
import javax.swing.JFrame;

import frmm.frmTrangChu;
public class thienAn {
  public static frmTrangChu frmTC=new frmTrangChu();
     public static database.clsConnectDB connection = new  database.clsConnectDB ();
    public static void main(String[] args) {
       frmm.frmDangNhap frmDN= new   frmm.frmDangNhap();
       frmDN.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       frmDN.setUndecorated(true);
       frmDN.setVisible(true);
       frmDN.show();
    }
   
    
}
