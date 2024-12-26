package sia;

/**
 *
 * @author lev
 */
public class Person{
    //Defining global characteristics of all persons in the system
    protected String name;
    protected String lastName;
    protected long id;
    protected int age;
    
    public Person(String name, String lastName, long id, int age){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }
    
    public String getData(){
        return("name (nombre): " + this.name + "\n" +
               "lastName (apellido): " + this.lastName + "\n" +
               "ID (identificacion): " + this.id + "\n" +
               "age (edad): " + this.age);
    }
    
    public String getData(String parameter){
        return switch (parameter.toLowerCase()) {
            case "name" -> "name (nombre): " + this.name + " " +
                "lastName (apellido): " + this.lastName;
            case "id" -> "ID (identificacion): " + this.id;
            case "age" -> "age (edad): " + this.age;
            default -> "";
        };
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public long getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    
    //Setters
    public void setName(String argument){
        this.name=argument;
    }
    public void setLastName(String argument){
        this.lastName=argument;
    }
    public void setId(long argument){
        this.id=argument;
    }
    public void setAge(int argument){
        this.age=argument;
    }
}
