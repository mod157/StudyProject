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
		cout << "�̸�: " << name << "\n�й�: " << StudentID << "\n�г�: " << grade << "\n��������: " << score << endl;
		cout << endl;
	}
};