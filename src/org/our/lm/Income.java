/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm;

/**
 *
 * @author CLIFFORD
 */
public class Income {
            private String ReceiptNo;
            private String Date;
            private String ReceivedFrom;
            private String CategoryId;
            private String Description;
            private String amount;

    /**
     * @return the ReceiptNo
     */
    public String getReceiptNo() {
        return ReceiptNo;
    }

    /**
     * @param ReceiptNo the ReceiptNo to set
     */
    public void setReceiptNo(String ReceiptNo) {
        this.ReceiptNo = ReceiptNo;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the ReceivedFrom
     */
    public String getReceivedFrom() {
        return ReceivedFrom;
    }

    /**
     * @param ReceivedFrom the ReceivedFrom to set
     */
    public void setReceivedFrom(String ReceivedFrom) {
        this.ReceivedFrom = ReceivedFrom;
    }

    /**
     * @return the CategoryId
     */
    public String getCategoryId() {
        return CategoryId;
    }

    /**
     * @param CategoryId the CategoryId to set
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


}
