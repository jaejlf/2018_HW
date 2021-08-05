#include <stdio.h>
#include <stdlib.h>

int foo(const char *str);
char bar(const char *str);
int main(void)
{
	char *str = NULL;

	if (str == NULL)
		str = (char *)malloc(256);

	printf("Enter a sentence: ");
	fgets(str, 256, stdin);
	printf("The sum of numbers: %d\n", foo(str));
	printf("The most frequent alphabet: %c\n", bar(str));

	free(str);
	str = NULL;

	return 0;
}