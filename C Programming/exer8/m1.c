#include <stdio.h>
#include <stdlib.h>

void sort_three_items(int *x);

int main(void)
{
	int *a = (int *)malloc(sizeof(int) * 3);
	int i;

	printf("Enter three integers: ");
	for (i = 0; i < 3; i++)
	{
		scanf("%d", &*(a + i));
	}

	sort_three_items(a);
	printf("%d %d %d\n", *a, *(a + 1), *(a + 2));

	free(a);
	return 0;
}
void sort_three_items(int *x)
{
	int p, q, r;
	if (*x <= *(x + 1))
	{
		p = *x;
		q = *(x + 1);
	}
	else
	{
		p = *(x + 1);
		q = *x;
	}

	if (q <= *(x + 2))
	{
		r = *(x + 2);
	}
	else
	{
		r = q;
		q = *(x + 2);
	}

	if (p <= q)
	{
		*x = p;
		*(x + 1) = q;
	}
	else
	{
		*x = q;
		*(x + 1) = p;
	}

	*(x + 2) = r;
}