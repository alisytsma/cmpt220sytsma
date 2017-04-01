
public class Problem3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //create course
      Course course = new Course("English 100");
      //add students
      course.addStudent("Peter Jones");
      course.addStudent("Brian Smith");
      course.addStudent("Anne Kennedy");
      //drop student
      course.dropStudent("Brian Smith");
      //get students
      for (int i = 0; i < course.getNumberOfStudents(); i++) {
          System.out.println(course.getStudents()[i]);
      }
   }
}