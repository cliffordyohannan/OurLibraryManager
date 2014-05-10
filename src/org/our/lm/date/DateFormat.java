/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *Clifford P Y
 *cliffordyohannan@live.com||cliffordyohannan@gmail.com
 * @author CLIFFORD
 */
public class DateFormat {
    Calendar calendar;
    SimpleDateFormat sdf;
    public static void main(String args[])
    {
        DateFormat df = new DateFormat();
        df.getCurrentDate();
    }
    public String getCurrentDate(){
        String date=null;
        calendar=Calendar.getInstance();
        sdf = new SimpleDateFormat("yyyy/MMM/dd");
        date=sdf.format(calendar.getTime());
        System.out.println(date);
        String da[] = date.split("\\/");
        if(date.contains("Jan"))
        {
            date=da[0]+"/01/"+da[2];
        }
        else if(date.contains("Feb"))
        {
             date=da[0]+"/02/"+da[2];
        }
        else if(date.contains("Mar"))
        {
             date=da[0]+"/03/"+da[2];
        } else if(date.contains("Apr"))
        {
             date=da[0]+"/04/"+da[2];
        }
        else if(date.contains("May"))
        {
             date=da[0]+"/05/"+da[2];
        } else if(date.contains("Jun"))
        {
             date=da[0]+"/06/"+da[2];
        }
        else if(date.contains("Jul"))
        {
             date=da[0]+"/07/"+da[2];
        } else if(date.contains("Aug"))
        {
             date=da[0]+"/08/"+da[2];
        }
        else if(date.contains("Sep"))
        {
             date=da[0]+"/09/"+da[2];
        }
         else if(date.contains("Oct"))
        {
             date=da[0]+"/10/"+da[2];
        }
        else if(date.contains("Nov"))
        {
             date=da[0]+"/11/"+da[2];
        }
         else if(date.contains("Dec"))
        {
             date=da[0]+"/12/"+da[2];
        }
        
            
        System.out.println("Currect date"+date);
        //System.out.println(da[0]+"ho"+da[1]+"ho"+da[2]);
        
        return date;
    }
}
