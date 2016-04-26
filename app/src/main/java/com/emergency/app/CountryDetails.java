package com.emergency.app;

/**
 * Created by Younas on 4/26/2016.
 */
public class CountryDetails {

    //private variables
    int _id;
    String _name;
    String _amb_phone_number;
    String _pol_phone_number;

    // Empty constructor
    public CountryDetails(){

    }
    // constructor
    public CountryDetails(int id, String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._amb_phone_number = _phone_number;
    }

    // constructor
    public CountryDetails(String name, String _phone_number){
        this._name = name;
        this._amb_phone_number = _phone_number;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getName(){
        return this._name;
    }

    // setting name
    public void setName(String name){
        this._name = name;
    }

    // getting phone number
    public String getAMbPhoneNumber(){
        return this._amb_phone_number;
    }

    // setting phone number
    public void setAMbPhoneNumber(String phone_number){
        this._amb_phone_number = phone_number;
    }
}