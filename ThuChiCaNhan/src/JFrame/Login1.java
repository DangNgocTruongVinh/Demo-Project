
package JFrame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import thuchicanhan.GiaoDich;
import thuchicanhan.InGiaoDich;
import thuchicanhan.ThongKe;


/**
 *
 * @author Admin
 */
import java.util.ArrayList;
public class Login1 extends javax.swing.JFrame {

    private int sequenceNumber;
    private Object inGiaoDich;
    private ArrayList<GiaoDich> listGD = new ArrayList<>();

    /**
     * Creates new form Login1
     */
    public Login1() {
        initComponents();
//        initData();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenu1 = new javax.swing.JMenu();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        list1 = new java.awt.List();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton_Them = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_Ngay = new javax.swing.JTextField();
        jTextField2_Ten = new javax.swing.JTextField();
        jTextField4_Sotien = new javax.swing.JTextField();
        jComboBox1_Loai = new javax.swing.JComboBox<>();
        jButton1_Luu = new javax.swing.JButton();
        jButton2_Reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9_TongThu = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1_Xoa = new javax.swing.JButton();
        truoc = new javax.swing.JLabel();
        jButton_TimKiem = new javax.swing.JButton();
        jTextField1_TongThu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_TenTimKiem = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1161, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jLabel8.setText("jLabel8");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jScrollPane4.setViewportView(jTextPane1);

        jButton_Them.setText("Thêm");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Ngày");

        jLabel2.setText("Tên giao dịch");

        jLabel3.setText("Loại giao dịch");

        jLabel4.setText("Số tiền");

        jTextField1_Ngay.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1_Ngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_NgayActionPerformed(evt);
            }
        });

        jTextField2_Ten.setBackground(new java.awt.Color(255, 204, 204));

        jTextField4_Sotien.setBackground(new java.awt.Color(255, 204, 204));
        jTextField4_Sotien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_SotienActionPerformed(evt);
            }
        });

        jComboBox1_Loai.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1_Loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thu", "Chi" }));
        jComboBox1_Loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_LoaiActionPerformed(evt);
            }
        });

        jButton1_Luu.setBackground(new java.awt.Color(255, 102, 102));
        jButton1_Luu.setText("Lưu thông tin");
        jButton1_Luu.setAutoscrolls(true);
        jButton1_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_LuuActionPerformed(evt);
            }
        });

        jButton2_Reset.setBackground(new java.awt.Color(255, 102, 102));
        jButton2_Reset.setText("Reset");
        jButton2_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_ResetActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("QUẢN LÝ CHI TIÊU CÁ NHÂN");

        jLabel7.setText(".vnđ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1_Ngay, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2_Ten, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4_Sotien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jButton1_Luu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jButton2_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(462, 462, 462))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(473, 473, 473))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_Ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1_Luu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_Sotien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_Reset)
                    .addComponent(jLabel7))
                .addGap(49, 49, 49)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane6.setBackground(new java.awt.Color(255, 204, 204));

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số thứ tự", "Ngày", "Tên giao dịch", "Loại giao dịch", "Số tiền (vnđ)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setBackground(new java.awt.Color(0, 153, 204));
        jLabel6.setFont(new java.awt.Font("Noto Sans SC Medium", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THÔNG TIN GIAO DỊCH");

        jPanel10.setBackground(new java.awt.Color(0, 204, 204));

        jLabel9_TongThu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9_TongThu.setText("Tổng thu:");
        jLabel9_TongThu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel9_TongThuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton1_Xoa.setText("Xóa");
        jButton1_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_XoaActionPerformed(evt);
            }
        });

        truoc.setBackground(new java.awt.Color(51, 255, 0));
        truoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        truoc.setForeground(new java.awt.Color(204, 0, 51));
        truoc.setText("0");

        jButton_TimKiem.setText("Tìm kiếm");
        jButton_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TimKiemActionPerformed(evt);
            }
        });

        jTextField1_TongThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_TongThuActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tổng chi: ");

        jTextField_TenTimKiem.setColumns(10);
        jTextField_TenTimKiem.setText("Tên");
        jTextField_TenTimKiem.setToolTipText("Nhập tên giao dịch");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jTextField1_TongThu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField_TenTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9_TongThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1_Xoa)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addComponent(truoc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton_TimKiem)))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9_TongThu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1_TongThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(truoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jButton1_Xoa)
                .addGap(44, 44, 44)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_TimKiem)
                    .addComponent(jTextField_TenTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("tab1", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("tab2", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1_LoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_LoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_LoaiActionPerformed

    private void jTextField4_SotienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_SotienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_SotienActionPerformed

    private void jButton1_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_LuuActionPerformed
        sequenceNumber++;
        String ngay = jTextField1_Ngay.getText();
        String ten = jTextField2_Ten.getText();
        String loai = jComboBox1_Loai.getSelectedItem().toString();
        String soTien = jTextField4_Sotien.getText();

        // Khởi tạo đối tượng InGiaoDich với tableModel của jTable1
//        InGiaoDich inGiaoDich = new InGiaoDich((DefaultTableModel) jTable1.getModel());
        if (inGiaoDich == null) {
        inGiaoDich = new InGiaoDich((DefaultTableModel) jTable1.getModel(), "datafile.txt");
        }
        
        // Gọi phương thức addTransaction() của đối tượng inGiaoDich
//        inGiaoDich.addTransaction(sequenceNumber, ngay, ten, loai, soTien);
        ((InGiaoDich)inGiaoDich).addTransaction(sequenceNumber, ngay, ten, loai, soTien);
        
        // Lưu dữ liệu vào file nhị phân
        String filePath = "datafile.txt";
//        inGiaoDich.exportDataToBinary(filePath);
        ((InGiaoDich)inGiaoDich).exportDataToTextFile("datafile.txt"); // Hoặc exportDataToBinary tùy theo yêu cầu của bạn

        // Khởi tạo đối tượng ThongKe với đối tượng inGiaoDich
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        ThongKe thongKe = new ThongKe(tableModel);

        thongKe.tinhToanVaThongKe();

        int tongThu = thongKe.getTongThu();
        int tongChi = thongKe.getTongChi();

        jTextField1_TongThu.setText(String.valueOf(tongThu));
        truoc.setText(String.valueOf(tongChi));
    }//GEN-LAST:event_jButton1_LuuActionPerformed

    private void jTextField1_NgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_NgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_NgayActionPerformed

    private void jButton2_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_ResetActionPerformed
        // Xóa dữ liệu đã nhập trong các trường nhập liệu
        jTextField1_Ngay.setText(""); 
        jTextField2_Ten.setText(""); 
        jTextField4_Sotien.setText("");

        // Gửi focus vào trường nhập liệu đầu tiên để người dùng có thể bắt đầu nhập dữ liệu mới ngay lập tức
        jTextField1_Ngay.requestFocus(); // Thay jTextField1 bằng tên trường nhập liệu đầu tiên của bạn
        jTextField2_Ten.requestFocus();
        jTextField4_Sotien.requestFocus();
    }//GEN-LAST:event_jButton2_ResetActionPerformed

    private void jButton1_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_XoaActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.removeRow(selectedRow);

            // Cập nhật lại số thứ tự của các hàng còn lại trong mô hình dữ liệu
            for (int i = selectedRow; i < tableModel.getRowCount(); i++) {
                String newSerialNumber = String.valueOf(i + 1); // Giá trị số thứ tự mới
                tableModel.setValueAt(newSerialNumber, i, 0); // Cập nhật giá trị số thứ tự cho cột 0
            }
        }
    }//GEN-LAST:event_jButton1_XoaActionPerformed

    private void jLabel9_TongThuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel9_TongThuAncestorAdded
        DefaultTableModel tableModel = getTableModelFromAnotherSource(); // Lấy bảng thông tin dữ liệu từ nguồn khác
        String fileName = "datafile.txt"; // Thay your_file_name.txt bằng tên thực tế của file dữ liệu
        InGiaoDich inGiaoDich = new InGiaoDich(tableModel, fileName);
        ThongKe thongKe = new ThongKe(inGiaoDich);

        // Tính toán và thống kê dữ liệu từ bảng
        thongKe.tinhToanVaThongKe();

        // Lấy tổng thu từ thongKe
        int tongThu = thongKe.getTongThu();

        // Hiển thị kết quả trong jLabel9
        jLabel9_TongThu.setText("Tổng thu: " + tongThu);

    }//GEN-LAST:event_jLabel9_TongThuAncestorAdded
   
    private void jButton_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TimKiemActionPerformed
     // String ngayTimKiem = jTextField1_TKNgay.getText();
     //timKiemDuLieu(jTable1, ngayTimKiem);
