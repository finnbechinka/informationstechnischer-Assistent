#include <stdio.h>
#include <stdlib.h>


typedef struct{
    char *string;
    int length;
}TString;

TString *createString(int length){
    TString *s = malloc(sizeof(TString));

    s->length = length;
    s->string = malloc(sizeof(char)*length);
    return s;
    }

int main()
{
    int length = 1;
    while(length >= 1){

    printf("\nstring length: ");
    scanf("%i",&length);
    fflush(stdin);

    TString *string_1 = createString(length);

    int i;
    for(i=0; i < string_1->length; i++){
        scanf("%c",&string_1->string[i]);
    }

    for(i=0; i < string_1->length; i++){
        printf("%c",string_1->string[i]);
        fflush(stdin);
    }
    }
    return 0;
}
