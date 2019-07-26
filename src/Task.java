public class Task
{
	private String description = null;
	private boolean isComplete = false;
	private TASK_PRIORITY priority;

	public Task(String description)
	{
		super();
		this.description = description;
		this.priority = TASK_PRIORITY.LOW;
	}

	public Task(String description, boolean isComplete)
	{
		super();
		this.description = description;
		this.isComplete = isComplete;
		this.priority = TASK_PRIORITY.LOW;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public boolean isComplete()
	{
		return isComplete;
	}

	public void setComplete(boolean isComplete)
	{
		this.isComplete = isComplete;
	}

	public TASK_PRIORITY getPriority()
	{
		return this.priority;
	}
	
	public void setPriority(TASK_PRIORITY p)
	{
		this.priority = p;
	}
}
