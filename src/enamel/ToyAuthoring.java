package enamel;

public class ToyAuthoring {

	public static void main(String[] args) {
		try {
			GpioControllerContainer gpio = new GpioControllerContainer();
		} catch (UnsatisfiedLinkError e) {
			System.out.println("The system does not support the hardware Braille cell. The program will ignore any code pertaining to the hardware Braille Cell.");
		}
		ScenarioParser s = new ScenarioParser();
		//s.setScenarioFile("SampleScenarios/Scenario_" + 2 + ".txt");
		s.setScenarioFile("FactoryScenarios/Scenario_1.txt");
	}
}