package in.co.examsadda.model;

public class Course {
    private Integer courseId;
    private String courseNameInEnglish;
    private String courseNameInRegional;
    private Integer numberOfPracticePapersAvailable;

    public Course() {
    }

    public Course(Integer courseId, String courseNameInEnglish, String courseNameInRegional, Integer numberOfPracticePapersAvailable) {
        this.courseId = courseId;
        this.courseNameInEnglish = courseNameInEnglish;
        this.courseNameInRegional = courseNameInRegional;
        this.numberOfPracticePapersAvailable = numberOfPracticePapersAvailable;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public void setCourseNameInEnglish(String courseNameInEnglish) {
        this.courseNameInEnglish = courseNameInEnglish;
    }

    public void setCourseNameInRegional(String courseNameInRegional) {
        this.courseNameInRegional = courseNameInRegional;
    }

    public void setNumberOfPracticePapersAvailable(Integer numberOfPracticePapersAvailable) {
        this.numberOfPracticePapersAvailable = numberOfPracticePapersAvailable;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public String getCourseNameInEnglish() {
        return courseNameInEnglish;
    }

    public String getCourseNameInRegional() {
        return courseNameInRegional;
    }

    public Integer getNumberOfPracticePapersAvailable() {
        return numberOfPracticePapersAvailable;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseNameInEnglish='" + courseNameInEnglish + '\'' +
                ", courseNameInRegional='" + courseNameInRegional + '\'' +
                ", numberOfPracticePapersAvailable=" + numberOfPracticePapersAvailable +
                '}';
    }
}
