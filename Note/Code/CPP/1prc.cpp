#include <bits/stdc++.h>
using namespace std;

int f(int n){
    int res;
if(n == 1) return 2;
res=f(n-1)*2;


    return res;




}
int main()
{
    int n;
    cin>>n;
    cout<<f(n);

    return 0;
}
