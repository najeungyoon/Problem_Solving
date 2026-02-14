#include <iostream>
using namespace std;

int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);

    int x,y,z;
    cin >> x >> y >> z;

    int num = x*y*z;
    int num_ary[10] = {0};

    while(num > 10){
        num_ary[num%10]++;
        num/=10;
    }
    num_ary[num]++;
    
    for(int num : num_ary){
        cout << num <<'\n';
    }

    return 0;
}