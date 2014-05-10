/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm.report;

/**
 *
 * @author CLIFFORD
 *
 */
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.ResultSet;
public class Pdformat {
    private static Font HeadFont=new Font(Font.FontFamily.TIMES_ROMAN,20,Font.BOLD);
    private static Font normalFont=new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL);
    public void createTable(ResultSet rs,String FileName){
            try{
                    Document document=new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(FileName));
                    document.open();
                    PdfPTable ptable=new PdfPTable(3);
                    float[] cellWidth={0.75f,2f,4f};
                    ptable.setWidths(cellWidth);
                    PdfPCell c1 = new PdfPCell(new Phrase("Member ID"));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    ptable.addCell(c1);

                    c1 = new PdfPCell(new Phrase("Member Name"));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    ptable.addCell(c1);

                    c1 = new PdfPCell(new Phrase("Address"));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    ptable.addCell(c1);
                    try
                    {
                            while(rs.next())
                            {
                                    ptable.setHeaderRows(1);
                                    ptable.addCell(rs.getString("memberid"));
                                    ptable.addCell(rs.getString("memberfname")+" "+rs.getString("memberlname"));
                                    ptable.addCell(rs.getString("housename")+","+rs.getString("landmark")+","+rs.getString("postoffice")+","+rs.getString("pincode"));
                                    

                           }
                           
                    }

                    catch (Exception e)
                    {
                           e.printStackTrace();
                    }
                    document.add(ptable);
                    document.close();

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }

    }


