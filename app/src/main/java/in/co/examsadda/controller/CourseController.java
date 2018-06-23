package in.co.examsadda.controller;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.model.Course;

public class CourseController {
    public List<Course> getCourseByInstituteIdAndStudentId(int inistituteId, String studentId){
        List<Course> courses = new ArrayList<>(  );
        courses.add( new Course( 1,"A","AA",20 ) );
        courses.add( new Course( 2,"B","BB",20 ) );
        courses.add( new Course( 3,"C","CC",20 ) );
        courses.add( new Course( 4,"D","DD",20 ) );
        courses.add( new Course( 5,"E","EE",20 ) );
        courses.add( new Course( 6,"F","FF",20 ) );
        courses.add( new Course( 7,"G","GG",20 ) );
        return courses;
    }
}
