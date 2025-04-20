package main.zipcode;

public class Hamming {
    private String s;
    private String s1;
    private int ham;
    public Hamming(String s, String s1)throws IllegalArgumentException {
        this.s = s;
        this.s1 = s1;
        if(s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        }


    }

    public int getHammingDistance() {
        ham = 0;
        for(int i = 0; i < s.length();i++){
            if(this.s.charAt(i)!= this.s1.charAt(i)){
                ham++;
            }
        }
        return ham;
    }
}
