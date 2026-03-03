#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <queue>
using namespace std;


int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);
    
    queue <int> Q;

    int n;
    cin >> n;


    for(int i=1; i<=n; i++){
        Q.push(i);
    }

    int c = 1;
    while(Q.size() > 1){
        if(c % 2==1){
            Q.pop();
            c++;
        }
        else if (c % 2 ==0)
        {
            int temp = Q.front();
            Q.push(temp);
            Q.pop();
            c++;
        }
    }

    cout<<Q.front();


    return 0;
}