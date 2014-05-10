/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm.db;
import java.sql.*;
import org.our.lm.*;


/**
 *
 * @author CLIFFORD
 */
import java.util.Date;
import javax.naming.spi.DirStateFactory.Result;
import org.our.lm.log.LogFile;
import org.our.lm.masters.BookCategory;
import org.our.lm.masters.IncomeCatogory;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import org.our.lm.date.DateFormat;
public class QueryManager 
{       
            
        //Strings for connecting database
            String url="jdbc:mysql://localhost:3306/";
            String dbName=OurConstants.DB_NAME;//"librarydatabase";
            String driver="com.mysql.jdbc.Driver";
            String uname="root";
            String pwd="root";
            Calendar calendar;
            SimpleDateFormat sdf;
            //
      //========================
        DateFormat df;
	DBConnectionManager dbconnection;
	Connection SQLCon;
	Statement stmt;
	ResultSet rs;
	String [] allBooks;
        LogFile lf;
	public QueryManager(LogFile file){
                System.out.println("In QUERY MANAGER");
                
		dbconnection=new DBConnectionManager();
		dbconnection.getDBConnection();
                lf=file;
                df = new DateFormat();
	}
        

 
  //Add to Database
    public int  AddMember(Member member)           {
            
            String addQuery="INSERT INTO membertable(memberid,memberfname,memberlname,gender,dob,housename,landmark,postoffice,pincode,panchayath,membertype,recomendedmember,admissionfee,phone1,phone2,ispaid,joindate,bloodgroup) VALUES('"+member.getMemberId()+"','"+member.getFirstName()+"','"+member.getLastName()+"','"+member.getMemberGender()+"','"+member.getDateOfBirth()+"','"+member.getHouseName()+"','"+member.getLandMark()+"','"+member.getPostOffice()+"','"+member.getPinCode()+"','"+member.getPanchayath()+"','"+member.getMemberType()+"','"+member.getRecomendedMemberId()+"','"+member.getAdmissionFee()+"','"+member.getResidencePhone()+"','"+member.getMobilePhone()+"','"+member.getIsPaid()+"','"+member.getJoinDate()+"','"+member.getBloodGroup()+"')";
            System.out.println(addQuery);
            if(dbconnection.isDBConnected())
            {
                try{
                    SQLCon=dbconnection.getConnectionHandle();
                    stmt=SQLCon.createStatement();
                    stmt.executeUpdate(addQuery);

                   }catch(Exception e)
                    {
                            if(e.getMessage().contains("Duplicate"))
                            {
                              
                               lf.writeLog("\t in AddMember(Member member) \n"+"\t"+addQuery+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");
                               return 1;
                            }
                            else
                            {
                               
                                 lf.writeLog("\t in AddMember(Member member) \n"+"\t"+addQuery+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");
                                 return 2;
                            }

                    }

            }
            else
                return 3;
           return 4;
        }
    public int  AddBook(Book book)                 {
        String AddQuery="INSERT INTO booktable(bookregno,bookname,authorname,publishername,publishyear,price,purchasedate,isbn,booksource,bookedtion,catogory,language,isreturned,shelfno) VALUES('"+book.getBookRegisterNo()+"','"+book.getBookName()+"','"+book.getAuthorName()+"','"+book.getPublisherName()+"','"+book.getPublishedYear()+"','"+book.getPrice()+"','"+book.getPurchaseDate()+"','"+book.getISBN()+"','"+book.getBookSource()+"','"+book.getBookEdition()+"','"+book.getCatogory()+"','"+book.getBookLanguage()+"','1','"+book.getShelfNumber()+"')";
        System.out.println(AddQuery);
        if(dbconnection.isDBConnected())
        {
                    try
                    {
                        SQLCon=dbconnection.getConnectionHandle();
                        stmt=SQLCon.createStatement();
                        stmt.executeUpdate(AddQuery);

                    }
                    catch(Exception e)
                    {
                        //System.out.println("" +e.getMessage());
                        if(e.getMessage().contains("Duplicate"))
                        {
                            lf.writeLog("\t in AddBook(Book book) \n"+"\t"+AddQuery+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");
                            return -1;
                        }
                        else
                        {
                            lf.writeLog("\t in ImportAsset(Asset asset) \n"+"\t"+AddQuery+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                            e.printStackTrace();
                            return -2;

                        }
                    }

                    return 0;

         }
         return -100;
    }
    public int  ImportAsset(Asset asset)           {
        String importAsset="INSERT INTO assettable (assetid,date,category,name,description,noitems,amount,isremoved,remarks) VALUES('"+asset.getAssetId()+"','"+asset.getDate()+"','"+asset.getCategory()+"','"+asset.getName()+"','"+asset.getDescription()+"','"+asset.getNoItems()+"','"+asset.getAmount()+"','"+asset.getIsRemoved()+"','"+asset.getRemarks()+"') ";
        System.out.println(importAsset);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                stmt.executeUpdate(importAsset);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                lf.writeLog("\t in ImportAsset(Asset asset) \n"+"\t"+importAsset+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                e.printStackTrace();
            }
        }
        
        
        return 1;
    }
    public int  ImportCirculation(Circulation circ){
        String circulation="INSERT INTO circulationtable (bookid,userid,date,isreturned,returndate)  VALUES ('"+circ.getBookId()+"','"+circ.getUserId()+"','"+circ.getDate()+"','"+circ.getIsReturned()+"','"+circ.getReturnDate()+"')";
        String bookIsReturned="UPDATE booktable SET booktable.isreturned='0' WHERE booktable.bookregno='"+circ.getBookId()+"'";
        System.out.println(circulation);
        System.out.println(bookIsReturned);
        int Val=0;
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                stmt.executeUpdate(circulation);
                stmt.executeUpdate(bookIsReturned);
            }catch(Exception e)
            {
                 lf.writeLog("\t in ImportCirculation(Circulation circ) \n"+"\t"+bookIsReturned+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                e.printStackTrace();
            }
        }
        return Val;
    }
    public void ImportExpence(Expence expence)     {

        String addExpence="INSERT INTO expencetable (voucherno,date,receivedby,categoryid,description,amount) VALUES('"+expence.getVoucherNo()+"','"+expence.getDate()+"','"+expence.getReceivedBy()+"','"+expence.getCategoryId()+"','"+expence.getDescription()+"','"+expence.getAmount()+"')";
        System.out.println(""+expence.getReceivedBy());
        System.out.println(addExpence);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                stmt.executeUpdate(addExpence);

            }catch(Exception e)
            {
                 lf.writeLog("\t in ImportExpence(Expence expence) \n"+"\t"+addExpence+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");
                 e.printStackTrace();

            }
        }

    }
    public void ImportIncome(Income income )       {


                String importIncome="INSERT INTO incometable (receiptno,date,receiveddfrom,categoryid,description,amount) VALUES('"+income.getReceiptNo()+"','"+income.getDate()+"','"+income.getReceivedFrom()+"','"+income.getCategoryId()+"','"+income.getDescription()+"','"+income.getAmount()+"') ";
                System.out.println(importIncome);
                if(dbconnection.isDBConnected())
                {
                        try{
                        
                                SQLCon=dbconnection.getConnectionHandle();
                                stmt=SQLCon.createStatement();
                                stmt.executeUpdate(importIncome);

                        }catch(Exception e)
                        {
                                lf.writeLog("\t in ImportIncome(Income income )  \n"+"\t"+importIncome+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                                e.printStackTrace();
                        }
                }
                
    }

    //Update Database
    public void UpdateBook(Book book)                    {
                    String updateQuery="UPDATE booktable SET shelfno='"+book.getShelfNumber()+"',bookregno='"+book.getBookRegisterNo()+"',bookname='"+book.getBookName()+"',authorname='"+book.getAuthorName()+"',publishername='"+book.getPublisherName()+"',publishyear='"+book.getPublishedYear()+"',price='"+book.getPrice()+"',purchasedate='"+book.getPurchaseDate()+"',isbn='"+book.getISBN()+"',booksource='"+book.getBookSource()+"',bookedtion='"+book.getBookEdition()+"',catogory='"+book.getCatogory()+"',language='"+book.getBookLanguage()+"'WHERE bookregno='"+book.getBookRegisterNo()+"'";

                    System.out.println(updateQuery);
                    if(dbconnection.isDBConnected())
                    {
                                try{
                                        SQLCon=dbconnection.getConnectionHandle();
                                        stmt=SQLCon.createStatement();
                                        stmt.executeUpdate(updateQuery);
                                   }
                                catch(Exception e)
                                {
                                     lf.writeLog("\t in UpdateBook(Book book)  \n"+"\t"+updateQuery+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                                    e.printStackTrace();
                                }
                    }
    }
    public void UpdateMember(Member member)              {
        String UpdateMember="UPDATE membertable SET memberid='"+member.getMemberId()+"',memberfname='"+member.getFirstName()+"',memberlname='"+member.getLastName()+"',gender='"+member.getMemberGender()+"',dob='"+member.getDateOfBirth()+"',housename='"+member.getHouseName()+"',landmark='"+member.getLandMark()+"',postoffice='"+member.getPostOffice()+"',panchayath='"+member.getPanchayath()+"',admissionfee='"+member.getAdmissionFee()+"',phone1='"+member.getResidencePhone()+"',phone2='"+member.getMobilePhone()+"',ispaid='"+member.getIsPaid()+"',pincode='"+member.getPinCode()+"',joindate='"+member.getJoinDate()+"' WHERE memberid='"+member.getOldId()+"'";
        System.out.println(UpdateMember);
        if(dbconnection.isDBConnected())
        {
                    try
                    {
                                SQLCon=dbconnection.getConnectionHandle();
                                stmt=SQLCon.createStatement();
                                stmt.executeUpdate(UpdateMember);
                    }
                    catch(Exception e)
                    {
                         lf.writeLog("\t in UpdateMember(Member member)  \n"+"\t"+UpdateMember+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");
                         e.printStackTrace();
                    }
        }

    }
    public void UpdateExpence(Expence expence)           {
        String updateExpence="UPDATE expencetable SET date='"+expence.getDate()+"',receivedby='"+expence.getReceivedBy()+"',categoryid='"+expence.getCategoryId()+"',description='"+expence.getDescription()+"',amount='"+expence.getAmount()+"' WHERE voucherno='"+expence.getVoucherNo()+"'";
        System.out.println(updateExpence);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                stmt.executeUpdate(updateExpence);

            }
            catch(Exception e)
            {
                 lf.writeLog("\t in UpdateExpence(Expence expence)  \n"+"\t"+updateExpence+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");
                 e.printStackTrace();
            }
        }
    }
    public int  UpdateIncome(Income income)              {
                String updateIncome="UPDATE incometable SET date='"+income.getDate()+"',receiveddfrom='"+income.getReceivedFrom()+"',categoryid='"+income.getCategoryId()+"',description='"+income.getDescription()+"',amount='"+income.getAmount()+"'";
                System.out.println(updateIncome);
                if(dbconnection.isDBConnected())
                {
                            try
                            {
                                        SQLCon=dbconnection.getConnectionHandle();
                                        stmt=SQLCon.createStatement();
                                        stmt.executeUpdate(updateIncome);
                            }catch(Exception e)
                            {
                                        if(e.getMessage().contains("Incorrect date value"))
                                        {
                                            lf.writeLog("\t in UpdateIncome(Income income)  \n"+"\t"+updateIncome+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                                            return 0;
                                        }
                                        else
                                        {
                                            lf.writeLog("\t in UpdateIncome(Income income)  \n"+"\t"+updateIncome+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                                            e.printStackTrace();
                                        }
                            }
                }
                return 1;
    }
    public int  UpdateAsset(Asset asset)                 {
                String updateAsset="UPDATE assettable SET date='"+asset.getDate()+"',category='"+asset.getCategory()+"',name='"+asset.getName()+"',description='"+asset.getDescription()+"',noitems='"+asset.getNoItems()+"',amount='"+asset.getAmount()+"',isremoved='"+asset.getIsRemoved()+"',remarks='"+asset.getRemarks()+"'WHERE assetid='"+asset.getAssetId()+"'  ";
                System.out.println(updateAsset);
                if(dbconnection.isDBConnected())
                {
                            try
                            {
                                        SQLCon=dbconnection.getConnectionHandle();
                                        stmt=SQLCon.createStatement();
                                        stmt.executeUpdate(updateAsset);
                            }
                            catch(Exception e)
                            {
                                        if(e.getMessage().contains("Incorrect date "))
                                        {
                                            lf.writeLog("\t in  UpdateAsset(Asset asset)  \n"+"\t"+updateAsset+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                                            return 0;
                                        }
                                        else
                                        if(e.getMessage().contains("Data truncated"))
                                        {
                                            lf.writeLog("\t in  UpdateAsset(Asset asset)  \n"+"\t"+updateAsset+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                                            return 0;


                                        }
                                        else
                                        {
                                            lf.writeLog("\t in  UpdateAsset(Asset asset)  \n"+"\t"+updateAsset+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                                            e.printStackTrace();
                                        }
                            }
                }
                return 1;
    }
    public void UpdateCirculationtable(Circulation circulation){
        String updatecirculation="UPDATE circulationtable SET circulationtable.isreturned='1',circulationtable.returndate='"+circulation.getReturnDate()+"',circulationtable.remarks='"+circulation.getRemarks()+"' WHERE circulationtable.bookid='"+circulation.getBookId()+"'AND circulationtable.isreturned='0'";
        String bookReturned="UPDATE booktable SET booktable.isreturned='1' WHERE booktable.bookregno='"+circulation.getBookId()+"'";
        System.out.println(updatecirculation);
        System.out.println(bookReturned);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                stmt.executeUpdate(updatecirculation);
                stmt.executeUpdate(bookReturned);
            }
            catch(Exception e)
            {
                lf.writeLog("\t in UpdateCirculationtable(Circulation circulation)  \n"+"\t"+bookReturned+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");

                System.out.println(e.getMessage());
            }
        }
        
    }
    //Getting Increments from Database
    public int getLastInsertedReceptNo()                       {
        int retn=0;
        String receiptNo="SELECT receiptno FROM incometable";
        System.out.println(receiptNo);
        if(dbconnection.isDBConnected())
        {
            
            try{
                        SQLCon=dbconnection.getConnectionHandle();
                        stmt=SQLCon.createStatement();
                        rs=stmt.executeQuery(receiptNo);
                        while(rs.next())
                        {
                            retn=Integer.parseInt(rs.getString("receiptno"));
                        }
                        rs.close();
                        System.out.println("Ividethy");
               }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }

        }

        return retn;

    }
    public int getLastInsertedVoucherNo()                      {
        int voucherNo=0;
        String VoucherNo="SELECT voucherno FROM expencetable";
        System.out.println(VoucherNo);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(VoucherNo);
                while(rs.next())
                {
                    voucherNo=Integer.parseInt(rs.getString("voucherno"));
                }
                rs.close();

            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return voucherNo;
    }
    public int getLastInsertedAssetNo()                        {
        int AssetNo=0;
        ResultSet rs=null;
        String assetNo="SELECT assetid FROM assettable";
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(assetNo);
                while(rs.next())
                {
                    AssetNo=Integer.parseInt(rs.getString("assetid"));
                }
                 rs.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }

        }
        return AssetNo;
    }
    public Date getCurrentDateFromDb(){
        Date curDate=null;
        return curDate;
    }
    //Get Data From Database Table
    public ResultSet ReturnBookDetails(String memberId)              {
       String bookDetails="SELECT circulationtable.bookid,circulationtable.userid,circulationtable.date ,booktable.bookname FROM circulationtable,booktable  WHERE circulationtable.userid='"+memberId+"' AND circulationtable.isreturned='0'  AND booktable.bookregno=circulationtable.bookid  ";
       System.out.println(bookDetails);
       if(dbconnection.isDBConnected())
       {
           try
           {
               SQLCon=dbconnection.getConnectionHandle();
               stmt=SQLCon.createStatement();
               rs=stmt.executeQuery(bookDetails);
           }
           catch(Exception e)
           {


               System.out.println(e.getMessage());
             e.printStackTrace();
           }
       }
       return rs;
   }
    public ResultSet SearchBook(String Key,int SearchNo)             {
                ResultSet rs=null;
                String SearchQuery=null;
                System.out.println("SearchNo :" +SearchNo);
                switch(SearchNo)
                {
                             case 0:
                                    SearchQuery  ="SELECT * FROM booktable WHERE bookregno ='"+Key+"'";
                                    break;
                             case 1:
                                    SearchQuery="SELECT * FROM booktable WHERE bookname LIKE '"+Key+"%'";
                                    break;
                             case 2:
                                    SearchQuery="SELECT * FROM booktable WHERE catogory LIKE '"+Key+"%'";
                                    break;
                             case 3:
                                    SearchQuery="SELECT * FROM booktable WHERE authorname LIKE '"+Key+"%'";
                                    break;
                }
                System.out.println(SearchQuery);
                if(dbconnection.isDBConnected())
                {
                            try{

                                    SQLCon=dbconnection.getConnectionHandle();
                                    stmt=SQLCon.createStatement();
                                    rs=stmt.executeQuery(SearchQuery);

                            }catch(Exception e)
                            {

                                    System.out.println(e.getMessage());
                                    e.printStackTrace();
                            }
                }
                return rs;

    }
    public ResultSet SearchMember(String Key,int SearchNo)           {
                ResultSet rs=null;
                String SearchQuery=null;
                switch(SearchNo)
                {
                            case 0:
                                    SearchQuery="SELECT * FROM membertable WHERE memberfname LIKE '"+Key+"%' OR memberlname LIKE '%"+Key+"'";
                                    break;
                            case 1:
                                    SearchQuery="SELECT * FROM membertable WHERE memberid='"+Key+"' ";
                                    break;
                            case 2:
                                    SearchQuery="SELECT * FROM membertable WHERE bloodgroup LIKE '"+Key+"%'";
                                    break;
                            case 3:
                                    SearchQuery = "SELECT * FROM membertable WHERE landmark LIKE '"+Key+"%'";
                                    break;
                            
                }
                System.out.println(SearchQuery);
                if(dbconnection.isDBConnected())
                {
                            try
                            {
                                        SQLCon=dbconnection.getConnectionHandle();
                                        stmt=SQLCon.createStatement();
                                        rs=stmt.executeQuery(SearchQuery);
                            }catch(Exception e)
                            {
                                        e.printStackTrace();
                            }
                }
                return rs;
    }
    public ResultSet SearchExpence(String Key,int  switcher)         {

        ResultSet rs=null;
        String searchExpence=null;
        switch(switcher)
        {
            case 0:
                searchExpence="SELECT * FROM expencetable WHERE voucherno='"+Key+"'";
                break;
            case 1:
                searchExpence="SELECT * FROM expencetable WHERE receivedby LIKE '"+Key+"%'";
                break;
            case 3:
                searchExpence="SELECT * FROM expencetable WHERE receivedby LIKE'"+Key+"%'";
                break;
        }
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(searchExpence);
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return rs;
    }
    public ResultSet SearchIntroducer(String key,String Id)          {
        ResultSet rs=null;
        String SearchQuery="SELECT * FROM membertable WHERE memberfname='"+key+"' OR memberid='"+Id+"' ";
        System.out.println(SearchQuery);
        if(dbconnection.isDBConnected())
        {
            try{
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(SearchQuery);

            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return rs;
    }
    public ResultSet getBookReturnInformationFromDb(String bookid)   {
        ResultSet rs=null;
        //String bookInformation =
        String bookInformation="SELECT circulationtable.date,circulationtable.userid,circulationtable.isreturned,circulationtable.returndate,booktable.bookname,membertable.memberfname,membertable.memberlname FROM circulationtable,booktable,membertable WHERE circulationtable.bookid='"+bookid+"' AND booktable.bookregno='"+bookid+"' AND circulationtable.isreturned='0' AND membertable.memberid=circulationtable.userid  ORDER BY circulationtable.date DESC LIMIT 1";
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(bookInformation);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }
        }
        return rs;
    }
    public ResultSet NumberOfBookToBeReturned(String userId)         {
        ResultSet rs=null;
        String SearchCirculation="SELECT * FROM circulationtable WHERE isreturned='0' AND userid='"+userId+"' ";
        System.out.println(SearchCirculation);
        
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(SearchCirculation);
            }catch(Exception e)
            {
                e.printStackTrace();
                
            }
        }
        return rs;
    }
    public ResultSet GetDataFromCirculationTable(String bookNo)      {
        ResultSet rs=null;
        String cData="SELECT circulationtable.userid,circulationtable.returndate FROM circulationtable WHERE circulationtable.bookid='"+bookNo+"'";
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(cData);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        return rs;

    }
    public ResultSet SearchIncome(String IncomeSKey,int switcher)    {
        ResultSet rs=null;
        String searchIncome=null;
        System.out.println(IncomeSKey);
        switch(switcher)
        {
            case 0:
                searchIncome = "SELECT *FROM incometable WHERE receiptno='"+IncomeSKey+"'";
                break;
            case 1:
                searchIncome="SELECT * FROM incometable WHERE receiveddfrom LIKE'"+IncomeSKey+"%'";
                break;
            case 2:
                searchIncome="SELECT * FROM incometable WHERE categoryid='"+IncomeSKey+"'";
                break;
       }
        System.out.println(searchIncome);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(searchIncome);
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return rs;
    }
    public ResultSet SearchAsset(String searchKey,int switcher)      {
        ResultSet rs=null;
        String searchAsset=null;
        switch(switcher)
        {
            case 0:
                searchAsset="SELECT * FROM assettable WHERE assetid='"+searchKey+"'";
                break;
            case 1:
                searchAsset="SELECT * FROM assettable WHERE name LIKE'"+searchKey+"%'";
                break;
        }
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(searchAsset);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return rs;
    }
    public ResultSet getBookNameFromBookTableForSubscription(String bookid){
        ResultSet rs=null;
        String bookName="SELECT booktable.bookname FROM booktable WHERE  booktable.bookregno='"+bookid+"'";
        System.out.println(bookName);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(bookName);
                
            }
            catch(Exception e)
            {

                System.out.println(e.getMessage());
              // e.printStackTrace();
            }

        }
        return rs;
    }
    public ResultSet checkAvailabilityOfbook(String bookid){
        ResultSet rs=null;
        String availBooks="SELECT * FROM booktable WHERE booktable.bookregno='"+bookid+"' AND booktable.isreturned='1'";
        System.out.println(availBooks);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(availBooks);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return rs;
    }
    public ResultSet getPOffice(String msg)    {
       ResultSet rs=null;
       String query="SELECT postoffice,pincode FROM membertable WHERE membertable.postoffice LIKE '"+msg+"%' " ;
       System.out.println(query);
       if(dbconnection.isDBConnected())
       {
           try
           {
               SQLCon=dbconnection.getConnectionHandle();
               stmt=SQLCon.createStatement();
               rs=stmt.executeQuery(query);
               
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
       return rs; 
   }
    public ResultSet getCategory(){
       ResultSet rs=null;
       String query="SELECT * FROM  mastertable WHERE type='"+1+"'";
       System.out.println(query);
       if(dbconnection.isDBConnected())
       {
           try
           {
                 SQLCon=dbconnection.getConnectionHandle();
                 stmt=SQLCon.createStatement();
                 rs=stmt.executeQuery(query);
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
                
                   
       }
       
       
       
       return rs;
       
       
       
   }
    public ResultSet getBookAuthor(String msg)    {
        ResultSet rs=null;
        String query="SELECT * FROM booktable WHERE authorname LIKE '"+msg+"%'";
        System.out.println(query);
        if(dbconnection.isDBConnected())
       {
           try
           {
                 SQLCon=dbconnection.getConnectionHandle();
                 stmt=SQLCon.createStatement();
                 rs=stmt.executeQuery(query);
           }
           catch(Exception e)
           {
                lf.writeLog("\t in ResultSet getBookAuthor(String msg)  \n"+"\t"+query+"\n\t"+e.getLocalizedMessage()+"\n----------------------------------------------------------\n\n\n");
                System.out.println(e.getMessage());
           }
       }
                
        
        return rs;
    }
    //Getting All data from database
    public ResultSet getAllMemberDetails(MemberReport memberReport)                                  {
        ResultSet rs=null;
        String MemberDetails="SELECT * FROM  membertable ORDER BY memberid ASC WHERE joindate between '"+memberReport.getReportDate1()+"' AND '"+memberReport.getReportDate2()+"'  ";
        System.out.println(MemberDetails);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                rs=stmt.executeQuery(MemberDetails);

            }catch(Exception e)
            {
            }
        }
        return rs;
    }
  //MASTER TABLE UPDATE
        //the methods below update and retrive income categories with user interactions from and to "CategoryEditPanel"
            public void UpdateIncomeCatogory(IncomeCatogory incomeCatogory,int switcher)    {
         String mS=null;
        switch(switcher)
        {
            
            case 1:
                  mS="UPDATE mastertable SET cat1='"+incomeCatogory.getCAT_1()+"' WHERE type='1'";
                break;
            case 2:
                  mS="UPDATE mastertable SET cat2='"+incomeCatogory.getCAT_2()+"' WHERE type='1'";
                break;
            case 3:
                  mS="UPDATE mastertable SET cat3='"+incomeCatogory.getCAT_3()+"' WHERE type='1'";
                break;
            case 4:
                  mS="UPDATE mastertable SET cat4='"+incomeCatogory.getCAT_4()+"' WHERE type='1'";
                break;
            case 5:
                  mS="UPDATE mastertable SET cat5='"+incomeCatogory.getCAT_5()+"' WHERE type='1'";
                break;
            case 6:
                  mS="UPDATE mastertable SET cat6='"+incomeCatogory.getCAT_6()+"' WHERE type='1'";
                break;
            case 7:
                  mS="UPDATE mastertable SET cat7='"+incomeCatogory.getCAT_7()+"' WHERE type='1'";
                break;

            case 8:
                  mS="UPDATE mastertable SET cat8='"+incomeCatogory.getCAT_8()+"' WHERE type='1'";
                break;
            case 9:
                  mS="UPDATE mastertable SET cat9='"+incomeCatogory.getCAT_9()+"' WHERE type='1'";
                break;
            case 10:
                  mS="UPDATE mastertable SET cat10='"+incomeCatogory.getCAT_10()+"' WHERE type='1'";
                break;
            case 11:
                  mS="UPDATE mastertable SET cat11='"+incomeCatogory.getCAT_11()+"' WHERE type='1'";
                break;
            case 12:
                  mS="UPDATE mastertable SET cat12='"+incomeCatogory.getCAT_12()+"' WHERE type='1'";
                break;
            case 13:
                  mS="UPDATE mastertable SET cat13='"+incomeCatogory.getCAT_13()+"' WHERE type='1'";
                break;
            case 14:
                  mS="UPDATE mastertable SET cat14='"+incomeCatogory.getCAT_14()+"' WHERE type='1'";
                break;
            case 15:
                  mS="UPDATE mastertable SET cat15='"+incomeCatogory.getCAT_15()+"' WHERE type='1'";
                break;
            case 16:
                  mS="UPDATE mastertable SET cat16='"+incomeCatogory.getCAT_16()+"' WHERE type='1'";
                break;
            case 17:
                  mS="UPDATE mastertable SET cat17='"+incomeCatogory.getCAT_17()+"' WHERE type='1'";
                break;
            case 18:
                  mS="UPDATE mastertable SET cat18='"+incomeCatogory.getCAT_18()+"' WHERE type='1'";
                break;
            case 19:
                  mS="UPDATE mastertable SET cat19='"+incomeCatogory.getCAT_19()+"' WHERE type='1'";
                break;
             case 20:
                  mS="UPDATE mastertable SET cat20='"+incomeCatogory.getCAT_20()+"' WHERE type='1'";
                break;
            case 21:
                  mS="UPDATE mastertable SET cat21='"+incomeCatogory.getCAT_21()+"' WHERE type='1'";
                break;
            case 22:
                  mS="UPDATE mastertable SET cat22='"+incomeCatogory.getCAT_22()+"' WHERE type='1'";
                break;
            case 23:
                  mS="UPDATE mastertable SET cat23='"+incomeCatogory.getCAT_23()+"' WHERE type='1'";
                break;
                case 24:
                  mS="UPDATE mastertable SET cat24='"+incomeCatogory.getCAT_24()+"' WHERE type='1'";
                break;
            case 25:
                  mS="UPDATE mastertable SET cat25='"+incomeCatogory.getCAT_25()+"' WHERE type='1'";
                break;
            case 26:
                  mS="UPDATE mastertable SET cat26='"+incomeCatogory.getCAT_26()+"' WHERE type='1'";
                break;
            case 27:
                  mS="UPDATE mastertable SET cat27='"+incomeCatogory.getCAT_27()+"' WHERE type='1'";
                break;

        }
        
        System.out.println(mS);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                stmt.executeUpdate(mS);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
            public ResultSet getIncomeCatogories()        {
            ResultSet rs=null;
            String incomeCatogories="SELECT * FROM mastertable WHERE  type='1'";
            System.out.println(incomeCatogories);
            if(dbconnection.isDBConnected())
            {
                try
                {
                    SQLCon=dbconnection.getConnectionHandle();
                    stmt=SQLCon.createStatement();
                    rs=stmt.executeQuery(incomeCatogories);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return rs;

        }
        //This method update the book categories that edited by the user via "CategoryEditPanel"
            public void updateBookCategory(BookCategory bc,int switcher){
              //  System.out.println("String:"++"Switch :"+switcher);
        String uBook=null;
        switch(switcher)
        {
            case 1:
                uBook = "UPDATE mastertable SET cat1='"+bc.getCAT_1()+"' where type='2'";
                break;
            case 2:
                uBook = "UPDATE mastertable SET cat2='"+bc.getCAT_2()+"' where type='2'";
                break;
            case 3:
                uBook = "UPDATE mastertable SET cat3='"+bc.getCAT_3()+"' where type='2'";
                break;
            case 4:
                uBook = "UPDATE mastertable SET cat4='"+bc.getCAT_4()+"' where type='2'";
                break;
            case 5:
                uBook = "UPDATE mastertable SET cat5='"+bc.getCAT_5()+"' where type='2'";
                break;
            case 6:
                uBook = "UPDATE mastertable SET cat6='"+bc.getCAT_6()+"' where type='2'";
                break;
            case 7:
                uBook = "UPDATE mastertable SET cat7='"+bc.getCAT_7()+"' where type='2'";
                break;
            case 8:
                uBook = "UPDATE mastertable SET cat8='"+bc.getCAT_8()+"' where type='2'";
                break;
             case 9:
                uBook = "UPDATE mastertable SET cat9='"+bc.getCAT_9()+"' where type='2'";
                break;
             case 10:
                uBook = "UPDATE mastertable SET cat10='"+bc.getCAT_10()+"' where type='2'";
                break;
             case 11:
                uBook = "UPDATE mastertable SET cat11='"+bc.getCAT_11()+"' where type='2'";
                break;
             case 12:
                uBook = "UPDATE mastertable SET cat12='"+bc.getCAT_12()+"' where type='2'";
                break;
             case 13:
                uBook = "UPDATE mastertable SET cat13='"+bc.getCAT_13()+"' where type='2'";
                break;
             case 14:
                uBook = "UPDATE mastertable SET cat14='"+bc.getCAT_14()+"' where type='2'";
                break;
              case 15:
                uBook = "UPDATE mastertable SET cat15='"+bc.getCAT_15()+"' where type='2'";
                break;
             case 16:
                uBook = "UPDATE mastertable SET cat16='"+bc.getCAT_16()+"' where type='2'";
                break;
             case 17:
                uBook = "UPDATE mastertable SET cat17='"+bc.getCAT_17()+"' where type='2'";
                break;
              case 18:
                uBook = "UPDATE mastertable SET cat18='"+bc.getCAT_18()+"' where type='2'";
                break;
             case 19:
                uBook = "UPDATE mastertable SET cat19='"+bc.getCAT_19()+"' where type='2'";
                break;
             case 20:
                uBook = "UPDATE mastertable SET cat20='"+bc.getCAT_20()+"' where type='2'";
                break;
             case 21:
                uBook = "UPDATE mastertable SET cat21='"+bc.getCAT_21()+"' where type='2'";
                break;
             case 22:
                uBook = "UPDATE mastertable SET cat22='"+bc.getCAT_22()+"' where type='2'";
                break;
             case 23:
                uBook = "UPDATE mastertable SET cat23='"+bc.getCAT_23()+"' where type='2'";
                break;
             case 24:
                uBook = "UPDATE mastertable SET cat24='"+bc.getCAT_24()+"' where type='2'";
                break;
             case 25:
                uBook = "UPDATE mastertable SET cat25='"+bc.getCAT_25()+"' where type='2'";
                break;
             case 26:
                uBook = "UPDATE mastertable SET cat26='"+bc.getCAT_26()+"' where type='2'";
                break;
             case 27:
                uBook = "UPDATE mastertable SET cat27='"+bc.getCAT_27()+"' where type='2'";
                break;
             default:
                 break;
           
        }
         System.out.println(uBook);
        if(dbconnection.isDBConnected())
        {
            try
            {
                SQLCon=dbconnection.getConnectionHandle();
                stmt=SQLCon.createStatement();
                stmt.executeUpdate(uBook);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
            public ResultSet getBookCategories(){
                 ResultSet rs =null;
                 String bCategories="SELECT * FROM mastertable WHERE  type='2'";
                 System.out.println(bCategories);
                 if(dbconnection.isDBConnected())
                 {
                        try
                        {
                            SQLCon=dbconnection.getConnectionHandle();
                            stmt=SQLCon.createStatement();
                            rs=stmt.executeQuery(bCategories);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }
                 }
                 return rs;

                
            }
 /*Here is the library manager configuring queries
  * The methods given below help to initialize some of the database entries
  * 
  */
//Configure Library manager 
     //Configuring income categories
        public void configureIncomeCategories()      {
          Connection con=null;
          String cIc="INSERT INTO mastertable(type,cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8,cat9,cat10,cat11,cat12,cat13,cat14,cat15,cat16,cat17,cat18,cat19,cat20,cat21,cat22,cat23,cat24) "
                  + "VALUES ('1','Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories')";
          System.out.println(cIc);
              try{
                    con=DriverManager.getConnection(url+dbName,uname,pwd);
                    stmt=con.createStatement();
                    stmt.executeUpdate(cIc);

                   }catch(Exception e)
                   {
                      e.printStackTrace();
                   }
                   
      }
     //configuring Book Categories
        public void configureBookCategories(){
            Connection con=null;
           String cBc="INSERT INTO mastertable(type,cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8,cat9,cat10,cat11,cat12,cat13,cat14,cat15,cat16,cat17,cat18,cat19,cat20,cat21,cat22,cat23,cat24) "
                  + "VALUES ('2','Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories')";
          System.out.println(cBc);
            try{
                    con=DriverManager.getConnection(url+dbName,uname,pwd);
                    stmt=con.createStatement();
                    stmt.executeUpdate(cBc);
                   }catch(Exception e)
                   {
                      e.printStackTrace();
                   }
                   
          
      }
     //configuring asset categories
        public void configureAssetCategories(){
            Connection con=null;
           String cAc="INSERT INTO mastertable(type,cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8,cat9,cat10,cat11,cat12,cat13,cat14,cat15,cat16,cat17,cat18,cat19,cat20,cat21,cat22,cat23,cat24) "
                  + "VALUES ('3','Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories')";
          System.out.println(cAc);
           
                try{
                    con=DriverManager.getConnection(url+dbName,uname,pwd);
                    stmt=con.createStatement();
                    stmt.executeUpdate(cAc);
                    con.close();
                    
                   }catch(Exception e)
                   {
                      e.printStackTrace();
                   }
                  
      }
     //configuring expence categories
        public void configureExpenceCategories(){
            Connection con=null;
       String cEc="INSERT INTO mastertable(type,cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8,cat9,cat10,cat11,cat12,cat13,cat14,cat15,cat16,cat17,cat18,cat19,cat20,cat21,cat22,cat23,cat24) "
                  + "VALUES ('4','Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories',"
                  + "'Categories','Categories','Categories','Categories','Categories','Categories')";
          System.out.println(cEc);
            
                try{
                    con=DriverManager.getConnection(url+dbName,uname,pwd);
                    stmt=con.createStatement();
                    stmt.executeUpdate(cEc);
                    con.close();

                   }catch(Exception e)
                   {
                      e.printStackTrace();
                   }
                   
      
      }
     //Initializing IncomeReceiptNumber
        public int initializeIncomeReceipt(int receiptNo)  {
            Connection con =null;
            String query="INSERT INTO incometable(receiptno,date)VALUES('"+receiptNo+"','"+df.getCurrentDate()+"')";
            System.out.println(query);
                try{
                    con=DriverManager.getConnection(url+dbName,uname,pwd);
                    stmt=con.createStatement();
                    stmt.executeUpdate(query);
                    con.close();
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                       return 0;
                   }
           
            return 1;
        }
     //Initialize AssetReceiptNumber
        public int initializeAssetReceipt(int receiptNo){
            Connection con=null;
            
            String query ="INSERT INTO assettable(assetid,date) VALUES('"+receiptNo+"','"+df.getCurrentDate()+"')"; 
            
            System.out.println(query);
             try{
                    con=DriverManager.getConnection(url+dbName,uname,pwd);
                    stmt=con.createStatement();
                    stmt.executeUpdate(query);
                    con.close();

                   }catch(Exception e)
                   {
                      e.printStackTrace();
                      return 0;
                   }
           
            return 1;
        }
      //Initialize Expence ReceiptNumber
        public int initializeExpenceReceipt(int receiptNo){
            Connection con=null;
            String query ="INSERT INTO expencetable(voucherno,date) VALUES('"+receiptNo+"','"+df.getCurrentDate()+"')"; 
            System.out.println(query);
           
                try{
                    con=DriverManager.getConnection(url+dbName,uname,pwd);
                    stmt=con.createStatement();
                    stmt.executeUpdate(query);
                    con.close();

                   }catch(Exception e)
                   {
                      e.printStackTrace();
                      return 0;
                   }
           
            return 1;
        }
       /*
        * Methods for creating database and tables
        */
    //creating Database and tables
        //method for creating database "librarydatabase" and tables
        public void createDatabase(){
               Connection con =null;
               String db="CREATE DATABASE librarydatabase";
               try{
                    con=DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/","root","root");
                    stmt=con.createStatement();
                    stmt.executeUpdate(db);
                    con.close();
                    //asset table
                    
                    //assettable creation compleated
               }catch(Exception e)
               {
                      e.printStackTrace();
                     
               }
           
            
        }
       //create asset table
        public void createAssetTable() {
            Connection con =null;
            String connection=url+dbName;
            String assettable="CREATE TABLE assettable(assetid bigint(20) PRIMARY KEY NOT NULL,date date NOT NULL,"
                            + "category varchar(50) ,name varchar(50) ,description varchar(300),"
                            + "noitems int(11) ,amount float ,isremoved smallint(6) "
                            + ",remarks varchar(50)  )";
            try{
                con =DriverManager.getConnection(connection, uname, pwd);
                stmt=con.createStatement();
                stmt.executeUpdate(assettable);
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        //method for creating booktable
        
         public void createBookTable() {
            Connection con =null;
            String connection=url+dbName;
            String booktable="CREATE TABLE booktable(bookregno varchar(50) PRIMARY KEY NOT NULL,bookname varchar(200) NOT NULL,authorname varchar(100) NOT NULL,"
                    + "publishername varchar(200) NOT NULL ,publishyear varchar(15) NOT NULL,purchasedate date NOT NULL,isbn varchar(30) NOT NULL"
                    + ",booksource varchar(50) NOT NULL,bookedtion varchar(5) NOT NULL,catogory varchar(50) NOT NULL,language varchar(50) NOT NULL,"
                    + "price float NOT NULL,isreturned smallint(6) NOT NULL,shelfno varchar(10) NOT NULL  )";
            try{
                con =DriverManager.getConnection(connection, uname, pwd);
                stmt=con.createStatement();
                stmt.executeUpdate(booktable);
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
         //method for creating circulation table();
         
         public void createCirculationTable(){
            Connection con =null;
            String connection=url+dbName;
            String circulationtable="CREATE TABLE circulationtable(bookid int(11) NOT NULL,userid int(11) NOT NULL,"
                    + "date date NOT NULL,isreturned smallint(6) NOT NULL,returndate date NOT NULL,remarks varchar(100) )";
            try{
                con =DriverManager.getConnection(connection, uname, pwd);
                stmt=con.createStatement();
                stmt.executeUpdate(circulationtable);
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
         //method for creating expencetable
          public void createExpenceTable(){
            Connection con =null;
            String connection=url+dbName;
            String expencetable="CREATE TABLE expencetable(voucherno int(11) PRIMARY KEY NOT NULL,date date NOT NULL,receivedby varchar(50) "
                    + ",categoryid smallint(6) ,description varchar(300),amount float )";
            try{
                con =DriverManager.getConnection(connection, uname, pwd);
                stmt=con.createStatement();
                stmt.executeUpdate(expencetable);
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
          //method for creating incometable
          
           public void createIncomeTable(){
            Connection con =null;
            String connection=url+dbName;
            String incometable="CREATE TABLE incometable(receiptno int(11) PRIMARY KEY NOT NULL,date date NOT NULL,receivedfrom varchar(50) ,categoryid smallint(6),description varchar(200),amount float)";
            try{
                con =DriverManager.getConnection(connection, uname, pwd);
                stmt=con.createStatement();
                stmt.executeUpdate(incometable);
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        //method for creating mastertable
          public void createMasterTable(){
            Connection con =null;
            String connection=url+dbName;
            String mastertable="CREATE TABLE mastertable(type smallint(6) PRIMARY KEY NOT NULL,cat1 varchar(100),cat2 varchar(100),cat3 varchar(100),cat4 varchar(100),cat5 varchar(100)"
                    + ",cat6 varchar(100),cat7 varchar(100),cat8 varchar(100),cat9 varchar(100),cat10 varchar(100),cat11 varchar(100)"
                    + ",cat12 varchar(100),cat13 varchar(100),cat14 varchar(100),cat15 varchar(100),cat16 varchar(100),cat17 varchar(100)"
                    + ",cat18 varchar(100),cat19 varchar(100),cat20 varchar(100),cat21 varchar(100),cat22 varchar(100),cat23 varchar(100)"
                    + ",cat24 varchar(100))";
            try{
                con =DriverManager.getConnection(connection, uname, pwd);
                stmt=con.createStatement();
                stmt.executeUpdate(mastertable);
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }  
       //method for creating member table
          public void createMemberTable(){
            Connection con =null;
            String connection=url+dbName;
            String membertable="CREATE TABLE membertable(memberid  bigint(20) PRIMARY KEY NOT NULL,memberfname varchar(50) NOT NULL"
                    + ",memberlname varchar(50) NOT NULL,gender varchar(1) NOT NULL,dob date NOT NULL,joindate date NOT NULL,"
                    + "housename varchar(100) ,landmark varchar(100) ,postoffice varchar(100),panchayath varchar(100),"
                    + "membertype smallint(6) NOT NULL,recomendedmember int(11) NOT NULL,admissionfee int(11) NOT NULL,phone1 varchar(20)"
                    + ",phone2 varchar(20) ,pincode varchar(10),ispaid smallint(6) NOT NULL,bloodgroup varchar(2) )";
            try{
                con =DriverManager.getConnection(connection, uname, pwd);
                stmt=con.createStatement();
                stmt.executeUpdate(membertable);
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }  
}
