package sia;

/**
 *
 * @author lev
 */
public class Person{
    //Defining global characteristics of all persons in the system
    protected String name;
    protected String lastName;
    protected char gender;
    protected long id;
    protected int age;
    
    //Full
    public Person(String name, String lastName, char gender, long id, int age){
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.age = age;
    }
    
    //Empty
    public Person(){
        this.name = null;
        this.lastName = null;
        this.gender = '\u0000';
        this.id = -1;
        this.age = -1;
        
    }
    
    public String getData(){
        return("name (nombre): " + this.name + "\n" +
               "lastName (apellido): " + this.lastName + "\n" +
               "gender (genero): " + this.gender + "\n" +
               "ID (identificacion): " + this.id + "\n" +
               "age (edad): " + this.age);
    }
    
    //ttt tttt tttttttttttt lagggg ggg                                  ]]]]]
    public String getData(String parameter){
        return switch (parameter.toLowerCase()) {
            case "name" -> "name (nombre): " + this.name + " " +
                "lastName (apellido): " + this.lastName;
            case "gender" -> "gender (genero): " + this.gender;
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
    public char getGender(){
        return this.gender;
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
    public void setGender(char argument){
        this.gender=argument;
    }
    public void setId(long argument){
        this.id=argument;
    }
    public void setAge(int argument){
        this.age=argument;
    }
}
