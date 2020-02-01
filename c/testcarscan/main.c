#include <stdio.h>
#include <stdlib.h>

int main()
{
    int programmvariable=1;
do {

    int zahl1;
    int zahl2;
    int ergebnis;
    char operation;

    printf("Bitte geben Sie eine Zahl ein: ");
    scanf("%d", &zahl1);

    printf("Bitte geben Sie einen Operator ein: ");
    scanf(" %c",&operation);

    printf("Bitte geben Sie eine weitere Zahl ein: ");
    scanf("%d", &zahl2);



switch( operation )
  {
  case '+':
    ergebnis=zahl1+zahl2;
    break;
  case '-':
    ergebnis=zahl1-zahl2;
    break;
  case '*':
    ergebnis=zahl1*zahl2;
    break;
  case '/':
    ergebnis=zahl1/zahl2;
    break;
  case '%':
    ergebnis=zahl1%zahl2;
    break;
  default:
    fprintf(stderr, "Ungueltiger Operator! \n");
    goto restart;
  }

       if (ergebnis==zahl1+zahl2){

    printf("----------------------------------------\n");
    printf("Summe von %d%c%d                  %d\n", zahl1, operation, zahl2, ergebnis);
    printf("----------------------------------------\n");

    }else {

      if (ergebnis==zahl1-zahl2) {
        printf("----------------------------------------\n");
        printf("Differenz von %d%c%d                  %d\n", zahl1, operation, zahl2, ergebnis);
        printf("----------------------------------------\n");

    }else {
      if (ergebnis==zahl1*zahl2) {
        printf("----------------------------------------\n");
        printf("Produkt von %d%c%d                  %d\n", zahl1, operation, zahl2, ergebnis);
        printf("----------------------------------------\n");

    }else {
      if (ergebnis==zahl1/zahl2) {
        printf("----------------------------------------\n");
        printf("Quotient von %d%c%d                  %d\n", zahl1, operation, zahl2, ergebnis);
        printf("----------------------------------------\n");
      }
    }
    }
    }


restart: printf("Moechten Sie eine neue Rechnung durchfueren? (1/0)");
scanf("%i", &programmvariable);

}

while(programmvariable==1);


    return 0;
}

