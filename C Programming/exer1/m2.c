#include <stdio.h>

int main(void)
{
	float km, mile = 60.3f;
	km = mile * 1.609f;

	printf("%.1f mile = %.2f km\n", mile, km);

	return 0;
}
