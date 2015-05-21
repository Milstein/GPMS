package gpms.gui;

import gpms.DAL.TodoDAO;
import gpms.model.Todo;

import java.net.UnknownHostException;
import java.util.List;

public class TodoAppRunner {

	public static void main(String[] args) throws UnknownHostException {
		try {
			Todo todo = new Todo("Task 1 from Command Line");
			TodoDAO.saveTodo(todo);

			todo = new Todo("Task 2 from Command Line");
			TodoDAO.saveTodo(todo);

			todo = new Todo("Task 3 from Command Line");
			TodoDAO.saveTodo(todo);

			List<Todo> allTodos = TodoDAO.getAllTodos();
			for (Todo aTodo : allTodos) {
				System.out.println(aTodo);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
