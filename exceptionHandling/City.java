package exceptionHandling;

import java.util.HashMap;
import java.util.Map;

public class City {

    int[] ZIPCODES = {734101, 737101, 700098, 171001, 194101};
    String[] CITIES = {"Darjeeling", "Gangtok", "Bidhanagar", "Shimla", "Ladakh"};
    Map<Integer, String> mp=new HashMap<>();

    
    City() {
        for(int i=0; i<ZIPCODES.length; i++)
            mp.put(ZIPCODES[i], CITIES[i]);
    }

    String findCityByZipCode(int zipCode) throws Exception 
    {

        String city=mp.get(zipCode);
        if(city==null)
            throw new Exception("City not found.".toUpperCase());

        return "CITY FOUND: " + city;
        
    }

    
    public static void main(String[] args) {
    	City obj=new City();
        try {
            System.out.println(obj.findCityByZipCode(734101));
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}

/*
EXPECTED INPUT/OUTPUT
CITY FOUND: Darjeeling
*/