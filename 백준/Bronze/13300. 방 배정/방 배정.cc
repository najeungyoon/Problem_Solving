#include <iostream>
using namespace std;

int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);

    int students[2][6] = {};

    int N,K;
    cin >>N>>K;
    

    for(int i=0; i<N; i++){
        int s,y;
        cin >> s>> y;
        students[s][y-1]++;    
    }

    int room_num = 0;
    for(int i=0; i<2; i++){
        for (int j = 0; j < 6; j++)
        {
            room_num+=students[i][j] / K;
            if(students[i][j]%K !=0){
                room_num++;
            }
        }
        
    }
    cout<<room_num;

}