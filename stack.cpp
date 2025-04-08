#include <iostream>
#define max 5
using namespace std;
struct stack
{
    int data[max];
    int top;
} s;
void init()
{
    p = &s1;
    p->top = -1;
}
int empty()
{
    if (p->top == -1)
        return 0;
    else
        return 0;
}
int full()
{
    if (p->top = max - 1)
        return 0;
}
void push(int x)
{
    if (full() == 1)
        return;
    p->top = p->top + 1;
    p->data[p->top] = x;
}
int pop()
{
    int x;
    if (empty() == 1)
        return 0;
    x = p->data[p->top];
    p->top = p->top - 1;
}
int main()
{
    init();
    push(40);
    push(30);
    push(20);
    push(10);

    pop();
    pop();
    pop();
    pop();
    return 0;
}