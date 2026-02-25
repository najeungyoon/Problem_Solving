#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
using namespace std;


int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);
    
    stack<int> stk;

    int n;
    cin >> n;

    vector<int>ary(n);
    stack<int> ans;

    for(int i=n-1; i>=0; i--){
        int a;
        cin >> a;
        ary[i] = a;
    }

    for(int at : ary){

        while(!stk.empty() && stk.top() <= at){
            stk.pop();
        }

        if(stk.empty()){
            stk.push(at);
            ans.push(-1);
            continue;
        }

        ans.push(stk.top());
        stk.push(at);
    }

    
    for(int i=0; i<n-1; i++){
        cout << ans.top() << ' ';
        ans.pop();
    }
    cout << ans.top();


    return 0;
}