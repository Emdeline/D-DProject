import java.util.Scanner;

public class CreatingCharacter
	{

		public static void main(String[] args)
			{
				// have to choose class
				// have to choose race
				// random number of hit points 
				
				System.out.println("Okay, so lets start out with makeing a name that you want to be called thought out the campaign.");
				Scanner gameNameInput = new Scanner(System.in);
				String gameName = gameNameInput.nextLine();
				System.out.println("Thats an awesome name! " + gameName + " ;)");

			}

	}
