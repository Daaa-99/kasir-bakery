package menu;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;


public class Bakery extends javax.swing.JFrame {

    private int Total = 0;
    private int x = 0;


    public Bakery() {
        initComponents();
        init();
        
        
        
    }

    public void init() {
        setTime();
    }

    public void setImage() {

    }

    public boolean jumlahIsZero(int jumlah) {
        if (jumlah == 0) {
            JOptionPane.showMessageDialog(null, "Masukkan Jumlah Item");
            return false;
        }
        return true;
    }

    public void reset() {
        Total = 0;
        x = 0;
        tombolTotal.setEnabled(true);
        spinner1.setValue(0);

        spinner5.setValue(0);
        spinner6.setValue(0);
        spinner7.setValue(0);
        spinner8.setValue(0);
        spinner9.setValue(0);
        spinner10.setValue(0);
        spinner11.setValue(0);
        spinner12.setValue(0);
        spinner13.setValue(0);
        spinner14.setValue(0);
        spinner15.setValue(0);
        xsubtotal.setText("0.0");
        xtotal.setText("0.0");
        nota.setText(" ");
        jCheckBox1.setSelected(false);

        jCheckBox4.setSelected(false);
 
        jCheckBox9.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
    }

    public void hasil() {
        xsubtotal.setText(String.valueOf(Total));
        xtotal.setText(String.valueOf(Total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        _date = new javax.swing.JLabel();
        _waktu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        xsubtotal = new javax.swing.JTextField();
        xtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nota = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelGambar = new javax.swing.JLabel();
        xgambar1 = new javax.swing.JLabel();
        spinner1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jLabelGambar16 = new javax.swing.JLabel();
        xgambar17 = new javax.swing.JLabel();
        spinner17 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jPanel21 = new javax.swing.JPanel();
        jLabelGambar15 = new javax.swing.JLabel();
        xgambar16 = new javax.swing.JLabel();
        spinner16 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabelGambar4 = new javax.swing.JLabel();
        xgambar5 = new javax.swing.JLabel();
        spinner5 = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        xgambar9 = new javax.swing.JLabel();
        spinner9 = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabelGambar5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabelGambar6 = new javax.swing.JLabel();
        xgambar11 = new javax.swing.JLabel();
        spinner11 = new javax.swing.JSpinner();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabelGambar7 = new javax.swing.JLabel();
        xgambar6 = new javax.swing.JLabel();
        spinner6 = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabelGambar8 = new javax.swing.JLabel();
        xgambar7 = new javax.swing.JLabel();
        spinner7 = new javax.swing.JSpinner();
        jLabel57 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jLabelGambar9 = new javax.swing.JLabel();
        xgambar8 = new javax.swing.JLabel();
        spinner8 = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        xgambar10 = new javax.swing.JLabel();
        spinner10 = new javax.swing.JSpinner();
        jLabel69 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabelGambar10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabelGambar11 = new javax.swing.JLabel();
        xgambar12 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        spinner12 = new javax.swing.JSpinner();
        jCheckBox12 = new javax.swing.JCheckBox();
        jPanel17 = new javax.swing.JPanel();
        jLabelGambar12 = new javax.swing.JLabel();
        xgambar13 = new javax.swing.JLabel();
        spinner13 = new javax.swing.JSpinner();
        jLabel81 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        jLabelGambar13 = new javax.swing.JLabel();
        xgambar14 = new javax.swing.JLabel();
        spinner14 = new javax.swing.JSpinner();
        jLabel87 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel19 = new javax.swing.JPanel();
        jLabelGambar14 = new javax.swing.JLabel();
        xgambar15 = new javax.swing.JLabel();
        spinner15 = new javax.swing.JSpinner();
        jLabel93 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jPanel20 = new javax.swing.JPanel();
        tombolTotal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabelGambar17 = new javax.swing.JLabel();
        xgambar18 = new javax.swing.JLabel();
        spinner18 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        _date.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        _date.setForeground(new java.awt.Color(0, 0, 0));
        _date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        _date.setText("date");
        _date.setDoubleBuffered(true);
        _date.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _date.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        _waktu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        _waktu.setForeground(new java.awt.Color(0, 0, 0));
        _waktu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        _waktu.setText("pee");
        _waktu.setDoubleBuffered(true);
        _waktu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _waktu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(_date, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_date))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));

