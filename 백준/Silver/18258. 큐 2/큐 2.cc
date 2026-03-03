#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
using namespace std;

const int mx =2000000;
int dat[mx];
int head,tail;


void push(int n){
    dat[tail++] = n;
}
int pop(){
    if(head == tail){
        return -1;
    }
    return dat[head++];
}

int front(){
    if(head == tail){
        return -1;
    }
    return dat[head];
}
int back(){
    if(head == tail){
        return -1;
    }
    return dat[tail-1];
}

int size(){
    return tail-head;
}

bool empty(){
    if(head==tail){
        return true;
    }
    return false;
}



int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    
    while(n--){
        string cmd;
        cin >> cmd;

        if(cmd == "push"){
            int n;
            cin >> n;
            push(n);
        }
        else if(cmd == "pop"){
            cout << pop() <<'\n';
        }
        else if (cmd =="front")
        {
            cout << front()<<'\n';
        }
        else if (cmd == "back")
        {
            cout << back()<<'\n';
        }
        else if (cmd == "size")
        {
            cout << size()<<'\n';
        }
        else if (cmd=="empty")
        {
            cout << empty()<<'\n';
        }
    }

    return 0;
}