import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i < 100; i++) {
    System.out.println("Enter input");
    String input = scanner.nextLine();
    System.out.println(Pattern.matches("(\\/\\*).*(\\*\\/)", input));
  }
  }
}