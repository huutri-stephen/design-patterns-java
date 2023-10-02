import common.candy.Candy;
import common.factory.CandyFactory;
import common.type.CandyType;

public class Main {
	public static void main(String[] args) {
		Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
		System.out.println(hardCandy.getCandyName());
	}
}