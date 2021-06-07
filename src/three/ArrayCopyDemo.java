package three;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'w', 'p'};
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println(copyTo);

    }
}
