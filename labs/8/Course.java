import java.util.ArrayList;


// JA: There is no class to test this.
class Course {
   //variables
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    
    //set course name
    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    //add student
    public void addStudent(String student) {
        students.add(student);
    }
    
    //array of students
    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }

    //number of students
    public int getNumberOfStudents() {
        return students.size();
    }
    
    //get course name
    public String getCourseName() {
        return courseName;
    }

    //drop student
    public void dropStudent(String student) {
        students.remove(student);
    }

    //clear students
    public void clear(){
        students.clear();
    }

}