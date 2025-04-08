#include <iostream>
using namespace std;
class node
{
public:
    int val;
    node *next;

    node(int data)
    {
        val = data;
        next = NULL;
    }
};
class LinkedList
{
public:
    node *head;

    LinkedList()
    {
        head = NULL;
    }
    void insertAtail(int x)
    {
        node *new_node = new node(x);
        if (head == NULL)
        {
            head = new_node;
            return;
        }
        node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = new_node;
    }
    
    void display()
    {
        node *temp = head;
        while (temp != NULL)
        {
            cout << temp->val << "->";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }
};
node* reverseKLL(node* &head,int k){
    node* prevptr=NULL;
    node* currptr=head;
    int counter=0;
    while(currptr!=NULL && counter<k){
        node* nextptr=currptr->next;
        currptr->next=prevptr;
        prevptr=currptr;
        currptr=nextptr;
        counter++;
    }
    if(currptr!=NULL){
    node* new_head=reverseKLL(currptr,k);
    head->next=new_head;
    }
    return prevptr;
}
int main()
{

    LinkedList ll;
    ll.insertAtail(1);
    ll.insertAtail(2);
    ll.insertAtail(3);
    ll.insertAtail(4);
    ll.insertAtail(5);
    ll.insertAtail(6);
    ll.display();
    ll.head=reverseKLL(ll.head,3);
    ll.display();

    return 0;
}
