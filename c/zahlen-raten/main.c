#include <stdio.h>
#include <stdlib.h>

int main()
{
    int benutzer_eingabe1;
    int zaehler1=0;
    int abfrage1=5;

    do{
    printf("Geben Sie bitte eine Zahl ein!\n");
    scanf("%i",&benutzer_eingabe1);
    printf("%i\n",benutzer_eingabe1);
    printf("Moechten Sie nochmal Raten?(1/0)\n");
    scanf("%c",&abfrage1);
    if(abfrage1=0){
        zaehler1=3;
    }
    if(abfrage1=1){
        zaehler1=zaehler1+1;
    }
    }while(zaehler1<3);

    return 0;
}
