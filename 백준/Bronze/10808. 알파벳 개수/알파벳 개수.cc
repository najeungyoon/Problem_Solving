#include <bits/stdc++.h>
using namespace std;


int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);


    int alphabet[26] = {0};
    string word;
    cin >> word;

    for(char a : word){
        alphabet[(int)a-97]++;
    }

    for(int num:alphabet){
        cout << num << " ";
    }

    return 0;
}