package basic.lesson.practice;

public class Student {
    private int stdNo;
    private String email;
    private int kor;
    private int eng;
    private int math;
    private int sci;
    private int his;
    private int total;
    private String hrCode;
    private String ach;
    private String locCode;

    public Student(int stdNo, String email, int kor, int eng, int math, int sci, int his, int total, String hrCode, String ach, String locCode) {
        this.stdNo = stdNo;
        this.email = email;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sci = sci;
        this.his = his;
        this.total = total;
        this.hrCode = hrCode;
        this.ach = ach;
        this.locCode = locCode;
    }

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getHis() {
        return his;
    }

    public void setHis(int his) {
        this.his = his;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getHrCode() {
        return hrCode;
    }

    public void setHrCode(String hrCode) {
        this.hrCode = hrCode;
    }

    public String getAch() {
        return ach;
    }

    public void setAch(String ach) {
        this.ach = ach;
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }
}
