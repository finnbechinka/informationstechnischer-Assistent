#include <stdio.h>
#include <stdlib.h>

const double MwSt=.19;

void eurUmrechnung(float x){
    printf("\n-----------------\n\n");
    float brutto=x+x*MwSt;
    printf("Bruttopreis:%.2f\n",brutto);
    printf("EUR->USD:%.2f\n",brutto*1.17355);
    printf("EUR->GBP:%.2f\n",brutto*0.89091);
    printf("\n-----------------\n");
}

void usdUmrechnung(float x){
    printf("\n-----------------\n\n");
    float brutto=x+x*MwSt;
    printf("Bruttopreis:%.2f\n",brutto);
    printf("USD->EUR:%.2f\n",brutto*0.85202);
    printf("USD->GBP:%.2f\n",brutto*0.75914);
    printf("\n-----------------\n");
}

void gbpUmrechnung(float x){
    printf("\n-----------------\n\n");
    float brutto=x+x*MwSt;
    printf("Bruttopreis:%.2f\n",brutto);
    printf("GBP->EUR:%.2f\n",brutto*1.12224);
    printf("GBP->USD:%.2f\n",brutto*1.31711);
    printf("\n-----------------\n");
}


int main()
{
    int laufen=1;
    while(laufen==1){
    int waerung=0;
    float netto;
    printf("Waerungen: EUR=0|USD=1|GBP=2\n");
    printf("____________________________\n\n");
    printf("Bitte waelen Sie ihre Waerung: ");
    scanf("%i",&waerung);
    printf("\n");
    if (waerung==0){
        printf("Sie haben EUR als Waerung gewaelt.\n");
        printf("Bitte geben Sie einen Nettopreis ein: ");
        scanf("%f",&netto);
        eurUmrechnung(netto);

    }

    if (waerung==1){
        printf("Sie haben USD als Waerung gewaelt.\n");
        printf("Bitte geben Sie einen Nettopreis ein: ");
        scanf("%f",&netto);
        usdUmrechnung(netto);

    }

    if (waerung==2){
        printf("Sie haben GBP als Waerung gewaelt.\n");
        printf("Bitte geben Sie einen Nettopreis ein: ");
        scanf("%f",&netto);
        gbpUmrechnung(netto);

    }
    printf("Wollen Sie noch eien Wert berechnen lassen? (1/0)");
    scanf("%i",&laufen);
    printf("\n-----------------\n");
    printf("\n-----------------\n");
    }
    return 0;
}
