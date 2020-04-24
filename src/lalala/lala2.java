package lalala;

import java.util.Scanner;

public class lala2 {

	public static void main(String[] args) {
/* (연습문제2)성적처리
 * 이름,국어,영어,수학 세 과목의 성적을 입력받고 총점과 평균을 구한후 평균이 90점 
 * 이상 수, 80점 이상 우 , 70점 이상 미, 60점 이상 양, 나머지 가로 표기하시오.
 */
	Scanner sc= new Scanner(System.in);
	int kor,eng,math,total;
	float avg;
	String name,grade;
	System.out.println("학생성명");
	name=sc.nextLine();
	System.out.println("국어성적");
	kor=Integer.parseInt(sc.nextLine());
	System.out.println("영어성적");
	eng=Integer.parseInt(sc.nextLine());
	System.out.println("수학성적");
	math=Integer.parseInt(sc.nextLine());
	
	total=  kor+eng+math;
	avg= total/3.0f;
	 if(avg>=90) 
		grade="수";
	else if(avg>=80) 
		grade="우";
	else if(avg>=70) 
		grade="미";
	else if(avg>=60) 
		grade="양";
	else  
		grade="가";
	System.out.println("이름:"+name);
	System.out.println("총점"+total);
	System.out.println("평균"+avg);
	System.out.println("등급"+grade);
	 
	
	 }
	
	}


