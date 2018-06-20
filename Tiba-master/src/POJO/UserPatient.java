/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.sql.Date;

/**
 *
 * @author Vanessa
 */
public class UserPatient {
    
    int id, telephonep;
    String firstnp, middlenp, lastnp, genderp, emailp, addressp, testNeeded ;
    Date dobp, datep;

    public UserPatient() {
    }

    public UserPatient(int aInt, String string, String string0, String string1, Date date, String string2, String string3, int aInt0, String string4, Date date0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public UserPatient(int id, String firstnp, String middlenp, String lastnp, Date dobp, String genderp, String emailp, int telephonep, String addressp, String testNeeded, Date datep) {
//        this.id = id;
//        this.firstnp = firstnp;
//        this.middlenp = middlenp;
//        this.lastnp = lastnp;
//        this.dobp = dobp;
//        this.genderp = genderp;
//        this.emailp = emailp;
//        this.telephonep = telephonep;
//        this.addressp = addressp;
//        this.testNeeded = testNeeded;
//        this.datep = datep;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFirstnp() {
        return firstnp;
    }

    public void setFirstnp(String firstnp) {
        this.firstnp = firstnp;
    }

    public String getMiddlenp() {
        return middlenp;
    }

    public void setMiddlenp(String middlenp) {
        this.middlenp = middlenp;
    }

    public String getLastnp() {
        return lastnp;
    }

    public void setLastnp(String lastnp) {
        this.lastnp = lastnp;
    }

    public String getGenderp() {
        return genderp;
    }

    public void setGenderp(String genderp) {
        this.genderp = genderp;
    }

    public String getEmailp() {
        return emailp;
    }

    public void setEmailp(String emailp) {
        this.emailp = emailp;
    }

    public String getAddressp() {
        return addressp;
    }

    public void setAddressp(String addressp) {
        this.addressp = addressp;
    }

    public int getTelephonep() {
        return telephonep;
    }

    public void setTelephonep(int telephonep) {
        this.telephonep = telephonep;
    }

    public Date getDobp() {
        return dobp;
    }

    public void setDobp(Date dobp) {
        this.dobp = dobp;
    }

    public Date getDatep() {
        return datep;
    }

    public void setDatep(Date datep) {
        this.datep = datep;
    }
    
    
    
//    @Override
//    public String toString() {
//        return "Patient [firstName= " + firstnp + ", middleName= " + middlenp + ", lastName= " + lastnp + ", Date= " + datep + ", Cost= "+cost +"]"; //To change body of generated methods, choose Tools | Templates.
//    }

    public String getTestNeeded() {
        return testNeeded;
    }

    public void setTestNeeded(String testNeeded) {
        this.testNeeded = testNeeded;
    }
    
}
