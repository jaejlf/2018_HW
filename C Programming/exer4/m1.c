#include <stdio.h>

int main(void)
{
	int num, reverse;
	printf("Enter a positive integer: ");
	scanf("%d", &num);

	while (num < 0)
	{
		printf("Input Error!\n");
		printf("Enter a positive integer: ");
		scanf("%d", &num);
	}

	while (num % 10 == 0)
	{
		num /= 10;
	}

	if (num != 0)
	{
		printf("Reversed integer:");
		while (num != 0)
		{
			reverse = num % 10;
			printf("%d", reverse);
			num /= 10;
		}
	}

	printf("\n");

	return 0;
}
