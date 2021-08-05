#include <stdio.h>

struct time
{
	int hour;
	int min;
	int ampm;
};

int main(void)
{
	struct time s = {0, 0, 0};
	struct time depart[8] = {{8, 0, 0}, {9, 43, 0}, {11, 19, 0}, {12, 47, 1}, {2, 0, 1}, {3, 45, 1}, {7, 0, 1}, {9, 45, 1}};
	struct time arrival[8] = {{10, 16, 0}, {11, 52, 0}, {1, 31, 1}, {3, 0, 1}, {4, 8, 1}, {5, 55, 1}, {9, 20, 1}, {11, 58, 1}};
	int i, cmp;
	char *ch, *ch_;

	printf("Enter a 24-hour time: ");
	scanf("%d:%d", &s.hour, &s.min);

	cmp = 60 * s.hour + s.min;

	if (cmp >= 480 && cmp <= 583)
	{
		if (cmp <= 531)
			i = 0;
		else
			i = 1;
	}
	else if (cmp > 583 && cmp <= 679)
	{
		if (cmp <= 631)
			i = 1;
		else
			i = 2;
	}
	else if (cmp > 679 && cmp <= 767)
	{
		if (cmp <= 723)
			i = 2;
		else
			i = 3;
	}
	else if (cmp > 767 && cmp <= 840)
	{
		if (cmp <= 803)
			i = 3;
		else
			i = 4;
	}
	else if (cmp > 840 && cmp <= 945)
	{
		if (cmp <= 892)
			i = 4;
		else
			i = 5;
	}
	else if (cmp > 945 && cmp <= 1140)
	{
		if (cmp <= 1042)
			i = 5;
		else
			i = 6;
	}
	else if (cmp > 1140 && cmp <= 1305)
	{
		if (cmp <= 1222)
			i = 6;
		else
			i = 7;
	}
	else
	{
		if (cmp <= 71 || cmp >= 1305)
			i = 7;
		else
			i = 0;
	}

	if (depart[i].ampm == 0)
		ch = "AM";
	else
		ch = "PM";
	if (arrival[i].ampm == 0)
		ch_ = "AM";
	else
		ch_ = "PM";

	printf("Closest departure time is %d:", depart[i].hour);

	if (depart[i].min >= 0 && depart[i].min <= 9)
		printf("0");
	printf("%d %s, arriving at %d:", depart[i].min, ch, arrival[i].hour);

	if (arrival[i].min >= 0 && arrival[i].min <= 9)
		printf("0");
	printf("%d %s.\n", arrival[i].min, ch_);

	return 0;
}