#include <stdio.h>
#include <stdlib.h>

int main()
{
    int zahl1;
    int zahl2;

    printf("Bitte geben Sie eine Zahl ein: ");
    scanf("%i", &zahl1);
    printf("Bitte geben Sie eine weitere Zahl ein: ");
    scanf("%i", &zahl2);

    printf("Summe: %i\n", zahl1+zahl2);
    printf("Differenz: %i\n", zahl1-zahl2);
    printf("Produkt: %i\n", zahl1*zahl2);
    printf("Quotient: %i\n", zahl1/zahl2);

    return 0;
}
