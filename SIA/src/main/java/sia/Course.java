/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sia;

/**
 *
 * @author pohlj
 */
public class Course {
    
    //Atributes
    private String name;
    private int numCredits;
    private String typology;
    private String type;
    private int numStudents;
    private int numProfs;
    private Student[] students;
    
    //Methods
    //Constructor 
    public Course(String name, int numCredits, String typology, String type, int numStudents, int numProfs, Student[] students){
        this.name = name;
        this.numCredits = numCredits;
        this.typology = typology;
        this.type = type;
        this.numStudents = numStudents;
        this.numProfs = numProfs;
        this.students = students;
    }
    
    //getters
    public String getName(){
        return name;
    }
    
    public int getNumCredits(){
        return numCredits;
    }
    
    public String getTypology(){
        return typology;
    }
    
    public String getType(){
        return type;
    }
    
    public int getNumStudents(){
        return numStudents;
    }
    
    public int getNumProfs(){
        return numProfs;
    }
    
    //setters 
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNumCredits(int numCredits){
        this.numCredits = numCredits;
    }
    
    public void setTypology(String typology){
        this.typology = typology;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setNumStudents(int numStudents){
        this.numStudents = numStudents;
    }
    
    public void setNumProfs(int numProfs){
        this.numProfs = numProfs;
    }
    
    //Other methods 
    
    public void updateNumStudents(int droppedStudents){
        int actualNum = getNumStudents();
        this.setNumStudents(actualNum-droppedStudents);
    }
    
    public void informAbsencePercentage(){
        System.out.println("You have lost this course with 6 absences");
    }
    
    public void reportStudentsInfo(int ii){
        System.out.println("The data from the " + ii + " students is: ");
        System.out.println(this.students[ii].getName());
    }
    
    public void reportStudentsInfo(int ii, boolean Flag){
        if(Flag){
        System.out.println("The data from the " + ii + " students is: ");
        System.out.println("Name: " + this.students[ii].getName());
        System.out.println("Last name: " + this.students[ii].getLastName());
        System.out.println("Id: " + this.students[ii].getId());
        System.out.println("Age: " + this.students[ii].getAge());

        }
    }
    
    public void reportCourseInfo(){
        //String name, int numCredits, String typology, String type, int numStudents, int numProfs, Student[] students
        System.out.println("Name: " + name);
        System.out.println("Credits: " + numCredits);
        System.out.println("Typology: " + typology);
        System.out.println("Type: " + type);     
    }
}
