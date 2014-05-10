/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MemberTabPanel.java
 *
 * Created on May 20, 2011, 4:52:35 PM
 */

package org.our.lm.ui;

/**
 *
 * @author CLIFFORD
 */
public class ReportTabPanel extends javax.swing.JPanel {

    /** Creates new form MemberTabPanel */
    LMMainPanel lmmp;
    public ReportTabPanel(LMMainPanel lMMainPanel) {
        lmmp=lMMainPanel;
        
       
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ReportTab = new javax.swing.JToolBar();
        MainReportTab = new javax.swing.JPanel();
        ReportTabBackGroundPanel = new javax.swing.JPanel();
        bt_MemberReport = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ReportTabBackGroundImagePanel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1282, 120));

        ReportTab.setBorder(null);
        ReportTab.setFloatable(false);
        ReportTab.setBorderPainted(false);
        ReportTab.setOpaque(false);

        MainReportTab.setLayout(new java.awt.GridBagLayout());

        ReportTabBackGroundPanel.setOpaque(false);

        bt_MemberReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MemberReport_Ori.png"))); // NOI18N
        bt_MemberReport.setToolTipText("Member Report ");
        bt_MemberReport.setBorderPainted(false);
        bt_MemberReport.setContentAreaFilled(false);
        bt_MemberReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_MemberReport.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MemberReport_Press.png"))); // NOI18N
        bt_MemberReport.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MemberReport_Rvr.png"))); // NOI18N
        bt_MemberReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MemberReportActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookreport_Ori.png"))); // NOI18N
        jButton2.setToolTipText("Book Report");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookreport_Presssed.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookreport_Rvr.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReportTabBackGroundPanelLayout = new javax.swing.GroupLayout(ReportTabBackGroundPanel);
        ReportTabBackGroundPanel.setLayout(ReportTabBackGroundPanelLayout);
        ReportTabBackGroundPanelLayout.setHorizontalGroup(
            ReportTabBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportTabBackGroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_MemberReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1202, Short.MAX_VALUE))
        );
        ReportTabBackGroundPanelLayout.setVerticalGroup(
            ReportTabBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportTabBackGroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReportTabBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_MemberReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MainReportTab.add(ReportTabBackGroundPanel, gridBagConstraints);

        ReportTabBackGroundImagePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainheader2.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MainReportTab.add(ReportTabBackGroundImagePanel, gridBagConstraints);

        ReportTab.add(MainReportTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReportTab, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ReportTab, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_MemberReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MemberReportActionPerformed
       
       lmmp.showMemberReportPanel();
         
    }//GEN-LAST:event_bt_MemberReportActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lmmp.showBookReportPanel();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainReportTab;
    private javax.swing.JToolBar ReportTab;
    private javax.swing.JLabel ReportTabBackGroundImagePanel;
    private javax.swing.JPanel ReportTabBackGroundPanel;
    private javax.swing.JButton bt_MemberReport;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}
