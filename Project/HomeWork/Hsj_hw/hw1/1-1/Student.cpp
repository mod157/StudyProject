#include <iostream>
#include <string>
#include "Student.h"

using namespace std;

int main()
{
	Student A("È²¼ºÁØ", 32131765, 3, 3.0);
	Student B("±è¿µÈñ", 32131766, 4, 4.0);
	A.StudentPrint();	
	B.StudentPrint();
	return 0;
}