#include <stdio.h>

int main(void)
{
	int num, i;
	printf("Enter a positive integer greater than 1: ");
	scanf("%d", &num);

	while (num <= 1)
	{
		printf("Input error!\n");
		printf("Enter a positive integer greater than 1: ");
		scanf("%d", &num);
	}

	for (i = 2; i <= num;)
	{
		if (num % i == 0)
		{
			printf("%d", i);
			num /= i;

			if (num == 1)
				break;

			printf("*");
		}
		else
		{
			i++;
		}

	} // for-end

	printf("\n");

	return 0;
}