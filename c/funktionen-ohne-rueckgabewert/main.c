#include <stdio.h>
#include <stdlib.h>

void benEingabe(){
    int x;
    printf("Bitte geben Sie eine ganze Zahl ein:\n");
    scanf("%i",&x);
    printf("\n");
    printf("%i\n",x);
}


int main(){
    benEingabe();
    return 0;
}
