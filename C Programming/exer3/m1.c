#include <stdio.h>

int main(void)
{
	int num, num_2, remain, tf;
	remain = 1;

	printf("Enter a positive integer(1~127):");
	scanf("%d", &num);

	tf = ((num == 2) || (num == 4) || (num == 8) || (num == 16) || (num == 32) || (num == 64)) && (remain -= 1);
	tf = (num >= 1) && (num_2 = num / 2) && (num_2 % 2 == 1) && (remain += 1);
	tf = (num_2 > 1) && (num_2 /= 2) && (num_2 % 2 == 1) && (remain += 1);
	tf = (num_2 > 1) && (num_2 /= 2) && (num_2 % 2 == 1) && (remain += 1);
	tf = (num_2 > 1) && (num_2 /= 2) && (num_2 % 2 == 1) && (remain += 1);
	tf = (num_2 > 1) && (num_2 /= 2) && (num_2 % 2 == 1) && (remain += 1);
	tf = (num_2 > 1) && (num_2 /= 2) && (num_2 % 2 == 1) && (remain += 1);

	printf("There are %d one(s) in binary expression of %d\n", remain, num);
	return 0;
}
