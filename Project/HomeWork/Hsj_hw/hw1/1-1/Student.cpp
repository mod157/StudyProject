#include <iostream>
#include <string>
#include "Student.h"

using namespace std;

int main()
{
	Student A("Ȳ����", 32131765, 3, 3.0);
	Student B("�迵��", 32131766, 4, 4.0);
	A.StudentPrint();	
	B.StudentPrint();
	return 0;
}