import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		for (;;)
		{
			System.out.println("To Do List Application :D");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Delete Task");
			System.out.println("99. Exit Application");
			System.out.print("Please enter the what you would like to do: ");

			int a = in.nextInt();

			if (a == 99)
				break;
			
			// System.out.println("You entered integer " + a);
		}

		in.close();
	}

}
