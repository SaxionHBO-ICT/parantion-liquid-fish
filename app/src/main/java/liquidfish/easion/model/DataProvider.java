package liquidfish.easion.model;


import java.util.ArrayList;

/**
 * Created by Rick on 31-5-2016.
 */
public abstract class DataProvider {

    private User user;

    public static ArrayList<Task> getTasks(){
        ArrayList<Task> list = new ArrayList();

        list.add(new Task(1, "Parantion", "Voortgang MOE", "first task", 0, "http://www.randomlink.com"));
        list.add(new Task(2, "Parantion", "Tweede vragenlijst", "second task", 1, "http://www.randomlink.com"));
        list.add(new Task(3, "Parantion", "MOE", "third task", 2, "http://www.randomlink.com"));

        return list;
    }

    //login:
    //https://easion.parantion.nl/api/?Action=Authenticate&Key=567dc9e3649c476a9e52bc8bf1ca30ea&Username=saxmoeuse01&Password=288116504f5e303e4be4ff1765b81f5d

    //getUserField:
    //https://easion.parantion.nl/api/?Action=GetUserField&Key=fbf59197049aa6a9726228394cdca84e&Uid=ef5190fe2d149812bf47836c26cbbe79&Var=firstname

    //setUserField:
    //https://easion.parantion.nl/api/?Action=SetUserField&Key=fbf59197049aa6a9726228394cdca84e&Uid=ef5190fe2d149812bf47836c26cbbe79&Var=firstname&Value=Henk

    //getTask:
    //https://easion.parantion.nl/api/?Action=GetTasks&Key=fbf59197049aa6a9726228394cdca84e&Uid=ef5190fe2d149812bf47836c26cbbe79



    //API links
    private String api = "https://easion.parantion.nl/api";
    private String oid = "567dc9e3649c476a9e52bc8bf1ca30ea";
    //worden opgeslagen aan de hand van authenticatie
    private String uid = "";
    private String sid = "";
    //Authenticate = api + authenticate + oid + &Username= + username + &Password= + password
    private String authenticate = "?Action=Authenticate&Key=";
    //GetUserField = api + userField + oid + &Username= + username + &Password= + password
    private String userField = "?Action=GetUserField&Key=";
    //SetUserField = api + userSetField + oid + &Username= + username + &Password= + password
    private String userSetField = "?Action=SetUserField&Key=";
    //GetTasks = api + tasks + oid + &Username= + username + &Password= + password
    private String tasks = "?Action=GetTaskField&Key=";


    public String getApi() {
        return api;
    }

    public String getOid() {
        return oid;
    }

    public String getUid() {
        return uid;
    }

    public String getSid() {
        return sid;
    }

    public String getAuthenticate() {
        return authenticate;
    }

    public String getUserField() {
        return userField;
    }

    public String getUserSetField() {
        return userSetField;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public User getUser(){
        return user.getCopy();
    }
}
