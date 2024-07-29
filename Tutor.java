//package CW;


/**
 * TUTOR class with corresponding Attributes
 *
 * @author Ishwor Dhakal(NP05CP4A230019)
 * @version (a version number or a date)
 */
public class Tutor extends Teacher
{
    private double salary;
    private String specialization;
    private String academicqualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    // constructor
    public Tutor(int teacherid, String teachername,String teacheraddress, String workingtype, String employmentstatus,int workinghours, double salary, String specialization, String academicqualifications,int performanceIndex){
        super(teacherid,teachername,teacheraddress,workingtype,employmentstatus);
        super.setWorkinghours(workinghours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicqualifications = academicqualifications;
        this.performanceIndex = performanceIndex;
        isCertified = false;
    }
    
    // accessor method
    public double getSalary(){
        return this.salary;
    }
    
    public String getSpecialization(){
        return this.specialization;
    }
    
    public String getAcademicqualifications(){
        return this.academicqualifications;
    }
    
    public int getPerformanceIndex(){
        return this.performanceIndex;
    }
    
    public boolean getIsCertified(){
        return this.isCertified;
    }
    
    
    // set method
    public void set(double salary, int performanceIndex){
        int workinghours = super.getWorkinghours();// calling the value of workinghours from parent class
        if(performanceIndex > 5 && workinghours > 20){
            if(performanceIndex >= 5 && performanceIndex <= 7){
                double cash = salary * 0.05;
                double newSalary = salary + cash;
                this.salary = newSalary;
                isCertified = true;
                this.performanceIndex = performanceIndex;
                System.out.println("Selected tutor's salary has been increased!!");
            }
            else if(performanceIndex >= 8 && performanceIndex <= 9){
                double cash = salary * 0.010;
                double newSalary = salary + cash;
                this.salary = newSalary;
                isCertified = true;
                this.performanceIndex = performanceIndex;
                System.out.println("Selected tutor's salary has been increased!!");
            }
            else if(performanceIndex == 10){
                double cash = salary * 0.020;
                double newSalary = salary + cash;
                this.salary = newSalary;
                isCertified = true;
                this.performanceIndex = performanceIndex;
                System.out.println("Selected tutor's salary has been increased!!");
            }
        
            else{
                System.out.println("Working hours of the tutor doesnt fall in the criteria");
            }
        }
        else{
            System.out.println("Tutor is not certified yet!!");
        }
    }
    
    // removetutor method
    public void removetutor(){
        if(!isCertified){
            this.salary = 0;
            this.specialization = "";
            this.academicqualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor is removed successfully!!");
        }
        else{
            System.out.println("Tutor cannot be removed.");
        }
    }
    
    // display method for displaying the data of tutor
    public void display(){
        if(!isCertified){
        super.display();// calling the display method from parent class
        }
        else{
        super.display();  // calling the display method from parent class
        System.out.println("Tutor salary is "+ salary);
        System.out.println("Tutor specialization is " + specialization);
        System.out.println("Tutor academic qualification is " + academicqualifications);
        System.out.println("Tutor performance index is " + performanceIndex);
        }
    }
}