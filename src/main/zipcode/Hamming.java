package zipcode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hamming {

    private static final Logger logger = Logger.getGlobal();

    String s;
    String s1;

    public Hamming(String s, String s1){
        if(s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.s = s;
        this. s1 = s1;
    }

    public int getHammingDistance() {
        try{
            int counter = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != s1.charAt(i)){
                    counter++;
                }
            }
            return counter;
        }
        catch (Exception IllegalArgumentException){
            logger.log(Level.INFO, "leftStrand and rightStrand must be of equal length.");
            return 0;
        }
    }
}
