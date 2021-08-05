#include <stdio.h>

int main(void)
{
	int top, top_line, line = 0, section = 0, bar = 1, bar_count = 0, space, space_count = 0, i, j;
	int t[5][3] = {{1, 0, 0}, {3, 0, 0}, {5, 0, 0}, {7, 0, 0}, {9, 0, 0}};

	do
	{
		
	Hanoi:
		for (line = 0; line < 5; line++)
		{
			printf(" ");

			for (section = 0; section < 3; section++)
			{
				space = (9 - t[line][section]) / 2;
				bar = t[line][section];

				for (space_count = 0; space_count < space; space_count++)
				{
					printf(" ");
				}
				space_count = 0;

				if (bar == 0)
					printf("|");
				else
				{
					for (bar_count = 0; bar_count < bar; bar_count++)
					{
						printf("-");
					}
				}
				bar_count = 0;

				for (space_count = 0; space_count < space; space_count++)
				{
					printf(" ");
				}
				space_count = 0;
				printf(" ");
			}

			printf("\n");
		}

		printf("===============================\n");

		if ((t[4][0] == 0) && ((t[4][1] == 0) || (t[4][2] == 0)))
			break;

		printf("Move a disc: ");
		scanf("%d %d", &i, &j);
		if (i == j)
		{
			printf("Two numbers should be different!\n");
			goto Hanoi;
		}

		if (t[4][i - 1] == 0)
		{
			printf("No disc in peg %d\n", i);
			goto Hanoi;
		}

		if ((i == 1 || i == 2 || i == 3) && (j == 1 || j == 2 || j == 3))
		{

			for (line = 0; line < 5; line++)
			{
				if (t[line][i - 1] != 0)
				{
					top_line = line;
					top = t[line][i - 1];
					t[line][i - 1] = 0;
					break;
				}
			}
			for (line = 4; line >= 0; line--)
			{
				if (t[line][j - 1] == 0)
				{
					if (line < 4)
					{
						if (t[line + 1][j - 1] < top)
						{
							printf("Disc cannot move!\n");
							t[top_line][i - 1] = top;
							goto Hanoi;
						}
						else
						{
							t[line][j - 1] = top;
							break;
						}
					}
					else
					{
						t[line][j - 1] = top;
						break;
					}
				}
			}
		}
		else
			printf("Wrong number!\n");

	} while (1);

	printf("\nCongratulations! But don't worry. The world will not end!\n");

	return 0;
}