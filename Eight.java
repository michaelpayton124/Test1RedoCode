import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter input");
    String input = scanner.nextLine();
    Pattern Corn = Pattern.compile("([^\\[.]@]+.[^@]+[^@]+)+@([^-\\[.]]+[^-\\[.]][^\\[.]]*[^-\\[.]]).([^-\\[.]]+[^-\\[.]][^\\[.]]*[^-\\[.]])", Pattern.CASE_INSENSITIVE);
    Matcher match = Corn.matcher(input);
    Boolean Wheat = match.find();
    if (Wheat) {
      System.out.println("It matches");
    } else {
      System.out.println("Nah lmao");
    }
  }
}
