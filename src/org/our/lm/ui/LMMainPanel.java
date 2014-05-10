/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LMMainPanel.java
 *
 * Created on May 20, 2011, 3:28:45 PM
 */

package org.our.lm.ui;
import codecLib.mpa.Constants;
import org.our.lm.db.*;
import org.our.lm.db.OurConstants;
import java.awt.CardLayout;
import org.our.lm.log.LogFile;
import org.our.lm.ui.master.*;

/**
 *
 * @author CLIFFORD
 */
public class LMMainPanel extends javax.swing.JPanel {

    QueryManager querymanager;
    CardLayout mainLayOut;
    //Toolbar Panels
    FileTabPanel fileTabPanel;
    MemberTabPanel memberTabPanel;
    FinanceTabPanel financeTabPanel;
    BookTabPanel bookTabPanel;
    SearchTabPanel searchTabPanel;
    ReportTabPanel reporttabPanel;
    MasterTabPanel masterTabPanel;
    MemberReportPanel memberReportPanel;
    BookSearchPanel bookSearchPanel;

    //Window Panels
    HomePanel homePanel;
    AddMemberPanel addMemberPanel;
    MemberSearchPanel memberSearchPanel;
    EditMemberPanel editMemberPanel;
    AddBookPanel addBookPanel;
    EditBookPanel editBookPanel;
    BookSubscriptionPanel bookSubscriptionPanel;
    BookReturnPanel bookReturnPanel;
    NewIncomePanel newIncomePanel;
    EditIncomePanel editIncomePanel;
    NewExpencePanel newExpencePanel;
    EditExpencePanel editExpencePanel;
    NewAssetPanel newAssetPanel;
    EditAssetPanel editAssetPanel;
    CatogoryEditPanel catogoryPanel;
    ConfigureManager configureManager;
    BookReportPanel bookReportPanel;
   
