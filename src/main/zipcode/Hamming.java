package zipcode;

public class Hamming {

    private String leftStrand;
    private String rightStrand;

    //-----------  constructor ----------------------
    public Hamming(String s, String s1) {
        leftStrand = s;
        rightStrand = s1;

        if (s.length() < s1.length() || s.length() > s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        getHammingDistance();
    }

//---------------------------------------------------

    public int getHammingDistance() {

        if (leftStrand.equals(rightStrand)) return 0;
        return -1;
    }



}
