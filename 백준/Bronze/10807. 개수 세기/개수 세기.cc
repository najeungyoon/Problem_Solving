#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);

   int n;
   cin >> n;
   int result =0;

   vector <int> ary(n);
    for (size_t i = 0; i < n; i++)
    {
        int num;
        cin >> num;
        ary[i] = num;
    }
    
    int match_num;
    cin >> match_num;
    for (int num : ary)
    {
        if (num == match_num)
        {
            result++;
        }    
    }
   cout << result;

    return 0;
}