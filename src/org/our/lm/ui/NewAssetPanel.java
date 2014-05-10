/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewAssetPanel.java
 *
 * Created on May 21, 2011, 1:16:05 PM
 */

package org.our.lm.ui;

import org.our.lm.db.QueryManager;
import org.our.lm.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author CLIFFORD
 */
public class NewAssetPanel extends javax.swing.JPanel {

    /** Creates new form NewAssetPanel */
    LMMainPanel lmmp;
    QueryManager querymanager;
    public NewAssetPanel(LMMainPanel lMMainPanel,QueryManager queryManager) {
        lmmp=lMMainPanel;
        querymanager=queryManager;

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

        NewAsssetGroup = new javax.swing.ButtonGroup();
        AssetNew = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        rbt_AssetAcquired = new javax.swing.JRadioButton();
        rbt_AssetRemoved = new javax.swing.JRadioButton();
        jLabel117 = new javax.swing.JLabel();
        txt_AssetRemarks = new javax.swing.JTextField();
        combo_AssetDD = new javax.swing.JComboBox();
        combo_AssetMM = new javax.swing.JComboBox();
        combo_AssetYY = new javax.swing.JComboBox();
        txt_AssetName = new javax.swing.JTextField();
        txt_AssetNoOfItems = new javax.swing.JTextField();
        combo_AssetCategory = new javax.swing.JComboBox();
        jLabel125 = new javax.swing.JLabel();
        txt_AssetAmount = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        lbl_AssetId = new javax.swing.JLabel();
        txt_AssetDescription = new javax.swing.JTextField();
        lbl_ErrorInAssetNew = new javax.swing.JLabel();
        bt_saveAssetnew = new javax.swing.JButton();
        bt_CancelInAssetNew = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        AssetNew.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel16.setOpaque(false);

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel112.setText("Date");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel113.setText("Asset Category");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel114.setText("Name *");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel115.setText("Description");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel116.setText("No Of Items");

        NewAsssetGroup.add(rbt_AssetAcquired);
        rbt_AssetAcquired.setFont(new java.awt.Font("Tahoma", 0, 12));
        rbt_AssetAcquired.setText("Acquired");
        rbt_AssetAcquired.setOpaque(false);

        NewAsssetGroup.add(rbt_AssetRemoved);
        rbt_AssetRemoved.setFont(new java.awt.Font("Tahoma", 0, 12));
        rbt_AssetRemoved.setText("Removed");
        rbt_AssetRemoved.setOpaque(false);

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel117.setText("Remarks");

        combo_AssetDD.setFont(new java.awt.Font("Tahoma", 0, 12));
        combo_AssetDD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        combo_AssetDD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        combo_AssetMM.setFont(new java.awt.Font("Tahoma", 0, 12));
        combo_AssetMM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        combo_AssetYY.setFont(new java.awt.Font("Tahoma", 0, 12));
        combo_AssetYY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012" }));

        combo_AssetCategory.setFont(new java.awt.Font("Tahoma", 0, 12));
        combo_AssetCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel125.setText("Amount *");

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel126.setText("Asset Id");

        bt_saveAssetnew.setFont(new java.awt.Font("Tahoma", 0, 12));
        bt_saveAssetnew.setText("Save");
        bt_saveAssetnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveAssetnewActionPerformed(evt);
            }
        });

        bt_CancelInAssetNew.setFont(new java.awt.Font("Tahoma", 0, 12));
        bt_CancelInAssetNew.setText("Cancel");
        bt_CancelInAssetNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_CancelInAssetNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelInAssetNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ErrorInAssetNew, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel112)
                                                    .addComponent(jLabel126))
                                                .addGap(37, 37, 37))
                                            .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(jLabel115)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(combo_AssetDD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(combo_AssetMM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(combo_AssetYY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_AssetId, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                                        .addComponent(rbt_AssetAcquired)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rbt_AssetRemoved))
                                                    .addComponent(txt_AssetName, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                                    .addComponent(txt_AssetDescription)))))
                                    .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel117)
                                            .addComponent(jLabel116)
                                            .addComponent(jLabel125))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_AssetRemarks, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(txt_AssetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_AssetNoOfItems, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel113)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_AssetCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(bt_saveAssetnew, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_CancelInAssetNew)
                        .addGap(29, 29, 29))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(combo_AssetDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_AssetMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_AssetYY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_AssetId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel126))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel113)
                        .addComponent(combo_AssetCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(txt_AssetName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125)
                    .addComponent(txt_AssetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbt_AssetAcquired)
                    .addComponent(rbt_AssetRemoved)
                    .addComponent(txt_AssetNoOfItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel117)
                        .addComponent(txt_AssetDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel115))
                    .addComponent(txt_AssetRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ErrorInAssetNew, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_saveAssetnew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_CancelInAssetNew, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout AssetNewLayout = new javax.swing.GroupLayout(AssetNew);
        AssetNew.setLayout(AssetNewLayout);
        AssetNewLayout.setHorizontalGroup(
            AssetNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssetNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AssetNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AssetNewLayout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(235, 235, 235))
                    .addGroup(AssetNewLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        AssetNewLayout.setVerticalGroup(
            AssetNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssetNewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AssetNew, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AssetNew, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CancelInAssetNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelInAssetNewActionPerformed
        lmmp.showHomePanel();
        this.setBlankOnAssetWindow();
        lbl_ErrorInAssetNew.setText("");
}//GEN-LAST:event_bt_CancelInAssetNewActionPerformed
private void setBlankOnAssetWindow()                             {
        txt_AssetName.setText("");txt_AssetDescription.setText("");txt_AssetAmount.setText("");txt_AssetNoOfItems.setText("");
        txt_AssetRemarks.setText("");rbt_AssetAcquired.setSelected(true);
    }
    private void bt_saveAssetnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveAssetnewActionPerformed

        if(this.testMandatoryInAssetNew())
            ColourMessage("Some of the mandatory fields were not filled. Please review your input", 0, lbl_ErrorInAssetNew);
        else {

            Asset asset=this.getValuesFromAssetAddWindow();
            querymanager.ImportAsset(asset);
            asset=null;
            int assetId=1+querymanager.getLastInsertedAssetNo();
            lbl_AssetId.setText(""+assetId);
            ColourMessage("Asset added  successfully ",1 , lbl_ErrorInAssetNew);

        }
    }//GEN-LAST:event_bt_saveAssetnewActionPerformed
 private Asset        getValuesFromAssetAddWindow()                        {
                            Asset asset=new Asset();
                            asset.setDate(combo_AssetYY.getSelectedItem()+"-"+combo_AssetMM.getSelectedItem()+"-"+combo_AssetDD.getSelectedItem());
                            asset.setAssetId(lbl_AssetId.getText());asset.setCategory((String)combo_AssetCategory.getSelectedItem());
                            asset.setName(txt_AssetName.getText());asset.setDescription(txt_AssetDescription.getText());asset.setNoItems(txt_AssetNoOfItems.getText());
                            asset.setAmount(txt_AssetAmount.getText());
                            if(rbt_AssetAcquired.isSelected())
                                asset.setIsRemoved("1");
                            else
                                asset.setIsRemoved("0");
                            asset.setRemarks(txt_AssetRemarks.getText());
                            return asset;
       }
 private boolean testMandatoryInAssetNew()                          {
                  boolean mandatory=false;
                  if(txt_AssetName.getText().equals(""))
                               mandatory=true;
                  try
                  {
                              int amount=Integer.parseInt(txt_AssetAmount.getText());
                              int noItems=Integer.parseInt(txt_AssetNoOfItems.getText());
                  }
                  catch(Exception e)
                  {
                              mandatory=true;
                  }
                  return mandatory;
       }
 private String getCurrentDate()                                      {
           Date date=new Date();
           String Output=null;
           SimpleDateFormat formater=new SimpleDateFormat("yyyy.MM.dd");
           Output=formater.format(date);
           return Output;

       }
       private void ColourMessage(String msg,int msgType,JLabel lbl)        {
                switch(msgType)
                {
                            case 0:
                                        lbl.setForeground(Color.red);
                                        lbl.setText(msg);
                                        break;
                            case 1:
                                        lbl.setForeground(Color.BLUE);
                                        lbl.setText(msg);

                }
    }
       private void clearTable(JTable tablename,int rowcount,int columcount){
        for(int i=0;i<rowcount;i++)
        for(int j=0;j<columcount;j++)
            tablename.setValueAt("",i, j);

    }
       public void setAssetnumber()
    {
        int assetId=1+querymanager.getLastInsertedAssetNo();
        lbl_AssetId.setText(""+assetId);
       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AssetNew;
    private javax.swing.ButtonGroup NewAsssetGroup;
    private javax.swing.JButton bt_CancelInAssetNew;
    private javax.swing.JButton bt_saveAssetnew;
    private javax.swing.JComboBox combo_AssetCategory;
    private javax.swing.JComboBox combo_AssetDD;
    private javax.swing.JComboBox combo_AssetMM;
    private javax.swing.JComboBox combo_AssetYY;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JLabel lbl_AssetId;
    private javax.swing.JLabel lbl_ErrorInAssetNew;
    private javax.swing.JRadioButton rbt_AssetAcquired;
    private javax.swing.JRadioButton rbt_AssetRemoved;
    private javax.swing.JTextField txt_AssetAmount;
    private javax.swing.JTextField txt_AssetDescription;
    private javax.swing.JTextField txt_AssetName;
    private javax.swing.JTextField txt_AssetNoOfItems;
    private javax.swing.JTextField txt_AssetRemarks;
    // End of variables declaration//GEN-END:variables

}
