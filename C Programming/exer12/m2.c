#include <stdio.h>

int main(void)
{
	FILE *a, *b, *c;
	char ch;

	a = fopen("a.txt", "r");
	b = fopen("b.txt", "r");
	c = fopen("c.txt", "w");

	if (a == NULL)
	{
		printf("a.txt does not exit!\n");
		return 0;
	}
	else if (b == NULL)
	{
		printf("b.txt does not exit!\n");
		return 0;
	}

	while ((ch = getc(a)) != EOF)
	{
		fputc(ch, c);
	}

	while ((ch = getc(b)) != EOF)
	{
		fputc(ch, c);
	}

	printf("c.txt has been created successfully.\n");

	fclose(a);
	fclose(b);
	fclose(c);
	return 0;
}