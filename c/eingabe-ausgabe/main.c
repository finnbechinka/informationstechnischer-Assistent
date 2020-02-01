#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x; //Deklaration der Variable mit dem Namen x im Speicherbereich einen int
    int y;
    printf ("Geben Sie eine Zahl ein "); //Eingabeaufforderung
    scanf ("%i", &x); //Initialisierung von x durch Benutzereingabe
    printf ("Geben Sie eine weitere Zahl ein ");
    scanf ("%i", &y);
    printf ("Die Summe der beiden Zahnel ist: %i", x+y); //Ausgabe des Wertes der Variable x
    return 0; //Ende der main Methode , Rückgabe alles in ordnug
}
