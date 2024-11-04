import java.util.Scanner;

/**
 * A simple class to run the Chatbot class.
 */
public class ChatbotRunner
{

	/**
	 * Create a Chatbot, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Chatbot csaBot = new Chatbot();
		
		System.out.println("\n**************************************************\n");
		System.out.println(csaBot.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (csaBot.getResponse(statement));
			statement = in.nextLine();
		}



	}

}
