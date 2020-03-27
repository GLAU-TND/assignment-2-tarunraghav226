package problem3.student;

public class Student {
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "---------------------------------------" + "\n" +
                "Name -- " + getName() + "\n" +
                "Roll Number -- " + getRollNumber() + "\n" +
                "---------------------------------------";
    }
}
