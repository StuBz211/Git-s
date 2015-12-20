import java.io.IOException;

public class Main {
	
	@SuppressWarnings("unused")
	private static Windows window;
	
	public static void main(String[] args) throws IOException
	{	

		setWindow(new Windows(508,  298));
}

	private static void setWindow( Windows window) {
		Main.window = window;
		
	}
}

