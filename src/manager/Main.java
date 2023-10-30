package manager;

public class Main {
    public static void main(String[] args) {
          StudentManager studentManager = new StudentManager();
          studentManager.add(new Student(1,"Minh Son"));
          studentManager.add(new Student(2,"Van Tuan"));


        for (Student ST: studentManager.getListStudent()) {
            System.out.println(ST);
        }
    }
}
