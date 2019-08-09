package test;

import model.Task;
import model.Todo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodoTest {

  private Todo todo;
  private Task task;

  @Before
  public void setUp(){
   todo = new Todo("Do Calculus homework");
   task = new Task("Practice problems #2", "10/04/18", "Library");
  }

  @Test
  public void testGetters() {
    assertEquals(todo.getDescription(), "Do Calculus homework" );

  }

  @Test
  public void testAddSubs(){
    assertEquals(todo.getSubTasks().size(), 0);
    todo.addDoable(task);
    assertEquals(todo.getSubTasks().size(), 1);
    assertTrue(todo.getSubTasks().contains(task));
  }

  @Test
  public void testRemoveSubs(){
    assertEquals(todo.getSubTasks().size(), 0);
    todo.addDoable(task);
    assertEquals(todo.getSubTasks().size(), 1);
    todo.removeDoable(task);
    assertEquals(todo.getSubTasks().size(), 0);
  }

  @Test
  public void testComplete() {
    assertFalse(todo.getStatus());
    todo.complete();
    assertTrue(todo.getStatus());
  }

}
