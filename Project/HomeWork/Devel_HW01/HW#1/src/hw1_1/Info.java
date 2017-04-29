package hw1_1;

public class Info {

	//이름, 학번, 학년, 누적점수
	private String name;
	private int id;
	private int grade;
	private int k_score,e_score,m_score;	
	
	Info(String Name, int ID, int Grade, 
			int K_Score, int E_Score, int M_Score) {
		name = Name;
		id = ID;
		grade = Grade;
		k_score = K_Score;
		e_score = E_Score;
		m_score = M_Score;
	}
	String getName() {
		return name;
	}
	int getID() {
		return id;
	}
	int getGrade() {
		return grade;
	}
	int total_score() {
		return k_score+e_score+m_score;
	}

}
