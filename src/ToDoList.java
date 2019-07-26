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
	
	public void updateTask(Task task,String newDesc)
	{
		Task t = tasks.get(task.getDescription());
		t.setDescription(newDesc);
		
		
	}
	
	public void updatePriority(String desc, TASK_PRIORITY prio)
	{
		Task t = getTask(desc);
		t.setPriority(prio);
		tasks.replace(desc, t);
	}
	
	public Collection<Task> getInCompleteTasks()
	{
		HashMap<String, Task> iComplTasks = new HashMap<String, Task>(tasks);

		for (Task t : iComplTasks.values())
			if (t.isComplete())
				iComplTasks.remove(t.getDescription());

		return iComplTasks.values();
	}
}
