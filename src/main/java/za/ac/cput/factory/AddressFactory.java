//@Author : Joshua Mokwebo 222191562;
//Date:19-04-2024;
//Time:2pm;
//GITHUB repository : My_AirWonderFlightBookingSystem;
//GITHUB Account:fluffy_J



package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.Address_Helper;
import za.ac.cput.util.Helper;

public class AddressFactory {
    public static Address buildAdress(String streetname , String suburb , int postalCode , String city){
      if(!Address_Helper.isNullorEmpty(streetname)||!Address_Helper.isNullorEmpty(suburb)||!Address_Helper.isCodeValid(postalCode)||!Address_Helper.isNullorEmpty(city))
      return null;

      return new Address.Builder().setStreetName(streetname).setSuburb(suburb).setPostalCode(postalCode).setCity(city)
                .build();

    }
}
