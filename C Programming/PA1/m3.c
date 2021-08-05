#include <stdio.h>

int main(void)
{
	int num, a, b, c;

	printf("Enter a positive integer: ");
	scanf("%d", &num);

	while (num < 0)
	{

		printf("Input Error !\n");
		printf("Enter a positive integer: ");
		scanf("%d", &num);
	}

	for (a = 1; a <= num; a++)
	{
		for (b = 1; b <= num; b++)
		{
			for (c = 1; c <= num; c++)
			{

				if ((a < b) && (a * a) + (b * b) == (c * c))
				{
					printf("%d, %d, %d\n", a, b, c);
				}
			}
		}
	}

	printf("\n");

	return 0;
}