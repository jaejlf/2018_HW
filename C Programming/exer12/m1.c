#include <stdio.h>

int main(void)
{
	int num, remain;
	int rgb[6] = {0};
	int i = 0;
	int red, green, blue;
	int grey;

	printf("Enter an RGB color: ");
	scanf("%d", &num);

	while (num >= 16)
	{
		rgb[i] = num % 16;
		num /= 16;

		i++;
		if (i > 5)
			break;
	}
	if (i > 5)
	{
		printf("Not an RGB value!\n");
		return 0;
	}

	rgb[5] = num;

	red = rgb[0] + rgb[1] * 16;
	green = rgb[2] + rgb[3] * 16;
	blue = rgb[4] + rgb[5] * 16;

	grey = (red + green + blue) / 3;

	printf("Grey scale color: %d\n", grey);

	return 0;
}