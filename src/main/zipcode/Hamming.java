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
    }

//---------------------------------------------------

    public int getHammingDistance() {
        int counter = 0;

        if (leftStrand.equals(rightStrand)) return 0;

        for (int i = 0; i < leftStrand.length(); i++){
            if (String.valueOf(leftStrand.charAt(i)).equals(String.valueOf(rightStrand.charAt(i)))){
            } else {
                counter++;
            }
        }

        return counter;
    }

}
