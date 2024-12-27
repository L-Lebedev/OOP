/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sia;

/**
 *
 * @author pohlj
 */
public class Lab extends Course{
    
    int WeeklyLectures;
    int WeeklyHours;
    String[] materials;
    
    public Lab(String name, int numCredits, String typology, String type, int numStudents, int numProfs,
            int WeeklyLectures, int WeeklyHours, String[] materials){
        
        super(name, numCredits, typology, type, numStudents, numProfs);
        this.WeeklyLectures = WeeklyLectures;
        this.WeeklyHours = WeeklyHours;
        this.materials = materials;
    }
    
    @Override 
    public void informAbsencePercentage(){
        System.out.println("You have lost this course with 3 absences");
    } 
    
    
    
    
    
}
