package interview.first_recurring;

import java.util.HashSet;

public class FirstRecurring {

    public static void main(String[] args) {
        System.out.println(firstRecurring("ABC"));
        System.out.println(firstRecurring("ABCA"));
        System.out.println(firstRecurring("ABCDBA"));
        System.out.println(firstRecurring("CBAABCA"));
        System.out.println(firstRecurring("CABDCD"));
    }
    public static char firstRecurring(String s) {
        HashSet chars = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (chars.contains(ch)) {
                return ch;
            }
            chars.add(ch);
        }
        return 'n';
    }
}
