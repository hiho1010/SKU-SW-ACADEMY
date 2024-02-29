package db_application_project;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Logger;

public class jdbcMain {
    Logger logger = Logger.getLogger("jdbcMain");
    public static void main(String[] args) {
        jdbcMain jdbcMain = new jdbcMain();
        jdbcMain.test();
    }

    public void test() {
        StudentDao dao = new StudentDao();
        try {
            boolean flag = dao.insert(this.makeData());

            if (flag) {
                logger.info("flag = " + flag);
            } else {
                logger.info("insert fail : flag = " + flag );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // makeData의 반환타입은 ArrayList<Student>
    private ArrayList<Student> makeData() {
        ArrayList<Student> list = null;
        //file에 접속하여 생성
        File file = new File("src/Abc1115.csv");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            list = new ArrayList<>();
            while((line=br.readLine())!=null) {
                Student student = getStudent(line);
                list.add(student);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        return list;
    }

    private static Student getStudent(String line) {
        String[] temp = line.split(",");
        int stdId = Integer.parseInt(temp[0]);
        String email = temp[1];
        int kor = Integer.parseInt(temp[2].trim());
        int eng = Integer.parseInt(temp[3].trim());
        int math = Integer.parseInt(temp[4].trim());
        int sci = Integer.parseInt(temp[5].trim());
        int his = Integer.parseInt(temp[6].trim());
        int total = Integer.parseInt(temp[7].trim());
        String mgrCode = temp[8];
        String accCode = temp[9];
        String locCode = temp[10];
        Student student = new Student(stdId, email, kor, eng, math, sci, his, total, mgrCode, accCode, locCode);
        return student;
    }
}
