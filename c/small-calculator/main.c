#include <stdio.h>
#include <stdlib.h>

int main()
{
    float zahl1;
    float zahl2;

    printf("Bitte geben Sie eine Zahl ein:");
    scanf("%f", &zahl1);
    printf("Bitte geben Sie eine weitere Zahl ein:");
    scanf("%f", &zahl2);

    printf("Summe: %.2f\n", zahl1+zahl2);
    printf("Differenz: %.2f\n", zahl1-zahl2);
    printf("Produkt: %.2f\n", zahl1*zahl2);
    printf("Quotient: %.2f\n", zahl1/zahl2);

    return 0;
}
