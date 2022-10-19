package Gun3_OOPWithNLayeredApp.Odev3.DataAccess;

import Gun3_OOPWithNLayeredApp.Odev3.entities.Course;

import java.util.List;

public interface ICourseDao {
    List<Course> getAllCourses();
    Course getCourse(int id) throws Exception;
    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(Course course);
}
