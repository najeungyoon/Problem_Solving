#include <iostream>
using namespace std;

int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);

    string N;
    cin >> N;

    int plastic_set[10] ={0,};
    
    for(char c:N){
        plastic_set[c-'0']++;
    }
    
    int set_count = 0;
    for(char c : N){
        if(c-'0' == 6 || c-'0' == 9) continue;
        set_count= max(plastic_set[c-'0'],set_count);
    }

    set_count = max(set_count,(plastic_set[6]+plastic_set[9]+1)/2);

    cout << set_count;
    return 0;
}