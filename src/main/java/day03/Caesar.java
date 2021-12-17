package day03;

public class Caesar extends Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        char[] chars = input.toCharArray();

        for ( int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i]+offset);
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar(2);
        String inputWord = "abcd";
        System.out.println("Original word: "+inputWord);

        System.out.println("Encrypted word: "+caesar.encrypts(inputWord));
    }
}
