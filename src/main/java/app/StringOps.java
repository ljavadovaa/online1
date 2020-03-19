package app;

public class StringOps {

  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  String invertCase(String origin) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      while (c >= 97 && c <= 122){
        c = (char) (origin.charAt(i) - 32);
        sb.append(c);
      }
      while (c >= 65 && c <= 90){
        c = (char) (origin.charAt(i) + 32);
        sb.append(c);
      }
    }
    return sb.toString();

  }

  // abc -> ABC
  // aBc -> ABC
  // Abc -> ABC

  public static String toUpperCase(String origin) { // a -> A A -> A
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      while (c >= 97 && c <= 122)
      {
        c = (char) (origin.charAt(i) - 32);
        sb.append(c);
      }
    }
    return sb.toString();
  }

  // abc -> abc
  // aBc -> abc
  // Abc -> abc
  String toLowerCase(String origin) { // A -> a a -> a
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      while (c >= 65 && c <= 90)
      {
        c = (char) (origin.charAt(i) + 32);
        sb.append(c);
      }
    }
    return sb.toString();
  }

}