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
public class BookTabPanel extends javax.swing.JPanel {

    /** Creates new form MemberTabPanel */
    LMMainPanel lmmp;
    public BookTabPanel(LMMainPanel lMMainPanel) {
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

        BookTab = new javax.swing.JToolBar();
        MainBookTab = new javax.swing.JPanel();
        BookTabBackGroundPanel = new javax.swing.JPanel();
        bt_AddBook = new javax.swing.JButton();
        bt_EditBook = new javax.swing.JButton();
        bt_DeleteBook = new javax.swing.JButton();
        bt_SubscribeBook = new javax.swing.JButton();
        bt_ReturnBook = new javax.swing.JButton();
        BookTabBackGroundImagePanel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1282, 120));

        BookTab.setBorder(null);
        BookTab.setFloatable(false);
        BookTab.setBorderPainted(false);
        BookTab.setOpaque(false);

        MainBookTab.setLayout(new java.awt.GridBagLayout());

        BookTabBackGroundPanel.setOpaque(false);

        bt_AddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddBook_Original.png"))); // NOI18N
        bt_AddBook.setToolTipText("Adding Books");
        bt_AddBook.setBorderPainted(false);
        bt_AddBook.setContentAreaFilled(false);
        bt_AddBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_AddBook.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddBook_Pressed.png"))); // NOI18N
        bt_AddBook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddBook_Rvr.png"))); // NOI18N
        bt_AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AddBookActionPerformed(evt);
            }
        });

        bt_EditBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditBook_Ori.png"))); // NOI18N
        bt_EditBook.setToolTipText("Editing Existing Books");
        bt_EditBook.setBorderPainted(false);
        bt_EditBook.setContentAreaFilled(false);
        bt_EditBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_EditBook.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditBook_Pressed.png"))); // NOI18N
        bt_EditBook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditBook_Rvr.png"))); // NOI18N
        bt_EditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EditBookActionPerformed(evt);
            }
        });

        bt_DeleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteBook_Ori.png"))); // NOI18N
        bt_DeleteBook.setToolTipText("Delete Books");
        bt_DeleteBook.setBorderPainted(false);
        bt_DeleteBook.setContentAreaFilled(false);
        bt_DeleteBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_DeleteBook.setEnabled(false);
        bt_DeleteBook.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteBook_Pressed.png"))); // NOI18N
        bt_DeleteBook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Deletebook_Rvr.png"))); // NOI18N

        bt_SubscribeBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CirculationBook_Ori.png"))); // NOI18N
        bt_SubscribeBook.setToolTipText("Book Subscription(Giving Books To User)");
        bt_SubscribeBook.setBorderPainted(false);
        bt_SubscribeBook.setContentAreaFilled(false);
        bt_SubscribeBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_SubscribeBook.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CirculationBook_Pressed.png"))); // NOI18N
        bt_SubscribeBook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CirculationBook_Rvr.png"))); // NOI18N
        bt_SubscribeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SubscribeBookActionPerformed(evt);
            }
        });

        bt_ReturnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReturnBook_Ori.png"))); // NOI18N
        bt_ReturnBook.setToolTipText("Return Books");
        bt_ReturnBook.setBorderPainted(false);
        bt_ReturnBook.setContentAreaFilled(false);
        bt_ReturnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_ReturnBook.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReturnBook_Pressed.png"))); // NOI18N
        bt_ReturnBook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReturnBook_Rvr.png"))); // NOI18N
        bt_ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReturnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BookTabBackGroundPanelLayout = new javax.swing.GroupLayout(BookTabBackGroundPanel);
        BookTabBackGroundPanel.setLayout(BookTabBackGroundPanelLayout);
        BookTabBackGroundPanelLayout.setHorizontalGroup(
            BookTabBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookTabBackGroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_EditBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_DeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_SubscribeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1098, Short.MAX_VALUE))
        );
        BookTabBackGroundPanelLayout.setVerticalGroup(
            BookTabBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookTabBackGroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BookTabBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_SubscribeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_DeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_EditBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MainBookTab.add(BookTabBackGroundPanel, gridBagConstraints);

        BookTabBackGroundImagePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainheader2.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MainBookTab.add(BookTabBackGroundImagePanel, gridBagConstraints);

        BookTab.add(MainBookTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookTab, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BookTab, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AddBookActionPerformed
       lmmp.showAddBookPanel();
    }//GEN-LAST:event_bt_AddBookActionPerformed

    private void bt_EditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EditBookActionPerformed
        lmmp.showEditBookPanel();
    }//GEN-LAST:event_bt_EditBookActionPerformed

    private void bt_SubscribeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SubscribeBookActionPerformed
       lmmp.showBookSubscriptionPanel();
    }//GEN-LAST:event_bt_SubscribeBookActionPerformed

    private void bt_ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReturnBookActionPerformed
        lmmp.showBookReturnPanel();
    }//GEN-LAST:event_bt_ReturnBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BookTab;
    private javax.swing.JLabel BookTabBackGroundImagePanel;
    private javax.swing.JPanel BookTabBackGroundPanel;
    private javax.swing.JPanel MainBookTab;
    private javax.swing.JButton bt_AddBook;
    private javax.swing.JButton bt_DeleteBook;
    private javax.swing.JButton bt_EditBook;
    private javax.swing.JButton bt_ReturnBook;
    private javax.swing.JButton bt_SubscribeBook;
    // End of variables declaration//GEN-END:variables

}