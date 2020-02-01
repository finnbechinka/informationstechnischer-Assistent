#include <stdio.h>
#include <stdlib.h>

typedef struct{
    double minRes;
    double maxRes;
    double averageRes;
    double maxAmp;
    double maxConV;
    char   nextRes;
}TResistor;

int main()
{
    int numRes;
    printf("Wie viele Widerstaende hat die Schaltung?   ");
    scanf("%i" ,&numRes); fflush(stdin);

    TResistor Resistors[numRes];
    int i;

    for(i=0;i<numRes;i++){
        TResistor resistor;

        printf("Bitte geben Sie den minimalen Widerstand des %i. Widerstands ein:    ", i+1);
        scanf("%lg" ,&resistor.minRes); fflush(stdin);

        printf("Bitte geben Sie den maximalen Widerstand des %i. Widerstands ein:    ", i+1);
        scanf("%lg" ,&resistor.maxRes); fflush(stdin);

        printf("Bitte geben Sie die maximale Stromstaerke des %i. Widerstands ein:    ", i+1);
        scanf("%lg" ,&resistor.maxAmp); fflush(stdin);

        printf("Bitte geben Sie die maximale Dauerspannung des %i. Widerstands ein:    ", i+1);
        scanf("%lg" ,&resistor.maxAmp); fflush(stdin);


        if(i <= (numRes - 2)){
            printf("Ist der naechste Widerstand in (R)eihe oder (P)arrallel:    ");
            scanf("%c" ,&resistor.nextRes); fflush(stdin);

        }

        resistor.averageRes = ((resistor.minRes + resistor.maxRes) / 2);

        Resistors[i] = resistor;
    }

    double totalRes = 0;
    double parallelTotalRes = 0;

    for(i=0;i<numRes;i++){
        if(Resistors[i].nextRes == 'R'){
            totalRes = totalRes + Resistors[i].averageRes;
        }
        else if(Resistors[i].nextRes == 'P'){
            int amountOfP = i;
            while(Resistors[amountOfP].nextRes == 'P'){
                amountOfP++;
            }
            int numOfPInGroup = amountOfP - i + 1;
            int j;
            for(j=0;j<numOfPInGroup;j++){
                parallelTotalRes = parallelTotalRes + (1/Resistors[i+j].averageRes);
            }
            parallelTotalRes = 1 / parallelTotalRes;
            totalRes = totalRes + parallelTotalRes;
            parallelTotalRes = 0;
            i = i + numOfPInGroup - 1;
        }
        else{
            printf("Fehler: Programm wird beendet");
            return 0;
        }
    }
    printf("\nDer Gesamtwiderstand betraegt: %lg Ohm" , totalRes);
}
