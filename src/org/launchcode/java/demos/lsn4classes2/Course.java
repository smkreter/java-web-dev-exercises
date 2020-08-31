package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String title;
    private Integer courseId;
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course (String title, Integer courseId) {
        this.title = title;
        this.courseId = courseId;
        this.topic = "TBD";
        //this.instructor = "TBD";
        //this.enrolledStudents = {};
    }
    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return this.courseId +": "+ this.title +" Instructor: " + this.instructor+ " Topic: " + this.topic;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId.equals(course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
    public static void main(String[] args) {
    Course maths = new Course("maths", 123);
    System.out.println(maths.toString());
    }
}
