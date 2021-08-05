#include <stdio.h>

int main(void)
{
	unsigned int num, i, fact, result;
	fact = 1;
	result = 1;

	for (num = 1;; num++)
	{
		for (i = 1; i <= num; i++)
		{
			fact *= i;
		}

		if ((num > 4) && (fact % 10 != 0))
			break;
		fact = 1;
	}

	for (i = 1; i <= num - 1; i++)
	{
		result *= i;
	}

	printf("[%u]! = [%u]\n", num - 1, result);

	return 0;
}
