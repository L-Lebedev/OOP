/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sia;
import java.util.Scanner;
/**
 *
 * @author pohlj
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //We start by declaring some students 
        
                     
        String name, lastName;
        long id;
        int age;
        float finalGrade;
        char gender;
        
        Student[] listOfStudents = new Student[2];
        
        System.out.println("Please introduce the information associated to the students: ");
                
        for(int ii = 0; ii < listOfStudents.length; ++ii){
            
            
            System.out.println("Information of student " + ii + " :");

            System.out.println("Name: ");
            name = input.nextLine();
            
            System.out.println("Last name: ");
            lastName = input.nextLine();
            
            System.out.println("Id: ");
            id = input.nextLong();
            
            System.out.println("Age: ");
            age = input.nextInt();
            
            System.out.println("Final grade: ");            
            finalGrade = input.nextFloat();
            
            System.out.println("Gender: ");
            gender = input.next().charAt(0);
            
            Student newStudent = new Student(name, lastName, id, age, finalGrade, gender);
            listOfStudents[ii] = newStudent;
            
            input.nextLine();
        }
        
        
        // Now we declare some courses 
        
        String[] books1 = {"Quantum Mechanics - Sakurai","Mathematical Methods - Arfken"};
        String[] books2 = {"Classical Electrodynamics - Jackson", "Electrodynamics - Zangwill"};
        String[] materials1 = {"X-ray diffractometer", "Kiln", "Magnetita"};
        
        Theoretical course1 = new Theoretical("Quantum Mechanics I", 4, "Disciplinar","Theoretical", 30, 1, 2,4,books1,listOfStudents);
        Lab course2 = new Lab("Characterization Techniques",3,"Disciplinar","Lab",25,2,2,4,materials1,listOfStudents);
        Theoretical course3 = new Theoretical("Electrodynamics I", 4, "Optativa","Theoretical",30,1,2,4,books2,listOfStudents);

        Course[] set1 = {course1,course3};
        Course[] set2 = {course2};
        
        
        // Now we declare some professors
            
        char gen = 'm';
        char gen2 = 'f';
        boolean[] days = {false,true,false,true,false};
                
        Professor professor1 = new Professor("George","Michael",gen,123456, 45, set1, days, 2);
        Professor professor2 = new Professor("Akira", "Kurosawa",gen,789544,65,set2,days,2);
        Professor professor3 = new Professor("Lea","Seydoux",gen2,458976,40,set2,days,2);

        //Now let us see the methods
        
       System.out.println("The data from one of the professors is: ");
       System.out.println("\n");
       
       
       System.out.println(professor1.getData());
       System.out.println("\n");

       System.out.println("The courses that he/she is teaching are:");
      
       professor1.getSubjectListString();
       System.out.println("\n");

        
       System.out.println("The information of one the courses offered this semesters is:");
       course1.reportCourseInfo();
       
       System.out.println("And we can see the details of one of the students that is taking this course:");
       
       course1.reportStudentsInfo(0);
       
       System.out.println("We can have more specific information: ");
       course1.reportStudentsInfo(0,true);
       
        
    }
}
