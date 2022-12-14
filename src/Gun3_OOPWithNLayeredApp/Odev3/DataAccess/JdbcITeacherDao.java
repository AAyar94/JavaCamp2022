package Gun3_OOPWithNLayeredApp.Odev3.DataAccess;

import Gun3_OOPWithNLayeredApp.Odev3.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class JdbcITeacherDao implements ITeacherDao {

    private List<Teacher> teachers = new ArrayList<Teacher>();
    @Override
    public List<Teacher> getAllTeachers() {
        System.out.println("Tüm Ögretmenler Jdbc ile getirildi.");
        return teachers;
    }

    @Override
    public Teacher getTeacher(int id) throws Exception {
        for (Teacher teacher : teachers){
            if (teacher.getId() == id){
                System.out.println(id+ " numaralı ögretmen getirildi(JDBC)");
                return teacher;
            }else {
                System.out.println("Öğretmen bulunamadı(JDBC)");

            }
        }
        throw new Exception("Hata(Öğretmen(JDBC))");
    }

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println(teacher.name + "İsimli öğretmen eklendi(JDBC)");
        this.teachers.add(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Öğretmen güncellendi(JDBC)");

    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        System.out.println("Öğretmen Silindi(JDBC)");
    }
}
