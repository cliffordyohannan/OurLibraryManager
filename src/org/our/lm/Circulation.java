/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm;

/**
 *
 * @author CLIFFORD
 */
public class Circulation {
    private String bookId;
    private String userId;
    private String remarks;
    private String isReturned;
    private String date;
    private String returnDate;

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the isReturned
     */
    public String getIsReturned() {
        return isReturned;
    }

    /**
     * @param isReturned the isReturned to set
     */
    public void setIsReturned(String isReturned) {
        this.isReturned = isReturned;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
