#include <iostream>
#include <deque>
#include <algorithm>
using namespace std;


int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);
    deque<int> DQ;
    int total_move =0;

    int n;
    cin >> n;

    for(int i=1; i<=n; i++){
        DQ.push_back(i);
    }

    int m;
    cin >> m;

    for(int j=0; j<m; j++){
        int num;
        cin >>num;

        int index = find(DQ.begin(),DQ.end(),num) - DQ.begin();
        while(DQ.front()!=num){
            if(index < DQ.size()-index){
                DQ.push_back(DQ.front());
                DQ.pop_front();
            }
            else{
                DQ.push_front(DQ.back());
                DQ.pop_back();
            }
            total_move++;
        }
        DQ.pop_front();
    }

    cout << total_move;
    
    
    return 0;
}