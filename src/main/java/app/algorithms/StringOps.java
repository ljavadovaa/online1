package app.algorithms;

public class StringOps {
  String invertCaseV4(String origin) {
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      chars[i] = (char) (chars[i] ^ 32); // bit XOR operation
    }
    return new String(chars);
  }

  String toUpperCaseV2(String origin) { // a -> A A -> A
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      chars[i] = (chars[i] >= 'a') ? (char)(chars[i] - 32) : chars[i];
    }
    return new String(chars);
  }

  String toLowerCaseV2(String origin) { // A -> a a -> a
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      chars[i] = (chars[i] >= 'a') ? chars[i] : (char)(chars[i] + 32);
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    System.out.println(new StringOps().invertCaseV4("HelloWorld"));
    System.out.println(new StringOps().toUpperCaseV2("HelloWorld"));
    System.out.println(new StringOps().toLowerCaseV2("HelloWorld"));
  }

}