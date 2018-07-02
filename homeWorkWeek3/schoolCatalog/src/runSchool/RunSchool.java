package runSchool;

import school.School;
import student.Student;

import java.util.Arrays;
import java.util.Scanner;

public class RunSchool {
    public static void main(String[] args) {

        School school = new School();
        Scanner sc = new Scanner(System.in);
        SchoolManager schoolManager = new SchoolManager(sc, school);

//        printManagerMenu();
//        schoolManager.addStudentToSchool();
//        System.out.println(school.toString());

        while (true){

            printManagerMenu();
            System.out.println();
            System.out.print("What would you like? - ");
            String choice = sc.next();

            switch (choice){
                case "1":
                    schoolManager.addStudentToSchool();
                    System.out.println(school.toString());
                    break;

                case "2":
                    System.out.println(school.toString());
                    schoolManager.removeStudentFromSchoolByIndex();
                    System.out.println(school.toString());
                    break;

                case "3":
                    System.out.println(school.toString());
                    schoolManager.removeStudentFromSchoolById();
                    System.out.println(school.toString());
                    break;



                case "5":
                    System.out.println(school.toString());
                    schoolManager.searchStudentBySecondName();
                    break;

                case "6":
                    System.out.println(school.toString());
                    break;

                case "7":
                    System.out.println(school.toString());
                    schoolManager.viewStudentByIndex();
                    break;

                case "8":
                    System.out.println(school.toString());
                    schoolManager.viewStudentById();
                    break;


                    default:
                        System.out.println("Good by");
                        return;

            }

        }

//        Student student = new Student(123, "aaa", "bbb", 25);
//        Student student2 = new Student(123, "aaa", "mmm", 25);
//        Student student3 = new Student(123, "aaa", "yyy", 25);
//        Student student4 = new Student(123, "aaa", "zzz", 25);
//        Student student5 = new Student(123, "aaa", "bbb", 25);
//        School school = new School();
//        school.sizeCatalog(10);

//        System.out.println("Hello world!");



//        for (int i = 0; i < 15 ; i++) {
//            Student student1 = new Student(i, "www", "qqq", 20);
//            school.add(student1);
//        }
//        school.add(student);
//        school.add(student2);
//        school.add(student3);
//        school.add(student4);
//        school.add(student5);
//        school.removeByIndex(0);
//        school.removeById(9);

//        System.out.println(school.toString());
//        System.out.println();
//        System.out.println(school.searchById(123));
//        System.out.println(school.searchBySecondName("bbb"));


//        School catalog1 = new School();

    }




    static void printManagerMenu(){

        System.out.println("          M E N U");
        System.out.println("1 - add a student to school");
        System.out.println("2 - remove a student from school by index");
        System.out.println("3 - remove a student from school by id");
        System.out.println("5 - search students at school by second name");
        System.out.println("6 - view student's list");
        System.out.println("7 - view a student by index");
        System.out.println("8 - view a student by id");


    }

}
