package week06d05;

public class User {

    private static final String DEFAULT_NAME = "anonymus";
private String name = DEFAULT_NAME;

public User (){

}

public User (String name){
    this.name = name;
}
protected String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}

}
