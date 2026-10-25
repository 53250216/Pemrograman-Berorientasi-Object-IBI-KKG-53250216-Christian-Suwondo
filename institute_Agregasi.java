package relasiClass;

import java.util.List;

/**
 * @author Christian Suwondo
 */
public class institute_Agregasi {
    String instituteName;
    private List<departement_Agregasi> departments;

    public institute_Agregasi(String instituteName, List<departement_Agregasi> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        List<student_Agregasi> students;
        for (departement_Agregasi dept : departments) {
            students = dept.getStudents();
            for (student_Agregasi s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}