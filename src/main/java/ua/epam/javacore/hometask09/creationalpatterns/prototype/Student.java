package ua.epam.javacore.hometask09.creationalpatterns.prototype;

public class Student implements Copyable{
    private int id;
    private String Group;
    private String speciality;

    public Student(int id, String Group, String speciality) {
        this.id = id;
        this.Group = Group;
        this.speciality = speciality;
    }


    @Override
    public Object copy() {
        return new Student(id, Group, speciality);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + Group + '\'' +
                ", sourceCode='" + speciality + '\'' +
                '}';
    }
}
