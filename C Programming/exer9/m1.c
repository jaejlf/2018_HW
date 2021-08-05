#include <stdlib.h>

int foo(const char *str)
{
	int s = 0;
	int i;

	for (i = 0; *(str + i) != '\0'; i++)
	{
		if (*(str + i) >= '0' && *(str + i) <= '9')
		{
			s += *(str + i) - '0';
		}
	}

	return s;
}