#include <bits/stdc++.h>
using namespace std;
int f(int n)
{
    int res;
    if (n == 1)
        return 1;

    res = f(n - 1) * n;
    return res;
}
int main()
{
    int n;
    cin>>n;
    
    
      
}
