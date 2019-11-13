package zipcode;

public class Hamming {

    private String s1;
    private String s;


    public Hamming(String s, String s1) throws IllegalArgumentException {
        this.s = s;
        this.s1 = s1;

        if(s.length() != s1.length()) {
            throw new  IllegalArgumentException ("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        Integer counter = 0;
        if (s1.length() == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s1.charAt(i) != s.charAt(i)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
