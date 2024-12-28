/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sia;

/**
 *
 * @author pohlj
 */
public class Student extends Person{
    public float finalGrade;
    
    public Student(String name, String lastName,long id, int age, float finalGrade, char gender){
        super(name, lastName, gender, id, age);
        this.finalGrade = finalGrade;
        this.gender = gender;
    }
    
    
   
    @Override
    public String getData(){
        return("name (nombre): " + this.name + "\n" +
               "lastName (apellido): " + this.lastName + "\n" +
               "ID (identificacion): " + this.id + "\n" +
               "age (edad): " + this.age + "\n" +
               "finalGrade (Nota final): " + this.finalGrade + "\n" +
               "gender (genero): " + this.gender + "\n");  
    }
    
    @Override
    public String getData(String parameter){
        return switch (parameter.toLowerCase()) {
            case "name" -> "name (nombre): " + this.name + " " +
                "lastName (apellido): " + this.lastName;
            case "id" -> "ID (identificacion): " + this.id;
            case "age" -> "age (edad): " + this.age;
            case "finalGrade" -> "finalGrade (Nota final): " + this.finalGrade;
            case "gender" -> "gender (genero): " + this.gender;
            default -> "";
        };
    }

    //Getter
    public float getFinalGrade() {
        return finalGrade;
    }
    
    public char getGender(){
        return gender;
    }

    //Setter

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }
    
    public void serGender(char gender){
        this.gender = gender;
    }
}