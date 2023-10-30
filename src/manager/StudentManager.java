package manager;

import DTO.ReadAndWriteStudent;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> listStudent;
    private ReadAndWriteStudent DocGhiMangHocsinh;

    public StudentManager( ) {
        this.listStudent = new ArrayList<>();
        this.DocGhiMangHocsinh = new ReadAndWriteStudent();
    }
    public void add(Student student){
        listStudent.add(student);
        DocGhiMangHocsinh.writeFile(listStudent);
    }
    public ArrayList<Student> getListStudent(){
        return this.listStudent;
    }
}
