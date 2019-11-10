package zipcode;

public class Hamming {
    private String s;
    private String s1;

    public Hamming(String s, String s1) throws IllegalArgumentException {
        this.s = s;
        this.s1 = s1;
        if (this.s.length() != this.s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

    }

    public int getHammingDistance() {

        Integer sum = 0;
        for (int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) != this.s1.charAt(i)) {
                sum++;
            }
        }

        return sum;
    }
}
