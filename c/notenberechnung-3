#include <stdio.h>
#include <stdlib.h>

int EingabeNotenanzahl(){
    printf("Please enter a grade count: ");
    int notenanzahl;
    scanf("%i",&notenanzahl);
    return notenanzahl;
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

void DurchschnittKommentar(double durchschnitt){
if(durchschnitt < 1.5){
    printf("Das Zeugnis ist sehr gut!\n");
}else if(durchschnitt >= 1.5 || durchschnitt < 2.5){
    printf("Das Zeugnis ist gut!\n");
}else if(durchschnitt >= 2.5 || durchschnitt < 3.5){
    printf("Das Zeugnis ist befriedigend!\n");
}else if(durchschnitt >= 3.5 || durchschnitt < 4.5){
    printf("Das Zeugnis ist ausreichend!\n");
}else if(durchschnitt >= 4.5 || durchschnitt < 5.5){
    printf("Das Zeugnis ist mangelhaft!\n");
}else if(durchschnitt >= 5.5){
    printf("Das Zeugnis ist unbefriedigend!\n");
}
}

int main()
{
    int notenanzahl = EingabeNotenanzahl();
    printf("---------------\n");
    double wunschDurchschnitt;
    printf("Bitte geben Sie ihren einen erwuenschten Durchschnitt ein:\n");
    scanf("%lg",&wunschDurchschnitt);
    double noten[notenanzahl];
    int i;
    for(i = 0; i < notenanzahl; i++){
        printf("Please enter the %i. grade: ",i+1);
        scanf("%lg",&noten[i]);
    }
    printf("---------------\n");
    double durchschnitt = DurchschnittsBerechnung(notenanzahl, noten);
    printf("grade average: %lg\n",durchschnitt);
    DurchschnittKommentar(durchschnitt);
    if(durchschnitt != wunschDurchschnitt){
        printf("Der Durchschnitt weicht um %lg vom Wunschdurchschnitt ab!", durchschnitt-wunschDurchschnitt);
    }
    return 0;
}
