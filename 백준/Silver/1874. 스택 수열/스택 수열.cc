#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
using namespace std;


int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int n; 
    cin >> n;
    stack<int> stk;
    int cnt = 1;
    vector<char> ans;

    for(int i=0; i<n; i++){
        int input;
        cin >> input;
        
        while(cnt <= input){
            stk.push(cnt);
            cnt++;
            ans.push_back('+');
        }
        if(input < stk.top()){
            cout << "NO";
            return 0;
        }

        stk.pop();
        ans.push_back('-');
    }

    for(char c: ans){
        cout << c <<'\n';
    }

    return 0;
}