package liquidfish.easion.model;


import java.util.ArrayList;

/**
 * Created by Rick on 31-5-2016.
 */
public abstract class DataProvider {

    public static ArrayList<Task> getTasks(){
        ArrayList<Task> list = new ArrayList();

        list.add(new Task(1, "Parantion", "Voortgang MOE", "first task", 0, "http://www.randomlink.com"));
        list.add(new Task(2, "Parantion", "Tweede vragenlijst", "second task", 0, "http://www.randomlink.com"));
        list.add(new Task(3, "Parantion", "MOE", "third task", 0, "http://www.randomlink.com"));

        return list;
    }
}
