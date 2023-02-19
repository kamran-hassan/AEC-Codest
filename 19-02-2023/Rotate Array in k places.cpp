#include<iostream>
using namespace std;

void rotateArray(int arr[], int k, int n)
{
    int firstPlace = k % n;

    for(int i = 0; i < n; i++)
    {
        cout << arr[(firstPlace + i) % n] << " ";
    }
}

int main()
{
    int arr[5] = {1, 3, 5, 7, 9};

    for(int i = 0; i < 5; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    int k = 3;

    rotateArray(arr, k, 5);

    return 0;
}
