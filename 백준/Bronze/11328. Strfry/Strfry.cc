#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;

    int alphabet[26] = {0};
    vector<string> result_ary;
    bool check;
    for(int i=0; i<n; i++){

        for(int j=0; j<26; j++){
            alphabet[j]=0;
        }
        check=true;
        
        string first_str;
        string second_str;
        cin >> first_str >> second_str;

        if(first_str.length() != second_str.length()){
            check = false;
        }

        for(char c1 : first_str){
            alphabet[c1-'a']++;
        }

        for(char c2: second_str){
            alphabet[c2-'a']--;
            if(alphabet[c2-'a'] < 0){
                check = false;
                break;
            }
        }
        if(check){
        result_ary.push_back("Possible");
        }else{
            result_ary.push_back("Impossible");
        }
    }
    
    for(string str : result_ary){
        cout << str << "\n";
    }

    return 0;
}