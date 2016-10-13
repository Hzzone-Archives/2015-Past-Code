#include <iostream>
#include <ctime>
using namespace std;
int main(){
    cout<<"please wait for 10 second"<<endl;
    const int time = 10;
    clock_t start = clock();
    while(start+time*CLOCKS_PER_SEC<clock());
    cout<<"done!"<<endl;
    return 0;
}