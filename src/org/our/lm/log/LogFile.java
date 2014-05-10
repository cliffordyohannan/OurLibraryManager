/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm.log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author CLIFFORD
 */
public class LogFile {
  
    FileHandler fileHandler;
    Logger logger;
    Calendar c;
    public void createLog()
    {
       try
               {
                String date=""+c.DAY_OF_YEAR;
                String time=""+c.HOUR_OF_DAY;
                String fileName = "Our_"+date+"_"+time+".log";
                System.out.println("File Name of file :"+fileName);
                boolean append=true;
                fileHandler = new FileHandler(fileName, append);
                System.out.println("Open a log file  Our.log with append mode ");
                }
               catch(Exception e)
               {
               }

    }
    public void writeLog(String msg)
    {
        SimpleFormatter sf = new SimpleFormatter();
        logger = logger.getLogger(msg);
        logger.addHandler(fileHandler);
        logger.setLevel(Level.ALL);
        fileHandler.setFormatter(sf);
        logger.log(Level.SEVERE,msg);
       
        
    }

}
