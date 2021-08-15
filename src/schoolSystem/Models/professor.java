package schoolSystem.Models;

public class professor extends employee{
    private int professorID;
    private String degree;
    private String department;
    private int teachingLoads;

    public int getProfessorID() {
        return professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeachingLoads() {
        return teachingLoads;
    }

    public void setTeachingLoads(int teachingLoads) {
        this.teachingLoads = teachingLoads;
    }
}
