#include<stdio.h>
int main()
{
  int a,b,Quotient,Remainder;
  a=365;
  b=4;
  Quotient=a/b;
  Remainder=a % b;
  printf("Quotient: %d\nRemainder: %d", Quotient, Remainder);
  return 0;
}