        xsubtotal.setEditable(false);
        xsubtotal.setBackground(new java.awt.Color(250, 250, 250));
        xsubtotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        xsubtotal.setForeground(new java.awt.Color(0, 0, 0));
        xsubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        xsubtotal.setText("0.0");

        xtotal.setEditable(false);
        xtotal.setBackground(new java.awt.Color(250, 250, 250));
        xtotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        xtotal.setForeground(new java.awt.Color(0, 0, 0));
        xtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        xtotal.setText("0.0");
        xtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sub Total");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total");

        nota.setBackground(new java.awt.Color(250, 250, 250));
        nota.setColumns(20);
        nota.setRows(5);
        nota.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(nota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 330, 650));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220), 2));
        jPanel4.setPreferredSize(new java.awt.Dimension(813, 689));

        jPanel5.setBackground(new java.awt.Color(235, 235, 235));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        jLabelGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/americano (1).png"))); // NOI18N

        xgambar1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        xgambar1.setForeground(new java.awt.Color(0, 0, 0));
        xgambar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar1.setText("americanno");

        spinner1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Rp. 17.000");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xgambar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))))
        );

        jPanel22.setBackground(new java.awt.Color(235, 235, 235));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel22.setPreferredSize(new java.awt.Dimension(150, 155));

        jLabelGambar16.setText("jLabel3");

        xgambar17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar17.setForeground(new java.awt.Color(0, 0, 0));
        xgambar17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar17.setText("Roti");

        spinner17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Rp. 10.000");

        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGambar16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xgambar17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox17)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabelGambar16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(11, 11, 11)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17)
                    .addComponent(spinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(235, 235, 235));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel21.setForeground(new java.awt.Color(0, 0, 0));
        jPanel21.setPreferredSize(new java.awt.Dimension(150, 155));

        jLabelGambar15.setText("jLabel3");

        xgambar16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar16.setForeground(new java.awt.Color(0, 0, 0));
        xgambar16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar16.setText("Roti");

        spinner16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Rp. 10.000");

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGambar15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(xgambar16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabelGambar15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(235, 235, 235));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 155));

        jLabelGambar4.setText("jLabel3");

        xgambar5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar5.setForeground(new java.awt.Color(0, 0, 0));
        xgambar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar5.setText("Roti");

        spinner5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Rp. 10.000");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGambar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xgambar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(spinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabelGambar4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addGap(12, 12, 12)
                .addComponent(spinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(235, 235, 235));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 155));

        xgambar9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar9.setForeground(new java.awt.Color(0, 0, 0));
        xgambar9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar9.setText("Roti");

        spinner9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Rp. 10.000");

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jLabelGambar5.setText("jLabel3");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xgambar9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelGambar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(spinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jCheckBox9)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabelGambar5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(235, 235, 235));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel11.setForeground(new java.awt.Color(0, 0, 0));

        jLabelGambar6.setText("jLabel3");

        xgambar11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar11.setForeground(new java.awt.Color(0, 0, 0));
        xgambar11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar11.setText("Roti");

        spinner11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Rp. 10.000");

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGambar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xgambar11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(spinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox11)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabelGambar6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(235, 235, 235));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.setPreferredSize(new java.awt.Dimension(150, 155));

        jLabelGambar7.setText("jLabel3");

        xgambar6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar6.setForeground(new java.awt.Color(0, 0, 0));
        xgambar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar6.setText("Roti");

        spinner6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Rp. 10.000");

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xgambar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(spinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox6)
                .addGap(0, 41, Short.MAX_VALUE))
            .addComponent(jLabelGambar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabelGambar7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(235, 235, 235));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.setPreferredSize(new java.awt.Dimension(150, 155));

        jLabelGambar8.setText("jLabel3");

        xgambar7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar7.setForeground(new java.awt.Color(0, 0, 0));
        xgambar7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar7.setText("Roti");

        spinner7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Rp. 10.000");

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGambar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xgambar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(spinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox7)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabelGambar8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(235, 235, 235));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.setPreferredSize(new java.awt.Dimension(150, 155));

        jLabelGambar9.setText("jLabel3");

        xgambar8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar8.setForeground(new java.awt.Color(0, 0, 0));
        xgambar8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar8.setText("Roti");

        spinner8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Rp. 10.000");

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGambar9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xgambar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(spinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabelGambar9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(235, 235, 235));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.setPreferredSize(new java.awt.Dimension(150, 155));

        xgambar10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar10.setForeground(new java.awt.Color(0, 0, 0));
        xgambar10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar10.setText("Roti");

        spinner10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Rp. 10.000");

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jLabelGambar10.setText("jLabel3");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xgambar10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelGambar10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(spinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox10)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabelGambar10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(235, 235, 235));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel16.setForeground(new java.awt.Color(0, 0, 0));

        jLabelGambar11.setText("jLabel3");

        xgambar12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar12.setForeground(new java.awt.Color(0, 0, 0));
        xgambar12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar12.setText("Roti");

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Rp. 10.000");

        spinner12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGambar11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xgambar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox12)
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabelGambar11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(235, 235, 235));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel17.setForeground(new java.awt.Color(0, 0, 0));

        jLabelGambar12.setText("jLabel3");

        xgambar13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar13.setForeground(new java.awt.Color(0, 0, 0));
        xgambar13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar13.setText("Roti");

        spinner13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Rp. 10.000");

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabelGambar12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xgambar13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(spinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox13))
                            .addComponent(jLabel81))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabelGambar12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox13))
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(235, 235, 235));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel18.setForeground(new java.awt.Color(0, 0, 0));

        jLabelGambar13.setText("jLabel3");

        xgambar14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar14.setForeground(new java.awt.Color(0, 0, 0));
        xgambar14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar14.setText("Roti");

        spinner14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 0, 0));
        jLabel87.setText("Rp. 10.000");

        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabelGambar13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel87))
                    .addComponent(xgambar14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(spinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabelGambar13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(235, 235, 235));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel19.setForeground(new java.awt.Color(0, 0, 0));

        jLabelGambar14.setText("jLabel3");

        xgambar15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xgambar15.setForeground(new java.awt.Color(0, 0, 0));
        xgambar15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar15.setText("Roti");

        spinner15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 0));
        jLabel93.setText("Rp. 10.000");

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGambar14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xgambar15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel93)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(spinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox15)))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabelGambar14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(250, 250, 250));

        tombolTotal.setBackground(new java.awt.Color(204, 153, 255));
        tombolTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tombolTotal.setForeground(new java.awt.Color(0, 0, 0));
        tombolTotal.setText("Bayar");
        tombolTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        tombolTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTotalActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(235, 235, 235));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 0));
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnReset1.setBackground(new java.awt.Color(235, 235, 235));
        btnReset1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnReset1.setForeground(new java.awt.Color(0, 0, 0));
        btnReset1.setText("Total");
        btnReset1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("NON-COFFE");
        jLabel2.setDoubleBuffered(true);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("COFFE");
        jLabel3.setDoubleBuffered(true);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("ROTI");
        jLabel5.setDoubleBuffered(true);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel23.setBackground(new java.awt.Color(235, 235, 235));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel23.setForeground(new java.awt.Color(0, 0, 0));

        jLabelGambar17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGambar17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/americano (1).png"))); // NOI18N

        xgambar18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        xgambar18.setForeground(new java.awt.Color(0, 0, 0));
        xgambar18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xgambar18.setText("americanno");

        spinner18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Rp. 17.000");

        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xgambar18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGambar17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabelGambar17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xgambar18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jCheckBox18))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(128, 128, 128))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Bakerycafe() {
        int idtransaksi = 17894 + (int) (Math.random()*8080000);
        nota.setText("=================Bakerycafe=================\n"
                + "Time: " + _waktu.getText() + "Date: " + _date.getText() + "\n"
                + "idtransaksi: " +idtransaksi+"\n" 
                + "==========================================\n"
                + "Nama Item:\t\t" + "Harga(Rp)\n");
    }
    int xx, xy;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tombolTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTotalActionPerformed
        if (Total == 0) {
            JOptionPane.showMessageDialog(null, "Anda Belum Memilih Item Apapun");
        } else {
            nota.setText(nota.getText()
                + "\n===========================================\n"
                + "Sub Total \t\tRp." + Total + "\n"
                + "Total: \t\tRp." + (Total) + "\n\n"
                + "================Terima Kasih================\n"
            );
            tombolTotal.setEnabled(false);
        }
    }//GEN-LAST:event_tombolTotalActionPerformed

    private void xtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtotalActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        int jumlah = Integer.parseInt(spinner15.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox15.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar15.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        int jumlah = Integer.parseInt(spinner14.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox14.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar14.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox14.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        int jumlah = Integer.parseInt(spinner13.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox13.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar13.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        int jumlah = Integer.parseInt(spinner12.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox12.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar12.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        int jumlah = Integer.parseInt(spinner11.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox11.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar11.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        int jumlah = Integer.parseInt(spinner6.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox6.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar6.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        int jumlah = Integer.parseInt(spinner7.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox7.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar7.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        int jumlah = Integer.parseInt(spinner8.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox8.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar8.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        int jumlah = Integer.parseInt(spinner9.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox9.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar9.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        int jumlah = Integer.parseInt(spinner10.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox10.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar10.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed

         
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int jumlah = Integer.parseInt(spinner1.getValue().toString());
        if (jumlahIsZero(jumlah) && jCheckBox1.isSelected()) {
            x++;
            if (x == 1) {
                Bakerycafe();
            }
            int Harga = jumlah * 3000;
            Total += Harga;
            nota.setText(nota.getText() + x + "." + xgambar1.getText() + "\t\tRp." + Harga + "\n");
            hasil();
        } else {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
 

    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Bakery.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String waktu = tf.format(date);
                    _waktu.setText(waktu.split(" ")[0] + " " + waktu.split(" ")[1]);
                    _date.setText(df.format(date));

                }
            }
        }).start();
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
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bakery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _date;
    private javax.swing.JLabel _waktu;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabelGambar;
    private javax.swing.JLabel jLabelGambar10;
    private javax.swing.JLabel jLabelGambar11;
    private javax.swing.JLabel jLabelGambar12;
    private javax.swing.JLabel jLabelGambar13;
    private javax.swing.JLabel jLabelGambar14;
    private javax.swing.JLabel jLabelGambar15;
    private javax.swing.JLabel jLabelGambar16;
    private javax.swing.JLabel jLabelGambar17;
    private javax.swing.JLabel jLabelGambar4;
    private javax.swing.JLabel jLabelGambar5;
    private javax.swing.JLabel jLabelGambar6;
    private javax.swing.JLabel jLabelGambar7;
    private javax.swing.JLabel jLabelGambar8;
    private javax.swing.JLabel jLabelGambar9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea nota;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JSpinner spinner10;
    private javax.swing.JSpinner spinner11;
    private javax.swing.JSpinner spinner12;
    private javax.swing.JSpinner spinner13;
    private javax.swing.JSpinner spinner14;
    private javax.swing.JSpinner spinner15;
    private javax.swing.JSpinner spinner16;
    private javax.swing.JSpinner spinner17;
    private javax.swing.JSpinner spinner18;
    private javax.swing.JSpinner spinner5;
    private javax.swing.JSpinner spinner6;
    private javax.swing.JSpinner spinner7;
    private javax.swing.JSpinner spinner8;
    private javax.swing.JSpinner spinner9;
    private javax.swing.JButton tombolTotal;
    private javax.swing.JLabel xgambar1;
    private javax.swing.JLabel xgambar10;
    private javax.swing.JLabel xgambar11;
    private javax.swing.JLabel xgambar12;
    private javax.swing.JLabel xgambar13;
    private javax.swing.JLabel xgambar14;
    private javax.swing.JLabel xgambar15;
    private javax.swing.JLabel xgambar16;
    private javax.swing.JLabel xgambar17;
    private javax.swing.JLabel xgambar18;
    private javax.swing.JLabel xgambar5;
    private javax.swing.JLabel xgambar6;
    private javax.swing.JLabel xgambar7;
    private javax.swing.JLabel xgambar8;
    private javax.swing.JLabel xgambar9;
    private javax.swing.JTextField xsubtotal;
    private javax.swing.JTextField xtotal;
    // End of variables declaration//GEN-END:variables
}
