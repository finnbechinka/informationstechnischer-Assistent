#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct{
    double side1;
    double side2;
    double side3;
}TTriangle;

typedef struct{
    double x;
    double y;
}TSquare;

typedef struct{
    double r;
}TCircle;

typedef struct{
    double h;
    double r;
}TCylinder;

double zylinderOberflaeche(TCylinder zylinder){
    return 2 * M_PI * zylinder.r * (zylinder.r + zylinder.h);
}

double zylinderVolumen(TCylinder zylinder){
    return M_PI * pow(zylinder.r,2) * zylinder.h;
}

double circleFlaeche(TCircle circle){
    return M_PI * pow(circle.r, 2) ;
}

double circleUmfang (TCircle circle){
    return 2 * M_PI * circle.r;
}

double squareFlaeche(TSquare square){
    return square.x * square.y;
}

double squareUmfang(TSquare square){
    return square.x + square.y;
}

double circumference(TTriangle triangle){
    return triangle.side1 + triangle.side2 + triangle.side3;
}
int main()
{
    TTriangle triangle;
    triangle.side1 = 12.3;
    triangle.side2 = 14.7;
    triangle.side3 = 15;
    printf("%.3lf\n",circumference(triangle));

    TSquare square;
    square.x = 5.5;
    square.y = 4.5;
    printf("%.3lf\n",squareFlaeche(square));
    printf("%.3lf\n",squareUmfang(square));

    TCircle circle;
    circle.r = 3;
    printf("%.3lf\n",circleFlaeche(circle));
    printf("%.3lf\n",circleUmfang(circle));

    TCylinder zylinder;
    zylinder.h = 2;
    zylinder.r = 3.3;
    printf("%.3lf\n",zylinderOberflaeche(zylinder));
    printf("%.3lf\n",zylinderVolumen(zylinder));

    return 0;
}
