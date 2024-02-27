package sku.lesson2.db;

public class Student {
    private int studentId;
    private String email;
    private int korean;
    private int math;
    private int sci;
    private int his;
    private int total;
    private String mgrCode;
    private String accCode;
    private String locCode;

    public Student(int studentId, String email, int korean, int math, int sci, int his, int total, String mgrCode, String accCode, String locCode) {
        this.studentId = studentId;
        this.email = email;
        this.korean = korean;
        this.math = math;
        this.sci = sci;
        this.his = his;
        this.total = total;
        this.mgrCode = mgrCode;
        this.accCode = accCode;
        this.locCode = locCode;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
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

    public String getMgrCode() {
        return mgrCode;
    }

    public void setMgrCode(String mgrCode) {
        this.mgrCode = mgrCode;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }
}