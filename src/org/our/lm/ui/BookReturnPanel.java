/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BookReturnPanel.java
 *
 * Created on May 21, 2011, 11:31:16 AM
 */

package org.our.lm.ui;
import org.our.lm.*;
import org.our.lm.report.*;
import org.our.lm.db.QueryManager;
import java.sql.ResultSet;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;
/**
 *
 * @author CLIFFORD
 */
public class BookReturnPanel extends javax.swing.JPanel {

    /** Creates new form BookReturnPanel */
    QueryManager querymanager;
    LMMainPanel lmmp;
    public BookReturnPanel(LMMainPanel lMMainPanel,QueryManager queryManager) {
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

        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        txt_BookIdReturn = new javax.swing.JTextField();
        lbl_BookNameReturn = new javax.swing.JLabel();
        lbl_MemberIdReturn = new javax.swing.JLabel();
        lbl_MemberNameReturn = new javax.swing.JLabel();
        lbl_DateDueReturn = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        lbl_AmountFineReturn = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        txt_OtherFeeReturn = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txt_RemarksReturn = new javax.swing.JTextField();
        bt_ReturnBook = new javax.swing.JButton();
        bt_CancelInBookReturn = new javax.swing.JButton();
        lbl_errorBookReturn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Book Return", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel23.setOpaque(false);

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel91.setText("Book Id");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel92.setText("Member Id");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel94.setText("Member Name");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel95.setText("Due Date");

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel96.setText("Fine Amount");

        txt_BookIdReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BookIdReturnActionPerformed(evt);
            }
        });
        txt_BookIdReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_BookIdReturnFocusLost(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel101.setText("Book Name");

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel130.setText("Any Other Fee");

        txt_OtherFeeReturn.setText("0");

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel131.setText("Remarks");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel130)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(jLabel92)
                            .addComponent(jLabel101)
                            .addComponent(jLabel91)
                            .addComponent(jLabel96)
                            .addComponent(jLabel131))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_BookIdReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_BookNameReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MemberIdReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MemberNameReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DateDueReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_OtherFeeReturn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_AmountFineReturn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_RemarksReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_BookIdReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel92)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_BookNameReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_MemberIdReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_MemberNameReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_DateDueReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(lbl_AmountFineReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(txt_OtherFeeReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(txt_RemarksReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_ReturnBook.setText("Return");
        bt_ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReturnBookActionPerformed(evt);
            }
        });

        bt_CancelInBookReturn.setText("Cancel");
        bt_CancelInBookReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelInBookReturnActionPerformed(evt);
            }
        });

        lbl_errorBookReturn.setFont(new java.awt.Font("Tahoma", 0, 12));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(lbl_errorBookReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_ReturnBook)
                        .addGap(30, 30, 30)
                        .addComponent(bt_CancelInBookReturn)
                        .addGap(35, 35, 35))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_CancelInBookReturn)
                    .addComponent(bt_ReturnBook)
                    .addComponent(lbl_errorBookReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BookIdReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BookIdReturnActionPerformed
        String bookId= txt_BookIdReturn.getText();
        ResultSet rs=querymanager.getBookReturnInformationFromDb(bookId);
        this.setValuesOnBookReturnWindow(rs);
}//GEN-LAST:event_txt_BookIdReturnActionPerformed

    private void txt_BookIdReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BookIdReturnFocusLost
        String bookId= txt_BookIdReturn.getText();
        ResultSet rs=querymanager.getBookReturnInformationFromDb(bookId);
        this.setValuesOnBookReturnWindow(rs);
}//GEN-LAST:event_txt_BookIdReturnFocusLost

    private void bt_ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReturnBookActionPerformed
        if(this.testMandatoryInReturnBook())
            ColourMessage("Some of the mandatory fields were not filled. Please review your input", 0, lbl_errorBookReturn);
        else {
            Circulation circulation=new Circulation();
            circulation.setBookId(txt_BookIdReturn.getText());
            circulation.setReturnDate(this.getCurrentDate());
            circulation.setRemarks(txt_RemarksReturn.getText());
            querymanager.UpdateCirculationtable(circulation);
            Income income=this.getIncomeValuesFromBookReturnWindow();
            querymanager.ImportIncome(income);
            this.setBlankOnBookReturnWindow();
            ColourMessage("Book successfully returned",1, lbl_errorBookReturn);
            circulation=null;

        }
    }//GEN-LAST:event_bt_ReturnBookActionPerformed
