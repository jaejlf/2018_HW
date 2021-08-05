#include <stdio.h>

int main(void)
{
	int a, b, c, d;

	printf("Enter a phone number:");
	scanf("+%d-%d-%d-%d", &a, &b, &c, &d);

	printf("Country code: %d\n", a);
	printf("Area code: %d\n", b);
	printf("Exchange number: %d\n", c);
	printf("Rest number: %d\n", d);

	return 0;
}
