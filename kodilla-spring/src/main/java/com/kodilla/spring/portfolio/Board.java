package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        //System.out.println("This is To Do List");
        return toDoList;
    }

    public TaskList getInProgressList() {
        //System.out.println("This is In Progress List");
        return inProgressList;
    }

    public TaskList getDoneList() {
        //System.out.println("This is Done List");
        return doneList;
    }
}
