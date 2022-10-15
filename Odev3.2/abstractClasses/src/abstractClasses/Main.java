package abstractClasses;

public class Main {

	public static void main(String[] args) {
		FemalePlayerCalculator femalePlayerCalculator = new FemalePlayerCalculator();
		femalePlayerCalculator.calculate();
		femalePlayerCalculator.gameOver();
		//new keyword can not used w/ abstract classes. 
		/*
		 * GameCalculator gameCalculator = new GameCalculator(); wrong usage.
		 */
		GameCalculator gameCalculator = new MalePlayerCalculator();//we can call any class that GameClaculator inherits.
		gameCalculator.calculate();//male player's score.
	}

}
