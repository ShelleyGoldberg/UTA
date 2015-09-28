import java.util.Scanner;
public class testActivity {

	public static void main(String[] args)
	{
		int first;
      String second;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter an integer value: ");
      first = keyboard.nextInt();
      System.out.print("Enter a word: ");
      second = keyboard.nextLine();
	}
}
