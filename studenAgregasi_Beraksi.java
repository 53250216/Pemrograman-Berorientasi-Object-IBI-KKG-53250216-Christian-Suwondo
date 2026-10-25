package relasiClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Suwondo
 */
public class studenAgregasi_Beraksi {
    public static void main(String[] args) {
        student_Agregasi s1 = new student_Agregasi("Mia", 1, "CSE");
        student_Agregasi s2 = new student_Agregasi("Priya", 2, "CSE");
        student_Agregasi s3 = new student_Agregasi("John", 1, "EE");
        student_Agregasi s4 = new student_Agregasi("Rahul", 2, "EE");

        // Daftar CSE Students
        List<student_Agregasi> cse_students = new ArrayList<student_Agregasi>();
        cse_students.add(s1);
        cse_students.add(s2);

        // Daftar EE Students
        List<student_Agregasi> ee_students = new ArrayList<student_Agregasi>();
        ee_students.add(s3);
        ee_students.add(s4);

        departement_Agregasi CSE = new departement_Agregasi("CSE", cse_students);
        departement_Agregasi EE = new departement_Agregasi("EE", ee_students);

        List<departement_Agregasi> departments = new ArrayList<departement_Agregasi>();
        departments.add(CSE);
        departments.add(EE);

        institute_Agregasi institute = new institute_Agregasi("BITS", departments);

        System.out.print("Total siswa adalah: ");
        System.out.println(institute.getTotalStudentsInInstitute());
    }
}
