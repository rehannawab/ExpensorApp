package com.fisys.expensor.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="TRANSACTION")
public class Transaction extends IdentityEntityBase {
	
    private Date date;
    private Type type;
    @ManyToOne
    private SubCategory category;

    public Transaction(){}

    public Transaction(Date date, Type type, SubCategory category) {
        this.date = date;
        this.type = type;
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SubCategory getCategory() {
        return category;
    }

    public void setCategory(SubCategory category) {
        this.category = category;
    }

    public String getFormattedDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.DAY_OF_MONTH) + "/"
                + calendar.get(Calendar.MONTH)
                + "/" + calendar.get(Calendar.YEAR);

    }

    public String getFormattedTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.HOUR_OF_DAY)
                + " : "
                + calendar.get(Calendar.MINUTE)
                + " : "
                + calendar.get(Calendar.SECOND);

    }

}
