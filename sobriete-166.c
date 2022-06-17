#include <stdio.h>

int main(int nbrArg, char** listArg)
{
  if (nbrArg == 1)
    return 0;
  int a=0;
  int b=0;

  while(listArg[1][a] != '\0')
  {
    listArg[1][b++] = (listArg[1][a] == ' ' && listArg[1][a + 1] != ' ' && listArg[1][a - 1] != ' ') ? (listArg[1][++a]) : (listArg[1][a]);
      a++;
  }
  listArg[1][b] = '\0';

  printf("[%s]", listArg[1]);
  return 0;
}
