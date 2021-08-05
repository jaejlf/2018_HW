#include <stdio.h>

void showUsage(void);

void noParameterError(void){
	printf("Missing parameters!\n\n");
	showUsage();
	return;
}

void tooManyParamError(void){
	printf("Too many parameters!\n\n");
	showUsage();
}

void wrongParamError(void){
	printf("Wrong parameters!\n\n");
	showUsage();
}

void showUsage(void){
	printf("Usage: ./[Execution File] [Option] [Number 1] [Number 2]\n\n");
	printf("[Option]\n\n -a : Addition\n -s : Subtraction\n\n");
}

