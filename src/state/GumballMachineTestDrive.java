package state;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine =
				new GumballMachine(20);

		for (int i = 0; i < 10; i++) {
			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
		}
	}
}
