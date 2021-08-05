#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
	int n, m;
	int a[3] = {0, 0, 0};

	if (argc == 1)
		return 0;

	n = atoi(argv[1]);

	for (; n >= 4;)
	{
		m = n & 3;
		n = n >> 2;

		if (m == 1)
			a[0]++;
		else if (m == 2)
			a[1]++;
		else if (m == 3)
			a[2]++;

		if (n == 1)
		{
			a[0]++;
			break;
		}
		else if (n == 2)
		{
			a[1]++;
			break;
		}
		else if (n == 3)
		{
			a[2]++;
			break;
		}
	}

	printf("1: %d\n2: %d\n3: %d\n", a[0], a[1], a[2]);

	return 0;
}