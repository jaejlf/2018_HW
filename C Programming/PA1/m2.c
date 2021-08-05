#include <stdio.h>

int main(void)
{
	int num, i, count;
	count = 0;

	printf("Enter an integer greater than 1: ");
	scanf("%d", &num);

	while (num <= 1)
	{
		printf("Input Error !\n");
		printf("Enter an integer greater than 1: ");
		scanf("%d", &num);
	}

	for (i = 2; i <= num;)
	{
		for (; num % i == 0;)
		{
			count++;
			num /= i;

			if (num == 1)
				break;
		}

		if (count != 0)
		{
			printf("%d^%d", i, count);
		}

		if (num == 1)
			break;

		if ((count != 0) && (num != 1))
		{
			printf(" * ");
		}

		i++;
		count = 0;
	}

	printf("\n");

	return 0;
}