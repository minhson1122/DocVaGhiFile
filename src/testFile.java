import java.io.File;
import java.io.IOException;

public class testFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("data.txt");
        File file2 = new File("data");
        file1.createNewFile();//tao file
        System.out.println(file1.exists());//kiem tra xem file ton tai hay khong
        file2.mkdirs();// tao mot thu muc trong
        System.out.println(file2.isDirectory());//kiem tra xem co phai Directory hay khong

        File fileX = new File("data/student.csv");//tạo file trong file
        fileX.createNewFile();
//        fileX.delete()// xóa file
        System.out.println(fileX.length() );

    }
}
