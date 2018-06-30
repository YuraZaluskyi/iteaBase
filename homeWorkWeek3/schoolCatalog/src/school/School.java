package school;


import student.Student;

import java.util.Arrays;

public class School {

    private Student[] catalog = new Student[1];
    private int size = 0;


    public School() {
    }

    public School(Student[] catalog) {
        this.catalog = catalog;
    }


    public Student[] getCatalog() {
        return catalog;
    }

    public void setCatalog(Student[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "School{" +
                "catalog=" + Arrays.toString(catalog) +
                '}';
    }

//_____________________Methods___________________________________________________________________

    //     1. задає розмір каталогу школи
    public void sizeCatalog(int size) {
        Student[] newCatalog = new Student[size];
        catalog = newCatalog;
    }

    //    2. додає студента до школи і встановлює йому id
    public void add(Student student) {
        if (size >= catalog.length) {
            extendArray();
        }
        catalog[size++] = student;
        student.setId(size);
    }

    //    3. збільшує каталог на 1, коли нема вже місця для наступного студента
    public void extendArray() {
        Student[] newCatalog = new Student[size + 1];
        System.arraycopy(catalog, 0, newCatalog, 0, catalog.length);
        catalog = newCatalog;
    }

    //    4. отримати клон масиву студентів
    public Student[] getCatalogClone() {
        return catalog.clone();
    }


    //    5. видалення студента за індексом
    public void removeByIndex(int index) {
        Student[] newCatalog = new Student[catalog.length - 1];
        System.arraycopy(catalog, 0, newCatalog, 0, index);
        System.arraycopy(catalog, index + 1, newCatalog, index, newCatalog.length - index);
        catalog = newCatalog;
    }

    //    6. видалити студента по id
    public void removeById(int id) {

        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i].getId() == id) {
                removeByIndex(i);
                break;
            }
        }
    }

    //  7. знайти студента по id
    public Student searchById(int id) {

        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i].getId() == id) {
                return catalog[i];
            }
        }
        return null;
    }

    //  8. знайти студентів по secondName
    public School searchBySecondName(String secondName){
        School newSchool = new School();

        for (int i = 0; i < catalog.length ; i++) {

            if (catalog[i].getSecondName() == secondName){
                newSchool.add(catalog[i]);
            }
        }
        return newSchool;
    }

//


}
