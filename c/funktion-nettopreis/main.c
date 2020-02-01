#include <stdio.h>
#include <stdlib.h>


void nettoBerechnung(float bruttopreis){
    float enthMwSt=bruttopreis*.19;
    printf("Nettopreis: %.2f\n",bruttopreis-enthMwSt);
    printf("Enthaltene Mehrwertsteuer: %.2f\n",enthMwSt);
}


int main()
{
    float bruttopreis;
    printf("Bitte geben Sie einen Bruttopreis ein: ");
    scanf("%f",&bruttopreis);
    printf("\n");
    nettoBerechnung(bruttopreis);
    return 0;
}