//    String ngayTimKiem = jTextField_NgayTimKiem.getText().trim();
//    if (!ngayTimKiem.isEmpty()) {
//        // Gọi phương thức tìm kiếm ở đây
////        timKiemDuLieu(ngayTimKiem);
//        if (inGiaoDich instanceof InGiaoDich) {
//            // Lưu ý: Thêm các trường người dùng nhập vào cho tên và loại nếu bạn muốn tìm kiếm theo các trường đó
//            String ten = ""; // Giả sử bạn có jTextField_Ten để nhập tên
//            String loai = ""; // Giả sử bạn có jComboBox_Loai để chọn loại
//            ((InGiaoDich)inGiaoDich).timKiemDuLieu(ngayTimKiem);
//        
//    } else {
//        JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày cần tìm kiếm!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//    }
    
    

    }//GEN-LAST:event_jButton_TimKiemActionPerformed

    private void jTextField1_TongThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_TongThuActionPerformed
        
    }//GEN-LAST:event_jTextField1_TongThuActionPerformed

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        
    }//GEN-LAST:event_jButton_ThemActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Luu;
    private javax.swing.JButton jButton1_Xoa;
    private javax.swing.JButton jButton2_Reset;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_TimKiem;
    private javax.swing.JComboBox<String> jComboBox1_Loai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel9_TongThu;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1_Ngay;
    private javax.swing.JTextField jTextField1_TongThu;
    private javax.swing.JTextField jTextField2_Ten;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4_Sotien;
    private javax.swing.JTextField jTextField_TenTimKiem;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.List list1;
    private javax.swing.JLabel truoc;
    // End of variables declaration//GEN-END:variables

    /*private DefaultTableModel getTableModelFromAnotherSource() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void timKiemDuLieu(String ngayTimKiem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
    private DefaultTableModel getTableModelFromAnotherSource() {
        // Đây là một ví dụ về cách bạn có thể tạo và trả về một DefaultTableModel
        // từ một nguồn dữ liệu khác, như một danh sách đối tượng
        // (Trong trường hợp này, danh sách đối tượng là listGD trong class InGiaoDich)

        // Khởi tạo một DefaultTableModel với các cột
        String[] columnNames = {"STT", "Ngày", "Tên giao dịch", "Loại giao dịch", "Số tiền"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Duyệt qua danh sách giao dịch và thêm dữ liệu vào DefaultTableModel
        for (GiaoDich gd : listGD) {
            Object[] rowData = {gd.getSTT(), gd.getNgay(), gd.getTen(), gd.getLoai(), gd.getSoTien()};
            model.addRow(rowData);
        }

        // Trả về DefaultTableModel đã được tạo và điền dữ liệu
        return model;
    }

    private void timKiemDuLieu(String ngayTimKiem) {
        // Đây là một ví dụ về cách bạn có thể triển khai phương thức timKiemDuLieu
        // để tìm kiếm dữ liệu theo một điều kiện cụ thể, như ngày

        // Tạo một DefaultTableModel mới để chứa kết quả tìm kiếm
        DefaultTableModel searchResultModel = new DefaultTableModel();
        searchResultModel.setColumnIdentifiers(new String[]{"STT", "Ngày", "Tên giao dịch", "Loại giao dịch", "Số tiền"});

        // Duyệt qua danh sách giao dịch và tìm các mục phù hợp với ngày tìm kiếm
        for (GiaoDich gd : listGD) {
            if (gd.getNgay().equals(ngayTimKiem)) {
                Object[] rowData = {gd.getSTT(), gd.getNgay(), gd.getTen(), gd.getLoai(), gd.getSoTien()};
                searchResultModel.addRow(rowData);
            }
        }

        // Hiển thị kết quả tìm kiếm
        // Ví dụ: hiển thị trên bảng hoặc thực hiện các hành động khác tương ứng với yêu cầu
        // ở đây tôi giả sử có một phương thức hiển thị kết quả tìm kiếm trên bảng
        displaySearchResultOnTable(searchResultModel);
    }

    // Phương thức hiển thị kết quả tìm kiếm trên bảng
    private void displaySearchResultOnTable(DefaultTableModel model) {
        // Ở đây, bạn thực hiện các hành động để hiển thị kết quả tìm kiếm trên bảng
        // Ví dụ: đặt model này cho jTable hoặc JTextArea để hiển thị kết quả
        jTable1.setModel(model);
    }

}
