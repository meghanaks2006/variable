#include<iostream.h>
#include<conio.h>
long int computeFactorial(int n)
{
    if(n==0 ||n==1)
    {
        return 1;
    }
    return n*computeFactorial(n-1);
}
int main()
{
    int num;
    clrscr();
    cout<<"Enter a positive integer"<<endl;
    cin>>num;
    if(num<0)
        cout<<"Factorial is not defined for negative number";
    else
        cout<<"Factorial of"<<num<<"is"<<computeFactorial(num);
    getch();
    return 0;
}