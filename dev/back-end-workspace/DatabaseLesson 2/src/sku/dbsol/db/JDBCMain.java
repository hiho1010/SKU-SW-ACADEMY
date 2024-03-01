package sku.dbsol.db;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // constructor
        JDBCMain main = new JDBCMain();
        // get db connection
        Connection con = ConnectionManager.getConnection();
        // make sql String with Solution.class
        String sql = "";
        Scanner scanner = new Scanner(System.in);

        PreparedStatement pstmt = con.prepareStatement(sql);
        int affectedCount = 0;


        main.testCRUD();
    }

    public void testCRUD() {
        String sql = "insert into gisa values (990002,'addx',17,29,16,49,43,154,'C','A','C')";
        GisaDao dao = new GisaDao();
        try {
            //boolean flag = dao.insert(sql);
            //sql = "delete from gisa where std_no = ?";
            //boolean flag = dao.delete(sql);
            //Student student = new Student(990003,"addx",17,29,16,49,43,154,"C","A","C");
            //boolean flag = dao.insert(student);
            boolean flag = dao.insert(this.makeData());
            if(flag) {
                System.out.println("insert success");
            } else {
                System.out.println("insert fail");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
    private ArrayList<Student> makeData(){
        ArrayList<Student> list = null;
        //file에 접속하여 생성
        File file = new File("/Users/hiho1010/SKU-SW-ACADEMY/dev/back-end-workspace/DatabaseLesson 2/src/sku/lesson2/db/Abc1115.csv");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            // 파일 안의 1000개의 라인에 각각 접근하여 --> 스트림 처리(IO)
            // 각 라인을 11개의 데이터로 분리하여 -->String 분리
            // Student객체로 생성한 다음 List에 저장 -->ArrayList
            list = new ArrayList<Student>();
            while((line=br.readLine())!=null) {
                String[] temp = line.split(",");
                int stdNo = Integer.parseInt(temp[0]);
                String email = temp[1];
                int kor = Integer.parseInt(temp[2].trim());
                int eng = Integer.parseInt(temp[3].trim());
                int math = Integer.parseInt(temp[4].trim());
                int sci = Integer.parseInt(temp[5].trim());
                int hist = Integer.parseInt(temp[6].trim());
                int total = Integer.parseInt(temp[7].trim());
                String mgrCode = temp[8];
                String accCode = temp[9];
                String locCode = temp[10];
                Student student = new Student(stdNo, email, kor, eng, math, sci, hist, total, mgrCode, accCode, locCode);
                list.add(student);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }

        return list;
    }
     */



    // db에 연결하기, db에서 자료 불러오기( 다 불러오는 것이 아닌 필요한 정보들만)

    private ArrayList<Student> dbToTxt() {
        ArrayList<Student> list = null;
        GisaDao dao = new GisaDao();
        String sql = "select from gisa";
        list = dao.select();

        return list;
    }


    public void writeAnswer(int number,String answer) {
        System.out.println("정답을 받아서 답안지 작성");
        //파일 생성
        File file = new File("Ans"+number+".txt");
        //파일 접근
        try {
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(answer);
            pw.close();
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //파일 쓰기
        // --> 스트림 지식
    }
}
