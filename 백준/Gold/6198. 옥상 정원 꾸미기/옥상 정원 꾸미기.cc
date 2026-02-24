#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
using namespace std;


int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);
    
    vector<int> ans;
    stack<int> stk;

    long long count = 0;

    int n;
    cin >> n;

    for(int i=0; i<n; i++){

        int h;
        cin >> h;

        while(!stk.empty() && stk.top()<=h){
            stk.pop();
        }
        count+= stk.size();
        stk.push(h);
    }

    cout << count;
    return 0;
}