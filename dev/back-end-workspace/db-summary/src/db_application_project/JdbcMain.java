package db_application_project;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class JdbcMain {
    Logger logger = Logger.getLogger("jdbcMain");
    public static void main(String[] args) {
        JdbcMain jdbcMain = new JdbcMain();
        StudentDao studentDao = new StudentDao();
        try {
            studentDao.insert(jdbcMain.makeData());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcMain.test();
    }

    public void test() {
        StudentDao dao = new StudentDao();
        try {
            if(true) {
                String queryAnswer1 = "select std_no"
                        + " from Gisa"
                        + " where loc_code = 'B'"
                        + " order by (kor+eng) desc, std_no asc"
                        + " limit 4,1";
                String queryAnswer2 = "select max(kor+eng) maxscore"
                        + " from Gisa"
                        + " where loc_code = 'B'";
                String queryAnswer3 = "select sum(total)+sum(case"
                        + "	when acc_code='A' then 5"
                        + " when acc_code='B' then 15"
                        + " when acc_code='C' then 20"
                        + " end) point"
                        + " from Gisa"
                        + " where (eng+math)>=120";
                StringBuilder sb = new StringBuilder("select count(*)");
                sb.append(" from");
                sb.append(" (select *	from Gisa");
                sb.append("	where acc_code='A' or acc_code='B') A");
                sb.append(" where kor+(case");
                sb.append("	when loc_code='A' then 5");
                sb.append(" when loc_code='B' then 10");
                sb.append(" when loc_code='C' then 15");
                sb.append("	end)>=50");
                String queryAnswer4 = sb.toString();
                //로직클래스에게 데이터 전달
                try {
                    String answer = dao.selectQuiz1(queryAnswer1);
                    this.writeAnswer(1, answer);
                    answer = dao.selectQuiz2(queryAnswer2);
                    this.writeAnswer(2, answer);
                    answer = dao.selectQuiz3(queryAnswer3);
                    this.writeAnswer(3, answer);
                    answer = dao.selectQuiz4(queryAnswer4);
                    this.writeAnswer(4, answer);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
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
            e.printStackTrace();
        }
    }
}
