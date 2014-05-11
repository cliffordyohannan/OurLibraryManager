/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConfigureManager.java
 *
 * Created on Sep 2, 2011, 11:30:29 AM
 */

package org.our.lm.ui.master;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.our.lm.db.QueryManager;
import org.our.lm.ui.LMMainPanel;

/**
 *This class is used to configure all the uninitialized tables
 * ie.in this we have four tables named 1.mastertable :for all details about book,income,Expensive,asset category are stored in master table with type as primary 
 * key then we give type1=income,type2=book etc.
 * 2.asset table we must initilize this asset table with asset id because different organizations have there asset id starting as different 
 * in this window we have to configure the asset id,recept number for income ,receipt number for expence etc.
 * first of all we insert data in to database then autoincrement in the case of assettable,income,expensive table.
 * In the case of mastertable first we inssert values then only update the values
 * 
 * @author CLIFFORD
 */
public class ConfigureManager extends javax.swing.JPanel {

    /** Creates new form ConfigureManager */
    QueryManager qm ;
    LMMainPanel lMMainPanel;
    public ConfigureManager(LMMainPanel lmmp,QueryManager queryManager) {
        qm=queryManager;
        lMMainPanel=lmmp;
        initComponents();
        pbar_configure.setValue(0);
        llbl_configmsg.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_receiptNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_VoucherNo = new javax.swing.JTextField();
        bt_configure = new javax.swing.JButton();
        bt_Cancel = new javax.swing.JButton();
        pbar_configure = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        txt_AssetNo = new javax.swing.JTextField();
        llbl_configmsg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Configure Manager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Receipt No :");

        txt_receiptNo.setText("0");
        txt_receiptNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_receiptNoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Voucher No :");

        txt_VoucherNo.setText("0");

        bt_configure.setText("Configure");
        bt_configure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_configureActionPerformed(evt);
            }
        });

        bt_Cancel.setText("Apply");
        bt_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelActionPerformed(evt);
            }
        });

        pbar_configure.setBackground(new java.awt.Color(255, 255, 255));
        pbar_configure.setForeground(new java.awt.Color(51, 255, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Asset No :");

        txt_AssetNo.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(bt_configure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Cancel)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_VoucherNo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(txt_receiptNo)
                                    .addComponent(txt_AssetNo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pbar_configure, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(llbl_configmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_receiptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_VoucherNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_AssetNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pbar_configure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(llbl_configmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_Cancel)
                            .addComponent(bt_configure))
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_receiptNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_receiptNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_receiptNoActionPerformed

    private void bt_configureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_configureActionPerformed
        int rNo=Integer.parseInt(txt_receiptNo.getText());
        int vNo=Integer.parseInt(txt_VoucherNo.getText());
        int aNo=Integer.parseInt(txt_AssetNo.getText());
        if(txt_AssetNo.getText().equals("")||txt_VoucherNo.getText().equals("")||txt_receiptNo.getText().equals(""))
        llbl_configmsg.setText("Please fill all text Fields");
        {
            //creating database
           llbl_configmsg.setText("Please Wait . . .");
           pbar_configure.setValue(0);
           //database already created during application init
                //qm.createDatabase();
                System.out.println("Create data base");
           pbar_configure.setValue(5);
                qm.createAssetTable();
                System.out.println("Asset table Created");
           pbar_configure.setValue(10);     
                qm.createBookTable();
                System.out.println("Book table Created");
           pbar_configure.setValue(15);   
                qm.createCirculationTable();
                System.out.println("circulation table Created");
           pbar_configure.setValue(20);  
                qm.createExpenceTable();
                System.out.println("Expence table Created");
           pbar_configure.setValue(25); 
                qm.createIncomeTable();
                System.out.println("Income table Created");
           pbar_configure.setValue(30);   
                qm.createMasterTable();
                System.out.println("Master table Created");
           pbar_configure.setValue(35); 
                qm.createMemberTable();
                System.out.println("Member table Created");
           pbar_configure.setValue(40);
                qm.initializeIncomeReceipt(rNo); //income OK
           pbar_configure.setValue(45);
                qm.initializeAssetReceipt(aNo);//Asset OK
           pbar_configure.setValue(50);   
                qm.initializeExpenceReceipt(vNo);//Expence OK
           pbar_configure.setValue(55);   
                qm.configureIncomeCategories();//income categories configured
           pbar_configure.setValue(60);
                qm.configureBookCategories();//book categories configured
           pbar_configure.setValue(65);
                qm.configureAssetCategories();//asset category configured
           pbar_configure.setValue(70);
                qm.configureExpenceCategories();//Expence configured
           pbar_configure.setValue(100);
           llbl_configmsg.setText("Completed succesfully,Please Restart 'Library Manager'");
           
               
                
            
        }
    }//GEN-LAST:event_bt_configureActionPerformed

    private void bt_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelActionPerformed
       lMMainPanel.showHomePanel();
        llbl_configmsg.setText("");
        pbar_configure.setValue(0);
        try {
            this.restartApplication(null);
        } catch (IOException ex) {
            Logger.getLogger(ConfigureManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_CancelActionPerformed
//This method for configuring income category with database
    public void configureIncomeCategory(){
        

}
/** 
 * Sun property pointing the main class and its arguments. 
 * Might not be defined on non Hotspot VM implementations.
 */
public static final String SUN_JAVA_COMMAND = "sun.java.command";

/**
 * Restart the current Java application
 * @param runBeforeRestart some custom code to be run before restarting
 * @throws IOException
 */
public static void restartApplication(Runnable runBeforeRestart) throws IOException {
	try {
		// java binary
		String java = System.getProperty("java.home") + "/bin/java";
		// vm arguments
		List<String> vmArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
		StringBuffer vmArgsOneLine = new StringBuffer();
		for (String arg : vmArguments) {
			// if it's the agent argument : we ignore it otherwise the
			// address of the old application and the new one will be in conflict
			if (!arg.contains("-agentlib")) {
				vmArgsOneLine.append(arg);
				vmArgsOneLine.append(" ");
			}
		}
		// init the command to execute, add the vm args
		final StringBuffer cmd = new StringBuffer("\"" + java + "\" " + vmArgsOneLine);

		// program main and program arguments
		String[] mainCommand = System.getProperty(SUN_JAVA_COMMAND).split(" ");
		// program main is a jar
		if (mainCommand[0].endsWith(".jar")) {
			// if it's a jar, add -jar mainJar
			cmd.append("-jar ").append(new File(mainCommand[0]).getPath());
		} else {
			// else it's a .class, add the classpath and mainClass
			cmd.append("-cp \"").append(System.getProperty("java.class.path")).append("\" ").append(mainCommand[0]);
		}
		// finally add program arguments
		for (int i = 1; i < mainCommand.length; i++) {
			cmd.append(" ");
			cmd.append(mainCommand[i]);
		}
		// execute the command in a shutdown hook, to be sure that all the
		// resources have been disposed before restarting the application
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					Runtime.getRuntime().exec(cmd.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		// execute some custom code before restarting
		if (runBeforeRestart!= null) {
			runBeforeRestart.run();
		}
		// exit
		System.exit(0);
	} catch (Exception e) {
		// something went wrong
		throw new IOException("Error while trying to restart the application", e);
	}
}
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cancel;
    private javax.swing.JButton bt_configure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel llbl_configmsg;
    public static javax.swing.JProgressBar pbar_configure;
    private javax.swing.JTextField txt_AssetNo;
    private javax.swing.JTextField txt_VoucherNo;
    private javax.swing.JTextField txt_receiptNo;
    // End of variables declaration//GEN-END:variables

}
