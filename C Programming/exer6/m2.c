#include <stdio.h>

int main(void)
{
	int i, j;
	int a[5], b[5], c[5], d[5], e[5], rowt[5], colt[5];
	int row_sum = 0, col_sum = 0;

	for (i = 0; i <= 4; i++)
	{
		a[i] = 0;
		b[i] = 0;
		c[i] = 0;
		d[i] = 0;
		e[i] = 0;
	}

	printf("Enter row 1: ");
	for (i = 0; i <= 4; i++)
	{
		scanf("%d", &a[i]);
	}

	printf("Enter row 2: ");
	for (i = 0; i <= 4; i++)
	{
		scanf("%d", &b[i]);
	}

	printf("Enter row 3: ");
	for (i = 0; i <= 4; i++)
	{
		scanf("%d", &c[i]);
	}

	printf("Enter row 4: ");
	for (i = 0; i <= 4; i++)
	{
		scanf("%d", &d[i]);
	}

	printf("Enter row 5: ");
	for (i = 0; i <= 4; i++)
	{
		scanf("%d", &e[i]);
	}

	//row
	//1
	printf("Row totals: ");
	for (i = 0; i <= 4; i++)
	{
		row_sum += a[i];
	}
	printf("%d", row_sum);

	//2
	row_sum = 0;
	for (i = 0; i <= 4; i++)
	{
		row_sum += b[i];
	}
	printf(" %d", row_sum);

	//3
	row_sum = 0;
	for (i = 0; i <= 4; i++)
	{
		row_sum += c[i];
	}
	printf(" %d", row_sum);

	//4
	row_sum = 0;
	for (i = 0; i <= 4; i++)
	{
		row_sum += d[i];
	}
	printf(" %d", row_sum);

	//5
	row_sum = 0;
	for (i = 0; i <= 4; i++)
	{
		row_sum += e[i];
	}
	printf(" %d\n", row_sum);

	//column
	printf("Column totals:");
	for (i = 0; i <= 4; i++)
	{
		col_sum = a[i] + b[i] + c[i] + d[i] + e[i];
		printf(" %d", col_sum);
	}

	printf("\n");

	return 0;
}