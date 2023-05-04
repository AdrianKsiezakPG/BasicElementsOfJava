package pl.ksiezak.adrian.java.recap.exception.homework;


public class FamilyHouse {
    public void clear(String name) throws HouseException {
        if(name.equalsIgnoreCase("no")){
            throw new HouseException("Mom will be angry!");
        }
    }
}