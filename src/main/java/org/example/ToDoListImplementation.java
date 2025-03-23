package org.example;

import java.sql.Connection;

public class ToDoListImplementation implements ToDoList{

    Connection conn = MysqlConection.getConnection();

    public ToDoListImplementation() throws ClassNotFoundException {
    }

    @Override
    public void listOfAllTask() {

    }

    @Override
    public void taskInProgress() {

    }

    @Override
    public void taskInPending() {

    }
}
