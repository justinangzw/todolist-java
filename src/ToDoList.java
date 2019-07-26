import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList
{
	private HashMap<String, Task> tasks = new HashMap<String, Task>();

	public boolean addTask(Task task)
	{
		return (tasks.put(task.getDescription(), task) == null) ? true : false;
	}

	public void completeTask(String description)
	{
		getTask(description).setComplete(true);
	}

	public boolean getStatus(String description)
	{
		return getTask(description).isComplete();
	}

	public Task getTask(String description)
	{
		return tasks.get(description);
	}

	public Task removeTask(String description)
	{
		return tasks.remove(description);
	}

	public Collection<Task> getAllTasks()
	{
		return tasks.values();
	}

	public Collection<Task> getCompletedTasks()
	{
		HashMap<String, Task> hComplTasks = new HashMap<String, Task>(tasks);

		for (Task t : hComplTasks.values())
			if (!t.isComplete())
				hComplTasks.remove(t.getDescription());

		return hComplTasks.values();
	}
}
