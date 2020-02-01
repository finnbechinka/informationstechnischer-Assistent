#include <stdio.h>
#include <stdlib.h>

double fahrenheit(int CGrad){
    double FGrad=CGrad*1.8+32;
    if(FGrad<40){
        printf("ACHTUNG! Temperatur unter 40 Grad Fahrenheit\n");
    }
    return (FGrad);
}

int main()
{
    int laufen=1;
    while(laufen==1){
    double CGrad;
    printf("Bitte geben Sie eine Temperatur in Grad Celsius ein: ");
    scanf("%lg",&CGrad);
    printf("\n------------------\n");
    double FGrad=fahrenheit(CGrad);
    printf("Die eingegebene Temperatur in Grad Fahrenheit ist: %.2lg",FGrad);
    printf("\n-----------------\n");
    printf("Wollen Sie noch eie Temperatur berechnen lassen? (1/0)");
    scanf("%i",&laufen);
    printf("\n-----------------\n");
    printf("\n-----------------\n");
    }
    return 0;
}
