public class Student {
    private String stdName;
    private int stdId;
    private String dept;
    private int marks;



    public Student(String stdName, int stdId, String dept, int marks) {
        this.stdName = stdName;
        this.stdId = stdId;
        this.dept = dept;
        this.marks = marks;
    }



    public String getStdName() {
        return stdName;
    }



    public void setStdName(String stdName) {
        this.stdName = stdName;
    }



    public int getStdId() {
        return stdId;
    }



    public void setStdId(int stdId) {
        this.stdId = stdId;
    }



    public String getDept() {
        return dept;
    }



    public void setDept(String dept) {
        this.dept = dept;
    }



    public int getMarks() {
        return marks;
    }



    public void setMarks(int marks) {
        this.marks = marks;
    }



    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", stdId=" + stdId +
                ", dept='" + dept + '\'' +
                ", marks=" + marks +
                '}';
    }
}
