#include <stdio.h>
#include <stdlib.h>

void gibWertetabelleAus(){
int x;
float y;
printf("Wertetabelle fuer die Funktion -1/48*x^2+4*x:\n\n");
printf("x|y\n");
for (x=0;x<=192;x++){
    printf("%i|%.2f\n",x,y=-1/48.0*x*x+4*x);
}
printf("\n------------------------\n");
}

void getStrahlerhoehen(){
    int x;
    float y;
    printf("Strahlerhoehen:\n\n");
    for (x=0;x<=192;x=x+30){
        y=-1/48.0*x*x+4*x;
        printf("x=%i y=%f\n",x,y);
    }
    printf("\n------------------------\n");
}

double berechneStrahlerhoehe (int x){
    return (-1/48.0*x*x+4*x);
}

int main()
{
    gibWertetabelleAus();
    getStrahlerhoehen();
    int laufen=1;
    while (laufen==1){
    double strahlerx;
    printf("Bitte geben Sie einen x-Wert fuer den Stahler ein: ");
    scanf("%lf",&strahlerx);
    printf("\nStrahler y-Wert fuer den x-Wert %.f: \n\n", strahlerx);
    printf("%.2f\n",berechneStrahlerhoehe(strahlerx));
    printf("\n------------------------\n");
    printf("Wollen sie noch eine Strahlerhoehe berechnen? (1/0)");
    scanf("%i",&laufen);
    printf("\n------------------------\n");
    printf("\n------------------------\n");
    }
    return 0;
}