    /** Creates new form LMMainPanel */
    public LMMainPanel() {
        LogFile lf = new LogFile();
        lf.createLog();
        initComponents();
    //Initializing querymanager
        querymanager=new QueryManager(lf);
        //database name 
        
    //Creating Database
        
    //Initialising AND adding Tabbed Panes
        fileTabPanel= new FileTabPanel(this);
        panelMenuBar.add("File", fileTabPanel);
        memberTabPanel=new MemberTabPanel(this);
        panelMenuBar.add("Member",memberTabPanel);
        bookTabPanel=new BookTabPanel(this);
        panelMenuBar.add("Book",bookTabPanel);
        financeTabPanel=new FinanceTabPanel(this);//Object creation Finance Tab
        panelMenuBar.add("Finance", financeTabPanel);
        searchTabPanel =new SearchTabPanel(this);//
        panelMenuBar.add("Search",searchTabPanel);
        reporttabPanel=new ReportTabPanel(this);
        panelMenuBar.add("Report",reporttabPanel);
        masterTabPanel=new MasterTabPanel(this);
        panelMenuBar.add("Master",masterTabPanel);
         //Initializing  Window Panels
        homePanel=new HomePanel();
        addMemberPanel =new AddMemberPanel(this,querymanager);
        editMemberPanel=new EditMemberPanel(this,querymanager);
        addBookPanel=new AddBookPanel(this,querymanager);
        editBookPanel=new EditBookPanel(this,querymanager);
        bookSubscriptionPanel=new BookSubscriptionPanel(this,querymanager);
        bookReturnPanel=new BookReturnPanel(this,querymanager);
        newIncomePanel=new NewIncomePanel(this, querymanager);
        editIncomePanel=new EditIncomePanel(this, querymanager);
        newExpencePanel=new NewExpencePanel(this, querymanager);
        editExpencePanel=new EditExpencePanel(this, querymanager);
        newAssetPanel=new NewAssetPanel(this, querymanager);
        editAssetPanel=new EditAssetPanel(this, querymanager);
        memberReportPanel=new MemberReportPanel(this, querymanager);
        catogoryPanel=new CatogoryEditPanel(this,querymanager);
        bookSearchPanel=new BookSearchPanel(this,querymanager);
        configureManager=new ConfigureManager(this,querymanager);
        memberSearchPanel=new MemberSearchPanel(this, querymanager);
        bookReportPanel = new BookReportPanel(this,querymanager);
        
        
        mainLayOut=(CardLayout)panelMainWindow.getLayout();
       //Adding Window panels
        panelMainWindow.add("HOME_PANEL",homePanel);
        panelMainWindow.add("ADD_MEMBER_PANEL",addMemberPanel);
        panelMainWindow.add("EDIT_MEMBER_PANEL",editMemberPanel );
        panelMainWindow.add("ADD_BOOK_PANEL", addBookPanel);
        panelMainWindow.add("EDIT_BOOK_PANEL",editBookPanel);
        panelMainWindow.add("BOOK_SUBSCRIPTION_PANEL", bookSubscriptionPanel);
        panelMainWindow.add("RETURN_BOOK_PANEL", bookReturnPanel);
        panelMainWindow.add("NEW_INCOME_PANEL", newIncomePanel);
        panelMainWindow.add("EDIT_INCOME_PANEL", editIncomePanel);
        panelMainWindow.add("NEW_EXPENCE_PANEL", newExpencePanel);
        panelMainWindow.add("EDIT_EXPENCE_PANEL",editExpencePanel);
        panelMainWindow.add("NEW_ASSET_PANEL",newAssetPanel);
        panelMainWindow.add("EDIT_ASSET_PANEL",editAssetPanel);
        panelMainWindow.add("MEMBER_REPORT_PANEL",memberReportPanel);
        panelMainWindow.add("CATOGORY_EDIT_PANEl", catogoryPanel);
        panelMainWindow.add("BOOK_SEARCH_PANEL", bookSearchPanel);
        panelMainWindow.add("CONFIGURE_MANAGER",configureManager);
        panelMainWindow.add("MEMBER_SEARCH_PANEL",memberSearchPanel);
        panelMainWindow.add("BOOK_REPORT_PANEL", bookReportPanel);
        
    }
    public void showHomePanel()  {
        mainLayOut.show(panelMainWindow,"HOME_PANEL");
    }
    public void showAddMemberPanel()    {
        mainLayOut.show(panelMainWindow,"ADD_MEMBER_PANEL");
    }
    public void showEditMemberPanel()    {
        mainLayOut.show(panelMainWindow,"EDIT_MEMBER_PANEL");
    }
    public void showAddBookPanel()    {
        addBookPanel.setBookCategory();
        mainLayOut.show(panelMainWindow, "ADD_BOOK_PANEL");
    }
    public void showEditBookPanel()   {
        mainLayOut.show(panelMainWindow,"EDIT_BOOK_PANEL");
    }
    public void showBookSubscriptionPanel()    {
        mainLayOut.show(panelMainWindow,"BOOK_SUBSCRIPTION_PANEL");
    }
    public void showBookReturnPanel(){
        mainLayOut.show(panelMainWindow,"RETURN_BOOK_PANEL" );
    }
    public void showNewIncomePanel(){
        newIncomePanel.setIncomeCategory();
        newIncomePanel.clearIncomePanel();
        newIncomePanel.UpdateIncomeCatogory();
        newIncomePanel.setReceiptNo();
        mainLayOut.show(panelMainWindow, "NEW_INCOME_PANEL");
        
    }
    public void showEditIncomePanel(){
        editIncomePanel.clearwindow();
        mainLayOut.show(panelMainWindow,"EDIT_INCOME_PANEL");
    }
    public void showNewExpencePanel(){
        newExpencePanel.setVoucherNo();
        mainLayOut.show(panelMainWindow, "NEW_EXPENCE_PANEL");
    }
    public void showEditExpencePanel(){
        mainLayOut.show(panelMainWindow, "EDIT_EXPENCE_PANEL");
    }
    public void showNewAssetPanel(){
        newAssetPanel.setAssetnumber();
        mainLayOut.show(panelMainWindow, "NEW_ASSET_PANEL");
    }
    public void showEditAssetPanel(){
        mainLayOut.show(panelMainWindow, "EDIT_ASSET_PANEL");
    }
    public void showMemberReportPanel(){
      
        mainLayOut.show(panelMainWindow, "MEMBER_REPORT_PANEL");
    }
    public void showCatogoryEditPanel()   {
        catogoryPanel.setBookCategory();
        catogoryPanel.setIncomeCategory();
        mainLayOut.show(panelMainWindow,"CATOGORY_EDIT_PANEl");
    }
    public void showBookSearchPanel()    {
        mainLayOut.show(panelMainWindow,"BOOK_SEARCH_PANEL");
    }
    public void showConfigurePanel()    {
        mainLayOut.show(panelMainWindow, "CONFIGURE_MANAGER");
    }
    public void showMemberSearchPanel()    {
        mainLayOut.show(panelMainWindow, "MEMBER_SEARCH_PANEL");
    }
    public void showBookReportPanel()    {
        mainLayOut.show(panelMainWindow, "BOOK_REPORT_PANEL");
    }
   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuBar = new javax.swing.JTabbedPane();
        panelMainWindow = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        panelMenuBar.setMinimumSize(new java.awt.Dimension(1282, 120));
        panelMenuBar.setPreferredSize(new java.awt.Dimension(1282, 120));
        panelMenuBar.setVerifyInputWhenFocusTarget(false);

        panelMainWindow.setBackground(new java.awt.Color(255, 255, 255));
        panelMainWindow.setForeground(new java.awt.Color(255, 255, 255));
        panelMainWindow.setMinimumSize(new java.awt.Dimension(800, 600));
        panelMainWindow.setOpaque(false);
        panelMainWindow.setPreferredSize(new java.awt.Dimension(800, 600));
        panelMainWindow.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMainWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMainWindow;
    private javax.swing.JTabbedPane panelMenuBar;
    // End of variables declaration//GEN-END:variables

}
