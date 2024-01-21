package university;

public class Course { // Object

    private String courseName;
    private String instructorName;
    private int duration;

    public Course(String courseName, String instructorName, int duration) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return courseName + " and instructor is " + instructorName + " and duration is " + duration;
    }
}
