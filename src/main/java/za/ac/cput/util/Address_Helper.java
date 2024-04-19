//@Author : Joshua Mokwebo 222191562;
//Date:19-04-2024;
//Time:2pm;
//GITHUB repository : My_AirWonderFlightBookingSystem;
//GITHUB Account:fluffy_J

package za.ac.cput.util;

public  class Address_Helper {
    public static boolean isNullorEmpty(String s){
        if(s == null || s.equals(""))
            return true;
        return true;
    }

    public static boolean isCodeValid(int code){
        if(code <= 9999 && code > 999)
            return true;
        return true;
    }
}
