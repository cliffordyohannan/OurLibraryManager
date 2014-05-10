/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm.report;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/**
 *
 * @author CLIFFORD
 */
public class DateSubstraction
{

               static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
               public static long getDateDifferance(Date CurrentDate,Date DueDate) {
               TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
               System.out.println(""+CurrentDate);
               System.out.println(""+DueDate);
               Calendar cal3 = Calendar.getInstance();cal3.setTime(CurrentDate);
               Calendar cal4 = Calendar.getInstance();cal4.setTime(DueDate);

              System.out.println("---");
              long result=printOutput("Manual   ", CurrentDate, DueDate, calculateDays(CurrentDate, DueDate));
              printOutput("Calendar ", CurrentDate, DueDate, daysBetween(cal3, cal4));
              return result;
 }


            private static long printOutput(String type, Date d1, Date d2, long result) {
              System.out.println(type+ "- Days between: " + sdf.format(d1)
                                + " and " + sdf.format(d2) + " is: " + result);
              return result;
            }

            /** Manual Method - YIELDS INCORRECT RESULTS - DO NOT USE**/
            /* This method is used to find the no of days between the given dates */
            public static long calculateDays(Date dateEarly, Date dateLater) {
                System.out.println((dateLater.getTime() - dateEarly.getTime()));
                return (dateLater.getTime() - dateEarly.getTime()) / (24 * 60 * 60 * 1000);

            }
            public static long addYear(Date dateEarly,Date dateLater){

                return (dateLater.getTime() + dateEarly.getTime());
            }

            /** Using Calendar - THE CORRECT WAY**/
            public static long daysBetween(Calendar startDate, Calendar endDate) {
              Calendar date = (Calendar) startDate.clone();
              long daysBetween = 0;
              while (date.before(endDate)) {
                date.add(Calendar.DAY_OF_MONTH, 1);
                daysBetween++;
              }
              return daysBetween;
            }

}
