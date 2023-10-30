import java.io.*;

public class demoReadAndWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("data/student.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("xin chao anh em ");
        bufferedWriter.close();

        File file1 = new File("data/student.csv");
        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

    }
}
