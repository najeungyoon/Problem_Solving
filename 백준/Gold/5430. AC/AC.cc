#include <iostream>
#include <deque>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;


void parse(string& input,deque<int>& output){
    if(input.size()!=2){
        int num=0;

        for(int i=1; i<input.size()-1; i++){
            if(input[i] == ','){
                output.push_back(num);
                num=0;
            }else{
                num = num*10 + (input[i]-'0');
            }
        }
        output.push_back(num);
    }   
}

// void reverse(deque<int>& DQ){
//     deque<int> temp;
//     while(DQ.size()){
//         temp.push_back(DQ.back());
//         DQ.pop_back();
//     }
//     DQ = temp;
// }


string print_ans(deque<int> & DQ,bool way){
    string ans;
    if(DQ.empty()){
        return "[]";
    }
    
    ans+='[';

    if(way){
        for(int i=0; i<DQ.size()-1; i++){
            ans+=to_string(DQ[i]);
            ans+=',';
        }
        ans+=to_string(DQ.back());
    }
    else if(!way){
        for(int i=DQ.size()-1; i>0; i--){
            ans+=to_string(DQ[i]);
            ans+=',';
        }
        ans+=to_string(DQ.front());
    }
    
    ans+=']';

    return ans;
}


int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);    
    int t;
    cin >> t;

    while(t--){
        deque <int> DQ;

        string func;
        cin >> func;

        int size;
        cin >> size;

        string input;
        cin >> input;

        parse(input,DQ); 
        
        bool error=false;
        // 정방향: true, 역방향: false
        bool dq_way = true;

        for(char cmd: func){
            if(cmd =='R'){
                dq_way = !dq_way;
            }

            else if(cmd =='D'){
                if(DQ.size()==0){
                    error=true;
                    break;
                }
                else if(dq_way){
                    DQ.pop_front();
                }
                else if(!dq_way){
                    DQ.pop_back();
                }
            }
        }

        if(error){
            cout << "error\n";
        }
        else{
            cout << print_ans(DQ,dq_way) <<'\n';
        }
    }
    
    return 0;
}