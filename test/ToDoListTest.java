import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;

public class ToDoListTest extends TestCase
{
	// Define Test Fixtures
	ToDoList tdl;
	Task t;
 ////i am here testing the code
	final String tDesc = "This do be a task mateys";

	public ToDoListTest()
	{
		super();
	}

	@Before
	public void setUp() throws Exception
	{
		// Initialise Test Fixtures
		tdl = new ToDoList();
		t = new Task(tDesc, false);
	}

	@After
	public void tearDown() throws Exception
	{
		// Uninitialise test Fixtures
	}

	@Test
	public void testGetAllTasks()
	{
		// Check if new Todo List
		assertTrue(tdl.getAllTasks().isEmpty());
		tdl.addTask(t);
		assertFalse(tdl.getAllTasks().isEmpty());
	}

	@Test
	public void testAddTask()
	{
		assertTrue(tdl.getAllTasks().isEmpty());
		tdl.addTask(t);
		assertFalse(tdl.getAllTasks().isEmpty());
	}

	@Test
	public void testgetStatus()
	{
		tdl.addTask(t);
		assertEquals(tdl.getStatus(tDesc), false);
	}

	@Test
	public void testRemoveTask()
	{
		tdl.addTask(t);
		assertFalse(tdl.getAllTasks().isEmpty());
		tdl.removeTask(tDesc);
		assertTrue(tdl.getAllTasks().isEmpty());
	}

	@Test
	public void testGetCompletedTasks()
	{
		tdl.addTask(t);
		Collection<Task> cTask = tdl.getCompletedTasks();
		assertTrue(cTask.isEmpty());
		tdl.completeTask(tDesc);
		cTask = tdl.getCompletedTasks();
		assertFalse(cTask.isEmpty());
	}
}
