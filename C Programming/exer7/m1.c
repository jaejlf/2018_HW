#include <stdio.h>

void swap(int *i, int *j);

int main(void)
{
	int a, b;
	printf("Enter two integers: ");
	scanf("%d %d", &a, &b);
	swap(&a, &b);
	printf("%d %d", a, b);
	printf("\n");

	return 0;
}

void swap(int *i, int *j)
{
	int p, q;
	p = *i;
	q = *j;

	*j = p;
	*i = q;
}