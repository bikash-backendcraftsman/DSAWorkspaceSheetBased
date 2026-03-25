package tufPlus.string;

public class Isomerphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean val = isomorphicString(s,t);
        System.out.println(val);
    }

    public static boolean isomorphicString(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] != mapT[c2]) return false;
            // Mark the mapping with the index + 1 (to avoid default 0 confusion)
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }
        return true;
    }
}
