package relasiClass;

import java.util.List;

/**
 * @author Christian Suwondo
 */
public class departement_Agregasi {
    String name;
    private List<student_Agregasi> students;

    public departement_Agregasi(String name, List<student_Agregasi> students) {
        this.name = name;
        this.students = students;
    }

    public List<student_Agregasi> getStudents() {
        return students;
    }
}