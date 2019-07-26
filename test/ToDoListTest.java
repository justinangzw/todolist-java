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
	//hi i am bing
	final String tDesc = "This do be a task mateys";
	final String updateDesc = "I have been updated matey";

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
	
	@Test
	public void testUpdateTask()
	{
		tdl.addTask(t);
		assertFalse(tdl.getAllTasks().isEmpty());
		Task testT = tdl.getTask(t.getDescription());
		testT.setDescription(updateDesc);
		assertEquals(updateDesc,t.getDescription());

	}
}
