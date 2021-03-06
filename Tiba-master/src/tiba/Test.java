/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiba;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vanessa
 */
public class Test extends javax.swing.JFrame {

    public static String pinfotext;
    public static String pidtext;
    public static String lidtext;
    public String url = Tiba.mysqlurl;
    public String pwd = Tiba.mysqlpwd;
    
    ButtonGroup bg = new ButtonGroup();
    
    public Test() {
        initComponents();
        
        getDate();
        getlabID();
        getPatientData();
        testsDone();
        fetchTests();
//        getTotalCost();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        labIDlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pinfojLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        addTjButton = new javax.swing.JButton();
        rmjButton = new javax.swing.JButton();
        submitjButton = new javax.swing.JButton();
        exitjButton = new javax.swing.JButton();
        refreshjButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        idjTextField1 = new javax.swing.JTextField();
        namejTextField2 = new javax.swing.JTextField();
        confirmjRadioButton1 = new javax.swing.JRadioButton();
        missedjRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reasonjTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        outcomejTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        unitCostjTextField3 = new javax.swing.JTextField();
        totalCostTxt = new javax.swing.JTextField();
        confirmjButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("T I B A - H M S ");

        searchTextField.setText("search");
        searchTextField.setCaretColor(new java.awt.Color(0, 102, 102));
        searchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextFieldMouseClicked(evt);
            }
        });
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("ID :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(247, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(219, 219, 219)
                        .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pinfojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pinfojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test ID", "Test Name", "Test Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        addTjButton.setText("ADD TEST");
        addTjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTjButtonActionPerformed(evt);
            }
        });

        rmjButton.setText("REMOVE TEST");
        rmjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmjButtonActionPerformed(evt);
            }
        });

        submitjButton.setText("SUBMIT RESULT");
        submitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButtonActionPerformed(evt);
            }
        });

        exitjButton.setText("EXIT");
        exitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitjButtonActionPerformed(evt);
            }
        });

        refreshjButton1.setText("REFRESH");
        refreshjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rmjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshjButton1)
                .addGap(18, 18, 18)
                .addComponent(addTjButton)
                .addGap(18, 18, 18)
                .addComponent(rmjButton)
                .addGap(18, 18, 18)
                .addComponent(submitjButton)
                .addGap(18, 18, 18)
                .addComponent(exitjButton)
                .addGap(21, 21, 21))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 102)));

        idjTextField1.setEditable(false);
        idjTextField1.setToolTipText("test id");

        namejTextField2.setEditable(false);
        namejTextField2.setToolTipText("test name");

        confirmjRadioButton1.setText("confirm");
        confirmjRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmjRadioButton1MouseClicked(evt);
            }
        });
        confirmjRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmjRadioButton1ActionPerformed(evt);
            }
        });

        missedjRadioButton2.setText("missed");

        reasonjTextArea1.setColumns(20);
        reasonjTextArea1.setRows(5);
        reasonjTextArea1.setText("reason");
        reasonjTextArea1.setToolTipText("reason text was not taken");
        jScrollPane2.setViewportView(reasonjTextArea1);

        outcomejTextArea2.setColumns(20);
        outcomejTextArea2.setRows(5);
        outcomejTextArea2.setText("outcome");
        outcomejTextArea2.setToolTipText("test results");
        jScrollPane3.setViewportView(outcomejTextArea2);

        jLabel3.setText("Unit Cost : ");

        jLabel4.setText("Total Cost : ");

        unitCostjTextField3.setEditable(false);

        totalCostTxt.setEditable(false);

        confirmjButton.setText("CONFIRM");
        confirmjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmjButtonActionPerformed(evt);
            }
        });

        jTextField1.setText("patient id");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idjTextField1)
                    .addComponent(namejTextField2)
                    .addComponent(jScrollPane2)
                    .addComponent(jTextField1))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(totalCostTxt))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(confirmjRadioButton1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(missedjRadioButton2)
                                .addComponent(unitCostjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(idjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(unitCostjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(missedjRadioButton2)
                                    .addComponent(confirmjRadioButton1)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmjButton)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalCostTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextFieldMouseClicked
        // TODO add your handling code here
        searchTextField.setText("");
    }//GEN-LAST:event_searchTextFieldMouseClicked

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
//        TableModel model = new DefaultTableModel();
//        TableRowSorter<TableModel> rowSorter = new TableRowSorter<TableModel>(model);
//        jTable1.setRowSorter(rowSorter);
//        String search = searchTextField.getText();
//        if (search.length() == 0) {
//            rowSorter.setRowFilter(null);
//        } else {
//            rowSorter.setRowFilter(RowFilter.regexFilter(search));
//        }
//        
        
        ResultSet rs = null;
        try {
            Connection conn =  DriverManager.getConnection(url, "root", pwd);
            String query = "SELECT testid, testname, testcost FROM tests WHERE testid=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, searchTextField.getText());
             rs = pst.executeQuery();
            
            while (rs.next()) {                
                idjTextField1.setText(rs.getString("testid"));
                namejTextField2.setText(rs.getString("testname"));
                unitCostjTextField3.setText(rs.getString("testcost"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void addTjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTjButtonActionPerformed
        // TODO add your handling code here:
        
        int r = ThreadLocalRandom.current().nextInt(10000);
        
        String id = JOptionPane.showInputDialog("TEST ID : ", String.valueOf(r));
        String name = JOptionPane.showInputDialog("TEST NAME : ");
        String cost = JOptionPane.showInputDialog("COST : ");
        
        try {
            Connection conn = DriverManager.getConnection(url, "root", pwd);
                    String query = "INSERT INTO tests (testid, testname, testcost)" 
                          + "VALUES(?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, id);
                    ps.setString(2, name);
                    ps.setString(3, cost);
                
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "NEW TEST ADDED.");
                
        }catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_addTjButtonActionPerformed

    private void rmjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmjButtonActionPerformed
        // TODO add your handling code here:
       
        
        int option = JOptionPane.showConfirmDialog(null, "Delete testID ?", "DELETE", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try {
                Connection conn = DriverManager.getConnection(url, "root", pwd);
                String query = "DELETE FROM tests WHERE testid =?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, " TEST DELETED.");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_rmjButtonActionPerformed

    private void submitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "generate costs bill");
//                testBill();
        try {
            Connection con = DriverManager.getConnection(url, "root", pwd);
            String query = "UPDATE billing SET testid=?, testcost=? WHERE patientid='"+jTextField1.getText()+"'"
                    + "VALUES(?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, idjTextField1.getText());
            ps.setString(2, unitCostjTextField3.getText());

            ps.executeUpdate();

    //                printReceipt();
            JOptionPane.showMessageDialog(null, "printing receipt...");

        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_submitjButtonActionPerformed

    private void exitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitjButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Lab().setVisible(true);
    }//GEN-LAST:event_exitjButtonActionPerformed

    private void refreshjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButton1ActionPerformed
        // TODO add your handling code here:
        fetchTests();
        
        idjTextField1.setText("");
        namejTextField2.setText("");
        jTextField1.setText("patient id");
        outcomejTextArea2.setText("");
        unitCostjTextField3.setText("");
        confirmjRadioButton1.setSelected(false);
        missedjRadioButton2.setSelected(false);
    }//GEN-LAST:event_refreshjButton1ActionPerformed

    private void confirmjRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmjRadioButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_confirmjRadioButton1ActionPerformed

    private void confirmjRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmjRadioButton1MouseClicked
        // TODO add your handling code here:
         if (confirmjRadioButton1.isSelected()) {
             if(jTextField1.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Ensure Patient ID textfield is filled!");
             } else {
                 try{
                Connection con = DriverManager.getConnection(url, "root", pwd);
                String query = "INSERT INTO patientresult (patientid, testid, testname, testoutcome, testdate)" 
                                + "VALUES(?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, idjTextField1.getText());
                ps.setString(3, namejTextField2.getText());
                ps.setString(4, outcomejTextArea2.getText());
                ps.setString(5, dateLbl.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "SAVED");

                } catch(SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
             }
            
        } else if (missedjRadioButton2.isSelected()) {
            reasonjTextArea1.setEnabled(true);
        }
    }//GEN-LAST:event_confirmjRadioButton1MouseClicked

    private void confirmjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmjButtonActionPerformed
        // TODO add your handling code here:
        
        int totcost;
        if(totalCostTxt.getText().isEmpty()) {
            totcost = 0 + Integer.valueOf((unitCostjTextField3.getText()));
        } else {
            totcost = Integer.valueOf(totalCostTxt.getText()) + Integer.valueOf((unitCostjTextField3.getText()));
        }
        
        totalCostTxt.setText(String.valueOf(totcost));
    }//GEN-LAST:event_confirmjButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        lidtext = args[0];
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTjButton;
    private javax.swing.JButton confirmjButton;
    private javax.swing.JRadioButton confirmjRadioButton1;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JButton exitjButton;
    private javax.swing.JTextField idjTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labIDlabel;
    private javax.swing.JRadioButton missedjRadioButton2;
    private javax.swing.JTextField namejTextField2;
    private javax.swing.JTextArea outcomejTextArea2;
    private javax.swing.JLabel pinfojLabel;
    private javax.swing.JTextArea reasonjTextArea1;
    private javax.swing.JButton refreshjButton1;
    private javax.swing.JButton rmjButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton submitjButton;
    private javax.swing.JTextField totalCostTxt;
    private javax.swing.JTextField unitCostjTextField3;
    // End of variables declaration//GEN-END:variables

    private void getDate() {
        java.time.LocalDate localDate = LocalDate.now();
        dateLbl.setText(localDate.toString());
    }

    private void getlabID() {
        pinfojLabel.setText(lidtext);
    }
    
    private void getPatientData() {
        
    }

    private void fetchTests() {
     
        try {
            ResultSet rs = null;
            Connection conn = DriverManager.getConnection(url, "root", pwd);
            String query = "SELECT * FROM tests";
            PreparedStatement pst = conn.prepareStatement(query);
            rs =  pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void testBill() {
        
            try {
                Connection con = DriverManager.getConnection(url, "root", pwd);
                String query = "UPDATE billing SET testid=?, testcost=? WHERE patientid='"+jTextField1.getText()+"'";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, idjTextField1.getText());
                ps.setString(2, unitCostjTextField3.getText());

                ps.executeQuery();
                
//                printReceipt();
                JOptionPane.showMessageDialog(null, "printing receipt...");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        
//        }
    }

//    private void getTotalCost() {
//        String input = unitCostjTextField3.getText();
////        int[] values = new int[input.length()];
//        int sum = 0;
//        int i = 0;
//        while(i < input.length()) {
//            int number;
//            if(input.substring(i, i+1).equals("-")) {
//                number = Integer.parseInt(input.substring(i, i+2));
//                i += 2;
//            } else {
//                number = Integer.parseInt(input.substring(i, i+1));
//                i++;
//            }
//            sum += number;
//        }
//    }

    private void testsDone() {
        reasonjTextArea1.setEnabled(false);
        bg.add(confirmjRadioButton1);
        bg.add(missedjRadioButton2);
        
    }

    private void clearText() {
        idjTextField1.setText("");
        namejTextField2.setText("");
        outcomejTextArea2.setText("");
        unitCostjTextField3.setText("");
        confirmjRadioButton1.setSelected(false);
        missedjRadioButton2.setSelected(false);
    }

}
