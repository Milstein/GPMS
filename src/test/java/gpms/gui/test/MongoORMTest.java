package gpms.gui.test;

import gpms.DAL.TodoDAO;
import gpms.model.Todo;

import java.net.UnknownHostException;

public class MongoORMTest {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		Todo todo = new Todo("Task 2 from Mongo ORM");
		todo.setCompleted(true);
		TodoDAO.saveTodo(todo);
		System.out.println("Todo persisted: ");
		for ( Todo t : TodoDAO.getAllTodos()){
			System.out.println(t);
			TodoDAO.setTodoAsCompleted(t);
		}
		
		System.out.println("Open Todos");
		for ( Todo t : TodoDAO.getOpenTodos()){
			System.out.println(t);
		}
	}

}
