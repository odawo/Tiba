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
public class PatientReport {
    
    int id, cost, telephonep;
    String firstnp, middlenp, lastnp, genderp, emailp, addressp ;
    Date dobp, datep;

    public PatientReport(int id, String firstnp, String middlenp, String lastnp, Date datep, int cost) {
        this.id = id;
        this.firstnp = firstnp;
        this.middlenp = middlenp;
        this.lastnp = lastnp;
        this.datep = datep;
        this.cost = cost;
    }
    
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
    
    public Date getDatep() {
        return datep;
    }

    public void setDatep(Date datep) {
        this.datep = datep;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Patient [firstName= " + firstnp + ", middleName= " + middlenp + ", lastName= " + lastnp + ", Date= " + datep + ", Cost= "+cost +"]"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
