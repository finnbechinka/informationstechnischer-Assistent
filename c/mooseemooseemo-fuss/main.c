#include <stdio.h>
#include <stdlib.h>

int main()
{
    int zaehler=1;
    do{
        printf("Moo");
        printf("See");
        zaehler=zaehler+1;
    }while(zaehler<3);

    if (zaehler==3){
        printf("Mo");
    }
    return 0;
}
