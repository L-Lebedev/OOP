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
    
    //Methods
    //Constructor 
    public Course(String name, int numCredits, String typology, String type, int numStudents, int numProfs){
        this.name = name;
        this.numCredits = numCredits;
        this.typology = typology;
        this.type = type;
        this.numStudents = numStudents;
        this.numProfs = numProfs;
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
    
}
