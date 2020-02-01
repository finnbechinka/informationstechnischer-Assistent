#include <stdio.h>
#include <stdlib.h>

int EingabeNotenanzahl(){
    printf("Please enter a grade count: ");
    int notenanzahl;
    scanf("%i",&notenanzahl);
    return notenanzahl;
}

int* EingabeDerNoten(int notenanzahl){
    int noten[notenanzahl];
    int i;
    for(i = 0; i < notenanzahl; i++){
        printf("Please enter the %i. grade: ",i+1);
        scanf("%i",&noten[i]);
    }
    return noten;
}

double DurchschnittsBerechnung(int notenanzahl, double noten[]){
    double addierteNoten = 0;
    int i;
    for(i = 0; i < notenanzahl; i++){
        addierteNoten += noten[i];
    }
    double durschnitt = addierteNoten / notenanzahl;
    return durschnitt;
}

int main()
{
    int notenanzahl = EingabeNotenanzahl();
    printf("---------------\n");
    double noten[notenanzahl];
    int i;
    for(i = 0; i < notenanzahl; i++){
        printf("Please enter the %i. grade: ",i+1);
        scanf("%lg",&noten[i]);
    }
    printf("---------------\n");
    double durchschnitt = DurchschnittsBerechnung(notenanzahl, noten);
    printf("grade average: %lg",durchschnitt);
    return 0;
}
