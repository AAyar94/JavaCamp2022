package Gun3_OOPWithNLayeredApp.Odev3.Business;

import Gun3_OOPWithNLayeredApp.Odev3.Core.Logging.ILogging;
import Gun3_OOPWithNLayeredApp.Odev3.DataAccess.ITeacherDao;
import Gun3_OOPWithNLayeredApp.Odev3.entities.Teacher;

import java.util.List;

public class TeacherManager {
    private ITeacherDao teacherDao;
    private List<ILogging> loggers;

    public TeacherManager(List<ILogging> loggings,ITeacherDao teacherDao){
        this.loggers =loggings;
        this.teacherDao=teacherDao;
    }
    public void add(Teacher teacher){
        teacherDao.addTeacher(teacher);
        for (ILogging logging: loggers){
            logging.log();
        }
    }
    public void update(Teacher teacher){
        teacherDao.addTeacher(teacher);
        for (ILogging logging:loggers){
            logging.log();
        }
    }
    public void delete(Teacher teacher){
        teacherDao.deleteTeacher(teacher);
        for (ILogging logging:loggers){
            logging.log();
        }
    }

    
}
