import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

public class DataMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataMain dataMain = new DataMain();
        // DB 연결하기
        Connection con = ConnectionManager.getConnection();
        // Soltion의 메소드를 통해 쿼리의 답변들 받아오기
        String sql = "ex";
        // 답변들을 .txt로 만들어주기
    }
    public void testStart() {
        GisaDao gisa = new GisaDao();
        String queryAnswer1 = "SELECT std_No FROM (SELECT std_No, ROW_NUMBER() OVER (ORDER BY (kor + eng) DESC, std_No) AS rnk FROM Gisa WHERE loc_code = 'B'  ) X WHERE rnk = 5;";
        String queryAnswer2 = "";
        String queryAnswer3 = " SELECT sum(total)+sum(case when acc_code = 'A' then 5 when acc_code = 'B' then 15 when acc_code = 'C' then 20 end) point from Gisa where  (eng+math)>=120;";
        String queryAnswer4 = getQueryAnswer4();

        String answer = gisa.selectQuiz1(queryAnswer1);
        this.printAnswer(1, answer);
        answer = gisa.selectQuiz2(queryAnswer2);
        this.printAnswer(2, answer);
        answer = gisa.selectQuiz3(queryAnswer3);
        this.printAnswer(3, answer);
        answer = gisa.selectQuiz4(queryAnswer4);
        this.printAnswer(4, answer);
    }

    private static String getQueryAnswer4() {
        StringBuilder sb = new StringBuilder("select count(*)");
        sb.append("select count(*)");
        sb.append("    from");
        sb.append("(select *");
        sb.append("    from Gisa");
        sb.append("where acc_code = 'A' or acc_code = 'B') A");
        sb.append("where kor+(case");
        sb.append("    when loc_code='A' then 5");
        sb.append("    when loc_code='B' then 10");
        sb.append("    when loc_code='C' then 15");
        sb.append("    end) >= 50");

        return sb.toString();
    }

    public void printAnswer(int quizNumber, String answer) {
        System.out.println("정답을 받아서 답안지 작성");
        //파일 생성
        File file = new File("Ans"+quizNumber+".txt");
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
    }
}
