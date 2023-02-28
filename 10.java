import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter input");
    String input = scanner.nextLine();
    Pattern Corn = Pattern.compile("([0-9]|[1-9]+[0-9]*|[0-7]+| 0[xX][0-9a-fA-F]+)(Ui64 | I64 | u | U | I |L )?", Pattern.CASE_INSENSITIVE);
    Matcher match = Corn.matcher(input);
    Boolean Wheat = match.find();
    if (Wheat) {
      System.out.println("It matches");
    } else {
      System.out.println("Nah lmao");
    }
  }
}