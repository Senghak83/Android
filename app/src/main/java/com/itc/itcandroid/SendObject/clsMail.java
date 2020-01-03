package com.itc.itcandroid.SendObject;

import java.io.Serializable;
import java.util.Date;

public class clsMail implements Serializable {
    private String topic;
    private String sendto;
    private  String sms;
    private Date date;


    public clsMail(String topic, String sendto, String sms, Date date) {
        this.topic = topic;
        this.sendto = sendto;
        this.sms = sms;
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
