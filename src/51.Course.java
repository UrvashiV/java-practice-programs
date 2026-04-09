 class Course {

    static int maxCapacity = 100;

    String courseName;
    int enrollment;
    String[] enrollmentStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollment=0;
        this.enrollmentStudents = new String[maxCapacity];
    }


    static void setMaxCap(int maxCapacity){
       Course.maxCapacity = maxCapacity;
    }

     void enrollment(String studentName){
        enrollmentStudents[enrollment] = studentName;
        enrollment++;
     }

     void unenrollStudent(String studentName){
         System.out.println("Student removed");
         enrollment--;
     }

}
