//package CW;


/**
 * LECTURER class with corresponding attributes
 *
 * @author Ishwor Dhakal(NP05CP4A230019)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher
{
    private String department;
    private int yearsofexperience;
    private int gradedScore;
    private boolean hasGraded;
    
    //constructor
    public Lecturer(int teacherid,String teachername,String teacheraddress,String workingtype,String employmentstatus,int workinghours,String department,int yearsofexperience)
    {
        super(teacherid,teachername,teacheraddress,workingtype,employmentstatus);
        super.setWorkinghours(workinghours);
        this.department = department;
        this.yearsofexperience = yearsofexperience;
        this.hasGraded = false;
        this.gradedScore = 0;
    }
    
    //accessor method
    public String getDepartment(){
        return this.department;
    }
    
    public int getYearsofexperience(){
        return this.yearsofexperience;
    }
    
    public boolean getHasGraded(){
        return this.hasGraded;
    }
    
    public int getGradedScore(){
        return gradedScore;
    }
    
    // setter method 
    public int setGradedScore(int gradedScore){
         return this.gradedScore= gradedScore;
    }
    
    
    // for the grade of student of assignment
    public void gradeAssignment(int gradedScore, String department, int yearsofexperience){
        if(yearsofexperience >= 5 && this.department.equals(department)){
            hasGraded = true;
            this.gradedScore = gradedScore;
            if(gradedScore >= 70){
                System.out.println("You got A grade");
            }
            else if(gradedScore >= 60 && gradedScore < 70){
                System.out.println("You got B grade");
            }
            else if(gradedScore >= 50 && gradedScore < 60){
                System.out.println("You got C grade");
            }
            else if(gradedScore >= 40 && gradedScore < 50){
                System.out.println("You got D grade");
            }
            else if(gradedScore < 40){
                System.out.println("You got E grade");
            }
            else{
                System.out.println("Your marks are yet to be graded");
            }
        }
        else{
             System.out.println("Experience is not matched and department not matched.");   
        }
      }
      
    // for displaying the data of lecturer
    public void display(){
        super.display();// calling display method from parent class
        System.out.println("Lecturer belongs to this " +department);
        System.out.println("Lecturer has " + yearsofexperience + " of experience");
        System.out.println("Lecturer has graded "+ gradedScore + " score");
    }

}
