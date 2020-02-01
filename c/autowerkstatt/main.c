#include <stdio.h>
#include <stdlib.h>

typedef struct{             ///Deklaration eines Struct und eines Typedefs fuer den Struct
    char bezeichnung[30];
    char farbe[30];
    char schaden[50];
    int baujahr;
    double arbeitszeit;
    double preis;
}TAuto;                     ///typedef name

int main()
{
    printf("Wieviele Autos sollen Gespeichert werden? ");   ///user input
    int anzahl;
    scanf("%i",&anzahl);

    TAuto Auto[anzahl];     ///array vom Typ TAuto um Autos zu speichern

    int i;
    for(i = 0; i < anzahl; i++){    ///user input, struct initialisierung mit daten
        printf("\nBitte geben Sie die Bezeichnung fuer Auto %i ein: ",i+1);
        fflush(stdin); gets(Auto[i].bezeichnung); fflush(stdin);
        printf("\nBitte geben Sie die Farbe fuer Auto %i ein: ",i+1);
        gets(Auto[i].farbe); fflush(stdin);
        printf("\nBitte geben Sie den Schaden fuer Auto %i ein: ",i+1);
        gets(Auto[i].schaden); fflush(stdin);
        printf("\nBitte geben Sie das Baujahr fuer Auto %i ein: ",i+1);
        scanf("%i",&Auto[i].baujahr); fflush(stdin);
        printf("\nBitte geben Sie die Arbeitszeit fuer Auto %i ein: ",i+1);
        scanf("%lf",&Auto[i].arbeitszeit); fflush(stdin);
        printf("\nBitte geben Sie den Preis fuer Auto %i ein: ",i+1);
        scanf("%lf",&Auto[i].preis); fflush(stdin);
    }

    int laufen = 1;
    while(laufen == 1){     ///daten ausgabe
        printf("\n\nWelches Auto soll angezeigt werden? ");
        int auswahl;
        scanf("%i",&auswahl);
        if(auswahl == 0){
            printf("\n%4s %30s %30s %50s %7s %11s %10s\n" ,"Auto" ,"Bezeichnung" ,"Farbe" ,"Schaden" ,"Baujahr" ,"Arbeitszeit" ,"Preis");
            int i;
            for(i = 0; i < anzahl; i++){
            printf("%4i %30s %30s %50s %7i %11.2f %10.2lf\n"
                   ,i+1 ,Auto[i].bezeichnung ,Auto[i].farbe ,Auto[i].schaden
                   ,Auto[i].baujahr ,Auto[i].arbeitszeit ,Auto[i].preis);
            }
        }else{
            printf("\n%4s %30s %30s %50s %7s %11s %10s\n" ,"Auto" ,"Bezeichnung" ,"Farbe" ,"Schaden" ,"Baujahr" ,"Arbeitszeit" ,"Preis");
            printf("%4i %30s %30s %50s %7i %11.2f %10.2lf"
                   ,auswahl ,Auto[auswahl-1].bezeichnung ,Auto[auswahl-1].farbe ,Auto[auswahl-1].schaden
                   ,Auto[auswahl-1].baujahr ,Auto[auswahl-1].arbeitszeit ,Auto[auswahl-1].preis);
        }
    }

    return 0;
}
