//package CW;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TeacherGUI {
    private JFrame frame;

    // JLabels for lecturer panel
    private JLabel LeTeacherId;
    private JLabel LeTeacherName;
    private JLabel LeAddress;
    private JLabel LeWorkingType;
    private JLabel LeEmployment;
    private JLabel LeWorkingHrs;
    private JLabel LeDepartment;
    private JLabel LeYrsofExp;

    // JLabels for tutor panel
    private JLabel TuTeacherId;
    private JLabel TuTeacherName;
    private JLabel TuAddress;
    private JLabel TuWorkingType;
    private JLabel TuEmployment;
    private JLabel TuWorkingHrs;
    private JLabel TuSalary;
    private JLabel TuSpecial;
    private JLabel TuAcaQUa;
    private JLabel TuPerIndex;

    // JLabels for set salary panel
    private JLabel setTeacherId;
    private JLabel setSalary;
    private JLabel setPerIndex;

    // JLabels for grade assignment panel
    private JLabel assignTeacherid;
    private JLabel assignGraded;
    private JLabel assignDepart;
    private JLabel assignYrs;

    // JLabels for remove tutor panel
    private JLabel rmvTeacherId;

    private JTextField LeteacherIdTF;
    private JTextField LeTeacherNameTF;
    private JTextField LeAddressTF;
    private JTextField LeWorkingTypeTF;
    private JTextField LeEmploymentTF;
    private JTextField LeWorkingHrsTF;
    private JTextField LeDepartmentTF;
    private JTextField LeYrsofExpTF;

    private JTextField TuTeacherIdTF;
    private JTextField TuTeacherNameTF;
    private JTextField TuAddressTF;
    private JTextField TuWorkingTypeTF;
    private JTextField TuEmploymentTF;
    private JTextField TuWorkingHrsTF;
    private JTextField TuSalaryTF;
    private JTextField TuSpecialTF;
    private JTextField TuAcaQUaTF;
    private JTextField TuPerIndexTF;

    private JTextField setTeacheridTF;
    private JTextField setSalaryTF;
    private JTextField setPerIndexTF;

    private JTextField assignTeacheridTF;
    private JTextField assignGradedTF;
    private JTextField assignDepartTF;
    private JTextField assignYrsTF;

    private JTextField rmvTeacheridTF;

    ArrayList<Teacher> teacherlist = new ArrayList<>();

    public TeacherGUI() {

        // Main Frame
        this.frame = new JFrame("Teacher Record System");
        frame.setSize(900, 550);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // lecturer panel
        JPanel lecturer = new JPanel();
        lecturer.setBounds(5, 5, 285, 390);
        lecturer.setLayout(null);
        lecturer.setBackground(Color.GRAY);
        lecturer.setBorder(BorderFactory.createTitledBorder("Lecturer"));
        frame.add(lecturer);

        // lecturer teacher id
        LeTeacherId = new JLabel("Teacher Id: ");
        LeTeacherId.setBounds(10, 15, 100, 20);
        lecturer.add(LeTeacherId);

        // lecturer teacher id textfield
        LeteacherIdTF = new JTextField();
        LeteacherIdTF.setBounds(160, 15, 100, 20);
        lecturer.add(LeteacherIdTF);

        // lecturer teacher name
        LeTeacherName = new JLabel("Teacher Name: ");
        LeTeacherName.setBounds(10, 50, 100, 20);
        lecturer.add(LeTeacherName);

        // lecturer teacher name textfield
        LeTeacherNameTF = new JTextField();
        LeTeacherNameTF.setBounds(160, 50, 100, 20);
        lecturer.add(LeTeacherNameTF);

        // lecturer Address
        LeAddress = new JLabel("Address: ");
        LeAddress.setBounds(10, 90, 100, 20);
        lecturer.add(LeAddress);

        // lecturer address textfield
        LeAddressTF = new JTextField();
        LeAddressTF.setBounds(160, 90, 100, 20);
        lecturer.add(LeAddressTF);

        // lecturer working type
        LeWorkingType = new JLabel("Working Type: ");
        LeWorkingType.setBounds(10, 130, 100, 20);
        lecturer.add(LeWorkingType);

        // lecturer working type textfield
        LeWorkingTypeTF = new JTextField();
        LeWorkingTypeTF.setBounds(160, 130, 100, 20);
        lecturer.add(LeWorkingTypeTF);

        // lecturer employment
        LeEmployment = new JLabel("Employment: ");
        LeEmployment.setBounds(10, 170, 100, 20);
        lecturer.add(LeEmployment);

        // lecturer employment text field
        LeEmploymentTF = new JTextField();
        LeEmploymentTF.setBounds(160, 170, 100, 20);
        lecturer.add(LeEmploymentTF);

        // lecturer working hours
        LeWorkingHrs = new JLabel("Working Hours: ");
        LeWorkingHrs.setBounds(10, 210, 100, 20);
        lecturer.add(LeWorkingHrs);

        // lecturer working hours text field
        LeWorkingHrsTF = new JTextField();
        LeWorkingHrsTF.setBounds(160, 210, 100, 20);
        lecturer.add(LeWorkingHrsTF);

        // lecturer department
        LeDepartment = new JLabel("Department: ");
        LeDepartment.setBounds(10, 250, 100, 20);
        lecturer.add(LeDepartment);

        // lecturer department textfield
        LeDepartmentTF = new JTextField();
        LeDepartmentTF.setBounds(160, 250, 100, 20);
        lecturer.add(LeDepartmentTF);

        // lecturer years of experience
        LeYrsofExp = new JLabel("Years Of Experience: ");
        LeYrsofExp.setBounds(10, 290, 160, 20);
        lecturer.add(LeYrsofExp);

        // lecturer year of experience text field
        LeYrsofExpTF = new JTextField();
        LeYrsofExpTF.setBounds(160, 290, 100, 20);
        lecturer.add(LeYrsofExpTF);

        // lecturer add method
        JButton LeAdd = new JButton("Add Lecturer");
        LeAdd.setBounds(70, 330, 150, 40);
        lecturer.add(LeAdd);
        LeAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addLecturer();
            };
        });

        // tutor panel
        JPanel tutor = new JPanel();
        tutor.setBounds(295, 5, 285, 500);
        tutor.setLayout(null);
        tutor.setBackground(Color.GRAY);
        tutor.setBorder(BorderFactory.createTitledBorder("Tutor"));
        frame.add(tutor);

        // tutor teacher id
        TuTeacherId = new JLabel("Teacher Id: ");
        TuTeacherId.setBounds(5, 15, 100, 20);
        tutor.add(TuTeacherId);

        // tutor teacher id text field
        TuTeacherIdTF = new JTextField();
        TuTeacherIdTF.setBounds(160, 15, 100, 20);
        tutor.add(TuTeacherIdTF);

        // tutor teaacher name
        TuTeacherName = new JLabel("Teacher Name: ");
        TuTeacherName.setBounds(5, 50, 100, 20);
        tutor.add(TuTeacherName);

        // tutor teacher name text field
        TuTeacherNameTF = new JTextField();
        TuTeacherNameTF.setBounds(160, 50, 100, 20);
        tutor.add(TuTeacherNameTF);

        // tutor address
        TuAddress = new JLabel("Address: ");
        TuAddress.setBounds(5, 90, 100, 20);
        tutor.add(TuAddress);

        // tutor address text field
        TuAddressTF = new JTextField();
        TuAddressTF.setBounds(160, 90, 100, 20);
        tutor.add(TuAddressTF);

        // tutor working type
        TuWorkingType = new JLabel("Working Type: ");
        TuWorkingType.setBounds(5, 130, 100, 20);
        tutor.add(TuWorkingType);

        // tutor working type textfield
        TuWorkingTypeTF = new JTextField();
        TuWorkingTypeTF.setBounds(160, 130, 100, 20);
        tutor.add(TuWorkingTypeTF);

        // tutor employment
        TuEmployment = new JLabel("Employment: ");
        TuEmployment.setBounds(5, 170, 100, 20);
        tutor.add(TuEmployment);

        // tutor employment text field
        TuEmploymentTF = new JTextField();
        TuEmploymentTF.setBounds(160, 170, 100, 20);
        tutor.add(TuEmploymentTF);

        // tutor working hours
        TuWorkingHrs = new JLabel("Working Hours: ");
        TuWorkingHrs.setBounds(5, 210, 100, 20);
        tutor.add(TuWorkingHrs);

        // tutor working hours text field
        TuWorkingHrsTF = new JTextField();
        TuWorkingHrsTF.setBounds(160, 210, 100, 20);
        tutor.add(TuWorkingHrsTF);

        // tutor salary
        TuSalary = new JLabel("Salary: ");
        TuSalary.setBounds(5, 250, 100, 20);
        tutor.add(TuSalary);

        // tutor salary text field
        TuSalaryTF = new JTextField();
        TuSalaryTF.setBounds(160, 250, 100, 20);
        tutor.add(TuSalaryTF);

        // tutor specialization
        TuSpecial = new JLabel("Specialization:");
        TuSpecial.setBounds(5, 290, 100, 20);
        tutor.add(TuSpecial);

        // tutor specialization text field
        TuSpecialTF = new JTextField();
        TuSpecialTF.setBounds(160, 290, 100, 20);
        tutor.add(TuSpecialTF);

        // tutor academic qualification
        TuAcaQUa = new JLabel("Academic Qualification: ");
        TuAcaQUa.setBounds(5, 330, 150, 20);
        tutor.add(TuAcaQUa);

        // tutor academic qualification text field
        TuAcaQUaTF = new JTextField();
        TuAcaQUaTF.setBounds(160, 330, 100, 20);
        tutor.add(TuAcaQUaTF);

        // tutor performance index
        TuPerIndex = new JLabel("Performance Index: ");
        TuPerIndex.setBounds(5, 370, 140, 20);
        tutor.add(TuPerIndex);

        // tutor performance index text field
        TuPerIndexTF = new JTextField();
        TuPerIndexTF.setBounds(160, 370, 100, 20);
        tutor.add(TuPerIndexTF);

        // add tutor method
        JButton tuAdd = new JButton("Add Tutor");
        tuAdd.setBounds(80, 430, 120, 40);
        tutor.add(tuAdd);
        tuAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTutor();
            };
        });

        // set salary panel
        JPanel setSal = new JPanel();
        setSal.setBounds(585, 5, 295, 190);
        setSal.setLayout(null);
        setSal.setBackground(Color.GRAY);
        setSal.setBorder(BorderFactory.createTitledBorder("Set Salary"));
        frame.add(setSal);

        // set salary teacher id
        setTeacherId = new JLabel("Teacher ID:");
        setTeacherId.setBounds(10, 15, 100, 20);
        setSal.add(setTeacherId);

        // text field for teacherid
        setTeacheridTF = new JTextField();
        setTeacheridTF.setBounds(150, 15, 100, 20);
        setSal.add(setTeacheridTF);

        // salary of setsalary
        setSalary = new JLabel("Salary: ");
        setSalary.setBounds(10, 50, 100, 20);
        setSal.add(setSalary);

        setSalaryTF = new JTextField();
        setSalaryTF.setBounds(150, 50, 100, 20);
        setSal.add(setSalaryTF);

        setPerIndex = new JLabel("Performance Index: ");
        setPerIndex.setBounds(10, 90, 120, 20);
        setSal.add(setPerIndex);

        setPerIndexTF = new JTextField();
        setPerIndexTF.setBounds(150, 90, 100, 20);
        setSal.add(setPerIndexTF);

        // set salary button
        JButton setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBounds(80, 130, 120, 40);
        setSal.add(setSalaryBtn);
        setSalaryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSalary();
            }
        });

        // grade assignment panel
        JPanel gradeAssign = new JPanel();
        gradeAssign.setBounds(585, 200, 295, 220);
        gradeAssign.setLayout(null);
        gradeAssign.setBackground(Color.GRAY);
        gradeAssign.setBorder(BorderFactory.createTitledBorder("Grade Assignment"));
        frame.add(gradeAssign);

        // gradeassign teacherid
        assignTeacherid = new JLabel("Teacher id: ");
        assignTeacherid.setBounds(10, 15, 100, 20);
        gradeAssign.add(assignTeacherid);

        assignTeacheridTF = new JTextField();
        assignTeacheridTF.setBounds(150, 15, 100, 20);
        gradeAssign.add(assignTeacheridTF);

        // graded score
        assignGraded = new JLabel("Graded Score: ");
        assignGraded.setBounds(10, 50, 100, 20);
        gradeAssign.add(assignGraded);

        assignGradedTF = new JTextField();
        assignGradedTF.setBounds(150, 50, 100, 20);
        gradeAssign.add(assignGradedTF);

        assignDepart = new JLabel("Department: ");
        assignDepart.setBounds(10, 90, 100, 20);
        gradeAssign.add(assignDepart);

        assignDepartTF = new JTextField();
        assignDepartTF.setBounds(150, 90, 100, 20);
        gradeAssign.add(assignDepartTF);

        assignYrs = new JLabel("Years of Experience: ");
        assignYrs.setBounds(10, 130, 150, 20);
        gradeAssign.add(assignYrs);

        assignYrsTF = new JTextField();
        assignYrsTF.setBounds(150, 130, 100, 20);
        gradeAssign.add(assignYrsTF);

        // grade Assignment button
        JButton gradedAssignBtn = new JButton("Graded Assignment");
        gradedAssignBtn.setBounds(80, 170, 150, 40);
        gradeAssign.add(gradedAssignBtn);
        gradedAssignBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gradeAssignment();
            }
        });

        // remove tutor panel
        JPanel rmvTut = new JPanel();
        rmvTut.setBounds(5, 400, 285, 105);
        rmvTut.setLayout(null);
        rmvTut.setBackground(Color.GRAY);
        rmvTut.setBorder(BorderFactory.createTitledBorder("Remove Tutor"));
        frame.add(rmvTut);

        // teacher id for remove tutor
        rmvTeacherId = new JLabel("Teaacher Id: ");
        rmvTeacherId.setBounds(10, 15, 100, 20);
        rmvTut.add(rmvTeacherId);

        rmvTeacheridTF = new JTextField();
        rmvTeacheridTF.setBounds(150, 15, 100, 20);
        rmvTut.add(rmvTeacheridTF);

        // remove tutor button
        JButton rmvTutBtn = new JButton("Remove Tutor");
        rmvTutBtn.setBounds(80, 50, 120, 40);
        rmvTut.add(rmvTutBtn);
        rmvTutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTutor();
            }
        });

        // buttons panel
        JPanel buttons = new JPanel();
        buttons.setBounds(585, 425, 295, 80);
        buttons.setLayout(null);
        buttons.setBackground(Color.GRAY);
        buttons.setBorder(BorderFactory.createTitledBorder("Buttons"));
        frame.add(buttons);

        // display button
        JButton display = new JButton("Display");
        display.setBounds(30, 25, 100, 40);
        buttons.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Teacher teacher : teacherlist) {
                    teacher.display();
                }
            }
        });

        // clear button
        JButton clear = new JButton("Clear");
        clear.setBounds(170, 25, 100, 40);
        buttons.add(clear);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        frame.setVisible(true);

    }

    private void addLecturer() {
        try {
            int teacherId = Integer.parseInt(LeteacherIdTF.getText());
            String teacherName = LeTeacherNameTF.getText();
            String address = LeAddressTF.getText();
            String workingType = LeWorkingTypeTF.getText();
            String employmentStatus = LeEmploymentTF.getText();
            String department = LeDepartmentTF.getText();
            int workingHours = Integer.parseInt(LeWorkingHrsTF.getText());
            int yearsOfExperience = Integer.parseInt(LeYrsofExpTF.getText());

            // Validate input fields
            if (teacherId <= 0 || workingHours <= 0 || yearsOfExperience < 0 ||
                    teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty() ||
                    employmentStatus.isEmpty() || department.isEmpty()) {
                throw new IllegalArgumentException("Invalid input. Please fill all the fields with valid data.");
            }
            if (!isIDUnique(teacherId)) {
                JOptionPane.showMessageDialog(frame, "Teacher Id already exist");
                return;
            }

            Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType,
                    employmentStatus, workingHours, department, yearsOfExperience);

            teacherlist.add(lecturer);

            JOptionPane.showMessageDialog(frame, "Lecturer added successfully");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid values.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addTutor() {
        try {
            int teacherId = Integer.parseInt(TuTeacherIdTF.getText());
            String teacherName = TuTeacherNameTF.getText();
            String address = TuAddressTF.getText();
            String workingType = TuWorkingTypeTF.getText();
            String employmentStatus = TuEmploymentTF.getText();
            int workingHours = Integer.parseInt(TuWorkingHrsTF.getText());
            double salary = Double.parseDouble(TuSalaryTF.getText());
            String specialization = TuSpecialTF.getText();
            String academicQualifications = TuAcaQUaTF.getText();
            int performanceIndex = Integer.parseInt(TuPerIndexTF.getText());

            // Validate input fields
            if (teacherId <= 0 || workingHours <= 0 || salary <= 0 ||
                    teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty() ||
                    employmentStatus.isEmpty() || specialization.isEmpty() || academicQualifications.isEmpty()) {
                throw new IllegalArgumentException("Invalid input. Please fill all the fields with valid data.");
            }

            if (!isIDUnique(teacherId)) {
                JOptionPane.showMessageDialog(frame, "Teacher Id already exist");
                return;
            }
            Tutor tutor = new Tutor(teacherId, teacherName, address, workingType,
                    employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);

            teacherlist.add(tutor);

            JOptionPane.showMessageDialog(frame, "Tutor added successfully");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid values.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void gradeAssignment() {
        try {
            int teacherID = Integer.parseInt(assignTeacheridTF.getText());
            int score = Integer.parseInt(assignGradedTF.getText());
            String department = assignDepartTF.getText();
            int experience = Integer.parseInt(assignYrsTF.getText());

            if (teacherID <= 0 || score < 0 || experience < 0 || department.isEmpty()) {
                throw new IllegalArgumentException("Invalid input. Please fill all the fields with valid data.");
            }

            Teacher teacher = getTeacherByID(teacherID);
            if (teacher == null) {
                throw new IllegalArgumentException("Teacher with ID " + teacherID + " not found.");
            }

            if (experience < 5) {
                throw new IllegalArgumentException(
                        "Teachers must have more than 5 years of experience to grade assignments.");
            }

            if (!(teacher instanceof Lecturer)) {
                throw new IllegalArgumentException("Only lecturers can grade assignments.");
            }
            Lecturer lecturer = (Lecturer) teacher;

            // Check if department matches
            if (!lecturer.getDepartment().equalsIgnoreCase(department)) {
                throw new IllegalArgumentException("Lecturer's department does not match the specified department.");
            }

            int Question = JOptionPane.showConfirmDialog(frame, "Teacher Id:"+teacherID+"Grade Score"+score+"Department"+department+"Years Of Experience"+experience,"Confirmation",JOptionPane.YES_NO_OPTION);
            if(Question == JOptionPane.YES_OPTION){
                lecturer.gradeAssignment(score, department, experience);
                JOptionPane.showMessageDialog(frame, "Assignment graded successfully.");
            }else{
                JOptionPane.showMessageDialog(frame,"Cant grade assignment","Wrong",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        LeteacherIdTF.setText("");
        LeTeacherNameTF.setText("");
        LeAddressTF.setText("");
        LeWorkingTypeTF.setText("");
        LeEmploymentTF.setText("");
        LeWorkingHrsTF.setText("");
        LeDepartmentTF.setText("");
        LeYrsofExpTF.setText("");

        TuTeacherIdTF.setText("");
        TuTeacherNameTF.setText("");
        TuAddressTF.setText("");
        TuWorkingTypeTF.setText("");
        TuEmploymentTF.setText("");
        TuWorkingHrsTF.setText("");
        TuSalaryTF.setText("");
        TuSpecialTF.setText("");
        TuAcaQUaTF.setText("");
        TuPerIndexTF.setText("");

        setTeacheridTF.setText("");
        setSalaryTF.setText("");
        setPerIndexTF.setText("");

        assignTeacheridTF.setText("");
        assignGradedTF.setText("");
        assignDepartTF.setText("");
        assignYrsTF.setText("");
    }

    private void removeTutor() {
        try {
            int teacherId = Integer.parseInt(rmvTeacheridTF.getText());

            // Validate input fields
            if (teacherId <= 0) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid teacher ID.");
            }

            Teacher teacher = getTeacherByID(teacherId);
            if (teacher == null) {
                throw new IllegalArgumentException("Teacher with ID " + teacherId + " not found.");
            }

            if (!(teacher instanceof Tutor)) {
                throw new IllegalArgumentException("The teacher with ID " + teacherId + " is not a Tutor.");
            }
            Tutor Tutor = (Tutor) teacher;
            if (Tutor.getIsCertified() == true) {
                JOptionPane.showMessageDialog(frame, "Cannot remove the tutor. Tutor is certified.");
                return; // Stop further execution
            }
            int Question = JOptionPane.showConfirmDialog(frame, "Teacher Id:"+teacherId,"Confirmation",JOptionPane.YES_NO_OPTION);
            if(Question == JOptionPane.YES_OPTION){
                teacherlist.remove(teacher);
                JOptionPane.showMessageDialog(frame, "Tutor removed successfully");
            }else{
                JOptionPane.showMessageDialog(frame,"Cannot be removed","Wrong",JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid  value for Teacher ID.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setSalary() {
        try {
            int teacherId = Integer.parseInt(setTeacheridTF.getText());
            double salary = Double.parseDouble(setSalaryTF.getText());
            int performanceIndex = Integer.parseInt(setPerIndexTF.getText());

            // Validate input fields
            if (teacherId <= 0 || salary <= 0 || performanceIndex <= 0) {
                throw new IllegalArgumentException("Invalid input. Please fill all the fields with valid data.");
            }

            Teacher teacher = getTeacherByID(teacherId);
            if (teacher == null) {
                throw new IllegalArgumentException("Teacher with ID " + teacherId + " not found.");
            }

            if (!(teacher instanceof Tutor)) {
                throw new IllegalArgumentException("Only tutors can have their salary set.");
            }
            Tutor tutor = (Tutor) teacher;
            int Question = JOptionPane.showConfirmDialog(frame, "Teacher Id:"+teacherId+"Salary"+salary+"Permormance Index"+performanceIndex,"Confirmation",JOptionPane.YES_NO_OPTION);
            if(Question == JOptionPane.YES_OPTION){
                tutor.set(salary, performanceIndex);
                JOptionPane.showMessageDialog(frame, "Salary for Tutor with ID " + teacherId + " set successfully.");
            }else{
                JOptionPane.showMessageDialog(frame,"Cannot set salary","Wrong",JOptionPane.ERROR_MESSAGE);
            }} 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Please enter valid values for Teacher ID, Salary, and Performance Index.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Teacher getTeacherByID(int teacherID) {
        for (Teacher teacher : teacherlist) {
            if (teacher.getTeacherid() == teacherID) {
                return teacher;
            }
        }
        return null; // Teacher not found
    }

    public boolean isIDUnique(int teacherID) {
        for (Teacher teacher : teacherlist) {
            if (teacher.getTeacherid() == teacherID) {
                return false; // ID is not unique
            }
        }
        return true; // ID is unique
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
