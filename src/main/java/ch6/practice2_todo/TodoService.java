package ch6.practice2_todo;

import java.util.List;

public interface TodoService { // talks to the database

	public List<String> retrieveTodos(String user);

	void deleteTodo(String todo);

}