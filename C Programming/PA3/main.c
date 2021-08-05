#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "doNotModify.h"

int main(int argc, char *argv[]){
	BIGINT A, B, result;
	switch(argc){
	case 1: case 2: case 3:
		noParameterError();
		exit(0);
	case 4:
		if(isInvalid(argv[2]) || isInvalid(argv[3])){
			wrongParamError();
			exit(0);
		}
		A = stringToBigInt(argv[2]);
		B = stringToBigInt(argv[3]);
		if(strcmp(argv[1], "-a") == 0)	result = add(A,B);
		else if(strcmp(argv[1], "-s") == 0)	result = sub(A,B);
		else{
			wrongParamError();
			exit(0);
		}
		printBigInt(result);
		printf("\n");
		break;
	default:
		tooManyParamError();
		break;
	}
	return 0;
}

