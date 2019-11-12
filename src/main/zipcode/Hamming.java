package zipcode;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.logging.Logger;

public class Hamming {
    String s;
    String s1;


    public Hamming(String s, String s1)throws IllegalArgumentException {
        this.s = s;
        this.s1 = s1;
        if(s.length()!=s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance(){
            int hammy = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)!=s1.charAt(i)){
                    hammy++;
                }

            }
            return hammy;
        }




}
