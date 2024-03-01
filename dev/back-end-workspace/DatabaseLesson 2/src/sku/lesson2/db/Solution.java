package sku.lesson2.db;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public String solveQuestion1(ArrayList<Student> data) {
		// TODO Auto-generated method stub
		String answer = null;
		ArrayList<Student> quiz4 = new ArrayList<Student>();
		for(Student student : data) {
			if(student.getLocCode().equals("B")) {
				quiz4.add(student);
			}
		}
		this.printQuiz(quiz4, 15, 25);
		int stdNo = quiz4.get(4).getStdNo();
		answer = String.valueOf(stdNo);

		return answer;
	}

	public String solveQuestion2(ArrayList<Student> list) {
		String answer = null;
		// 지역코드가 B 인 자료에 대하여 (국어점수 + 영어점수) 중 가장 큰값 구하기
		// ArrayList 지식
		// max 알고리즘
		// 기본 문법 (변수,제어문)
		// 객체의 기본 사용법
		int max = 0;
		for(Student st : list) {
			if(st.getLocCode().equals("B")) {
				if(max<(st.getKor()+st.getEng())) {
					max = st.getKor()+st.getEng();
				}
			}
		}
		System.out.println("문제 풀이");
		answer = String.valueOf(max);
		return answer;
	}

	public String solveQuestion3(ArrayList<Student> data) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count  = 0;
		for(Student student : data) {
			int point = 0;
			if(student.getEng()+student.getMath()>=120) {
				if(student.getAccCode().equals("A")) {
					point = 5;
				} else if(student.getAccCode().equals("B")) {
					point = 15;
				} else if(student.getAccCode().equals("C")) {
					point = 20;
				}
				count++;
				sum = sum + student.getTotal()+point;
			}
		}
		System.out.println(count);
		return String.valueOf(sum);
	}

	public String solveQuestion4(ArrayList<Student> data) {
		// TODO Auto-generated method stub
		String answer = null;
		int count = 0;
		for(Student student : data) {
			if(student.getAccCode().equals("A")
					||student.getAccCode().equals("B")) {
				int point = 5;
				if(student.getLocCode().equals("B")) {
					point = 10;
				} else if(student.getLocCode().equals("C")) {
					point = 15;
				}
				if(student.getKor()+point>=50) {
					count++;
				}
			}
		}
		answer = String.valueOf(count);
		return answer;
	}

	public void printQuiz(ArrayList<Student> quiz,int start, int end) {
		for(int i=start;i<end;i++) {
			System.out.println(quiz.get(i));
		}
	}
	
}








