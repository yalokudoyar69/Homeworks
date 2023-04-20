package homework22;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class StudentAverageScore implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getAverageScore() - o2.getAverageScore());
    }


}