private Income       getIncomeValuesFromBookReturnWindow(){
           Income income=new Income();
           int receiptno=1+querymanager.getLastInsertedReceptNo();
           income.setReceiptNo(""+receiptno);
           income.setReceivedFrom(lbl_MemberNameReturn.getText());
           int Amount1=Integer.parseInt(lbl_AmountFineReturn.getText());
           int Amount2=Integer.parseInt(txt_OtherFeeReturn.getText());
           income.setAmount(""+(Amount1+Amount2));
           income.setDescription(txt_RemarksReturn.getText());
           income.setDate(this.getCurrentDate());
           income.setCategoryId("4");
           System.out.println("Income"+income.getReceivedFrom());
           return income;
       }
  private void setBlankOnBookReturnWindow()                        {
           txt_BookIdReturn.setText("");lbl_MemberNameReturn.setText("");lbl_DateDueReturn.setText("");lbl_AmountFineReturn.setText("");
           lbl_MemberIdReturn.setText("");lbl_BookNameReturn.setText("");
       }
    private void bt_CancelInBookReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelInBookReturnActionPerformed
        lmmp.showHomePanel();
        this.setBlankOnBookReturnWindow();
        lbl_errorBookReturn.setText("");
}//GEN-LAST:event_bt_CancelInBookReturnActionPerformed
  private void setValuesOnBookReturnWindow(ResultSet rs)           {

                    boolean isReturned =false;
                    try
                    {
                       if(!rs.next())
                       {
                                   ColourMessage("Please Enter a valid 'Book Id'",0,lbl_errorBookReturn );
                                   this.setBlankOnBookReturnWindow();
                       }
                       else
                       {
                                   Date DueDate=null;
                                   Date currDate=new Date();
                                   do
                                   {
                                               lbl_BookNameReturn.setText(rs.getString("bookname"));
                                               lbl_MemberIdReturn.setText(rs.getString("userid"));
                                               lbl_DateDueReturn.setText(rs.getString("returndate"));
                                               lbl_MemberNameReturn.setText(rs.getString("memberfname")+" "+rs.getString("memberlname"));
                                               DueDate=rs.getDate("returndate");
                                               isReturned =rs.getBoolean("isreturned");
                                               System.out.println("Whether book returned "+isReturned);


                                   }while(rs.next());
                                   System.out.println("Due Date During MainUi:"+DueDate);
                                   DateSubstraction ds=new DateSubstraction();
                                   long numberOfDays=ds.getDateDifferance(DueDate,currDate );
                                   long Fine=(numberOfDays-15)*2;
                                   ColourMessage("",0,lbl_errorBookReturn );
                                   System.out.println("Fine:"+Fine);
                                   if(Fine>0)
                                               ColourMessage(""+Fine, 0,lbl_AmountFineReturn);
                                   else
                                               ColourMessage("0", 1,lbl_AmountFineReturn);
                                   bt_ReturnBook.setEnabled(!isReturned);
                        }
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                    }
    }
 private boolean testMandatoryInReturnBook(){
                    boolean mandatory=false;
                    if(txt_BookIdReturn.getText().equals(""))
                            mandatory =true;
                     if(txt_OtherFeeReturn.equals(""))
                            mandatory=true;
                    try
                    {
                            int otherFee=Integer.parseInt(txt_OtherFeeReturn.getText());
                            int bookId=Integer.parseInt(txt_BookIdReturn.getText());
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CancelInBookReturn;
    private javax.swing.JButton bt_ReturnBook;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JLabel lbl_AmountFineReturn;
    private javax.swing.JLabel lbl_BookNameReturn;
    private javax.swing.JLabel lbl_DateDueReturn;
    private javax.swing.JLabel lbl_MemberIdReturn;
    private javax.swing.JLabel lbl_MemberNameReturn;
    private javax.swing.JLabel lbl_errorBookReturn;
    private javax.swing.JTextField txt_BookIdReturn;
    private javax.swing.JTextField txt_OtherFeeReturn;
    private javax.swing.JTextField txt_RemarksReturn;
    // End of variables declaration//GEN-END:variables

}
