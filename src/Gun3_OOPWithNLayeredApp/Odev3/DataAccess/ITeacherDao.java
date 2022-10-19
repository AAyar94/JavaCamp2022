package Gun3_OOPWithNLayeredApp.Odev3.DataAccess;

import Gun3_OOPWithNLayeredApp.Odev3.entities.Teacher;

import java.util.List;

public interface ITeacherDao {
    List<Teacher> getAllTeachers();
    Teacher getTeacher(int id) throws Exception;
    void addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(Teacher teacher);
}
