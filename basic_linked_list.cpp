#include <iostream>
using namespace std;
// format to creat singly linked list
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
// insertion a node at start
void insertAtHead(node *&head, int val)
{
    node *new_node = new node(val);
    new_node->next = head;
    head = new_node;
}
// insertion a node at the end
void insertAtial(node *&head, int val)
{
    node *new_node = new node(val);
    node *temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = new_node;
}
// insertion node at arbitary position
void insertAtPosition(node *&head, int val, int pos)
{
    if (pos == 0)
    {
        insertAtHead(head, val);
        return;
    }
    node *new_node = new node(val);
    node *temp = head;
    int curr_pos = 0;
    while (curr_pos != pos - 1)
    {
        temp = temp->next;
        curr_pos++;
    }
    new_node->next = temp->next;
    temp->next = new_node;
}
// updation at Kth position
void updateAtPosition(node *&head, int k, int val)
{
    node *temp = head;
    int curr_pos = 0;
    while (curr_pos != k)
    {
        temp = temp->next;
        curr_pos++;
    }
    temp->val = val;
}
// delete a node at head
void deleteAtHead(node *&head)
{
    node *temp = head;
    head = head->next;
    free(temp);
}
// delete a node at end
void delateAtEnd(node *&head)
{
    node *second_last = head;
    while (second_last->next->next != NULL)
    {
        second_last = second_last->next;
    }
    node *temp = second_last->next;
    second_last->next = NULL;
    free(temp);
}
// delete a node at arbitar position
void deleteAtPosition(node *head, int pos)
{
    if (pos == 0)
    {
        deleteAtHead(head);
        return;
    }
    int curr_pos = 0;
    node *prv = head;
    while (curr_pos != pos - 1)
    {
        prv = prv->next;
        curr_pos++;
    }
    node *temp = prv->next;
    prv->next = prv->next->next;
    free(temp);
}
void display(node *head)
{
    node *temp = head;
    while (temp != NULL)
    {
        cout << temp->val << "->";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}
int main()
{
    node *head = NULL;
    /*node* n=new node(1);
    node* m=new node(2);
    cout<<n->val<<" "<<m->val<<" "<<m->next<<endl;*/
    insertAtHead(head, 3);
    display(head);
    insertAtHead(head, 2);
    display(head);
    insertAtHead(head, 1);
    display(head);
    insertAtial(head, 6);
    display(head);
    insertAtPosition(head, 4, 3);
    display(head);
    insertAtPosition(head, 5, 4);
    display(head);
    /*updateAtPosition(head,5,7);
    display(head);
    deleteAtHead(head);
    display(head);
    delateAtEnd(head);
    display(head);*/
    deleteAtPosition(head, 1);
    display(head);
    return 0;
}