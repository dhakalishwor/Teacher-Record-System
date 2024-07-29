//package CW;


/**
 * TEACHER class with corresponding attributes
 *
 * @author Ishwor Dhakal(NP05CP4A230019)
 * @version (a version number or a date)
 */
public class Teacher
{
    private int teacherid;
    private String teachername;
    private String teacheraddress;
    private String workingtype;
    private String employmentstatus;
    private int workinghours;
    
    //constructor
    public Teacher(int teacherid,String teachername, String teacheraddress, String workingtype, String employmentstatus){
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.teacheraddress = teacheraddress;
        this.workingtype = workingtype;
        this.employmentstatus = employmentstatus;
    }
    
    // accessor method
    public int getTeacherid(){
        return this.teacherid;    
    }
    
    public String getTeachername(){
        return teachername;
    }
    
    public String getTeacheraddress(){
        return teacheraddress;
    }
    
    public String getWorkingtype(){
        return workingtype;
    }
    
    public String getEmploymentstatus(){
        return employmentstatus;
    }
    
    public int getWorkinghours(){
        return workinghours;
    }
    //Settor method 
    public void setWorkinghours(int workinghours)
    {
        this.workinghours = workinghours;
    }
    
    //for displaying data: display method
    public void display(){
        System.out.println("Teacher id is " + teacherid);
        System.out.println("Teacher name is " + teachername);
        System.out.println("Teacher address is " + teacheraddress);
        System.out.println("Teacher working type is " + workingtype);
        System.out.println("Teacher employment status is " + employmentstatus);
        
        if(workinghours > 0){
            System.out.println("Teacher working hours is " + workinghours);
        }
        else{
            System.out.println("Teacher teaching hours is yet to be assigned");
        }
    }
}
