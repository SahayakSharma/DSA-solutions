#include <iostream>
using namespace std;

int sum(int a, int b)
{
    return a + b;
}

int main()

{
    int a=sum(5, 7);
    cout<<a<<endl;

    vector<int> v{1,2,3,4,5};
    
    return 0;
}