#include <stdio.h>
#include <stdlib.h>

double storebealtStahlseilBerchnen(int x){
    double stellenBerechnung=0.0002684486*x*x-0.4359605911*x+254;
    return(stellenBerechnung);
}

int main()
{
    int laufen=1;
    while (laufen==1){
    int stelle;
    printf("Bitte geben Sie eine Stelle ein: ");
    scanf("%i",&stelle);
    printf("\n");
    printf("Das Stahlseil an der Stelle x=%i ist %f m lang!\n",stelle,storebealtStahlseilBerchnen(stelle));
    printf("\n-----------------------\n");
    printf("Wiederholen?(1/0)");
    scanf("%i",&laufen);
    printf("\n-----------------------\n");
    }
    ///Berechung Gesamtlänge
    int startwert;
    double gesamtlaenge;
    int anzahlSeile=0;
    printf("Wie viele Stahlseile sollen zwueschen den Pylonen gespannt werden? ");
    scanf("%i",&anzahlSeile);
    float enfernungSeile=1624/anzahlSeile;
    for (startwert=enfernungSeile;startwert<=1624-enfernungSeile;startwert=startwert+enfernungSeile){
        gesamtlaenge+=storebealtStahlseilBerchnen(startwert);
    }
    printf("\nDie gesamtlaenge der Seile betraegt: %lg m\n",gesamtlaenge);
    printf("\n-----------------------\n");


    return 0;
}
