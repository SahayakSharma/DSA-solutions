#include <iostream>
#include <vector>
using namespace std;

int PalinArray(int a[], int n)
    {
        int check=0;
        for(int i=0;i<n;i++){
            int n=a[i];
            int rev=0;
            int digit;
            do{
                digit=n%10;
                rev=(rev*10)+digit;
                n=n/10;
            }while(n!=0);
            if(rev!=a[i]){
                check++;
            }
        }
        if(check==0){
            return 1;
        }
        else{
            return 0;
        }
    	// code here
    }