#include <stdio.h>

int main(void)
{
	int num, a, b, i, j;

	printf("Enter an even integer greater than 2: ");
	scanf("%d", &num);

	while ((num % 2 != 0) || (num < 4))
	{
		printf("Input Error !\n");
		printf("Enter an even integer greater than 2: ");
		scanf("%d", &num);
	}

	for (a = 2; a <= num; a++)
	{

		for (i = 2; i <= num / 2; i++)
		{
			if (a % i == 0)
				break;
		}

		if (a == i)
		{

			b = num - a;

			for (j = 2; j <= num; j++)
			{
				if (b % j == 0)
					break;
			}

			if (b == j)
			{

				printf("%d = %d + %d\n", num, a, b);
			}
		}
	}

	return 0;
}