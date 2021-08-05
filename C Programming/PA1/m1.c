#include <stdio.h>

int main(void)
{
	int num, count_star, line, line__, space, space__, count_space;

	count_star = 0;
	count_space = 0;
	line = 1;

	printf("Enter a positive integer: ");
	scanf("%d", &num);

	while (num <= 0)
	{
		printf("Input Error !\n");
		printf("Enter a positive integer: ");
		scanf("%d", &num);
	}

	line__ = num * 2 - 1;
	space = num - 1;
	space__ = num - 1;

	while (line <= num * 2 - 1)
	{

		for (; space != 0;)
		{

			printf(" ");

			count_space++;

			if (count_space == space__)
				break;
		}

		for (;;)
		{
			printf("*");

			if (line <= num)
			{
				count_star++;
				if (count_star == line * 2 - 1)
					break;
			}
			else
			{
				count_star++;
				if (count_star == line__ * 2 - 1)
					break;
			}
		}

		line++;
		line__--;
		space--;

		if (space < 0)
		{
			space__ = -space;
		}
		else
		{
			space__ = space;
		}

		count_star = 0;
		count_space = 0;
		printf("\n");
	}
	return 0;
}