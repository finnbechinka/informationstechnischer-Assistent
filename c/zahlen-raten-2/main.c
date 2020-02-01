#include <stdio.h>
#include <stdlib.h>

/*int main()//zählergesteuerte
{
    int y;
    int zahl1;
    for(y=1;y<4;y++){

    if(zahl1==4){
    printf("Glückwunsch");
    return 0;
 }
    printf("Geben sie eine Zahl ein \n");
    scanf("%i",&zahl1);

 }
 if(y==4){
printf("schade");
 }

}






*/

/*int main()//Kopfgesteuerte
{
    int y=1;
    int zahl1;

    while(y<4){
         if(zahl1==4){
    printf("Glueckwunsch");
    return 0;
 }
    printf("Geben sie eine Zahl ein\n");

    scanf("%i",&zahl1);
    y++;

 }
 if(y==4){
printf("schade");
    }
    if(y==4){
     return 0;
    }
}*/


int main()
{

    int y = 5;
    int z;
    int x = 1;
   do{
        printf("Bitte geben sie eine Zahl ein \n");
        scanf("%i" , &z);

        if(z == y){
            printf("Glueckwunsch \n");
            return 0;
        }
        else{
                printf("Versuchen sie es nochmal\n");
                x++;
        }
    }   while(x <4);

    return 0;

}
