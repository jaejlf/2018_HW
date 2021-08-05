char bar(const char *str)
{
	char freq = 'A';
	int i = 0, tmp[26] = {0};
	int max = 0, k = 0;

	for (i = 0; *(str + i) != '\0'; i++)
	{
		if ((*(str + i) >= 'A' && *(str + i) <= 'Z') || (*(str + i) >= 'a' && *(str + i) <= 'z'))
		{
			if (*(str + i) >= 'A' && *(str + i) <= 'Z')
			{
				tmp[*(str + i) - 'A']++;
			}
			else if (*(str + i) >= 'a' && *(str + i) <= 'z')
			{
				tmp[*(str + i) - 'a']++;
			}
		}
	}

	for (i = 0; i < 26; i++)
	{
		if (tmp[i] >= max)
		{
			max = tmp[i];
			k = i;
		}
	}

	freq = 'A' + k;

	return freq;
}