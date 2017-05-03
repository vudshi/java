package University;

/*
[*] Интернет университету потребовалось разработать систему онлайн-регистрации абитуриентов на курсы.
Студент должен иметь возможность зарегистрироваться на курс, покинуть курс, посмотреть свое расписание.
Напишите как минимум 10 классов, которые могли бы использоваться в такой системе.
*/

 /**
 * Created by lsm on 5/2/2017.
  * Base object student. Additional information about user.
 */
public class Student {
    private int id;
    private String stName, stSurname, stFathername, stAdditional;
    private User user;

    public Student(String stName, String stSurname, String stFathername, String stAdditional, User user) {
         this.stName = stName;
         this.stSurname = stSurname;
         this.stFathername = stFathername;
         this.stAdditional = stAdditional;
         this.user = user;
    }

     public int getId() {
         return id;
     }

     public String getStName() {
         return stName;
     }

     public String getStSurname() {
         return stSurname;
     }

     public String getStFathername() {
         return stFathername;
     }

     public String getStAdditional() {
         return stAdditional;
     }

     public User getUser() {
         return user;
     }
 }
