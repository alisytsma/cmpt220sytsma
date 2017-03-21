class Course {
   //variables
   private final String courseName;
   private String[] students = new String[30];
   private int numberOfStudents;
   //get course name
   Course(String courseName) {
       this.courseName = courseName;
   }
   //add student
   void addStudent(String student) {
       students[numberOfStudents] = student;
       numberOfStudents++;
   }
   //get students
   String[] getStudents() {
       return students;
   }
   //get number of students
   int getNumberOfStudents() {
       return numberOfStudents;
   }
   //get name of course
   String getCourseName() {
       return courseName;
   }
   //drop student
   void dropStudent(String student) {
       int index = 0;
       for (int i = 0; i < numberOfStudents; i++) {
          if (students[i].equals(student)) {
              index = i;
          }
       }
       if (index >= 0) {
           System.arraycopy(students, index + 1, students, index, numberOfStudents - index - 1);
       }
       students[--numberOfStudents] = null;
   }

   //clear class
   void clear() {
       students = new String[30];
       numberOfStudents = 0;
   }
}
