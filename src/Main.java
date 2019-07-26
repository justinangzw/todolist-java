import java.util.Scanner;

public class Main
{
	ToDoList tdl;

	public void addTask(String description)
	{
		addTask(new Task(description, false));
	}

	public void addTask(Task t)
	{
		tdl.addTask(t);
	}

	static void doMain(Scanner in)
	{
		for (;;)
		{
			System.out.println("To Do List Application :D");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Delete Task");
			System.out.println("99. Exit Application");
			System.out.print("Please enter the what you would like to do: ");

			int a = in.nextInt();

			switch (a)
			{
			case 1:
				break;
			case 99:
				return;
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		doMain(in);
		in.close();
		
		System.out.println("Exited, goodbye! :)");
	}

}
