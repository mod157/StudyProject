#include <iostream>
#include <cstring>
using namespace std;

class Reverse {
private:
	char *revStr;
	int length;
public:
	Reverse(char *str)
	{
		length = strlen(str);
		revStr = new char[length];

		for (int i = 0; i < length; i++)
		{
			revStr[length - i - 1] = str[i];
		}
	}

	void ReversePrint()
	{
		for (int i = 0; i < length; i++)
		{
			cout << revStr[i];
		}
		cout << endl;
	}
};