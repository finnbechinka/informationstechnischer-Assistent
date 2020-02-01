#include <stdio.h>
#include <stdlib.h>

    int benEingabeMitRueckgabe(){
        int x;
        printf("Bitte geben Sie eine ganze Zahl ein:\n");
        scanf("%i",&x);
        printf("\n");
        printf("%i\n",x);
        return 0;
    }

int main()
{
    int zahl;
    zahl=benEingabeMitRueckgabe();

    return 0;
}
