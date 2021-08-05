#include <stdio.h>

int main(void)
{
	int a, b, c;
	int sum, pro, ave;

	printf("Input three integers:");
	scanf("%d %d %d", &a, &b, &c);

	sum = a + b + c;
	pro = a * b * c;
	ave = (a + b + c) / 3;

	printf("+---------+---------+\n");
	printf("| Sum     |%8d |\n", sum);
	printf("+---------+---------+\n");
	printf("| Product |%8d |\n", pro);
	printf("+---------+---------+\n");
	printf("| Average |%8d |\n", ave);
	printf("+---------+---------+\n");

	return 0;
}
