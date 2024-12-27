/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sia;

/**
 *
 * @author pohlj
 */
public class Theoretical extends Course{
    int WeeklyLectures;
    int WeeklyHours;
    String[] books;
    
    public Theoretical(String name, int numCredits, String typology, String type, int numStudents, int numProfs,
            int WeeklyLectures, int WeeklyHours, String[] materials){
        
        super(name, numCredits, typology, type, numStudents, numProfs);
        this.WeeklyLectures = WeeklyLectures;
        this.WeeklyHours = WeeklyHours;
        this.books = materials;
    }
    
    @Override 
    public void informAbsencePercentage(){
        System.out.println("You have lost this course with 6 absences");
    } 
    
}
