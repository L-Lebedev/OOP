package sia;

/**
 *
 * @author lev
 */
import java.util.Scanner;

public class Professor extends Person{
    private String[] assignedSubjects;
    private boolean[] workDays;
    private int dailyWorkload;
    private String aboutMe;
    
    //assigned
    public Professor(String name, String lastName, long id, int age, String[] assignedSubjects, boolean[] workDays, int dailyWorkload){
        super(name, lastName, id, age);
        this.assignedSubjects = assignedSubjects;
        this.workDays = workDays;
        this.dailyWorkload = dailyWorkload;
    }
    
    //On vacation
    public Professor(String name, String lastName, long id, int age){
        super(name, lastName, id, age);
    }
    
    //Complex funcfuzzyaletions
    @Override
    public String getData(){
        return super.getData() + "\n" +
                "Works on (trabaja): " + this.getWorkDaysString() + "\n" +
                "Subjects (materias): " + this.getSubjectListString() + "\n" +
                "Daily workload: " + this.dailyWorkload + " hours\n" +
                "About me: " + this.aboutMe;
    }
    
    public String getSubjectListString(){
        String output = "";
        for(String element : this.assignedSubjects){
            output = output + element + " ";
        }
        return output;
    }
    
    public String getWorkDaysString() {
        String[] dayNames = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String output = "";
        for (int i = 0; i < this.workDays.length; i++) {
            if (this.workDays[i]) {
                output += dayNames[i] + " ";
            }
        }
        return output.trim();
    }
    
    public String[] getWorkDaysStringArr() {
        String[] dayNames = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] output = {};
        for (int i = 0; i < this.workDays.length; i++) {
            if (this.workDays[i]) {
                stringAddX(output, dayNames[i]);
            }
        }
        return output;
    }
    
    //funcion estatica supongo??
    public static String[] stringAddX(String arr[], String x){
        int locallen = arr.length;
        String[] newarr = new String[locallen+1];
        System.arraycopy(arr, 0, newarr, 0, locallen);
        newarr[locallen] = x;

        return newarr;
    }
    
    public void setAboutMe(boolean console){
        if(console == true){
            Scanner inputGetter = new Scanner(System.in);
            this.aboutMe=inputGetter.next();
        }
        else if(console == false){
            throw new IllegalArgumentException("setAboutMe argument should be true for console mode");
        }
    }
    
    //Getters
    public String[] getAssignedSubjects(){
        return this.assignedSubjects;
    }
    public boolean[] getWorkDays(){
        return this.workDays;
    }
    public int getDailyWorkload(){
        return this.dailyWorkload;
    }
    public String getAboutMe(){
        return this.aboutMe;
    }
    
    //Setters
    public void setAssignedSubjects(String[] argument){
        this.assignedSubjects = argument;
    }
    public void setWorkDays(boolean[] argument){
        this.workDays = argument;
    }
    public void setDailyWorkload(int argument){
        this.dailyWorkload = argument;
    }
    public void setAboutMe(String argument){
        this.aboutMe=argument;
    }
}
