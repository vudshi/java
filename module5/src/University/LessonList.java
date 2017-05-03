package University;

/**
 * Created by lsm on 03.05.2017.
 *
 */
public class LessonList {
    private LessonList next;
    private Lesson lesson;

    public LessonList(LessonList next, Lesson lesson) {
        this.next = next;
        this.lesson = lesson;
    }
}
