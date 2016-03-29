package com.dark.hello.annotation.service;

import com.dark.hello.annotation.Todo;
import com.dark.hello.annotation.Todo.Priority;
import com.dark.hello.annotation.Todo.Status;

/**
 * This Class demonstrates use of Todo annotation defined in Todo.java
 * @author Peker
 * @date   2016年3月29日下午6:36:07
 */
public class BusinessLogic {

    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod() {
        // No Code Written yet
    }
    
    @Todo(author = "Uday", priority = Priority.MEDIUM, status = Status.STARTED)
    public void incompleteMethod() {
        System.err.println("This method is incomplete");
    }
}
