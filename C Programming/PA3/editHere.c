#include <string.h>
#include <stdio.h>
#include "doNotModify.h"

int isInvalid(const char *num)
{
	int digit;
	int a, i;
	digit = strlen(num);

	if (digit > 100)
		a = 1;
	else
	{
		for (i = 0; i < digit; i++)
		{
			if (num[i] < '0' || num[i] > '9')
			{
				a = 1;
				break;
			}
			else
				a = 0;
		}

		if (num[0] == '-')
		{
			for (i = 1; i < digit; i++)
			{
				if (num[i] < '0' || num[i] > '9')
				{
					a = 1;
					break;
				}
				else
					a = 0;
			}
		}
	}

	if (digit == 101 && num[0] == '-')
	{
		for (i = 1; i < digit; i++)
		{
			if (num[i] < '0' || num[i] > '9')
			{
				a = 1;
				break;
			}
			else
				a = 0;
		}
	}

	return a;
}

BIGINT stringToBigInt(const char *num)
{
	BIGINT r = {{0}, 0};
	int i, j;
	int digit;
	digit = strlen(num);

	if (num[0] == '-')
	{
		r.sign = 0;

		for (i = digit - 2, j = 0; i >= 0; i--, j++)
		{
			r.d[i] = num[j + 1] - '1' + 1;
		}
	}
	else
	{
		r.sign = 1;

		for (i = digit - 1, j = 0; i >= 0; i--, j++)
		{
			r.d[i] = num[j] - '1' + 1;
		}
	}

	return r;
}

void printBigInt(const BIGINT n)
{
	int i, index;

	for (i = 99; i >= 0; i--)
	{
		if (n.d[i] != 0)
		{
			index = i;
			break;
		}
	}

	if (n.sign == 0)
	{
		printf("-");
		for (i = index; i >= 0; i--)
		{
			printf("%d", n.d[i]);
		}
	}
	else
	{
		for (i = index; i >= 0; i--)
		{
			printf("%d", n.d[i]);
		}
	}

	return;
}

BIGINT add(const BIGINT A, const BIGINT B)
{
	BIGINT r = {{0}, 0};
	int i;
	int index_A, index_B, start_index;
	int up = 0, down = 0;
	int cmp = 2;

	for (i = 99; i >= 0; i--)
	{
		if (A.d[i] != 0)
		{
			index_A = i;
			break;
		}
	}
	for (i = 99; i >= 0; i--)
	{
		if (B.d[i] != 0)
		{
			index_B = i;
			break;
		}
	}

	if (index_A >= index_B)
		start_index = index_A;
	else
		start_index = index_B;

	if (A.sign == B.sign)
	{
		for (i = 0; i <= start_index + 1; i++)
		{
			r.d[i] = A.d[i] + B.d[i] + up;
			if (r.d[i] >= 10)
			{
				up = r.d[i] / 10;
				r.d[i] %= 10;
			}
			else
				up = 0;
		}
		if (A.sign == 0)
			r.sign = 0;
		else
			r.sign = 1;
	}

	else
	{
		for (i = start_index; i >= 0; i--)
		{
			if (A.d[i] != B.d[i])
			{
				if (A.d[i] > B.d[i])
					cmp = 0;
				else
					cmp = 1;
				break;
			}
		}
		if (cmp == 2)
			r.sign = 1;
		else if (cmp == 0)
			r.sign = A.sign;
		else if (cmp == 1)
			r.sign = B.sign;

		if (cmp == 2 || cmp == 0)
		{
			for (i = 0; i <= start_index + 1; i++)
			{
				r.d[i] = A.d[i] - B.d[i] - down;
				if (r.d[i] < 0)
				{
					r.d[i] += 10;
					down = 1;
				}
				else
					down = 0;
			}
		}
		else
		{
			for (i = 0; i <= start_index + 1; i++)
			{
				r.d[i] = B.d[i] - A.d[i] - down;
				if (r.d[i] < 0)
				{
					r.d[i] += 10;
					down = 1;
				}
				else
					down = 0;
			}
		}
	}

	return r;
}

BIGINT sub(const BIGINT A, const BIGINT B)
{
	BIGINT r = {{0}, 0};
	int i;
	int index_A, index_B, start_index;
	int up = 0;
	int down = 0;
	int cmp = 2;

	for (i = 99; i >= 0; i--)
	{
		if (A.d[i] != 0)
		{
			index_A = i;
			break;
		}
	}
	for (i = 99; i >= 0; i--)
	{
		if (B.d[i] != 0)
		{
			index_B = i;
			break;
		}
	}

	if (index_A >= index_B)
		start_index = index_A;
	else
		start_index = index_B;

	if (A.sign != B.sign)
	{
		for (i = 0; i <= start_index + 1; i++)
		{
			r.d[i] = A.d[i] + B.d[i] + up;
			if (r.d[i] >= 10)
			{
				up = r.d[i] / 10;
				r.d[i] %= 10;
			}
			else
				up = 0;
		}
		if (A.sign == 0)
			r.sign = 0;
		else
			r.sign = 1;
	}

	else
	{
		for (i = start_index; i >= 0; i--)
		{
			if (A.d[i] != B.d[i])
			{
				if (A.d[i] > B.d[i])
					cmp = 0;
				else
					cmp = 1;
				break;
			}
		}

		if (cmp == 2)
			r.sign = 1;
		else if (cmp == 0)
		{
			if (A.sign == 0)
				r.sign = 0;
			else
				r.sign = 1;
		}
		else if (cmp == 1)
		{
			if (A.sign == 0)
				r.sign = 1;
			else
				r.sign = 0;
		}

		if (cmp == 2 || cmp == 0)
		{
			for (i = 0; i <= start_index + 1; i++)
			{
				r.d[i] = A.d[i] - B.d[i] - down;
				if (r.d[i] < 0)
				{
					r.d[i] += 10;
					down = 1;
				}
				else
					down = 0;
			}
		}
		else
		{
			for (i = 0; i <= start_index + 1; i++)
			{
				r.d[i] = B.d[i] - A.d[i] - down;
				if (r.d[i] < 0)
				{
					r.d[i] += 10;
					down = 1;
				}
				else
					down = 0;
			}
		}
	}

	return r;
}