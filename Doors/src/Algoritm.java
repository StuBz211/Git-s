
@SuppressWarnings("serial")
public class Algoritm extends Windows{
	public Algoritm(int widht, int height) {
		super(widht, height);
	}
	public static int score = 0;

	public static void algoritm(int doorNumber)
	{	
		int monst = (int) (Math.random()*3);
		if (doorNumber == monst){
			cleanScore();
			
		}
		else {
			addScore();
			
		}
	}

	private static void addScore() {
		score += 1;
		System.out.println(score);
		
	}

	private static void cleanScore() {
		score = 0;
		System.out.println(score);
	}

	
}
