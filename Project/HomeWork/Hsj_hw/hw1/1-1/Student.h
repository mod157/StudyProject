#include <iostream>
#include <string>
using namespace std;

class Student {
private:
	string name;
	int StudentID;
	int grade;
	double score;

public:
	Student(string name_, int StudentID_, int grade_, double score_)
	{
		name = name_;
		StudentID = StudentID_;
		grade = grade_;
		score = score_;
	}
	void StudentPrint()
	{
		cout << "이름: " << name << "\n학번: " << StudentID << "\n학년: " << grade << "\n누적성적: " << score << endl;
		cout << endl;
	}
};