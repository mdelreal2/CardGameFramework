public class TableException extends Exception
{
	//class that exists to be thrown whenever the user requests to access the ArrayList of players at an invalid index
	TableException(String message)
	{
		super(message);
	}
}
