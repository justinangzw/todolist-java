import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main
{
	static ToDoList tdl;

	public static boolean addTask(String description)
	{
		return addTask(new Task(description, false));
	}

	public static boolean addTask(Task t)
	{
		return tdl.addTask(t);
	}

	public static void addTask(Scanner in)
	{
		System.out.print("Add Task: Enter a task description: ");
		String input = in.nextLine();
		if (addTask(input))
			System.out.println("Added new task successfully with desc: " + input);
		else
			System.out.println("Oops, there was an error adding your task :(");
	}

	public static void viewTasks()
	{
		Collection<Task> tal = tdl.getAllTasks();
		
		System.out.println("View All Tasks - There are currently " + tal.size() + " tasks in the list:");
		
		for(Task t : tal)
		{
			System.out.println("Task: " + t.getDescription());
		}
	}

	public static void main(String[] args)
	{
		tdl = new ToDoList();
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
			in.nextLine();

			switch (a)
			{
			case 1:
				addTask(in);
				break;
			case 2:
				viewTasks();
				break;
			case 99:
				in.close();
				System.out.println("Exited, goodbye! :)");
				return;
			}

			System.out.println("");
		}

	}

}
