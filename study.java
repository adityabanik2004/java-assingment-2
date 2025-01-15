class Teacher {
    private String tname;
    private String subject;
    private int yrsofexp;

    // Getter and Setter methods
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYrsOfExp() {
        return yrsofexp;
    }

    public void setYrsOfExp(int yrsofexp) {
        this.yrsofexp = yrsofexp;
    }
}

class Student {
    private String sname;
    private String degree;
    private String college;

    // Getter and Setter methods
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

class Relationship {   // Establishes relation between Teacher and Student classes

    // Method to set details for Teacher
    public static void setTeacherDetails(Teacher tea, String tname, String subject, int yrsofexp) {
        tea.setTname(tname);
        tea.setSubject(subject);
        tea.setYrsOfExp(yrsofexp);
    }

    // Method to set details for Student
    public static void setStudentDetails(Student stud, String sname, String degree, String college) {
        stud.setSname(sname);
        stud.setDegree(degree);
        stud.setCollege(college);
    }

    public static void TeacherStudent(Teacher tea, Student stud) {
        System.out.println(stud.getSname() + " takes " + stud.getDegree() + " class under " + tea.getTname() + " Sir");
    }

    public static void TeacherStudentDetails(Teacher tea, Student stud) {
        System.out.println(tea.getTname() + " Sir teaches " + tea.getSubject() + " to " + stud.getSname() +
            " reading as " + stud.getDegree() + " in " + stud.getCollege() + " college");
    }

    public static void main(String args[]) { // Main method
        Teacher tea = new Teacher();
        setTeacherDetails(tea, "Amitava", "OOPS DESIGN", 10);  

        Student stud1 = new Student();
        setStudentDetails(stud1, "Aditya", "Java", "SNU");  

        Student stud2 = new Student();
        setStudentDetails(stud2, "Madhu", "Btech", "UEM");  

        // Using the static methods to establish teacher-student relationships
        TeacherStudent(tea, stud1);
        TeacherStudentDetails(tea, stud2);
    }
}
