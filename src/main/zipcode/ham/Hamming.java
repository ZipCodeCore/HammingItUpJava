package ham;

public class Hamming {
    private String s;
    private String s1;

    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;

        if (!(s.length() == s1.length())) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int matchCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                matchCount++;
            }
        }
        return matchCount;
    }
}
