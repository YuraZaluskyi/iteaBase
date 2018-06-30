package runSchool;


import school.School;
import student.Student;

import java.util.Scanner;

public class SchoolManager {

    private Scanner sc;
    private School school;

    public SchoolManager(Scanner sc, School school) {
        this.sc = sc;
        this.school = school;
    }

//    Methods________________________________________________________________________________________

    public void addStudentToSchool() {
        System.out.print("Please, enter student's first name: ");
        String firstName = sc.next();
        System.out.println();
        System.out.print("Please, enter student's last name: ");
        String secondName = sc.next();
        System.out.println();
        System.out.print("Please, enter student's age: ");
        int age = sc.nextInt();
        System.out.println();
        Student student = new Student(firstName, secondName, age);
        school.add(student);
    }

    public void removeStudentFromSchoolByIndex(){
        System.out.print("Please, enter student's index: ");
        int index = sc.nextInt();
        school.removeByIndex(index);
    }

    public void removeStudentFromSchoolById(){
        System.out.print("Please, enter student's id: ");
        int id = sc.nextInt();
        school.removeById(id);
    }

    public void searchStudentById(){
        System.out.print("Please, enter student's id: ");
        int id = sc.nextInt();
        school.searchById(id);
    }


}
