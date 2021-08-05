#ifndef __DONOTMODIFY_H__
#define __DONOTMODIFY_H__

typedef struct bigint_t{
	int d[100];
	int sign;
} BIGINT;

void noParameterError(void);
void tooManyParamError(void);
void wrongParamError(void);

int isInvalid(const char*);

BIGINT stringToBigInt(const char*);
void printBigInt(const BIGINT);

BIGINT add(const BIGINT, const BIGINT);
BIGINT sub(const BIGINT, const BIGINT);

#endif
