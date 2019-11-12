package zipcode;

public class Hamming {

    public Hamming(String s, String s1) {

        if (s.length() < s1.length() || s.length() > s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        return -1;
    }
}
