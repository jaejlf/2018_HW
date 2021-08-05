#include <stdio.h>

void yellow(int x[], int size, int *sl, int *ss);

int main(void)
{
	int i, x[10], a, b;
	printf("Enter ten numbers: ");

	for (i = 0; i < 10; i++)
	{
		scanf("%d", &x[i]);
	}
	yellow(x, 10, &a, &b);
	printf("Second Largest: %d, Second Smallest: %d\n", a, b);

	return 0;
}

void yellow(int x[], int size, int *sl, int *ss)
{
	int i, j, p, q, largest = 0, smallest = x[0];
	for (i = 0; i < size; i++)
	{
		if (x[i] >= largest)
		{
			largest = x[i];
			p = i;
		}
	}

	for (i = 0; i < size; i++)
	{
		if (x[i] <= smallest)
		{
			smallest = x[i];
			q = i;
		}
	}

	for (i = 0; i < size; i++)
	{
		for (j = 0; j < size; j++)
		{
			if ((x[j] == largest) && (j != p))
			{
				*sl = x[j];
				break;
			}
			if (x[j] == largest - 1)
			{
				*sl = x[j];
				break;
			}
		}
		if ((x[j] == largest) && (j != p))
			break;
		if (x[j] == largest - 1)
			break;
		largest -= 1;
	}

	for (i = 0; i < size; i++)
	{
		for (j = 0; j < size; j++)
		{
			if ((x[j] == smallest) && (j != q))
			{
				*ss = x[j];
				break;
			}
			if (x[j] == smallest + 1)
			{
				*ss = x[j];
				break;
			}
		}
		if ((x[j] == smallest) && (j != q))
			break;
		if (x[j] == smallest + 1)
			break;
		smallest += 1;
	}
	printf("%d, %d\n", *sl, *ss);
}