package three;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'w', 'p'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 10);
        System.out.println(copyTo);
    }
}
