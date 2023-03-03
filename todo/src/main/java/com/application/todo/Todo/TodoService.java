package com.application.todo.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "stevie1","Learn AWS", 
							LocalDate.now().plusYears(1), false ));
		todos.add(new Todo(2, "stevie1","Learn DevOps", 
				LocalDate.now().plusYears(2), false ));
		todos.add(new Todo(3, "stevie1","Learn Full Stack Development", 
				LocalDate.now().plusYears(3), false ));
	}
	
}
