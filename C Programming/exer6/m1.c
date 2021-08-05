#include <stdio.h>

int main(void)
{
	double num, b;
	int a;

	printf("Enter a positive number: ");
	scanf("%lf", &num);

	a = num;
	b = num - a;

	printf("Integer part: %d\n", a);
	printf("Fraction part: %lf\n", b);

	return 0;
}
