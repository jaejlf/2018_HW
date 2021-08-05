#include <stdio.h>

int main(void)
{
	int mm, dd;

	printf("Enter date (mm/dd) :");
	scanf("%d/%d", &mm, &dd);

	if ((mm >= 1) && (mm <= 12))
	{
		if ((dd <= 29) && (dd >= 1))
			printf("Valid date\n");
		else if ((mm != 2) && (dd == 30) && (dd >= 1))
			printf("Valid date\n");
		else if ((mm == 2) && ((dd >= 30) || (dd < 1)))
			printf("Invalid date\n");
		else if (dd == 31)
		{
			if ((mm == 1) || (mm == 3) || (mm == 5) || (mm == 7) || (mm == 8) ||
				(mm == 10) || (mm == 12))
				printf("Valid date\n");
			else
				printf("Invalid date\n");
		}

		else
			printf("Invalid date\n");
	}
	else
		printf("Invalid date\n");
	return 0;
}
