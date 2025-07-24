package DAY5;

interface Attendance {
 void markAttendance(String name);
}

class Student implements Attendance {
 public void markAttendance(String name) {
     System.out.println("Student " + name + " is marked present.");
 }
}

class Teacher implements Attendance {
 public void markAttendance(String name) {
     System.out.println("Teacher " + name + " is marked present.");
 }
}

public class AttendanceSystem {
 public static void main(String[] args) {
     Attendance student1 = new Student();
     Attendance teacher1 = new Teacher();

     student1.markAttendance("Alice");
     student1.markAttendance("Bob");

     teacher1.markAttendance("Mr. Smith");
     teacher1.markAttendance("Ms. Johnson");
 }
}
