package zipcode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hamming {
    private String s;
    private String s1;
    //private static final Logger logger = new Logger(System.in, System.out);

    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if (s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length."); }
    }

    public int getHammingDistance() throws IllegalArgumentException {



        Integer hammingValue = 0;
        String [] sSplit = s.split("");
        String [] s1Split = s1.split("");

            if (sSplit.length == s1Split.length) {
                for (int i = 0; i < sSplit.length; i++){
                    if (!sSplit[i].equals(s1Split[i])){
                        hammingValue++;

                    }
                }
            }
        return hammingValue;
    }
}