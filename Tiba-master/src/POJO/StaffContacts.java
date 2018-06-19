/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Vanessa
 */
public class StaffContacts {
    
    int recepID, drID, labID, pharmacyID, telephone;

    public StaffContacts(int recepID, int drID, int labID, int pharmacyID, int telephone) {
        this.recepID = recepID;
        this.drID = drID;
        this.labID = labID;
        this.pharmacyID = pharmacyID;
        this.telephone = telephone;
    }

    public StaffContacts() {
    }

    public int getRecepID() {
        return recepID;
    }

    public void setRecepID(int recepID) {
        this.recepID = recepID;
    }

    public int getDrID() {
        return drID;
    }

    public void setDrID(int drID) {
        this.drID = drID;
    }

    public int getLabID() {
        return labID;
    }

    public void setLabID(int labID) {
        this.labID = labID;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "StaffContacts{" + "recepID=" + recepID + ", drID=" + drID + ", labID=" + labID + ", pharmacyID=" + pharmacyID + ", telephone=" + telephone + '}';
    }

}
