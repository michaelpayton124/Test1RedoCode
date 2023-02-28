import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter input");
    String input = scanner.nextLine();
    System.out.println(Pattern.matches("(b*ab*ab*)*|(a*ba*ba*)*(c|d)*|(cbadcbad)*", input));
  }
}
