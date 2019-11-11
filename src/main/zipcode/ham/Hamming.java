package ham;

public class Hamming {
    private char[] strand1;
    private char[] strand2;
    public Hamming(String s, String s1) throws IllegalArgumentException {
        this.strand1 = s.toCharArray();
        this.strand2 = s1.toCharArray();
        if (!validateEqualStrandLength()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {//throws IllegalArgumentException {
        int distance = 0;
        try {
            if (validateEqualStrandLength()) {
                for (int i = 0; i < strand1.length; i++) {
                    if (strand1[i] != strand2[i]) {
                        distance++;
                    }
                }
            }
        } catch(IllegalArgumentException e) {
            System.out.println(e.getStackTrace());
        }
        return distance;
    }

    public Boolean validateEqualStrandLength() {//} throws IllegalArgumentException {
        return (strand1.length == strand2.length);
    }
}
