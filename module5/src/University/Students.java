package University;

/**
 * Created by lsm on 5/2/2017.
 * [*] Интернет университету потребовалось разработать систему онлайн-регистрации абитуриентов на курсы.
 * Студент должен иметь возможность зарегистрироваться на курс, покинуть курс, посмотреть свое расписание.
 * Напишите как минимум 10 классов, которые могли бы использоваться в такой системе.
 */
public class Students {
    private int id;
    private String stName, stSurname, stFathername, stAbout, stAdditional;


    public Students(String stName, String stSurname, String stFathername, String stAbout, String stAdditional) {
        this.stName = stName;
        this.stSurname = stSurname;
        this.stFathername = stFathername;
        this.stAbout = stAbout;
        this.stAdditional = stAdditional;
    }
}
