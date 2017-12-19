package ApcsBarry;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

import java.util.Random;
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("hobby") >= 0)
		{
			response = getRandomHobbyResponse()+"What about you?";
		}
		else if (statement.indexOf("play") >= 0)
		{
			response = "Wow. That's fun.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
	private String getRandomHobbyResponse()
	{
		Random rng = new Random();
		int whichResponse = rng.nextInt(3);
		String response = "";
		if (whichResponse == 0)
		{
			response = "I like chasing.";
		}
		else if (whichResponse == 1)
		{
			response = "I like swimming.";
		}
		else if (whichResponse == 2)
		{
			response = "I like basketball.";
		}
		
		return response;
	}
	private String getRandomHobbyResponse2()
	{
		String[] response= {"I like chasing.","I like swimming.","I like basketball."};
		double r = Math.random();
		int whichResponse = (int)(r * response.length);
		
		return response[whichResponse];
	}
}
