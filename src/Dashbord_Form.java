package menu;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 *
 * @author User
 */
public final class Dashbord_Form extends javax.swing.JFrame {
    int xx, xy;
    
     //default border for the menu item
     Border default_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(51,51,51));
        
     //Yellow border for the menu item
     Border YELLOW_border = BorderFactory.createMatteBorder(1, 0, 1, 0, Color.YELLOW);
     
     //create an array of jlabels
     JLabel[] menuLabels = new JLabel[3];
     
     //create an array of jPanel
     JPanel[] panels = new JPanel[3];
     
     
    public Dashbord_Form() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        btnclose.setIcon(new FlatSVGIcon("Gambar/Close.svg", 20, 20));
        
        //set bordel
        //panel logo border
        Border panelborder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE);
        jpanel_logodannama.setBorder(panelborder);
        //panel container border
        Border container = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51,51,51));
        jPanel_container.setBorder(container);
 
        //populate the menulabels array
        //you can use a for loop to tho that
        menuLabels[0] = jLabel_menuitem1;
        menuLabels[1] = jLabel_menuitem2;
        menuLabels[2] = jLabel_menuitem3;
        
        //populate the panels array
        panels[0] = jPanel_barang;
        panels[1] = jPanel_transaksi;
        panels[2] = jPanel_laporan;

        addActionToMenuLabels();
    }
    
    //create a funtion to set the label background color
    public void setLabelBackground(JLabel label){
        //reset labels to their default design
        for(JLabel menuitem : menuLabels){
            
        //change the jlabel background color
        menuitem.setBackground(new Color(51,51,51));
        menuitem.setForeground(Color.white);
        }
        
        //change the jlabel background color
        label.setBackground(Color.white);
        label.setForeground(new Color(51,51,51));
    }
            
    //create a funtion to show the selected panel
    public void showPanel(JPanel panel){
        //hide panels
        for(JPanel pnl : panels){
            pnl.setVisible(false);
        }
         //and show only this panels
         panel.setVisible(true);
    }
    
    
    public void addActionToMenuLabels(){
        // get labels in the jpanel menu
            Component[] components = jPanel_menu.getComponents();
        
        for (Component component : components){
            if(component instanceof JLabel)
            {
                JLabel label = (JLabel) component;
                
                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //change the jlabel background and fourground
                        setLabelBackground(label);
                        
                        //display the selected panel
                        switch (label.getText().trim()){
                            case "Barang":
                                 showPanel(jPanel_barang);
                                 break;
                            case "Transaksi":
                                 showPanel(jPanel_transaksi);
                                 jPanel_transaksi.setBackground(Color.red);
                                 break;
                            case "Laporan":
                                 showPanel(jPanel_laporan);
                                 jPanel_laporan.setBackground(Color.green);
                                 break;
                        }
                        
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        //set the borde to yellow
                       label.setBorder(YELLOW_border);
                    }
                    
                    @Override
                    public void mouseExited(MouseEvent e) {
                        //reset to the default border
                        label.setBorder(default_border);
                     }
                });
            }
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

        jPanel_container = new javax.swing.JPanel();
        jPanel_transaksi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menuitem2 = new javax.swing.JLabel();
        jLabel_menuitem3 = new javax.swing.JLabel();
        jLabel_menuitem1 = new javax.swing.JLabel();
        jpanel_logodannama = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_exit = new javax.swing.JPanel();
        btnclose = new javax.swing.JLabel();
        jPanel_barang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_laporan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel_container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("transaksi");

        javax.swing.GroupLayout jPanel_transaksiLayout = new javax.swing.GroupLayout(jPanel_transaksi);
        jPanel_transaksi.setLayout(jPanel_transaksiLayout);
        jPanel_transaksiLayout.setHorizontalGroup(
            jPanel_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_transaksiLayout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        jPanel_transaksiLayout.setVerticalGroup(
            jPanel_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_transaksiLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jPanel_menu.setBackground(new java.awt.Color(51, 51, 51));

        jLabel_menuitem2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_menuitem2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_menuitem2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_menuitem2.setText("   Transaksi");
        jLabel_menuitem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem2.setOpaque(true);

        jLabel_menuitem3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_menuitem3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_menuitem3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_menuitem3.setText("   Laporan");
        jLabel_menuitem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem3.setOpaque(true);

        jLabel_menuitem1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_menuitem1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_menuitem1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_menuitem1.setText("   Barang");
        jLabel_menuitem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem1.setOpaque(true);

        jpanel_logodannama.setBackground(new java.awt.Color(51, 51, 51));
        jpanel_logodannama.setForeground(new java.awt.Color(153, 153, 153));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Logo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Dashbord");

        javax.swing.GroupLayout jpanel_logodannamaLayout = new javax.swing.GroupLayout(jpanel_logodannama);
        jpanel_logodannama.setLayout(jpanel_logodannamaLayout);
        jpanel_logodannamaLayout.setHorizontalGroup(
            jpanel_logodannamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_logodannamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanel_logodannamaLayout.setVerticalGroup(
            jpanel_logodannamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_logodannamaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpanel_logodannamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_logodannama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_menuitem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addComponent(jpanel_logodannama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuitem2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_exit.setBackground(new java.awt.Color(51, 51, 51));

        btnclose.setIcon(new FlatSVGIcon("Gambar/Close.svg"));
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_exitLayout = new javax.swing.GroupLayout(jPanel_exit);
        jPanel_exit.setLayout(jPanel_exitLayout);
        jPanel_exitLayout.setHorizontalGroup(
            jPanel_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_exitLayout.createSequentialGroup()
                .addGap(0, 655, Short.MAX_VALUE)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_exitLayout.setVerticalGroup(
            jPanel_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_exitLayout.createSequentialGroup()
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_barang.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("barang");

        javax.swing.GroupLayout jPanel_barangLayout = new javax.swing.GroupLayout(jPanel_barang);
        jPanel_barang.setLayout(jPanel_barangLayout);
        jPanel_barangLayout.setHorizontalGroup(
            jPanel_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_barangLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel_barangLayout.setVerticalGroup(
            jPanel_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_barangLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        jPanel_laporan.setBackground(new java.awt.Color(0, 255, 153));

        jLabel3.setText("laporan");

        javax.swing.GroupLayout jPanel_laporanLayout = new javax.swing.GroupLayout(jPanel_laporan);
        jPanel_laporan.setLayout(jPanel_laporanLayout);
        jPanel_laporanLayout.setHorizontalGroup(
            jPanel_laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_laporanLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel_laporanLayout.setVerticalGroup(
            jPanel_laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_laporanLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jPanel_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addContainerGap(169, Short.MAX_VALUE)
                    .addComponent(jPanel_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addContainerGap(170, Short.MAX_VALUE)
                    .addComponent(jPanel_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jPanel_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jPanel_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jPanel_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
    dispose();
    }//GEN-LAST:event_btncloseMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(Dashbord_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashbord_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashbord_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashbord_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashbord_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_menuitem1;
    private javax.swing.JLabel jLabel_menuitem2;
    private javax.swing.JLabel jLabel_menuitem3;
    private javax.swing.JPanel jPanel_barang;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JPanel jPanel_exit;
    private javax.swing.JPanel jPanel_laporan;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_transaksi;
    private javax.swing.JPanel jpanel_logodannama;
    // End of variables declaration//GEN-END:variables
}