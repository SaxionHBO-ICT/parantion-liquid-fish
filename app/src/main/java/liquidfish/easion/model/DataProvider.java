package liquidfish.easion.model;


import java.util.ArrayList;

/**
 * Created by Rick on 31-5-2016.
 */
public abstract class DataProvider {

    public static ArrayList<Task> getTasks(){
        ArrayList<Task> list = new ArrayList();

        list.add(new Task(1, "testSender", "Task 1", "first task", 0, "http://www.randomlink.com"));
        list.add(new Task(2, "testSender", "Task 2", "second task", 0, "http://www.randomlink.com"));
        list.add(new Task(3, "testSender", "Task 3", "first task", 0, "http://www.randomlink.com"));
        list.add(new Task(3, "testSender", "Task 4", "second task", 0, "http://www.randomlink.com"));

        return list;
    }
}
