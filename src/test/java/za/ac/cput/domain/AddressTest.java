package za.ac.cput.domain;

import org.junit.jupiter.api.Test;
import za.ac.cput.factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    public void createAdress(){
    if(AddressFactory.buildAdress("Battersea Dive" , "" , 0 , "Johannesburg") == null)
        System.out.println("failed");
    else
        System.out.println("Created");

    }

}