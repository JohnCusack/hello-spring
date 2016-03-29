package com.dark.hello.annotation.test;

import java.lang.reflect.Method;

import com.dark.hello.annotation.Todo;
import com.dark.hello.annotation.service.BusinessLogic;
/**
 * This Class demonstrates use of annotations using reflection.
 * @author Peker
 * @date   2016年3月29日下午6:35:06
 */
public class TodoReport {
    
    public TodoReport() {
        super();
    }
    public static void main(String[] args) {
        getTodoReportForBusinessLogic();
    }
    
    /**
     * This method iterates through all messages of BusinessLogic class and fetches annotations defined on each of them.
     * After that it displays the information from annotation accordingly.
     */
    private static void getTodoReportForBusinessLogic() {
        System.out.println("-------------------------------");
        Class businessLogicClass = BusinessLogic.class;
        for(Method method : businessLogicClass.getMethods()) {
            Todo todoAnnotation = (Todo) method.getAnnotation(Todo.class);
            if(todoAnnotation != null) {
                System.out.println("Method Name :" + method.getName());
                System.out.println("Author :" + todoAnnotation.author());
                System.out.println("Priority :" + todoAnnotation.priority());
                System.out.println("-------------------------------");
            }
        }
    }
}
