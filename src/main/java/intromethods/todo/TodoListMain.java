package intromethods.todo;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodo("Kiseperni az udvart");
        todoList.addTodo("Megetetni a macskát");
        todoList.addTodo("Ebédet főzni");
        todoList.addTodo("Kimosni a szennyest");

        System.out.println(todoList);

        todoList.finishTodos("Megetetni a macskát");

        System.out.println(todoList);

        todoList.finishAllTodos(Arrays.asList("Ebédet főzni"));

        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());

    }
}